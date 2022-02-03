package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class StructAbstractInfoStruct {
  @SerializedName("abstract_label")
  private String abstractLabel = null;

  @SerializedName("abstract_text")
  private String abstractText = null;

  public StructAbstractInfoStruct abstractLabel(String abstractLabel) {
    this.abstractLabel = abstractLabel;
    return this;
  }

  public StructAbstractInfoStruct abstractText(String abstractText) {
    this.abstractText = abstractText;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
