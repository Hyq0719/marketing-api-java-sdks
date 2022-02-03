package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdcreativesGetFilteringStruct {
  @SerializedName("ad_id")
  private Long adId = null;
  @SerializedName("campaign_id")
  private Long campaignId = null;
  @SerializedName("creative_ids")
  private List<Long> creativeIds = null;
  @SerializedName("creative_title")
  private String creativeTitle = null;
  @SerializedName("creative_create_time")
  private String creativeCreateTime = null;
  @SerializedName("creative_modify_time")
  private String creativeModifyTime = null;
  @SerializedName("image_mode")
  private String imageMode = null;
  @SerializedName("landing_type")
  private String landingType = null;
  @SerializedName("pricing")
  private String pricing = null;
  @SerializedName("status")
  private String status = null;

  public AdcreativesGetFilteringStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdcreativesGetFilteringStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdcreativesGetFilteringStruct creativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
    return this;
  }

  public AdcreativesGetFilteringStruct creativeTitle(String creativeTitle) {
    this.creativeTitle = creativeTitle;
    return this;
  }

  public AdcreativesGetFilteringStruct creativeCreateTime(String creativeCreateTime) {
    this.creativeCreateTime = creativeCreateTime;
    return this;
  }

  public AdcreativesGetFilteringStruct creativeModifyTime(String creativeModifyTime) {
    this.creativeModifyTime = creativeModifyTime;
    return this;
  }

  public AdcreativesGetFilteringStruct imageMode(String imageMode) {
    this.imageMode = imageMode;
    return this;
  }

  public AdcreativesGetFilteringStruct landingType(String landingType) {
    this.landingType = landingType;
    return this;
  }

  public AdcreativesGetFilteringStruct pricing(String pricing) {
    this.pricing = pricing;
    return this;
  }

  public AdcreativesGetFilteringStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
