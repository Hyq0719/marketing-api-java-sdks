package com.hyq0719.mktapi.generator.oceanengine.entity;

import com.google.gson.Gson;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CrawlerResult {
  private String classPrefix;
  private Map<String, List<BaseEntity>> requestEntityMap;
  private Map<String, List<BaseEntity>> responseEntityMap;

  @Override
  public String toString() {
    Gson gson = new Gson();
    return "classPrefix: " + classPrefix + "\n" + "requestEntityMap： " + gson.toJson(requestEntityMap) + "\n"
      + "responseEntityMap： " + gson.toJson(responseEntityMap);
  }
}
