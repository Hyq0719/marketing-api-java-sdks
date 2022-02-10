package com.hyq0719.mktapi.common.executor.parameter;

import com.google.gson.Gson;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * api请求参数
 *
 * @author hyq0719
 */
@Data
@Builder
@AllArgsConstructor
public class RequestParam {
  /**
   * 每个api的唯一路径
   */
  private String path;
  /**
   * 协议：http,https
   */
  private String scheme;
  /**
   * host地址
   */
  private String host;
  /**
   * api版本
   */
  private String version;
  /**
   * 请求方法：GET，POST等
   */
  private String method;
  /**
   * url中的请求参数
   */
  private List<Pair> queryParams;
  /**
   * url中的请求集合参数
   */
  private List<Pair> collectionQueryParams;
  /**
   * 是否使用请求体
   */
  private Boolean usePostBody;
  /**
   * 请求体
   */
  private Object postBody;
  /**
   * 请求头
   */
  private Map<String, String> headerParams;
  /**
   * 请求表参数
   */
  private Map<String, Object> formParams;
  /**
   * 请求授权参数名
   */
  private String[] authNames;
  /**
   * access token
   */
  private String accessToken;

  public RequestParam() {
    method = RequestConstants.GET;
    usePostBody = false;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
