package com.hyq0719.mktapi.common;

public interface RetryStrategy {

  /**
   * 重试次数
   *
   * @return
   */
  default Integer retryCount() {
    return 10;
  }

  /**
   * 重试条件
   *
   * @return
   */
  default Boolean retryCondition(Long code) {
    return false;
  }

  /**
   * 是否启用
   *
   * @return
   */
  default Boolean enable() {
    return true;
  }

  default Boolean isTokenExpired(Long code) {
    return false;
  }
}
