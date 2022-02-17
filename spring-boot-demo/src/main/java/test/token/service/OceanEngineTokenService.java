package test.token.service;

import com.hyq0719.mktapi.common.token.IToken;
import com.hyq0719.mktapi.oceanengine.token.OceanExternalTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import test.token.OceanTokenImpl;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class OceanEngineTokenService extends OceanExternalTokenService {

  /**
   * 模拟刷新所有token
   */
  @Override
  public List<IToken> refreshAllToken() {
    log.info("OceanEngineTokenService refreshAllToken");
    List<IToken> tokens = new ArrayList<>();
    tokens.add(new OceanTokenImpl("0000000000", "0000000000"));
    tokens.add(new OceanTokenImpl("0000000000", "0000000000"));
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
    return new OceanTokenImpl("0000000000", "0000000000");
  }
}
