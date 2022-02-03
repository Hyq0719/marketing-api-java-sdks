package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AdDataStruct {
  @SerializedName("ad_download_status")
  private Long adDownloadStatus = null;
  @SerializedName("ad_keywords")
  private List<String> adKeywords = null;
  @SerializedName("app_name")
  private String appName = null;
  @SerializedName("creative_auto_generate_switch")
  private Long creativeAutoGenerateSwitch = null;
  @SerializedName("creative_display_mode")
  private String creativeDisplayMode = null;
  @SerializedName("external_url")
  private String externalUrl = null;
  @SerializedName("ies_core_user_id")
  private String iesCoreUserId = null;
  @SerializedName("is_comment_disable")
  private Long isCommentDisable = null;
  @SerializedName("is_feed_and_fav_see")
  private Long isFeedAndFavSee = null;
  @SerializedName("playable_url")
  private String playableUrl = null;
  @SerializedName("source")
  private String source = null;
  @SerializedName("third_industry_id")
  private Long thirdIndustryId = null;
  @SerializedName("web_url")
  private String webUrl = null;

  public Long getAdDownloadStatus() {
    return adDownloadStatus;
  }

  public void setAdDownloadStatus(Long adDownloadStatus) {
    this.adDownloadStatus = adDownloadStatus;
  }

  public AdDataStruct adDownloadStatus(Long adDownloadStatus) {
    this.adDownloadStatus = adDownloadStatus;
    return this;
  }

  public List<String> getAdKeywords() {
    return adKeywords;
  }

  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }

  public AdDataStruct adKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AdDataStruct appName(String appName) {
    this.appName = appName;
    return this;
  }

  public Long getCreativeAutoGenerateSwitch() {
    return creativeAutoGenerateSwitch;
  }

  public void setCreativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
  }

  public AdDataStruct creativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
    return this;
  }

  public String getCreativeDisplayMode() {
    return creativeDisplayMode;
  }

  public void setCreativeDisplayMode(String creativeDisplayMode) {
    this.creativeDisplayMode = creativeDisplayMode;
  }

  public AdDataStruct creativeDisplayMode(String creativeDisplayMode) {
    this.creativeDisplayMode = creativeDisplayMode;
    return this;
  }

  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public AdDataStruct externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  public String getIesCoreUserId() {
    return iesCoreUserId;
  }

  public void setIesCoreUserId(String iesCoreUserId) {
    this.iesCoreUserId = iesCoreUserId;
  }

  public AdDataStruct iesCoreUserId(String iesCoreUserId) {
    this.iesCoreUserId = iesCoreUserId;
    return this;
  }

  public Long getCommentDisable() {
    return isCommentDisable;
  }

  public void setCommentDisable(Long commentDisable) {
    isCommentDisable = commentDisable;
  }

  public AdDataStruct commentDisable(Long commentDisable) {
    isCommentDisable = commentDisable;
    return this;
  }

  public Long getFeedAndFavSee() {
    return isFeedAndFavSee;
  }

  public void setFeedAndFavSee(Long feedAndFavSee) {
    isFeedAndFavSee = feedAndFavSee;
  }

  public AdDataStruct feedAndFavSee(Long feedAndFavSee) {
    isFeedAndFavSee = feedAndFavSee;
    return this;
  }

  public String getPlayableUrl() {
    return playableUrl;
  }

  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }

  public AdDataStruct playableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
    return this;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public AdDataStruct source(String source) {
    this.source = source;
    return this;
  }

  public Long getThirdIndustryId() {
    return thirdIndustryId;
  }

  public void setThirdIndustryId(Long thirdIndustryId) {
    this.thirdIndustryId = thirdIndustryId;
  }

  public AdDataStruct thirdIndustryId(Long thirdIndustryId) {
    this.thirdIndustryId = thirdIndustryId;
    return this;
  }

  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public AdDataStruct webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
