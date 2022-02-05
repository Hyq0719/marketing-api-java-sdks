package com.hyq0719.mktapi.common.advice;

import com.hyq0719.mktapi.common.ApiResponse;

@FunctionalInterface
public interface ApiRequestAdvice {

  default void before() {

  }

  void after(ApiResponse response);
}
