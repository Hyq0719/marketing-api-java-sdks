package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AbstractMaterialsStruct {
  @SerializedName("text_abstract_info")
  private TextAbstractInfoStruct textAbstractInfo = null;

  @SerializedName("struct_abstract_info")
  private List<StructAbstractInfoStruct> structAbstractInfo = null;

  public AbstractMaterialsStruct textAbstractInfo(TextAbstractInfoStruct textAbstractInfo) {
    this.textAbstractInfo = textAbstractInfo;
    return this;
  }

  public AbstractMaterialsStruct structAbstractInfo(List<StructAbstractInfoStruct> structAbstractInfo) {
    this.structAbstractInfo = structAbstractInfo;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
