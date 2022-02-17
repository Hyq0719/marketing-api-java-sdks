package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CreativeBatchUpdateRequest implements TokenKey {
  @SerializedName("creatives")
  private List<CreativesStruct> creatives = null;

  @SerializedName("creative_category")
  private Integer creativeCategory = null;

  @SerializedName("impression_url")
  private String impressionUrl = null;

  @SerializedName("creative_tag")
  private List<String> creativeTag = null;

  @SerializedName("click_track_url")
  private String clickTrackUrl = null;

  @SerializedName("ad_photo_played_t3s_url")
  private String adPhotoPlayedT3sUrl = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("actionbar_click_url")
  private String actionbarClickUrl = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;


  public CreativeBatchUpdateRequest creatives(List<CreativesStruct> creatives) {
    this.creatives = creatives;
    return this;
  }

  public CreativeBatchUpdateRequest creativeCategory(Integer creativeCategory) {
    this.creativeCategory = creativeCategory;
    return this;
  }

  public CreativeBatchUpdateRequest impressionUrl(String impressionUrl) {
    this.impressionUrl = impressionUrl;
    return this;
  }

  public CreativeBatchUpdateRequest creativeTag(List<String> creativeTag) {
    this.creativeTag = creativeTag;
    return this;
  }

  public CreativeBatchUpdateRequest clickTrackUrl(String clickTrackUrl) {
    this.clickTrackUrl = clickTrackUrl;
    return this;
  }

  public CreativeBatchUpdateRequest adPhotoPlayedT3sUrl(String adPhotoPlayedT3sUrl) {
    this.adPhotoPlayedT3sUrl = adPhotoPlayedT3sUrl;
    return this;
  }

  public CreativeBatchUpdateRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public CreativeBatchUpdateRequest actionbarClickUrl(String actionbarClickUrl) {
    this.actionbarClickUrl = actionbarClickUrl;
    return this;
  }

  public CreativeBatchUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
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
