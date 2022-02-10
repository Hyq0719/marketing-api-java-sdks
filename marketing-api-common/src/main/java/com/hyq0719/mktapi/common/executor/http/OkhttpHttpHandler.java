package com.hyq0719.mktapi.common.executor.http;

import com.hyq0719.mktapi.common.ApiResponse;
import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import okhttp3.MultipartBody.Builder;
import okhttp3.internal.http.HttpMethod;
import okio.BufferedSink;
import okio.Okio;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class OkhttpHttpHandler extends BaseHttpHandler {

  private final OkHttpClient httpsClient;
  private final Map<String, String> defaultHeaderMap = new HashMap<>();
  private final String tempFolderPath = null;

  public OkhttpHttpHandler(OkHttpClient httpsClient) {
    this.httpsClient = httpsClient;
  }

  @Override
  public <T> ApiResponse<T> execute(RequestParam param, Type returnType) throws ApiException {
    try {
      Call call = buildCall(param);
      log.info(call.request().toString());
      Response response = call.execute();
      T data = handleResponse(response, returnType);
      return new ApiResponse<>(response.code(), response.headers().toMultimap(), data);
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  public Call buildCall(RequestParam param)
          throws ApiException {
    Request request = buildRequest(param);
    return httpsClient.newCall(request);
  }

  public Request buildRequest(RequestParam param) throws ApiException {
    final String url = buildUrl(param);
    final String method = param.getMethod();

    String contentType = param.getHeaderParams().get("Content-Type");
    // ensuring a default content type
    if (contentType == null) {
      contentType = "application/json";
    }

    RequestBody reqBody;
    final Object body = param.getPostBody();
    if (!HttpMethod.permitsRequestBody(param.getMethod())) {
      reqBody = null;
    } else if ("application/x-www-form-urlencoded".equals(contentType)) {
      reqBody = buildRequestBodyFormEncoding(param.getFormParams());
    } else if ("multipart/form-data".equals(contentType)) {
      reqBody = buildRequestBodyMultipart(param.getFormParams());
    } else if (body == null) {
      if ("DELETE".equals(method)) {
        // allow calling DELETE without sending a request body
        reqBody = null;
      } else {
        // use an empty request body (for POST, PUT and PATCH)
        reqBody = RequestBody.create(MediaType.parse(contentType), "");
      }
    } else {
      reqBody = serialize(body, contentType);
    }
    Request.Builder reqBuilder = new Request.Builder().url(url);
    processHeaderParams(param.getHeaderParams(), reqBuilder);
    return reqBuilder.method(method, reqBody).build();
  }

  /**
   * Build a form-encoding request body with the given form parameters.
   *
   * @param formParams Form parameters in the form of Map
   * @return RequestBody
   */
  public RequestBody buildRequestBodyFormEncoding(Map<String, Object> formParams) {
    FormBody.Builder formBuilder = new FormBody.Builder();
    for (Entry<String, Object> param : formParams.entrySet()) {
      formBuilder.add(param.getKey(), parameterToString(param.getValue()));
    }
    return formBuilder.build();
  }

  /**
   * Build a multipart (file uploading) request body with the given form parameters, which could
   * contain text fields and file fields.
   *
   * @param formParams Form parameters in the form of Map
   * @return RequestBody
   */
  public MultipartBody buildRequestBodyMultipart(Map<String, Object> formParams) {
    Builder mpBuilder = new Builder().setType(MultipartBody.FORM);
    for (Entry<String, Object> param : formParams.entrySet()) {
      if (param.getValue() instanceof File) {
        File file = (File) param.getValue();
        mpBuilder.addFormDataPart(param.getKey(), file.getName()
                , RequestBody.create(MediaType.parse("multipart/form-data"), file));
      } else {
        mpBuilder.addFormDataPart(param.getKey(), String.valueOf(param.getValue()));
      }
    }
    return mpBuilder.build();
  }

  public RequestBody serialize(Object obj, String contentType) throws ApiException {
    if (obj instanceof byte[]) {
      // Binary (byte array) body parameter support.
      return RequestBody.create(MediaType.parse(contentType), (byte[]) obj);
    } else if (obj instanceof File) {
      // File body parameter support.
      return RequestBody.create(MediaType.parse(contentType), (File) obj);
    } else if (isJsonMime(contentType)) {
      String content;
      if (obj != null) {
        content = getJSON().serialize(obj);
      } else {
        content = null;
      }
      return RequestBody.create(MediaType.parse(contentType), content);
    } else {
      throw new ApiException("Content type \"" + contentType + "\" is not supported");
    }
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
  @SuppressWarnings("unchecked")
  public <T> T deserialize(Response response, Type returnType) throws ApiException {
    if (response == null || returnType == null) {
      return null;
    }

    if ("byte[]".equals(returnType.toString())) {
      // Handle binary response (byte array).
      try {
        return (T) response.body().bytes();
      } catch (IOException e) {
        throw new ApiException(e);
      }
    } else if (returnType.equals(File.class)) {
      // Handle file downloading.
      return (T) downloadFileFromResponse(response);
    }

    String respBody;
    try {
      if (response.body() != null) {
        respBody = response.body().string();
      } else {
        respBody = null;
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }

    if (respBody == null || "".equals(respBody)) {
      return null;
    }

    String contentType = response.headers().get("Content-Type");
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
              response.code(),
              response.headers().toMultimap(),
              respBody);
    }
  }

  public File downloadFileFromResponse(Response response) throws ApiException {
    try {
      File file = prepareDownloadFile(response);
      BufferedSink sink = Okio.buffer(Okio.sink(file));
      sink.writeAll(response.body().source());
      sink.close();
      return file;
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  /**
   * Prepare file for download
   *
   * @param response An instance of the Response object
   * @return Prepared file for the download
   * @throws IOException If fail to prepare file for download
   */
  public File prepareDownloadFile(Response response) throws IOException {
    String filename = null;
    String contentDisposition = response.header("Content-Disposition");
    if (contentDisposition != null && !"".equals(contentDisposition)) {
      // Get filename from the Content-Disposition header.
      Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
      Matcher matcher = pattern.matcher(contentDisposition);
      if (matcher.find()) {
        filename = sanitizeFilename(matcher.group(1));
      }
    }

    String prefix = null;
    String suffix = null;
    if (filename == null) {
      prefix = "download-";
      suffix = "";
    } else {
      int pos = filename.lastIndexOf(".");
      if (pos == -1) {
        prefix = filename + "-";
      } else {
        prefix = filename.substring(0, pos) + "-";
        suffix = filename.substring(pos);
      }
      // File.createTempFile requires the prefix to be at least three characters long
      if (prefix.length() < 3) {
        prefix = "download-";
      }
    }

    if (tempFolderPath == null) {
      return File.createTempFile(prefix, suffix);
    } else {
      return File.createTempFile(prefix, suffix, new File(tempFolderPath));
    }
  }


  /**
   * Sanitize filename by removing path. e.g. ../../sun.gif becomes sun.gif
   *
   * @param filename The filename to be sanitized
   * @return The sanitized filename
   */
  public String sanitizeFilename(String filename) {
    return filename.replaceAll(".*[/\\\\]", "");
  }


  public <T> T handleResponse(Response response, Type returnType) throws ApiException {
    if (response.isSuccessful()) {
      if (returnType == null || response.code() == 204) {
        // returning null if the returnType is not defined,
        // or the status code is 204 (No Content)
        if (response.body() != null) {
          try {
            response.body().close();
          } catch (Exception e) {
            throw new ApiException(
                    response.message(), e, response.code(), response.headers().toMultimap());
          }
        }
        return null;
      } else {
        return deserialize(response, returnType);
      }
    } else {
      String respBody = null;
      if (response.body() != null) {
        try {
          respBody = response.body().string();
        } catch (IOException e) {
          throw new ApiException(
                  response.message(), e, response.code(), response.headers().toMultimap());
        }
      }
      throw new ApiException(
              response.message(), response.code(), response.headers().toMultimap(), respBody);
    }
  }

  /**
   * Set header parameters to the request builder, including default headers.
   *
   * @param headerParams Header parameters in the ofrm of Map
   * @param reqBuilder   Reqeust.Builder
   */
  public void processHeaderParams(Map<String, String> headerParams, Request.Builder reqBuilder) {
    for (Entry<String, String> param : headerParams.entrySet()) {
      reqBuilder.header(param.getKey(), parameterToString(param.getValue()));
    }
    for (Entry<String, String> header : defaultHeaderMap.entrySet()) {
      if (!headerParams.containsKey(header.getKey())) {
        reqBuilder.header(header.getKey(), parameterToString(header.getValue()));
      }
    }
  }

}
