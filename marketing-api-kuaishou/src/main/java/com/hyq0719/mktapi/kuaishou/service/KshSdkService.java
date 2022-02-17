package com.hyq0719.mktapi.kuaishou.service;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.kuaishou.api.AccountServiceApi;
import com.hyq0719.mktapi.kuaishou.api.AdServingApi;
import com.hyq0719.mktapi.kuaishou.api.DataReportApi;
import lombok.Getter;

@Getter
public class KshSdkService {
  private AccountServiceApi accountServiceApi;
  private AdServingApi adServingApi;
  private DataReportApi dataReportApi;

  public KshSdkService(ApiClient apiClient, RetryStrategy retryStrategy) {
    accountServiceApi = new AccountServiceApi(apiClient, retryStrategy);
    adServingApi = new AdServingApi(apiClient, retryStrategy);
    dataReportApi = new DataReportApi(apiClient, retryStrategy);
  }
}
