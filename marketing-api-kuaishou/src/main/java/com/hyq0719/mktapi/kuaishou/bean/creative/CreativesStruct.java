package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativesStruct {
  @SerializedName("sticker_title")
  private String stickerTitle = null;

  @SerializedName("creative_name")
  private String creativeName = null;

  @SerializedName("expose_tag")
  private String exposeTag = null;

  @SerializedName("creative_material_type")
  private Integer creativeMaterialType = null;

  @SerializedName("overlay_type")
  private String overlayType = null;

  @SerializedName("short_slogan")
  private String shortSlogan = null;

  @SerializedName("photo_id")
  private String photoId = null;

  @SerializedName("action_bar_text")
  private String actionBarText = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("creative_id")
  private String creativeId = null;

  @SerializedName("new_expose_tag")
  private List<String> newExposeTag = null;

  @SerializedName("image_token")
  private String imageToken = null;

  @SerializedName("site_id")
  private Long siteId = null;

  @SerializedName("image_tokens")
  private List<String> imageTokens = null;


  public CreativesStruct stickerTitle(String stickerTitle) {
    this.stickerTitle = stickerTitle;
    return this;
  }

  public CreativesStruct creativeName(String creativeName) {
    this.creativeName = creativeName;
    return this;
  }

  public CreativesStruct exposeTag(String exposeTag) {
    this.exposeTag = exposeTag;
    return this;
  }

  public CreativesStruct creativeMaterialType(Integer creativeMaterialType) {
    this.creativeMaterialType = creativeMaterialType;
    return this;
  }

  public CreativesStruct overlayType(String overlayType) {
    this.overlayType = overlayType;
    return this;
  }

  public CreativesStruct shortSlogan(String shortSlogan) {
    this.shortSlogan = shortSlogan;
    return this;
  }

  public CreativesStruct photoId(String photoId) {
    this.photoId = photoId;
    return this;
  }

  public CreativesStruct actionBarText(String actionBarText) {
    this.actionBarText = actionBarText;
    return this;
  }

  public CreativesStruct description(String description) {
    this.description = description;
    return this;
  }

  public CreativesStruct creativeId(String creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public CreativesStruct newExposeTag(List<String> newExposeTag) {
    this.newExposeTag = newExposeTag;
    return this;
  }

  public CreativesStruct imageToken(String imageToken) {
    this.imageToken = imageToken;
    return this;
  }

  public CreativesStruct siteId(Long siteId) {
    this.siteId = siteId;
    return this;
  }

  public CreativesStruct imageTokens(List<String> imageTokens) {
    this.imageTokens = imageTokens;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
