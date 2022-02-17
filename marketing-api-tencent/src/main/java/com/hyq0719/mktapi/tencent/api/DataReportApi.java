package com.hyq0719.mktapi.tencent.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;

/**
 * 腾讯广告——数据洞察api
 */
public class DataReportApi extends AbstractTencentApi {

  public DataReportApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }
}
