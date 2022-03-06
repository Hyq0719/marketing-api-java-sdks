package test.auth.tencent;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.tencent.bean.common.TencentResponse;
import com.hyq0719.mktapi.tencent.bean.oauth.OauthTokenRequest;
import com.hyq0719.mktapi.tencent.bean.oauth.OauthTokenResponseData;
import com.hyq0719.mktapi.tencent.service.TencentSdkService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import test.AppProperties;
import test.auth.TokenAuthorizer;
import test.auth.bean.AuthToken;
import test.auth.bean.Result;
import test.constant.ChannelConstants;
import test.util.Util;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author hyq0719
 * @date 2022/3/6 10:16 下午
 */
@Component
public class TencentAuthorizer implements TokenAuthorizer {
  private final TencentProperties tencentProperties;
  @Resource
  private TencentSdkService tencentSdkService;
  @Resource
  private AppProperties appProperties;

  public TencentAuthorizer(TencentProperties tencentProperties) {
    this.tencentProperties = tencentProperties;
  }

  @Override
  public String channel() {
    return ChannelConstants.TENCENT;
  }

  @Override
  public Result<String> parseAuthCode(Map<String, String> params) {
    String authCode = params.get("authorization_code");
    if (StringUtils.isEmpty(authCode)) {
      return Result.ofFail();
    }
    return Result.ofSuccessful(authCode);
  }

  @Override
  public Result<AuthToken> authorize(String advertiserId, String authCode) {
    TencentProperties.TencentOAuth2Config config = tencentProperties.getConfigs().get(advertiserId);
    if (config == null) {
      return Result.ofFail();
    }

    if (isDebugMode()) {
      return Util.authorizeForTest(advertiserId, authCode, channel());
    }
    OauthTokenRequest request = new OauthTokenRequest();
    request.clientId(Integer.valueOf(config.getClientId())).clientSecret(config.getSecret()).grantType("authorization_code")
      .authorizationCode(authCode).redirectUri(config.getCallbackUrl());
    try {
      TencentResponse<OauthTokenResponseData> response = tencentSdkService.getOauthApi().oauthToken().execute(request);
      if (!response.isSuccessful()) {
        return Result.ofFail();
      }
      OauthTokenResponseData data = response.getData();
      AuthToken authToken = new AuthToken();
      authToken.setChannel(channel());
      authToken.setAdvertiserId(data.getAuthorizerInfo().getWechatAccountId());
      authToken.setAccessToken(data.getAccessToken());
      authToken.setRefreshToken(data.getRefreshToken());
      long now = System.currentTimeMillis();
      authToken.setCreateTime(now);
      authToken.setRefreshTime(now);
      return Result.ofSuccessful(authToken);
    } catch (ApiException e) {
      e.printStackTrace();
    }
    return Result.ofFail();
  }

  @Override
  public Result<AuthToken> refresh(AuthToken authToken) {
    TencentProperties.TencentOAuth2Config config = tencentProperties.getConfigs().get(authToken.getAdvertiserId());
    if (config == null) {
      return Result.ofFail();
    }

    if (isDebugMode()) {
      return Util.refreshForTest(authToken);
    }

    OauthTokenRequest request = new OauthTokenRequest();
    request.clientId(Integer.valueOf(config.getClientId())).clientSecret(config.getSecret())
      .grantType("refresh_token").refreshToken(authToken.getRefreshToken());
    try {
      TencentResponse<OauthTokenResponseData> response = tencentSdkService.getOauthApi().oauthToken().execute(request);
      if (!response.isSuccessful()) {
        return Result.ofFail();
      }
      OauthTokenResponseData data = response.getData();
      AuthToken newAuthToken = authToken.newToken(data.getAccessToken(), data.getRefreshToken());
      return Result.ofSuccessful(newAuthToken);
    } catch (ApiException e) {
      e.printStackTrace();
    }
    return Result.ofFail();
  }

  @Override
  public boolean isDebugMode() {
    return appProperties.isDebugMode();
  }
}
