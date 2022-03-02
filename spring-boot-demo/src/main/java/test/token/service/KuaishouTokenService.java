package test.token.service;

import com.hyq0719.mktapi.common.token.IToken;
import com.hyq0719.mktapi.kuaishou.token.KshExternalTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import test.token.bean.KshToken;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class KuaishouTokenService extends KshExternalTokenService {
  /**
   * 模拟刷新所有token
   */
  @Override
  public List<IToken> refreshAllToken() {
    log.info("KuaishouTokenService refreshAllToken");
    List<IToken> tokens = new ArrayList<>();
    tokens.add(new KshToken("0000000000", "0000000000"));
    tokens.add(new KshToken("0000000000", "0000000000"));
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
    return new KshToken("0000000000", "0000000000");
  }
}
