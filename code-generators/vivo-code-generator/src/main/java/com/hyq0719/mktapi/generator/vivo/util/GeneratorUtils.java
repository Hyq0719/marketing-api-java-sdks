package com.hyq0719.mktapi.generator.vivo.util;

import com.google.common.base.CaseFormat;
import org.apache.commons.lang3.StringUtils;

public class GeneratorUtils {

  public static String snakeToCamel(String str) {
    return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
  }

  public static String camelToSnake(String str) {
    return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str);
  }

  /**
   * 请求地址生成请求类名
   */
  public static String urlToEntityPrefix(String url) {
    // null或者空字符串的时候不处理
    if (StringUtils.isEmpty(url)) {
      return null;
    }
    String[] urlSplit = url.replaceFirst("https://marketing-api.vivo.com.cn/openapi/v[0-9]/", "").split("/");
    StringBuilder sb = new StringBuilder();
    for (String s : urlSplit) {
      String[] strings = s.split("_");
      for (String string : strings) {
        sb.append(toUpperCaseFirstOne(string.trim()));
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
