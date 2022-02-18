package com.hyq0719.mktapi.common.annotation;


import com.hyq0719.mktapi.common.constant.RequestConstants;

import java.lang.annotation.*;

/**
 * 请求参数注解
 *
 * @author hyq0719
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ApiRequestMapping {
  /**
   * 请求路径后缀，和BaseUrl拼接
   *
   * @return 请求路径后缀
   */
  String value();

  /**
   * 请求版本号，默认从BaseUrl获取
   *
   * @return 请求版本号
   */
  String version() default "";

  /**
   * 请求host地址，默认从BaseUrl获取
   *
   * @return 请求host地址
   */
  String host() default "";

  /**
   * 请求方法：GET，POST等
   *
   * @return 请求方法
   */
  String method();

  /**
   * 是否使用请求体，默认为true
   *
   * @return 是否使用请求体
   */
  boolean usePostBody() default true;

  /**
   * 请求头中的Content-Type
   *
   * @return Content-Type
   */
  String[] contentTypes() default {RequestConstants.CONTENT_TYPE_JSON, RequestConstants.CONTENT_TYPE_XML};
}
