package com.hyq0719.mktapi.common.token;

import java.util.List;

public interface ExternalTokenService {

  /**
   * 刷新所有token
   *
   * @return token列表
   */
  List<IToken> refreshAllToken();

  /**
   * 刷新单个token
   *
   * @param tokenKey token key
   * @return token
   */
  IToken refreshToken(String tokenKey);
}
