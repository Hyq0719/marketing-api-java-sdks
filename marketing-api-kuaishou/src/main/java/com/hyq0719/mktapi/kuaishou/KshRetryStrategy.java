package com.hyq0719.mktapi.kuaishou;

import com.hyq0719.mktapi.common.RetryStrategy;


public class KshRetryStrategy implements RetryStrategy {

  private Integer retryCount = 10;

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

  @Override
  public Boolean retryCondition(Long code) {
    return code == 400001;
  }

  @Override
  public Boolean enable() {
    return enable;
  }

  @Override
  public Boolean isTokenExpired(Long code) {
    return code == 402000 || code == 402004;
  }
}
