package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SubTitleMaterialStruct {
  @SerializedName("sub_title")
  private String subTitle = null;

  public SubTitleMaterialStruct subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
