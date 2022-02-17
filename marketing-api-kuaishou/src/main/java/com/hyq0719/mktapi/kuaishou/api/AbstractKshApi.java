package com.hyq0719.mktapi.kuaishou.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.kuaishou.KshApiRequest;

import java.lang.reflect.Method;

public class AbstractKshApi {

  private final ApiClient apiClient;
  private final RetryStrategy retryStrategy;

  protected AbstractKshApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    this.apiClient = apiClient;
    this.retryStrategy = retryStrategy;
  }

  public KshApiRequest init(Class classObj) {
    KshApiRequest request = null;
    try {
      request = (KshApiRequest) classObj.getDeclaredConstructors()[0].newInstance(this);
      Method methodSetConfig = classObj.getMethod("setConfig", ApiClient.class, RetryStrategy.class);
      methodSetConfig.invoke(request, apiClient, retryStrategy);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return request;
  }
}
