package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ProgrammedCreativeMaterialStruct {
  @SerializedName("sticker_style_ids")
  private List<Integer> stickerStyleIds = null;

  @SerializedName("materials")
  private List<MaterialsStruct> materials = null;

  @SerializedName("description_titles")
  private List<String> descriptionTitles = null;

  @SerializedName("sticker_titles")
  private List<String> stickerTitles = null;


  public ProgrammedCreativeMaterialStruct stickerStyleIds(List<Integer> stickerStyleIds) {
    this.stickerStyleIds = stickerStyleIds;
    return this;
  }

  public ProgrammedCreativeMaterialStruct materials(List<MaterialsStruct> materials) {
    this.materials = materials;
    return this;
  }

  public ProgrammedCreativeMaterialStruct descriptionTitles(List<String> descriptionTitles) {
    this.descriptionTitles = descriptionTitles;
    return this;
  }

  public ProgrammedCreativeMaterialStruct stickerTitles(List<String> stickerTitles) {
    this.stickerTitles = stickerTitles;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
