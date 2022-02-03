package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DpaProductTargetStruct {
  @SerializedName("rule")
  private String rule = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;


  public DpaProductTargetStruct rule(String rule) {
    this.rule = rule;
    return this;
  }

  public DpaProductTargetStruct title(String title) {
    this.title = title;
    return this;
  }

  public DpaProductTargetStruct type(String type) {
    this.type = type;
    return this;
  }

  public DpaProductTargetStruct value(String value) {
    this.value = value;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
