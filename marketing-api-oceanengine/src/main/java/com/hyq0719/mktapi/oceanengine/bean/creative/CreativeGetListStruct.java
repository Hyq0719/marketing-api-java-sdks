package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeGetListStruct {
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

  public CreativeGetListStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public CreativeGetListStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CreativeGetListStruct creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public CreativeGetListStruct creativeWordIds(List<Long> creativeWordIds) {
    this.creativeWordIds = creativeWordIds;
    return this;
  }

  public CreativeGetListStruct creativeCreateTime(String creativeCreateTime) {
    this.creativeCreateTime = creativeCreateTime;
    return this;
  }

  public CreativeGetListStruct creativeModifyTime(String creativeModifyTime) {
    this.creativeModifyTime = creativeModifyTime;
    return this;
  }

  public CreativeGetListStruct imageMode(String imageMode) {
    this.imageMode = imageMode;
    return this;
  }

  public CreativeGetListStruct imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  public CreativeGetListStruct imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
    return this;
  }

  public CreativeGetListStruct optStatus(String optStatus) {
    this.optStatus = optStatus;
    return this;
  }

  public CreativeGetListStruct status(String status) {
    this.status = status;
    return this;
  }

  public CreativeGetListStruct title(String title) {
    this.title = title;
    return this;
  }

  public CreativeGetListStruct thirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

  public CreativeGetListStruct videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  public CreativeGetListStruct materials(List<MaterialsStruct> materials) {
    this.materials = materials;
    return this;
  }
}
