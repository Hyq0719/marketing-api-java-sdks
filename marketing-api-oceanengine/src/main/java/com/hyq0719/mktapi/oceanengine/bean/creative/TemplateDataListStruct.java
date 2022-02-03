package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TemplateDataListStruct {
  @SerializedName("background_image_id")
  private String backgroundImageId = null;

  public TemplateDataListStruct backgroundImageId(String backgroundImageId) {
    this.backgroundImageId = backgroundImageId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
