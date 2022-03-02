package com.hyq0719.mktapi.vivo;

import com.hyq0719.mktapi.common.RetryStrategy;

public class VivoRetryStrategy implements RetryStrategy {

  private Integer retryCount = 3;

  private Boolean enable = true;

  public void setRetryCount(Integer retryCount) {
    if (retryCount == null) {
      return;
    }
    this.retryCount = retryCount;
  }

  public void setEnable(Boolean enable) {
    if (enable == null) {
      return;
    }
    this.enable = enable;
  }

  @Override
  public Integer retryCount() {
    return retryCount;
  }

  /**
   * @param code 请求返回码
   * @return 重试条件：服务异常或请求失败
   */
  @Override
  public Boolean retryCondition(Long code) {
    return code == 70110 || code == 70111;
  }

  @Override
  public Boolean enable() {
    return enable;
  }

  @Override
  public Boolean isTokenExpired(Long code) {
    return code == 60005 || code == 60002;
  }
}
