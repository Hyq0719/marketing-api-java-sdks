package com.hyq0719.mktapi.tencent.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.tencent.TencentApiRequest;

import java.lang.reflect.Method;

public class AbstractTencentApi {
  public static final String ACCOUNT_ID = "account_id";
  public static final String FILTERING = "filtering";
  public static final String PAGE = "page";
  public static final String PAGE_SIZE = "page_size";
  public static final String IS_DELETED = "is_deleted";
  public static final String MULTI = "multi";

  private final ApiClient apiClient;
  private final RetryStrategy retryStrategy;

  protected AbstractTencentApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    this.apiClient = apiClient;
    this.retryStrategy = retryStrategy;
  }

  public TencentApiRequest init(Class classObj) {
    TencentApiRequest request = null;
    try {
      request = (TencentApiRequest) classObj.getDeclaredConstructors()[0].newInstance(this);
      Method methodSetConfig = classObj.getMethod("setConfig", ApiClient.class, RetryStrategy.class);
      methodSetConfig.invoke(request, apiClient, retryStrategy);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return request;
  }
}
