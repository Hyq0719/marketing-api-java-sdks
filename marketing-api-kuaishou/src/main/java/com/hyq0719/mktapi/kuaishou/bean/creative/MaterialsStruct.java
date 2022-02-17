package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class MaterialsStruct {
  @SerializedName("creative_material_type")
  private Integer creativeMaterialType = null;

  @SerializedName("photo_id")
  private String photoId = null;

  @SerializedName("sticker_titles")
  private List<String> stickerTitles = null;

  @SerializedName("image_tokens")
  private List<String> imageTokens = null;


  public MaterialsStruct creativeMaterialType(Integer creativeMaterialType) {
    this.creativeMaterialType = creativeMaterialType;
    return this;
  }

  public MaterialsStruct photoId(String photoId) {
    this.photoId = photoId;
    return this;
  }

  public MaterialsStruct stickerTitles(List<String> stickerTitles) {
    this.stickerTitles = stickerTitles;
    return this;
  }

  public MaterialsStruct imageTokens(List<String> imageTokens) {
    this.imageTokens = imageTokens;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
