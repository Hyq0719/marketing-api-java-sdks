package com.hyq0719.mktapi.tencent.bean.targetings;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * 定向包来源，自建或者来自分享
 */
@JsonAdapter(TargetingPkgSourceType.Adapter.class)
public enum TargetingPkgSourceType {
  CREATE("TARGETING_SOURCE_TYPE_CREATE"),

  SHARE("TARGETING_SOURCE_TYPE_SHARE");

  private String value;

  TargetingPkgSourceType(String value) {
    this.value = value;
  }

  public static TargetingPkgSourceType fromValue(String text) {
    for (TargetingPkgSourceType b : TargetingPkgSourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static class Adapter extends TypeAdapter<TargetingPkgSourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TargetingPkgSourceType enumeration)
            throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TargetingPkgSourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TargetingPkgSourceType.fromValue(String.valueOf(value));
    }
  }
}
