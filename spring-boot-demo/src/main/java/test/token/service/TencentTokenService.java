package test.token.service;

import com.hyq0719.mktapi.common.token.IToken;
import com.hyq0719.mktapi.tencent.token.TencentExternalTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import test.auth.bean.AuthToken;
import test.auth.service.AuthService;
import test.auth.tencent.TencentAccountService;
import test.constant.ChannelConstants;
import test.token.bean.TencentToken;
import test.token.bean.VivoToken;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class TencentTokenService extends TencentExternalTokenService {
  @Resource
  private AuthService authService;
  @Resource
  private TencentAccountService tencentAccountService;

  /**
   * 模拟刷新所有token
   */
  @Override
  public List<IToken> refreshAllToken() {
    log.info("TencentTokenService refreshAllToken");

    List<AuthToken> authTokenList = authService.getTokenByChannel(ChannelConstants.TENCENT);
    List<IToken> tokens = new ArrayList<>();
    for (AuthToken authToken : authTokenList) {
      List<String> subAccounts = tencentAccountService.getSubAccounts(authToken.getAccessToken());
      if (CollectionUtils.isEmpty(subAccounts)) {
        tokens.add(new VivoToken(authToken.getAdvertiserId(), authToken.getAccessToken()));
      } else {
        for (String subAccount : subAccounts) {
          tokens.add(new TencentToken(subAccount, authToken.getAccessToken()));
        }
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
    AuthToken authToken = authService.getToken(ChannelConstants.TENCENT, tokenKey);
    return new TencentToken(authToken.getAdvertiserId(), authToken.getAccessToken());
  }

  /**
   * 测试时手动添加token
   *
   * @param tokens 已有的token list
   */
  private void addTokenForTest(List<IToken> tokens) {
    tokens.add(new TencentToken("0000000000", "0000000000"));
    tokens.add(new TencentToken("0000000000", "0000000000"));
  }
}
