package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ImageMaterialsStruct {
  @SerializedName("image_info")
  private ImageInfoStruct imageInfo = null;
  @SerializedName("template_image")
  private TemplateImageStruct templateImageStruct = null;

  public ImageMaterialsStruct imageInfo(ImageInfoStruct imageInfo) {
    this.imageInfo = imageInfo;
    return this;
  }

  public ImageMaterialsStruct templateImageStruct(TemplateImageStruct templateImageStruct) {
    this.templateImageStruct = templateImageStruct;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
