package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CreativeCreateRequest implements TokenKey {
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

  @SerializedName("creative_category")
  private Integer creativeCategory = null;

  @SerializedName("creative_tag")
  private List<String> creativeTag = null;

  @SerializedName("put_status")
  private Integer putStatus = null;

  @SerializedName("ad_photo_played_t3s_url")
  private String adPhotoPlayedT3sUrl = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("new_expose_tag")
  private List<String> newExposeTag = null;

  @SerializedName("image_token")
  private String imageToken = null;

  @SerializedName("site_id")
  private Long siteId = null;

  @SerializedName("live_creative_type")
  private Integer liveCreativeType = null;

  @SerializedName("impression_url")
  private String impressionUrl = null;

  @SerializedName("click_track_url")
  private String clickTrackUrl = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("actionbar_click_url")
  private String actionbarClickUrl = null;

  @SerializedName("image_tokens")
  private List<String> imageTokens = null;


  public CreativeCreateRequest stickerTitle(String stickerTitle) {
    this.stickerTitle = stickerTitle;
    return this;
  }

  public CreativeCreateRequest creativeName(String creativeName) {
    this.creativeName = creativeName;
    return this;
  }

  public CreativeCreateRequest exposeTag(String exposeTag) {
    this.exposeTag = exposeTag;
    return this;
  }

  public CreativeCreateRequest creativeMaterialType(Integer creativeMaterialType) {
    this.creativeMaterialType = creativeMaterialType;
    return this;
  }

  public CreativeCreateRequest overlayType(String overlayType) {
    this.overlayType = overlayType;
    return this;
  }

  public CreativeCreateRequest shortSlogan(String shortSlogan) {
    this.shortSlogan = shortSlogan;
    return this;
  }

  public CreativeCreateRequest photoId(String photoId) {
    this.photoId = photoId;
    return this;
  }

  public CreativeCreateRequest actionBarText(String actionBarText) {
    this.actionBarText = actionBarText;
    return this;
  }

  public CreativeCreateRequest description(String description) {
    this.description = description;
    return this;
  }

  public CreativeCreateRequest creativeCategory(Integer creativeCategory) {
    this.creativeCategory = creativeCategory;
    return this;
  }

  public CreativeCreateRequest creativeTag(List<String> creativeTag) {
    this.creativeTag = creativeTag;
    return this;
  }

  public CreativeCreateRequest putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public CreativeCreateRequest adPhotoPlayedT3sUrl(String adPhotoPlayedT3sUrl) {
    this.adPhotoPlayedT3sUrl = adPhotoPlayedT3sUrl;
    return this;
  }

  public CreativeCreateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CreativeCreateRequest newExposeTag(List<String> newExposeTag) {
    this.newExposeTag = newExposeTag;
    return this;
  }

  public CreativeCreateRequest imageToken(String imageToken) {
    this.imageToken = imageToken;
    return this;
  }

  public CreativeCreateRequest siteId(Long siteId) {
    this.siteId = siteId;
    return this;
  }

  public CreativeCreateRequest liveCreativeType(Integer liveCreativeType) {
    this.liveCreativeType = liveCreativeType;
    return this;
  }

  public CreativeCreateRequest impressionUrl(String impressionUrl) {
    this.impressionUrl = impressionUrl;
    return this;
  }

  public CreativeCreateRequest clickTrackUrl(String clickTrackUrl) {
    this.clickTrackUrl = clickTrackUrl;
    return this;
  }

  public CreativeCreateRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public CreativeCreateRequest actionbarClickUrl(String actionbarClickUrl) {
    this.actionbarClickUrl = actionbarClickUrl;
    return this;
  }

  public CreativeCreateRequest imageTokens(List<String> imageTokens) {
    this.imageTokens = imageTokens;
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
