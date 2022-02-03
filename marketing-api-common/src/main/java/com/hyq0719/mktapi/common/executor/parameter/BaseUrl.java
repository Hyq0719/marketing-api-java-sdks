package com.hyq0719.mktapi.common.executor.parameter;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseUrl {
  String scheme;
  String host;
  String version;

  @Override
  public String toString() {
    return scheme + "://" + host + "/" + version;
  }
}
