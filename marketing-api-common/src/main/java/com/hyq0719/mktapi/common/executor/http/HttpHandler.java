package com.hyq0719.mktapi.common.executor.http;

import com.hyq0719.mktapi.common.ApiResponse;
import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import com.hyq0719.mktapi.common.util.JSON;

import java.lang.reflect.Type;

public interface HttpHandler {

  <T> ApiResponse<T> execute(RequestParam param, Type returnType) throws ApiException;

  String buildUrl(RequestParam param);

  JSON getJSON();
}
