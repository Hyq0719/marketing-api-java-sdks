package com.hyq0719.mktapi.generator.tencent.entity;

import lombok.Data;

import java.util.List;

@Data
public class SingleFileEntity {
  private BaseClassInfo baseClassInfo;
  private Boolean isRequest;
  private String className;
  private List<BaseEntity> list;
  private List<String> importList;

  public SingleFileEntity baseClassInfo(BaseClassInfo baseClassInfo) {
    this.baseClassInfo = baseClassInfo;
    return this;
  }

  public SingleFileEntity isRequest(Boolean isRequest) {
    this.isRequest = isRequest;
    return this;
  }

  public SingleFileEntity className(String className) {
    this.className = className;
    return this;
  }

  public SingleFileEntity list(List<BaseEntity> list) {
    this.list = list;
    return this;
  }

  public SingleFileEntity importList(List<String> importList) {
    this.importList = importList;
    return this;
  }

}
