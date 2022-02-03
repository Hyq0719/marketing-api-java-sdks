package com.hyq0719.mktapi.common.executor.parameter;

import org.apache.http.NameValuePair;

public class Pair implements NameValuePair {
  private String name = "";
  private String value = "";

  public Pair(String name, String value) {
    setName(name);
    setValue(value);
  }

  @Override
  public String getName() {
    return this.name;
  }

  private void setName(String name) {
    if (!isValidString(name)) {
      return;
    }

    this.name = name;
  }

  @Override
  public String getValue() {
    return this.value;
  }

  private void setValue(String value) {
    if (!isValidString(value)) {
      return;
    }

    this.value = value;
  }

  private boolean isValidString(String arg) {
    if (arg == null) {
      return false;
    }
    return !arg.trim().isEmpty();
  }
}
