package test.token.service;

import com.hyq0719.mktapi.common.token.IToken;
import com.hyq0719.mktapi.oceanengine.token.OceanExternalTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import test.auth.bean.AuthToken;
import test.auth.oceanengine.OceanAccountService;
import test.auth.service.AuthService;
import test.constant.ChannelConstants;
import test.token.bean.OceanToken;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class OceanEngineTokenService extends OceanExternalTokenService {
  @Resource
  private AuthService authService;
  @Resource
  private OceanAccountService oceanAccountService;

  /**
   * 模拟刷新所有token
   */
  @Override
  public List<IToken> refreshAllToken() {
    log.info("OceanEngineTokenService refreshAllToken");
    List<IToken> tokens = new ArrayList<>();

    List<AuthToken> authTokenList = authService.getTokenByChannel(ChannelConstants.OCEAN_ENGINE);
    if (CollectionUtils.isEmpty(authTokenList)) {
      return tokens;
    }
    for (AuthToken authToken : authTokenList) {
      String advertiserId = authToken.getAdvertiserId();
      String accessToken = authToken.getAccessToken();
      //获取子账号
      List<String> subAccounts = oceanAccountService.getOceanSubAccounts(advertiserId, accessToken);
      //用广告主账号给子账号依次授权
      for (String subAccount : subAccounts) {
        tokens.add(new OceanToken(subAccount, accessToken));
      }
    }
    addTokenForTest(tokens);
    return tokens;
  }

  /**
   * 模拟刷新单个token
   *
   * @param tokenKey token key
   * @return
   */
  @Override
  public IToken refreshToken(String tokenKey) {
    AuthToken authToken = authService.getToken(ChannelConstants.OCEAN_ENGINE, tokenKey);
    return new OceanToken(authToken.getAdvertiserId(), authToken.getAccessToken());
  }

  /**
   * 测试时手动添加token
   *
   * @param tokens 已有的token list
   */
  private void addTokenForTest(List<IToken> tokens) {
    tokens.add(new OceanToken("0000000000", "0000000000"));
    tokens.add(new OceanToken("0000000000", "0000000000"));
  }
}
