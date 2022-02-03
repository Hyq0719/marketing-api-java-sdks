package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdcreativesGetListStruct {
  @SerializedName("ad_id")
  private Long adId = null;
  @SerializedName("advertiser_id")
  private Long advertiserId = null;
  @SerializedName("creative_id")
  private Long creativeId = null;
  @SerializedName("creative_word_ids")
  private List<Long> creativeWordIds = null;
  @SerializedName("creative_create_time")
  private String creativeCreateTime = null;
  @SerializedName("creative_modify_time")
  private String creativeModifyTime = null;
  @SerializedName("image_mode")
  private String imageMode = null;
  @SerializedName("image_id")
  private String imageId = null;
  @SerializedName("image_ids")
  private List<String> imageIds = null;
  @SerializedName("opt_status")
  private String optStatus = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("third_party_id")
  private String thirdPartyId = null;
  @SerializedName("video_id")
  private String videoId = null;
  @SerializedName("metarials")
  private List<MaterialsStruct> materials = null;

  public AdcreativesGetListStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdcreativesGetListStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdcreativesGetListStruct creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public AdcreativesGetListStruct creativeWordIds(List<Long> creativeWordIds) {
    this.creativeWordIds = creativeWordIds;
    return this;
  }

  public AdcreativesGetListStruct creativeCreateTime(String creativeCreateTime) {
    this.creativeCreateTime = creativeCreateTime;
    return this;
  }

  public AdcreativesGetListStruct creativeModifyTime(String creativeModifyTime) {
    this.creativeModifyTime = creativeModifyTime;
    return this;
  }

  public AdcreativesGetListStruct imageMode(String imageMode) {
    this.imageMode = imageMode;
    return this;
  }

  public AdcreativesGetListStruct imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  public AdcreativesGetListStruct imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
    return this;
  }

  public AdcreativesGetListStruct optStatus(String optStatus) {
    this.optStatus = optStatus;
    return this;
  }

  public AdcreativesGetListStruct status(String status) {
    this.status = status;
    return this;
  }

  public AdcreativesGetListStruct title(String title) {
    this.title = title;
    return this;
  }

  public AdcreativesGetListStruct thirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

  public AdcreativesGetListStruct videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  public AdcreativesGetListStruct materials(List<MaterialsStruct> materials) {
    this.materials = materials;
    return this;
  }
}
