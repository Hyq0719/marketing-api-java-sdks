package test.auth.oceanengine;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.token.AccessTokenRequest;
import com.hyq0719.mktapi.oceanengine.bean.token.AccessTokenResponseData;
import com.hyq0719.mktapi.oceanengine.bean.token.RefreshTokenRequest;
import com.hyq0719.mktapi.oceanengine.bean.token.RefreshTokenResponseData;
import com.hyq0719.mktapi.oceanengine.service.OceanSdkService;
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
 * @date 2022/2/25 3:49 下午
 */
@Component
public class OceanAuthorizer implements TokenAuthorizer {
  private final OceanProperties oceanProperties;
  @Resource
  private OceanSdkService oceanSdkService;
  @Resource
  private AppProperties appProperties;

  public OceanAuthorizer(OceanProperties oceanProperties) {
    this.oceanProperties = oceanProperties;
  }

  @Override
  public String channel() {
    return ChannelConstants.OCEAN_ENGINE;
  }

  @Override
  public Result<String> parseAuthCode(Map<String, String> params) {
    String authCode = params.get("auth_code");
    if (StringUtils.isEmpty(authCode)) {
      return Result.ofFail();
    }
    return Result.ofSuccessful(authCode);
  }

  @Override
  public Result<AuthToken> authorize(String advertiserId, String authCode) {
    OceanProperties.OceanOAuth2Config config = oceanProperties.getConfigs().get(advertiserId);
    if (config == null) {
      return Result.ofFail();
    }

    if (isDebugMode()) {
      return Util.authorizeForTest(advertiserId, authCode, channel());
    }
    AccessTokenRequest request = new AccessTokenRequest();
    request.appId(Long.valueOf(config.getClientId())).secret(config.getSecret()).grantType("auth_code").authCode(authCode);
    try {
      OceanResponse<AccessTokenResponseData> response = oceanSdkService.getTokenApi().accessToken().execute(request);
      if (!response.isSuccessful()) {
        return Result.ofFail();
      }
      AccessTokenResponseData data = response.getData();
      AuthToken authToken = new AuthToken();
      authToken.setChannel(channel());
      authToken.setAdvertiserId(advertiserId);
      authToken.setAccessToken(data.getAccessToken());
      authToken.setRefreshToken(data.getRefreshToken());
      long now = System.currentTimeMillis();
      authToken.setCreateTime(now);
      authToken.setRefreshTime(now);
      return Result.ofSuccessful(authToken);
    } catch (ApiException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public Result<AuthToken> refresh(AuthToken authToken) {
    OceanProperties.OceanOAuth2Config config = oceanProperties.getConfigs().get(authToken.getAdvertiserId());
    if (config == null) {
      return Result.ofFail();
    }

    if (isDebugMode()) {
      return Util.refreshForTest(authToken);
    }

    RefreshTokenRequest request = new RefreshTokenRequest();
    request.appId(Long.valueOf(config.getClientId())).secret(config.getSecret())
      .refreshToken(authToken.getRefreshToken()).grantType("auth_code");
    try {
      OceanResponse<RefreshTokenResponseData> response = oceanSdkService.getTokenApi().refreshToken().execute(request);
      if (!response.isSuccessful()) {
        return Result.ofFail();
      }
      RefreshTokenResponseData data = response.getData();
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
