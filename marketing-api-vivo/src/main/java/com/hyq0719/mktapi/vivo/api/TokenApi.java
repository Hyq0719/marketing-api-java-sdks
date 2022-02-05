package com.hyq0719.mktapi.vivo.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.vivo.VivoApiRequest;
import com.hyq0719.mktapi.vivo.bean.common.VivoResponse;
import com.hyq0719.mktapi.vivo.bean.token.Oauth2RefreshTokenRequest;
import com.hyq0719.mktapi.vivo.bean.token.Oauth2RefreshTokenResponseData;
import com.hyq0719.mktapi.vivo.bean.token.Oauth2TokenRequest;
import com.hyq0719.mktapi.vivo.bean.token.Oauth2TokenResponseData;

import java.util.List;

public class TokenApi extends AbstractVivoApi {
  private volatile Oauth2Token oauth2Token;
  private volatile Oauth2RefreshToken oauth2RefreshToken;

  public TokenApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public Oauth2Token oauth2Token() {
    if (oauth2Token == null) {
      synchronized (Oauth2Token.class) {
        if (oauth2Token == null) {
          oauth2Token = (Oauth2Token) init(Oauth2Token.class);
        }
      }
    }
    return oauth2Token;
  }

  public Oauth2RefreshToken oauth2RefreshToken() {
    if (oauth2RefreshToken == null) {
      synchronized (Oauth2RefreshToken.class) {
        if (oauth2RefreshToken == null) {
          oauth2RefreshToken = (Oauth2RefreshToken) init(Oauth2RefreshToken.class);
        }
      }
    }
    return oauth2RefreshToken;
  }

  @ApiRequestMapping(value = "/oauth2/token", method = RequestConstants.GET, usePostBody =
          false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class Oauth2Token extends VivoApiRequest<Oauth2TokenRequest,
          VivoResponse<Oauth2TokenResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                Oauth2TokenRequest request) {
      Integer clientId = request.getClientId();
      if (clientId != null) {
        localVarQueryParams.addAll(parameterToPair("client_id", clientId));
      }
      String clientSecret = request.getClientSecret();
      if (clientSecret != null) {
        localVarQueryParams.addAll(parameterToPair("client_secret", clientSecret));
      }
      String grantType = request.getGrantType();
      if (grantType != null) {
        localVarQueryParams.addAll(parameterToPair("grant_type", grantType));
      }
      String code = request.getCode();
      if (code != null) {
        localVarQueryParams.addAll(parameterToPair("code", code));
      }
    }

    @Override
    public String[] getLocalVarAuthNames() {
      return new String[]{};
    }
  }

  @ApiRequestMapping(value = "/oauth2/refreshToken", method = RequestConstants.GET, usePostBody =
          false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class Oauth2RefreshToken extends VivoApiRequest<Oauth2RefreshTokenRequest,
          VivoResponse<Oauth2RefreshTokenResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                Oauth2RefreshTokenRequest request) {
      String clientId = request.getClientId();
      if (clientId != null) {
        localVarQueryParams.addAll(parameterToPair("client_id", clientId));
      }
      String clientSecret = request.getClientSecret();
      if (clientSecret != null) {
        localVarQueryParams.addAll(parameterToPair("client_secret", clientSecret));
      }
      String refreshToken = request.getRefreshToken();
      if (refreshToken != null) {
        localVarQueryParams.addAll(parameterToPair("refresh_token", refreshToken));
      }
    }

    @Override
    public String[] getLocalVarAuthNames() {
      return new String[]{};
    }
  }
}
