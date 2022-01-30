package com.hyq0719.mktapi.common.executor.parameter;


public interface ParamHandler<T> {
  RequestParam constructParameters(T t, String token);

  BaseUrl getBaseUrl();

  String[] getRequestContentTypes();

  String[] getLocalVarAuthNames();

  String getMethod();

  String getVersion();

  String getStringToken(String accountId);

  String getAccountId(T t);

  String getLocalVarPath(); // 业务地址

  Boolean isUsePostBody();

  String[] getRequestAccept();
}
