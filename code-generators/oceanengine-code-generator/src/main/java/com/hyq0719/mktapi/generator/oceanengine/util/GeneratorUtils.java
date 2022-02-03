package com.hyq0719.mktapi.generator.oceanengine.util;

import com.google.common.base.CaseFormat;
import org.apache.commons.lang3.StringUtils;

public class GeneratorUtils {
  /**
   * 蛇形命名转驼峰命名
   */
  public static String snakeToCamel(String str) {
    return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
  }

  /**
   * 驼峰命名转蛇形命名
   */
  public static String camelToSnake(String str) {
    return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str);
  }

  /**
   * 请求地址生成请求类名
   */
  public static String urlToEntityPrefix(String url, String urlPrefix) {
    // null或者空字符串的时候不处理
    if (StringUtils.isEmpty(url)) {
      return null;
    }
    if (StringUtils.isEmpty(urlPrefix)) {
      urlPrefix = "https://ad.oceanengine.com/open_api/2/";
    }
    String[] urlSplit = url.replaceFirst(urlPrefix, "").split("/");
    StringBuilder sb = new StringBuilder();
    for (String s : urlSplit) {
      String[] strings = s.split("_");
      for (String string : strings) {
        if (StringUtils.isNotEmpty(string)) {
          sb.append(toUpperCaseFirstOne(string.trim()));
        }
      }
    }
    return sb.toString();
  }

  /**
   * 首字母转小写
   */
  public static String toLowerCaseFirstOne(String s) {
    if (Character.isLowerCase(s.charAt(0))) {
      return s;
    } else {
      return Character.toLowerCase(s.charAt(0)) + s.substring(1);
    }
  }

  /**
   * 首字母转大写
   */
  public static String toUpperCaseFirstOne(String s) {
    if (Character.isUpperCase(s.charAt(0))) {
      return s;
    } else {
      return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
  }
}
