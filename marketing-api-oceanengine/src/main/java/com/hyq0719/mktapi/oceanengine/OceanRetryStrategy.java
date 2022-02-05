package com.hyq0719.mktapi.oceanengine;

import com.hyq0719.mktapi.common.RetryStrategy;


public class OceanRetryStrategy implements RetryStrategy {

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

  @Override
  public Boolean retryCondition(Long code) {
    return code == 40100 || code == 50000;
  }

  @Override
  public Boolean enable() {
    return enable;
  }

  @Override
  public Boolean isTokenExpired(Long code) {
    return code == 40105 || code == 40102;
  }
}
