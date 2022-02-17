package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CreativeUpdateRequest implements TokenKey {
  @SerializedName("sticker_title")
  private String stickerTitle = null;

  @SerializedName("creative_name")
  private String creativeName = null;

  @SerializedName("expose_tag")
  private String exposeTag = null;

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

  @SerializedName("ad_photo_played_t3s_url")
  private String adPhotoPlayedT3sUrl = null;

  @SerializedName("creative_id")
  private Long creativeId = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("new_expose_tag")
  private List<String> newExposeTag = null;

  @SerializedName("image_token")
  private String imageToken = null;

  @SerializedName("site_id")
  private Long siteId = null;

  @SerializedName("impression_url")
  private String impressionUrl = null;

  @SerializedName("click_track_url")
  private String clickTrackUrl = null;

  @SerializedName("image_tokens")
  private List<String> imageTokens = null;


  public CreativeUpdateRequest stickerTitle(String stickerTitle) {
    this.stickerTitle = stickerTitle;
    return this;
  }

  public CreativeUpdateRequest creativeName(String creativeName) {
    this.creativeName = creativeName;
    return this;
  }

  public CreativeUpdateRequest exposeTag(String exposeTag) {
    this.exposeTag = exposeTag;
    return this;
  }

  public CreativeUpdateRequest overlayType(String overlayType) {
    this.overlayType = overlayType;
    return this;
  }

  public CreativeUpdateRequest shortSlogan(String shortSlogan) {
    this.shortSlogan = shortSlogan;
    return this;
  }

  public CreativeUpdateRequest photoId(String photoId) {
    this.photoId = photoId;
    return this;
  }

  public CreativeUpdateRequest actionBarText(String actionBarText) {
    this.actionBarText = actionBarText;
    return this;
  }

  public CreativeUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

  public CreativeUpdateRequest creativeCategory(Integer creativeCategory) {
    this.creativeCategory = creativeCategory;
    return this;
  }

  public CreativeUpdateRequest creativeTag(List<String> creativeTag) {
    this.creativeTag = creativeTag;
    return this;
  }

  public CreativeUpdateRequest adPhotoPlayedT3sUrl(String adPhotoPlayedT3sUrl) {
    this.adPhotoPlayedT3sUrl = adPhotoPlayedT3sUrl;
    return this;
  }

  public CreativeUpdateRequest creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public CreativeUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CreativeUpdateRequest newExposeTag(List<String> newExposeTag) {
    this.newExposeTag = newExposeTag;
    return this;
  }

  public CreativeUpdateRequest imageToken(String imageToken) {
    this.imageToken = imageToken;
    return this;
  }

  public CreativeUpdateRequest siteId(Long siteId) {
    this.siteId = siteId;
    return this;
  }

  public CreativeUpdateRequest impressionUrl(String impressionUrl) {
    this.impressionUrl = impressionUrl;
    return this;
  }

  public CreativeUpdateRequest clickTrackUrl(String clickTrackUrl) {
    this.clickTrackUrl = clickTrackUrl;
    return this;
  }

  public CreativeUpdateRequest imageTokens(List<String> imageTokens) {
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
