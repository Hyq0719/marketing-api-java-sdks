package com.hyq0719.mktapi.generator.tencent.entity;

import lombok.Data;

import java.util.Map;

/**
 * @program: dashboard
 * @description:
 * @author: wuning
 * @create: 2020-09-29 10:42
 **/
@Data
public class GeneratorConfigEntity {
  private String mainPackage;
  private Person person;
  private Map<String, JavaMap> generatorJavaMap;

  @Data
  public static class Person {
    String author;
    String email;
  }

  @Data
  public static class JavaMap {
    String packageName;
  }
}
