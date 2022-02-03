package com.hyq0719.mktapi.oceanengine.service;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.oceanengine.api.*;
import lombok.Getter;

@Getter
public class OceanSdkService {
  private final AccountServiceApi accountServiceApi;
  private final AdServingApi adServingApi;
  private final DataReportApi dataReportApi;
  private final MaterialApi materialApi;
  private final TokenApi tokenApi;
  private final DmpAudienceApi dmpAudienceApi;

  public OceanSdkService(ApiClient apiClient, RetryStrategy retryStrategy) {
    accountServiceApi = new AccountServiceApi(apiClient, retryStrategy);
    adServingApi = new AdServingApi(apiClient, retryStrategy);
    dataReportApi = new DataReportApi(apiClient, retryStrategy);
    materialApi = new MaterialApi(apiClient, retryStrategy);
    tokenApi = new TokenApi(apiClient, retryStrategy);
    dmpAudienceApi = new DmpAudienceApi(apiClient, retryStrategy);
  }
}
