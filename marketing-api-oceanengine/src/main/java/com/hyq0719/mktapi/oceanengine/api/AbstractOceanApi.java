// Copyright (C) 2021 Yuewen Inc. All rights reserved.

package com.hyq0719.mktapi.oceanengine.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;

import java.lang.reflect.Method;

public abstract class AbstractOceanApi {
  public static final String ADVERTISER_ID = "advertiser_id";
  public static final String FILTERING = "filtering";
  public static final String PAGE = "page";
  public static final String PAGE_SIZE = "page_size";
  public static final String START_DATE = "start_date";
  public static final String END_DATE = "end_date";
  public static final String GROUP_BY = "group_by";
  public static final String TIME_GRANULARITY = "time_granularity";

  private final ApiClient apiClient;
  private final RetryStrategy retryStrategy;

  protected AbstractOceanApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    this.apiClient = apiClient;
    this.retryStrategy = retryStrategy;
  }

  public OceanApiRequest init(Class classObj) {
    OceanApiRequest request = null;
    try {
      request = (OceanApiRequest) classObj.getDeclaredConstructors()[0].newInstance(this);
      Method methodSetConfig = classObj.getMethod("setConfig", ApiClient.class, RetryStrategy.class);
      methodSetConfig.invoke(request, apiClient, retryStrategy);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return request;
  }
}
