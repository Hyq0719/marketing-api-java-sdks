package com.hyq0719.mktapi.oceanengine;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.executor.http.HttpHandler;
import com.hyq0719.mktapi.common.token.ExternalTokenService;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;

public class OceanApiClient extends ApiClient {

  public OceanApiClient(ITokenLocalCache iTokenLocalCache, HttpHandler httpsClient,
                        ExternalTokenService externalTokenService) {
    super(iTokenLocalCache, httpsClient, externalTokenService);
  }
}
