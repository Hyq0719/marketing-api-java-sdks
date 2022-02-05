package com.hyq0719.mktapi.vivo.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.vivo.VivoApiRequest;

import java.lang.reflect.Method;

public class AbstractVivoApi {
  public static final String ADVERTISER_ID = "advertiser_id";

  private final ApiClient apiClient;
  private final RetryStrategy retryStrategy;

  protected AbstractVivoApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    this.apiClient = apiClient;
    this.retryStrategy = retryStrategy;
  }

  public VivoApiRequest init(Class classObj) {
    VivoApiRequest request = null;
    try {
      request = (VivoApiRequest) classObj.getDeclaredConstructors()[0].newInstance(this);
      Method methodSetConfig = classObj.getMethod("setConfig", ApiClient.class, RetryStrategy.class);
      methodSetConfig.invoke(request, apiClient, retryStrategy);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return request;
  }
}
