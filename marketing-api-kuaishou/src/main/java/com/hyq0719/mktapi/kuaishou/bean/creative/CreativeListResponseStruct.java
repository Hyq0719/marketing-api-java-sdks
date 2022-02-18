package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeListResponseStruct {
  @SerializedName("overlay_bg_image_token")
  private String overlayBgImageToken = null;

  @SerializedName("creative_name")
  private String creativeName = null;

  @SerializedName("first_frame_type")
  private Integer firstFrameType = null;

  @SerializedName("expose_tag")
  private String exposeTag = null;

  @SerializedName("overlay_type")
  private String overlayType = null;

  @SerializedName("photo_id")
  private String photoId = null;

  @SerializedName("display_info")
  private DisplayInfoStruct displayInfo = null;

  @SerializedName("cover_height")
  private Long coverHeight = null;

  @SerializedName("put_status")
  private Integer putStatus = null;

  @SerializedName("creative_id")
  private Long creativeId = null;

  @SerializedName("new_expose_tag")
  private List<String> newExposeTag = null;

  @SerializedName("update_time")
  private String updateTime = null;

  @SerializedName("overlay_bg_url")
  private String overlayBgUrl = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("image_tokens")
  private List<String> imageTokens = null;

  @SerializedName("sticker_title")
  private String stickerTitle = null;

  @SerializedName("creative_material_type")
  private Integer creativeMaterialType = null;

  @SerializedName("cover_url")
  private String coverUrl = null;

  @SerializedName("short_slogan")
  private String shortSlogan = null;

  @SerializedName("create_time")
  private String createTime = null;

  @SerializedName("review_detail")
  private String reviewDetail = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  @SerializedName("programmed_creative_material")
  private ProgrammedCreativeMaterialStruct programmedCreativeMaterial = null;

  @SerializedName("creativeStatusType")
  private Integer creativestatustype = null;

  @SerializedName("ad_photo_played_t3s_url")
  private String adPhotoPlayedT3sUrl = null;

  @SerializedName("cover_width")
  private Long coverWidth = null;

  @SerializedName("image_token")
  private String imageToken = null;

  @SerializedName("site_id")
  private Long siteId = null;

  @SerializedName("impression_url")
  private String impressionUrl = null;

  @SerializedName("material_url")
  private List<String> materialUrl = null;

  @SerializedName("click_track_url")
  private String clickTrackUrl = null;

  @SerializedName("create_channel")
  private Integer createChannel = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("reject_video_snapshot")
  private List<String> rejectVideoSnapshot = null;


  public CreativeListResponseStruct overlayBgImageToken(String overlayBgImageToken) {
    this.overlayBgImageToken = overlayBgImageToken;
    return this;
  }

  public CreativeListResponseStruct creativeName(String creativeName) {
    this.creativeName = creativeName;
    return this;
  }

  public CreativeListResponseStruct firstFrameType(Integer firstFrameType) {
    this.firstFrameType = firstFrameType;
    return this;
  }

  public CreativeListResponseStruct exposeTag(String exposeTag) {
    this.exposeTag = exposeTag;
    return this;
  }

  public CreativeListResponseStruct overlayType(String overlayType) {
    this.overlayType = overlayType;
    return this;
  }

  public CreativeListResponseStruct photoId(String photoId) {
    this.photoId = photoId;
    return this;
  }

  public CreativeListResponseStruct displayInfo(DisplayInfoStruct displayInfo) {
    this.displayInfo = displayInfo;
    return this;
  }

  public CreativeListResponseStruct coverHeight(Long coverHeight) {
    this.coverHeight = coverHeight;
    return this;
  }

  public CreativeListResponseStruct putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public CreativeListResponseStruct creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public CreativeListResponseStruct newExposeTag(List<String> newExposeTag) {
    this.newExposeTag = newExposeTag;
    return this;
  }

  public CreativeListResponseStruct updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public CreativeListResponseStruct overlayBgUrl(String overlayBgUrl) {
    this.overlayBgUrl = overlayBgUrl;
    return this;
  }

  public CreativeListResponseStruct unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public CreativeListResponseStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public CreativeListResponseStruct imageTokens(List<String> imageTokens) {
    this.imageTokens = imageTokens;
    return this;
  }

  public CreativeListResponseStruct stickerTitle(String stickerTitle) {
    this.stickerTitle = stickerTitle;
    return this;
  }

  public CreativeListResponseStruct creativeMaterialType(Integer creativeMaterialType) {
    this.creativeMaterialType = creativeMaterialType;
    return this;
  }

  public CreativeListResponseStruct coverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    return this;
  }

  public CreativeListResponseStruct shortSlogan(String shortSlogan) {
    this.shortSlogan = shortSlogan;
    return this;
  }

  public CreativeListResponseStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public CreativeListResponseStruct reviewDetail(String reviewDetail) {
    this.reviewDetail = reviewDetail;
    return this;
  }

  public CreativeListResponseStruct totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  public CreativeListResponseStruct programmedCreativeMaterial(
    ProgrammedCreativeMaterialStruct programmedCreativeMaterial) {
    this.programmedCreativeMaterial = programmedCreativeMaterial;
    return this;
  }

  public CreativeListResponseStruct creativestatustype(Integer creativestatustype) {
    this.creativestatustype = creativestatustype;
    return this;
  }

  public CreativeListResponseStruct adPhotoPlayedT3sUrl(String adPhotoPlayedT3sUrl) {
    this.adPhotoPlayedT3sUrl = adPhotoPlayedT3sUrl;
    return this;
  }

  public CreativeListResponseStruct coverWidth(Long coverWidth) {
    this.coverWidth = coverWidth;
    return this;
  }

  public CreativeListResponseStruct imageToken(String imageToken) {
    this.imageToken = imageToken;
    return this;
  }

  public CreativeListResponseStruct siteId(Long siteId) {
    this.siteId = siteId;
    return this;
  }

  public CreativeListResponseStruct impressionUrl(String impressionUrl) {
    this.impressionUrl = impressionUrl;
    return this;
  }

  public CreativeListResponseStruct materialUrl(List<String> materialUrl) {
    this.materialUrl = materialUrl;
    return this;
  }

  public CreativeListResponseStruct clickTrackUrl(String clickTrackUrl) {
    this.clickTrackUrl = clickTrackUrl;
    return this;
  }

  public CreativeListResponseStruct createChannel(Integer createChannel) {
    this.createChannel = createChannel;
    return this;
  }

  public CreativeListResponseStruct status(Integer status) {
    this.status = status;
    return this;
  }

  public CreativeListResponseStruct rejectVideoSnapshot(List<String> rejectVideoSnapshot) {
    this.rejectVideoSnapshot = rejectVideoSnapshot;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
