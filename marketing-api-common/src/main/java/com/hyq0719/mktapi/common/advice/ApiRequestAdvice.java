package com.hyq0719.mktapi.common.advice;

@FunctionalInterface
public interface ApiRequestAdvice {

  default void before() {

  }

  void after();
}
