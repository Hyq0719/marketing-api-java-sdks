package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ImageInfoStruct {
  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("name")
  private String name = null;

  public ImageInfoStruct imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  public ImageInfoStruct name(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
