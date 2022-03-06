package test.token.service;

import com.hyq0719.mktapi.common.token.IToken;
import com.hyq0719.mktapi.vivo.token.VivoExternalTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import test.auth.bean.AuthToken;
import test.auth.service.AuthService;
import test.constant.ChannelConstants;
import test.token.bean.VivoToken;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class VivoTokenService extends VivoExternalTokenService {
  @Resource
  AuthService authService;

  /**
   * 模拟刷新所有token
   *
   * @return 刷新后的token list
   */
  @Override
  public List<IToken> refreshAllToken() {
    log.info("VivoTokenService refreshAllToken");
    List<IToken> tokens = new ArrayList<>();
    List<AuthToken> authTokenList = authService.getTokenByChannel(ChannelConstants.VIVO);
    if (CollectionUtils.isEmpty(authTokenList)) {
      return tokens;
    }

    for (AuthToken authToken : authTokenList) {
      tokens.add(new VivoToken(authToken.getAdvertiserId(), authToken.getAccessToken()));
    }
    addTokenForTest(tokens);
    return tokens;
  }

  /**
   * 模拟刷新单个token
   *
   * @param tokenKey 广告主账号
   * @return 刷新后的token
   */
  @Override
  public IToken refreshToken(String tokenKey) {
    AuthToken authToken = authService.getToken(ChannelConstants.VIVO, tokenKey);
    return new VivoToken(authToken.getAdvertiserId(), authToken.getAccessToken());
  }

  /**
   * 测试时手动添加token
   *
   * @param tokens 已有的token list
   */
  private void addTokenForTest(List<IToken> tokens) {
    tokens.add(new VivoToken("0000000000", "0000000000"));
    tokens.add(new VivoToken("0000000000", "0000000000"));
  }
}
