package com.hyq0719.mktapi.tencent.bean.targetings;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * 锁定状态
 */
@JsonAdapter(AdLockStatus.Adapter.class)
public enum AdLockStatus {
  LOCKED("ADLOCKSTATUS_LOCKED"),

  UNLOCKED("ADLOCKSTATUS_UNLOCKED");

  private String value;

  AdLockStatus(String value) {
    this.value = value;
  }

  public static AdLockStatus fromValue(String text) {
    for (AdLockStatus b : AdLockStatus.values()) {
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

  public static class Adapter extends TypeAdapter<AdLockStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdLockStatus enumeration)
            throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdLockStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdLockStatus.fromValue(String.valueOf(value));
    }
  }
}
