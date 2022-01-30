package com.hyq0719.mktapi.common.util;

import com.google.gson.Gson;

public class JsonUtil {

  private final static Gson GSON = new Gson();

  public static String toJsonString(Object obj) {
    return GSON.toJson(obj);
  }
}
