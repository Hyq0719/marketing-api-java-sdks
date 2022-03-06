package com.hyq0719.mktapi.tencent.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.tencent.TencentApiRequest;
import com.hyq0719.mktapi.tencent.bean.common.TencentResponse;
import com.hyq0719.mktapi.tencent.bean.oauth.OauthAuthorizeRequest;
import com.hyq0719.mktapi.tencent.bean.oauth.OauthTokenRequest;
import com.hyq0719.mktapi.tencent.bean.oauth.OauthTokenResponseData;

import java.util.List;

/**
 * @author hyq0719
 * @date 2022/3/6 7:55 下午
 */
public class OauthApi extends AbstractTencentApi {
  /**
   * OAuth授权
   */
  private volatile OauthAuthorize oauthAuthorize;
  private volatile OauthToken oauthToken;

  public OauthApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public OauthAuthorize oauthAuthorize() {
    if (oauthAuthorize == null) {
      synchronized (OauthAuthorize.class) {
        if (oauthAuthorize == null) {
          oauthAuthorize = (OauthAuthorize) init(OauthAuthorize.class);
        }
      }
    }
    return oauthAuthorize;
  }

  public OauthToken oauthToken() {
    if (oauthToken == null) {
      synchronized (OauthToken.class) {
        if (oauthToken == null) {
          oauthToken = (OauthToken) init(OauthToken.class);
        }
      }
    }
    return oauthToken;
  }

  @ApiRequestMapping(value = "/authorize", method = RequestConstants.GET, usePostBody = false, version = "oauth",
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class OauthAuthorize extends TencentApiRequest<OauthAuthorizeRequest, TencentResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                OauthAuthorizeRequest request) {
      Integer clientId = request.getClientId();
      if (clientId != null) {
        localVarQueryParams.addAll(parameterToPair("client_id", clientId));
      }
      String redirectUri = request.getRedirectUri();
      if (redirectUri != null) {
        localVarQueryParams.addAll(parameterToPair("redirect_uri", redirectUri));
      }
      String state = request.getState();
      if (state != null) {
        localVarQueryParams.addAll(parameterToPair("state", state));
      }
      String scope = request.getScope();
      if (scope != null) {
        localVarQueryParams.addAll(parameterToPair("scope", scope));
      }
      String accountType = request.getAccountType();
      if (accountType != null) {
        localVarQueryParams.addAll(parameterToPair("account_type", accountType));
      }
      Integer accountDisplayNumber = request.getAccountDisplayNumber();
      if (accountDisplayNumber != null) {
        localVarQueryParams.addAll(parameterToPair("account_display_number", accountDisplayNumber));
      }
    }
  }

  @ApiRequestMapping(value = "/token", method = RequestConstants.GET, usePostBody = false, version = "oauth",
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class OauthToken extends TencentApiRequest<OauthTokenRequest, TencentResponse<OauthTokenResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                OauthTokenRequest request) {
      Integer clientId = request.getClientId();
      if (clientId != null) {
        localVarQueryParams.addAll(parameterToPair("client_id", clientId));
      }
      String redirectUri = request.getRedirectUri();
      if (redirectUri != null) {
        localVarQueryParams.addAll(parameterToPair("redirect_uri", redirectUri));
      }
      String grantType = request.getGrantType();
      if (grantType != null) {
        localVarQueryParams.addAll(parameterToPair("grant_type", grantType));
      }
      String authorizationCode = request.getAuthorizationCode();
      if (authorizationCode != null) {
        localVarQueryParams.addAll(parameterToPair("authorization_code", authorizationCode));
      }
      String refreshToken = request.getRefreshToken();
      if (refreshToken != null) {
        localVarQueryParams.addAll(parameterToPair("refresh_token", refreshToken));
      }
    }
  }
}
