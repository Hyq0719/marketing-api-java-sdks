package test.auth.vivo;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.vivo.bean.common.VivoResponse;
import com.hyq0719.mktapi.vivo.bean.token.Oauth2RefreshTokenRequest;
import com.hyq0719.mktapi.vivo.bean.token.Oauth2RefreshTokenResponseData;
import com.hyq0719.mktapi.vivo.bean.token.Oauth2TokenRequest;
import com.hyq0719.mktapi.vivo.bean.token.Oauth2TokenResponseData;
import com.hyq0719.mktapi.vivo.service.VivoSdkService;
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
 * @date 2022/2/25 3:45 下午
 */
@Component
public class VivoAuthorizer implements TokenAuthorizer {
  private final VivoProperties vivoProperties;
  @Resource
  private VivoSdkService vivoSdkService;
  @Resource
  private AppProperties appProperties;

  public VivoAuthorizer(VivoProperties vivoProperties) {
    this.vivoProperties = vivoProperties;
  }

  @Override
  public String channel() {
    return ChannelConstants.VIVO;
  }

  @Override
  public Result<String> parseAuthCode(Map<String, String> params) {
    String authCode = params.get("code");
    if (StringUtils.isEmpty(authCode)) {
      return Result.ofFail();
    }
    return Result.ofSuccessful(authCode);
  }

  @Override
  public Result<AuthToken> authorize(String advertiserId, String authCode) {
    VivoProperties.VivoOAuth2Config config = vivoProperties.getConfigs().get(advertiserId);
    if (config == null) {
      return Result.ofFail();
    }

    if (isDebugMode()) {
      return Util.authorizeForTest(advertiserId, authCode, channel());
    }

    Oauth2TokenRequest request = new Oauth2TokenRequest();
    request.clientId((int) config.getClientId()).clientSecret(config.getSecret()).grantType("code").code(authCode);
    try {
      VivoResponse<Oauth2TokenResponseData> response = vivoSdkService.getTokenApi().oauth2Token().execute(request);
      if (!response.isSuccessful()) {
        return Result.ofFail();
      }
      Oauth2TokenResponseData data = response.getData();
      AuthToken authToken = new AuthToken();
      authToken.setChannel(channel());
      authToken.setAdvertiserId(advertiserId);
      authToken.setAccessToken(data.getAccessToken());
      authToken.setRefreshToken(data.getRefreshToken());
      authToken.setCreateTime(System.currentTimeMillis());
      authToken.setRefreshTime(data.getRefreshTokenDate());
      return Result.ofSuccessful(authToken);
    } catch (ApiException e) {
      e.printStackTrace();
    }

    return Result.ofFail();
  }

  @Override
  public Result<AuthToken> refresh(AuthToken authToken) {
    VivoProperties.VivoOAuth2Config config = vivoProperties.getConfigs().get(authToken.getAdvertiserId());
    if (config == null) {
      return Result.ofFail();
    }

    if (isDebugMode()) {
      return Util.refreshForTest(authToken);
    }

    Oauth2RefreshTokenRequest request = new Oauth2RefreshTokenRequest();
    request.clientId(String.valueOf(config.getClientId())).clientSecret(config.getSecret()).refreshToken(authToken.getRefreshToken());
    try {
      VivoResponse<Oauth2RefreshTokenResponseData> response = vivoSdkService.getTokenApi().oauth2RefreshToken().execute(request);
      if (!response.isSuccessful()) {
        return Result.ofFail();
      }
      Oauth2RefreshTokenResponseData data = response.getData();
      AuthToken newAuthToken = authToken.newToken(data.getAccessToken(), data.getRefreshToken(), Long.valueOf(data.getRefreshTokenDate()));
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
