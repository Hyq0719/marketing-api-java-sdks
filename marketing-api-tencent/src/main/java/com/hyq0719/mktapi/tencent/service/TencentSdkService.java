package com.hyq0719.mktapi.tencent.service;


import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.tencent.api.AccountManagementApi;
import com.hyq0719.mktapi.tencent.api.AdManagementApi;
import com.hyq0719.mktapi.tencent.api.DataReportApi;
import lombok.Getter;

@Getter
public class TencentSdkService {
  private final AccountManagementApi accountManagementApi;
  private final AdManagementApi adManagementApi;
  private final DataReportApi dataReportApi;

  public TencentSdkService(ApiClient apiClient, RetryStrategy retryStrategy) {
    accountManagementApi = new AccountManagementApi(apiClient, retryStrategy);
    adManagementApi = new AdManagementApi(apiClient, retryStrategy);
    dataReportApi = new DataReportApi(apiClient, retryStrategy);
  }
}
