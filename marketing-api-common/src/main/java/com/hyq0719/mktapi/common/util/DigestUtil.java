package com.hyq0719.mktapi.common.util;

import java.security.MessageDigest;

public class DigestUtil {

  // 盐，用于混交md5
  private static final String SLAT = "&%5123***&&%%$$#@";

  public static String encrypt(String dataStr) {
    try {
      dataStr = dataStr + SLAT;
      MessageDigest m = MessageDigest.getInstance("MD5");
      m.update(dataStr.getBytes("UTF8"));
      byte[] s = m.digest();
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < s.length; i++) {
        result.append(Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6));
      }
      return result.toString();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "";
  }
}
