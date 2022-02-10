package com.hyq0719.mktapi.common.advice;

import com.hyq0719.mktapi.common.ApiResponse;

/**
 * api请求增强，类似AOP
 *
 * @author hyq0719
 */
@FunctionalInterface
public interface ApiRequestAdvice {

  /**
   * 请求前执行
   */
  default void before() {

  }

  /**
   * 请求后执行
   *
   * @param response 请求的返回内容
   */
  void after(ApiResponse response);
}
