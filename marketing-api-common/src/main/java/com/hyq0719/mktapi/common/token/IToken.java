package com.hyq0719.mktapi.common.token;

public interface IToken<T> {

  String getTokenKey();

  String getToken();

  T getConfig();
}
