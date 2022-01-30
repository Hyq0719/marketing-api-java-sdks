package com.hyq0719.mktapi.common.token;

import java.util.List;

public interface ExternalTokenService {

  List<IToken> refreshAllToken();

  IToken refreshToken(String tokenKey);
}
