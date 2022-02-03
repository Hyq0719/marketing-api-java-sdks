package com.hyq0719.mktapi.common.annotation;


import com.hyq0719.mktapi.common.constant.RequestConstants;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ApiRequestMapping {
  String value();

  String version() default "";

  String host() default "";

  String method();

  boolean usePostBody() default true;

  String[] contentTypes() default {RequestConstants.CONTENT_TYPE_JSON, RequestConstants.CONTENT_TYPE_XML};
}
