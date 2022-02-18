package com.hyq0719.mktapi.oceanengine.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.token.*;

import java.util.List;

public class TokenApi extends AbstractOceanApi {
  private volatile AccessToken accessToken;
  private volatile RefreshToken refreshToken;
  private volatile AdvertiserGet advertiserGet;
  private volatile UserInfo userInfo;
  private volatile AppAccessToken appAccessToken;

  public TokenApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public AccessToken accessToken() {
    if (accessToken == null) {
      synchronized (AccessToken.class) {
        if (accessToken == null) {
          accessToken = (AccessToken) init(AccessToken.class);
        }
      }
    }
    return accessToken;
  }

  public RefreshToken refreshToken() {
    if (refreshToken == null) {
      synchronized (RefreshToken.class) {
        if (refreshToken == null) {
          refreshToken = (RefreshToken) init(RefreshToken.class);
        }
      }
    }
    return refreshToken;
  }

  public AdvertiserGet advertiserGet() {
    if (advertiserGet == null) {
      synchronized (AdvertiserGet.class) {
        if (advertiserGet == null) {
          advertiserGet = (AdvertiserGet) init(AdvertiserGet.class);
        }
      }
    }
    return advertiserGet;
  }

  public UserInfo userInfo() {
    if (userInfo == null) {
      synchronized (UserInfo.class) {
        if (userInfo == null) {
          userInfo = (UserInfo) init(UserInfo.class);
        }
      }
    }
    return userInfo;
  }

  public AppAccessToken appAccessToken() {
    if (appAccessToken == null) {
      synchronized (AppAccessToken.class) {
        if (appAccessToken == null) {
          appAccessToken = (AppAccessToken) init(AppAccessToken.class);
        }
      }
    }
    return appAccessToken;
  }

  @ApiRequestMapping(value = "/access_token/", method = RequestConstants.POST, version = "oauth2")
  public class AccessToken extends OceanApiRequest<AccessTokenRequest, OceanResponse<AccessTokenResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AccessTokenRequest request) {
    }

    @Override
    public String[] getLocalVarAuthNames() {
      return new String[]{};
    }
  }

  @ApiRequestMapping(value = "/refresh_token/", method = RequestConstants.POST, version = "oauth2")
  public class RefreshToken extends OceanApiRequest<RefreshTokenRequest, OceanResponse<RefreshTokenResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                RefreshTokenRequest request) {
    }

    @Override
    public String[] getLocalVarAuthNames() {
      return new String[]{};
    }
  }

  @ApiRequestMapping(value = "/advertiser/get/", method = RequestConstants.GET, usePostBody =
    false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN}, version = "oauth2")
  public class AdvertiserGet extends OceanApiRequest<AdvertiserGetRequest,
    OceanResponse<AdvertiserGetResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdvertiserGetRequest request) {
      String accessToken = request.getAccessToken();
      if (accessToken != null) {
        localVarQueryParams.addAll(parameterToPair("access_token", accessToken));
      }
      Long appId = request.getAppId();
      if (appId != null) {
        localVarQueryParams.addAll(parameterToPair("app_id", appId));
      }
      String secret = request.getSecret();
      if (secret != null) {
        localVarQueryParams.addAll(parameterToPair("secret", secret));
      }
    }

    @Override
    public String[] getLocalVarAuthNames() {
      return new String[]{};
    }
  }

  @ApiRequestMapping(value = "/user/info/", method = RequestConstants.GET, usePostBody =
    false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class UserInfo extends OceanApiRequest<UserInfoRequest, OceanResponse<UserInfoResponseData>> {
  }

  @ApiRequestMapping(value = "/app_access_token/", method = RequestConstants.POST
    , version = "oauth2", host = "open.oceanengine.com")
  public class AppAccessToken extends OceanApiRequest<AppAccessTokenRequest
    , OceanResponse<AppAccessTokenResponseData>> {
    @Override
    public String[] getLocalVarAuthNames() {
      return new String[]{};
    }
  }
}
