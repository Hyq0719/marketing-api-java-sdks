package com.hyq0719.mktapi.tencent;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.executor.http.HttpHandler;
import com.hyq0719.mktapi.common.token.ExternalTokenService;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;

public class TencentApiClient extends ApiClient {

  public TencentApiClient(ITokenLocalCache iTokenLocalCache, HttpHandler httpsClient,
                          ExternalTokenService externalTokenService) {
    super(iTokenLocalCache, httpsClient, externalTokenService);
  }

}
