package com.hyq0719.mktapi.generator.vivo.entity;

import lombok.Data;

@Data
public class BaseClassInfo {
  private String packageName;
  private String comments;
  private String author;
  private String email;
  private String datetime;

  public BaseClassInfo packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  public BaseClassInfo comments(String comments) {
    this.comments = comments;
    return this;
  }

  public BaseClassInfo author(String author) {
    this.author = author;
    return this;
  }

  public BaseClassInfo email(String email) {
    this.email = email;
    return this;
  }

  public BaseClassInfo datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }
}
