package com.hyq0719.mktapi.common.executor.parameter;

import lombok.Builder;
import lombok.Data;

/**
 * 请求基础url
 *
 * @author hyq0719
 */
@Data
@Builder
public class BaseUrl {
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

  @Override
  public String toString() {
    return scheme + "://" + host + "/" + version;
  }
}
