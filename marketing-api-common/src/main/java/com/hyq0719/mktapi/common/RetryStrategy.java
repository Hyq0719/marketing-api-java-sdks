package com.hyq0719.mktapi.common;

/**
 * api请求重试策略
 *
 * @author hyq0719
 */
public interface RetryStrategy {

  /**
   * 重试次数，默认为3次
   *
   * @return 重试次数
   */
  default Integer retryCount() {
    return 3;
  }

  /**
   * 根据各渠道返回码判断是否重试
   *
   * @return 重试条件
   */
  default Boolean retryCondition(Long code) {
    return false;
  }

  /**
   * 是否开启重试
   *
   * @return 是否开启重试
   */
  default Boolean enable() {
    return true;
  }

  /**
   * 根据返回码判断token是否过期
   *
   * @param code 请求返回码
   * @return token是否过期
   */
  default Boolean isTokenExpired(Long code) {
    return false;
  }
}
