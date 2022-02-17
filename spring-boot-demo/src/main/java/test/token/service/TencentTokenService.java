package test.token.service;

import com.hyq0719.mktapi.common.token.IToken;
import com.hyq0719.mktapi.tencent.token.TencentExternalTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import test.token.TencentTokenImpl;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class TencentTokenService extends TencentExternalTokenService {
  /**
   * 模拟刷新所有token
   */
  @Override
  public List<IToken> refreshAllToken() {
    log.info("TencentTokenService refreshAllToken");
    List<IToken> tokens = new ArrayList<>();
    tokens.add(new TencentTokenImpl("0000000000", "0000000000"));
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
    return new TencentTokenImpl("0000000000", "0000000000");
  }
}
