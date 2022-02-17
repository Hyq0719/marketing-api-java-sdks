package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PhotoListStruct {
  @SerializedName("creative_material_type")
  private Long creativeMaterialType = null;

  @SerializedName("photo_id")
  private Long photoId = null;

  @SerializedName("cover_image_token")
  private String coverImageToken = null;


  public PhotoListStruct creativeMaterialType(Long creativeMaterialType) {
    this.creativeMaterialType = creativeMaterialType;
    return this;
  }

  public PhotoListStruct photoId(Long photoId) {
    this.photoId = photoId;
    return this;
  }

  public PhotoListStruct coverImageToken(String coverImageToken) {
    this.coverImageToken = coverImageToken;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
