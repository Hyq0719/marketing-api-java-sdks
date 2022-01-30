package com.hyq0719.mktapi.common.executor.http;

import com.hyq0719.mktapi.common.executor.parameter.BaseUrl;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import com.hyq0719.mktapi.common.util.JSON;
import com.hyq0719.mktapi.common.util.PairUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public abstract class BaseHttpHandler implements HttpHandler {

  private JSON json;
  private boolean verifyingSsl;

  protected BaseHttpHandler() {
    json = new JSON();
    verifyingSsl = true;
  }

  /**
   * True if isVerifyingSsl flag is on
   *
   * @return True if isVerifySsl flag is on
   */
  public boolean isVerifyingSsl() {
    return verifyingSsl;
  }

  public String parameterToString(Object param) {
    return PairUtil.parameterToString(param, json);
  }

  @Override
  public String buildUrl(RequestParam requestParam) {
    StringBuilder url = new StringBuilder();
    final BaseUrl baseUrl = requestParam.getBaseUrl();

    url.append(baseUrl.getScheme()).append("://")
            .append(baseUrl.getHost()).append("/")
            .append(requestParam.getVersion())
            .append(requestParam.getPath());

    appendQueryParams(url, requestParam, baseUrl);

    appendCollectionQueryParams(url, requestParam);

    return url.toString();
  }

  @Override
  public JSON getJSON() {
    return json;
  }

  /**
   * Escape the given string to be used as URL query value.
   *
   * @param str String to be escaped
   * @return Escaped string
   */
  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  public boolean isJsonMime(String mime) {
    String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
    return mime != null && (mime.matches(jsonMime) || "*/*".equals(mime));
  }

  private void appendQueryParams(StringBuilder url, RequestParam requestParam, BaseUrl baseUrl) {
    List<Pair> queryParams = requestParam.getQueryParams();
    if (queryParams != null && !queryParams.isEmpty()) {
      // support (constant) query string in `path`, e.g. "/posts?draft=1"
      String prefix = baseUrl.toString().contains("?") ? "&" : "?";
      for (Pair param : queryParams) {
        if (param.getValue() != null) {
          if (prefix != null) {
            url.append(prefix);
            prefix = null;
          } else {
            url.append("&");
          }
          String value = parameterToString(param.getValue());
          url.append(escapeString(param.getName())).append("=").append(escapeString(value));
        }
      }
    }
  }

  private void appendCollectionQueryParams(StringBuilder url, RequestParam requestParam) {
    List<Pair> collectionQueryParams = requestParam.getCollectionQueryParams();
    if (collectionQueryParams != null && !collectionQueryParams.isEmpty()) {
      String prefix = url.toString().contains("?") ? "&" : "?";
      for (Pair param : collectionQueryParams) {
        if (param.getValue() != null) {
          if (prefix != null) {
            url.append(prefix);
            prefix = null;
          } else {
            url.append("&");
          }
          String value = parameterToString(param.getValue());
          // collection query parameter value already escaped as part of parameterToPairs
          url.append(escapeString(param.getName())).append("=").append(value);
        }
      }
    }
  }
}
