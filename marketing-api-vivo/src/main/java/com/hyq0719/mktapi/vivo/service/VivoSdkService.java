package com.hyq0719.mktapi.vivo.service;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.vivo.api.*;
import lombok.Getter;

@Getter
public class VivoSdkService {
  private final TokenApi tokenApi;
  private final AccountServiceApi accountServiceApi;
  private final DataQueryApi dataQueryApi;
  private final DmpTagApi dmpTagApi;
  private final DataAccessApi dataAccessApi;

  public VivoSdkService(ApiClient apiClient, RetryStrategy retryStrategy) {
    tokenApi = new TokenApi(apiClient, retryStrategy);
    accountServiceApi = new AccountServiceApi(apiClient, retryStrategy);
    dataQueryApi = new DataQueryApi(apiClient, retryStrategy);
    dmpTagApi = new DmpTagApi(apiClient, retryStrategy);
    dataAccessApi = new DataAccessApi(apiClient, retryStrategy);
  }
}
