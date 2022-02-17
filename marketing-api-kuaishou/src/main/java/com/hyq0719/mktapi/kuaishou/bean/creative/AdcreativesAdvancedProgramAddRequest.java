package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdcreativesAdvancedProgramAddRequest implements TokenKey {
  @SerializedName("cover_image_tokens")
  private List<String> coverImageTokens = null;

  @SerializedName("creative_category")
  private Integer creativeCategory = null;

  @SerializedName("horizontal_photo_ids")
  private List<String> horizontalPhotoIds = null;

  @SerializedName("creative_tag")
  private List<String> creativeTag = null;

  @SerializedName("sticker_styles")
  private List<Integer> stickerStyles = null;

  @SerializedName("action_bar")
  private String actionBar = null;

  @SerializedName("vertical_photo_ids")
  private List<String> verticalPhotoIds = null;

  @SerializedName("cover_slogans")
  private List<String> coverSlogans = null;

  @SerializedName("captions")
  private List<String> captions = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("photo_list")
  private List<PhotoListStruct> photoList = null;

  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("site_id")
  private Long siteId = null;

  @SerializedName("click_url")
  private String clickUrl = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("actionbar_click_url")
  private String actionbarClickUrl = null;


  public AdcreativesAdvancedProgramAddRequest coverImageTokens(List<String> coverImageTokens) {
    this.coverImageTokens = coverImageTokens;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest creativeCategory(Integer creativeCategory) {
    this.creativeCategory = creativeCategory;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest horizontalPhotoIds(List<String> horizontalPhotoIds) {
    this.horizontalPhotoIds = horizontalPhotoIds;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest creativeTag(List<String> creativeTag) {
    this.creativeTag = creativeTag;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest stickerStyles(List<Integer> stickerStyles) {
    this.stickerStyles = stickerStyles;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest actionBar(String actionBar) {
    this.actionBar = actionBar;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest verticalPhotoIds(List<String> verticalPhotoIds) {
    this.verticalPhotoIds = verticalPhotoIds;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest coverSlogans(List<String> coverSlogans) {
    this.coverSlogans = coverSlogans;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest captions(List<String> captions) {
    this.captions = captions;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest photoList(List<PhotoListStruct> photoList) {
    this.photoList = photoList;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest siteId(Long siteId) {
    this.siteId = siteId;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest clickUrl(String clickUrl) {
    this.clickUrl = clickUrl;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public AdcreativesAdvancedProgramAddRequest actionbarClickUrl(String actionbarClickUrl) {
    this.actionbarClickUrl = actionbarClickUrl;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}
