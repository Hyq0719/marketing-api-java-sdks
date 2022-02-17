package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeAdvancedProgramListResponseStruct {
  @SerializedName("cover_image_urls")
  private List<String> coverImageUrls = null;

  @SerializedName("cover_image_tokens")
  private List<String> coverImageTokens = null;

  @SerializedName("create_time")
  private String createTime = null;

  @SerializedName("view_status_reason")
  private String viewStatusReason = null;

  @SerializedName("horizontal_photo_ids")
  private List<String> horizontalPhotoIds = null;

  @SerializedName("sticker_styles")
  private List<Integer> stickerStyles = null;

  @SerializedName("action_bar")
  private String actionBar = null;

  @SerializedName("put_status")
  private Integer putStatus = null;

  @SerializedName("vertical_photo_ids")
  private List<String> verticalPhotoIds = null;

  @SerializedName("cover_slogans")
  private List<String> coverSlogans = null;

  @SerializedName("captions")
  private List<String> captions = null;

  @SerializedName("update_time")
  private String updateTime = null;

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

  @SerializedName("view_status")
  private Integer viewStatus = null;


  public CreativeAdvancedProgramListResponseStruct coverImageUrls(List<String> coverImageUrls) {
    this.coverImageUrls = coverImageUrls;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct coverImageTokens(List<String> coverImageTokens) {
    this.coverImageTokens = coverImageTokens;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct viewStatusReason(String viewStatusReason) {
    this.viewStatusReason = viewStatusReason;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct horizontalPhotoIds(List<String> horizontalPhotoIds) {
    this.horizontalPhotoIds = horizontalPhotoIds;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct stickerStyles(List<Integer> stickerStyles) {
    this.stickerStyles = stickerStyles;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct actionBar(String actionBar) {
    this.actionBar = actionBar;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct verticalPhotoIds(List<String> verticalPhotoIds) {
    this.verticalPhotoIds = verticalPhotoIds;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct coverSlogans(List<String> coverSlogans) {
    this.coverSlogans = coverSlogans;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct captions(List<String> captions) {
    this.captions = captions;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct siteId(Long siteId) {
    this.siteId = siteId;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct clickUrl(String clickUrl) {
    this.clickUrl = clickUrl;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct actionbarClickUrl(String actionbarClickUrl) {
    this.actionbarClickUrl = actionbarClickUrl;
    return this;
  }

  public CreativeAdvancedProgramListResponseStruct viewStatus(Integer viewStatus) {
    this.viewStatus = viewStatus;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
