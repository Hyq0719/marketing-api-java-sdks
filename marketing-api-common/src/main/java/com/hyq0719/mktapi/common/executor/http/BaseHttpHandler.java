package com.hyq0719.mktapi.common.executor.http;

import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import com.hyq0719.mktapi.common.util.JSON;
import com.hyq0719.mktapi.common.util.PairUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * HttpHandler抽象类，提供url构造的默认实现
 *
 * @author hyq0719
 */
public abstract class BaseHttpHandler implements HttpHandler {

  private final JSON json;
  private final boolean verifyingSsl;

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

    url.append(requestParam.getScheme()).append("://")
      .append(requestParam.getHost()).append("/")
      .append(requestParam.getVersion())
      .append(requestParam.getPath());

    appendQueryParams(url, requestParam);

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

  /**
   * 添加请求参数
   *
   * @param url          当前url
   * @param requestParam 请求参数
   */
  private void appendQueryParams(StringBuilder url, RequestParam requestParam) {
    List<Pair> queryParams = requestParam.getQueryParams();
    if (queryParams != null && !queryParams.isEmpty()) {
      // support (constant) query string in `path`, e.g. "/posts?draft=1"
      String prefix = "?";
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

  /**
   * 添加请求参数集合
   *
   * @param url          当前url
   * @param requestParam 请求参数
   */
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
