package com.hyq0719.mktapi.generator.tencent.entity;

import lombok.Data;

@Data
public class BaseEntity {
  private String snakeProperty;
  private String camelProperty;
  private String description;
  private String type;

  public BaseEntity(String snakeProperty, String camelProperty, String description, String type) {
    this.snakeProperty = snakeProperty;
    this.camelProperty = camelProperty;
    this.description = description;
    this.type = type;
  }

  public BaseEntity snakeProperty(String snakeProperty) {
    this.snakeProperty = snakeProperty;
    return this;
  }

  public BaseEntity camelProperty(String camelProperty) {
    this.camelProperty = camelProperty;
    return this;
  }

  public BaseEntity description(String description) {
    this.description = description;
    return this;
  }

  public BaseEntity type(String type) {
    this.type = type;
    return this;
  }
}
