package com.hyq0719.mktapi.common.executor.http;


import com.hyq0719.mktapi.common.ApiResponse;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import java.util.Map.Entry;

@Slf4j
public class ApacheHttpHandler extends BaseHttpHandler {

  private static final String DEFAULT_ENCODER = "utf-8";
  private final CloseableHttpClient httpsClient;
  private final RequestConfig requestConfig;

  public ApacheHttpHandler(CloseableHttpClient httpClient, RequestConfig requestConfig) {
    this.httpsClient = httpClient;
    this.requestConfig = requestConfig;
  }

  @Override
  public <T> ApiResponse<T> execute(RequestParam param, Type returnType) throws ApiException {
    try {
      HttpResponse response = doRequest(param);
      Header[] headers = response.getAllHeaders();
      Map<String, List<String>> headerMap = toMultimap(headers);
      T data = handleResponse(response, returnType);
      return new ApiResponse<>(response.getStatusLine().getStatusCode(), headerMap, data);
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  public HttpResponse doRequest(RequestParam param) throws IOException {
    if (RequestConstants.GET.equals(param.getMethod())) {
      return doGet(param);
    } else if (RequestConstants.POST.equals(param.getMethod())) {
      return doPost(param);
    }
    return null;
  }

  public HttpResponse doGet(RequestParam param) throws IOException {
    HttpGet get = new HttpGet(buildUrl(param));
    get.setConfig(requestConfig);
    get.setHeaders(paramToHeaders(param.getHeaderParams()));
    return httpsClient.execute(get);
  }

  public HttpResponse doPost(RequestParam param) throws IOException {
    HttpPost post = new HttpPost(buildUrl(param));
    post.setConfig(requestConfig);
    post.setHeaders(paramToHeaders(param.getHeaderParams()));
    post.setProtocolVersion(HttpVersion.HTTP_1_0);
    setPostEntity(post, param);
    return httpsClient.execute(post);
  }

  public void setPostEntity(HttpPost httpPost, RequestParam param) {
    String contentType = param.getHeaderParams().get("Content-Type");
    // ensuring a default content type
    if (contentType == null) {
      contentType = "application/json";
    }
    if ("multipart/form-data".equals(contentType)) {
      httpPost.setEntity(buildRequestEntityMultipart(param.getFormParams()));
    } else {
      String postEntity = parameterToString(param.getPostBody());
      if (postEntity != null) {
        StringEntity entity = new StringEntity(postEntity, Consts.UTF_8);
        entity.setContentType(contentType);
        httpPost.setEntity(entity);
      }
    }
  }

  public HttpEntity buildRequestEntityMultipart(Map<String, Object> formParams) {
    MultipartEntityBuilder mpBuilder = MultipartEntityBuilder.create();
    if (formParams != null) {
      for (Entry<String, Object> entry : formParams.entrySet()) {
        if (entry.getValue() instanceof File) {
          File file = (File) entry.getValue();
          mpBuilder.addPart(entry.getKey(), new FileBody(file));
        } else {
          mpBuilder.addTextBody(entry.getKey(), String.valueOf(entry.getValue()),
            ContentType.TEXT_PLAIN.withCharset(Consts.UTF_8));
        }
      }
    }
    return mpBuilder.build();
  }

  public <T> T handleResponse(HttpResponse response, Type returnType) throws ApiException {
    int code = response.getStatusLine().getStatusCode();
    if (code >= 200 && code < 300) {
      if (returnType == null || code == 204) {
        // returning null if the returnType is not defined,
        // or the status code is 204 (No Content)
        return null;
      } else {
        return deserialize(response, returnType);
      }
    }
    String respBody = null;
    if (response.getEntity() != null) {
      try {
        respBody = EntityUtils.toString(response.getEntity(), DEFAULT_ENCODER);
      } catch (IOException e) {
        throw new ApiException(e);
      }
    }
    throw new ApiException(response.getStatusLine().getReasonPhrase(),
      code, toMultimap(response.getAllHeaders()), respBody);
  }

  /**
   * Deserialize response body to Java object, according to the return type and the Content-Type
   * response header.
   *
   * @param <T>        Type
   * @param response   HTTP response
   * @param returnType The type of the Java object
   * @return The deserialized Java object
   * @throws ApiException If fail to deserialize response body, i.e. cannot read response body or
   *                      the Content-Type of the response is not supported.
   */
  public <T> T deserialize(HttpResponse response, Type returnType) throws ApiException {
    if (response == null || returnType == null) {
      return null;
    }

    String respBody;
    try {
      if (response.getEntity() != null) {
        respBody = EntityUtils.toString(response.getEntity(), DEFAULT_ENCODER);
      } else {
        respBody = null;
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }

    if (respBody == null || "".equals(respBody)) {
      return null;
    }

    String contentType = getHeaderValue(response.getAllHeaders(), "Content-Type");
    if (contentType == null) {
      // ensuring a default content type
      contentType = "application/json";
    }
    if (isJsonMime(contentType)) {
      return getJSON().deserialize(respBody, returnType);
    } else if (returnType.equals(String.class)) {
      // Expecting string, return the raw response body.
      return (T) respBody;
    } else {
      throw new ApiException(
        "Content type \"" + contentType + "\" is not supported for type: " + returnType,
        response.getStatusLine().getStatusCode(),
        toMultimap(response.getAllHeaders()),
        respBody);
    }
  }

  public Header[] paramToHeaders(Map<String, String> headersMap) {
    List<Header> headers = new ArrayList<>(headersMap.size());
    headersMap.forEach((k, v) -> {
      if (!"Content-Type".equals(k)) {
        headers.add(new BasicHeader(k, v));
      }
    });
    return headers.toArray(new Header[0]);
  }

  public Map<String, List<String>> toMultimap(Header[] headers) {
    Map<String, List<String>> headerMap = new HashMap<>();
    for (Header header : headers) {
      String name = header.getName().toLowerCase(Locale.US);
      List<String> values = headerMap.computeIfAbsent(name, k -> new ArrayList<>(2));
      values.add(header.getValue());
    }
    return headerMap;
  }

  public String getHeaderValue(Header[] headers, String name) {
    if (name == null || "".equals(name)) {
      return null;
    }
    for (Header header : headers) {
      if (name.equals(header.getName())) {
        return header.getValue();
      }
    }
    return null;
  }

  @Override
  public String buildUrl(RequestParam requestParam) {
    return super.buildUrl(requestParam).replace("\"", "%22");
  }
}
