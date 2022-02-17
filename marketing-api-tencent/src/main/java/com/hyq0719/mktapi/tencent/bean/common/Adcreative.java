/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.hyq0719.mktapi.tencent.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 广告创意
 */
public class Adcreative {
  @SerializedName("adcreative_id")
  private Long adcreativeId = null;

  @SerializedName("adcreative_name")
  private String adcreativeName = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("page_type")
  private String pageType = null;

  @SerializedName("page_spec")
  private PageSpec pageSpec = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("promoted_object_type")
  private String promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("playable_page_material_id")
  private String playablePageMaterialId = null;

  @SerializedName("video_end_page")
  private VideoEndPageSpec videoEndPage = null;

  @SerializedName("adcreative_template_id")
  private Long adcreativeTemplateId = null;

  @SerializedName("adcreative_elements")
  private AdcreativeCreativeElementsRead adcreativeElements = null;

  public Adcreative adcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
    return this;
  }

  /**
   * Get adcreativeId
   *
   * @return adcreativeId
   */
  public Long getAdcreativeId() {
    return adcreativeId;
  }

  public void setAdcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
  }

  public Adcreative adcreativeName(String adcreativeName) {
    this.adcreativeName = adcreativeName;
    return this;
  }

  /**
   * Get adcreativeName
   *
   * @return adcreativeName
   */
  public String getAdcreativeName() {
    return adcreativeName;
  }

  public void setAdcreativeName(String adcreativeName) {
    this.adcreativeName = adcreativeName;
  }

  public Adcreative campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public Adcreative pageType(String pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  public String getPageType() {
    return pageType;
  }

  public void setPageType(String pageType) {
    this.pageType = pageType;
  }

  public Adcreative pageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   */
  public PageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  public Adcreative siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public Adcreative addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  public Adcreative promotedObjectType(String promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  public String getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(String promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public Adcreative promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   */
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public Adcreative createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public Adcreative lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public Adcreative playablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
    return this;
  }

  /**
   * Get playablePageMaterialId
   *
   * @return playablePageMaterialId
   */
  public String getPlayablePageMaterialId() {
    return playablePageMaterialId;
  }

  public void setPlayablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
  }

  public Adcreative videoEndPage(VideoEndPageSpec videoEndPage) {
    this.videoEndPage = videoEndPage;
    return this;
  }

  /**
   * Get videoEndPage
   *
   * @return videoEndPage
   */
  public VideoEndPageSpec getVideoEndPage() {
    return videoEndPage;
  }

  public void setVideoEndPage(VideoEndPageSpec videoEndPage) {
    this.videoEndPage = videoEndPage;
  }

  public Adcreative adcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
    return this;
  }

  /**
   * Get adcreativeTemplateId
   *
   * @return adcreativeTemplateId
   */
  public Long getAdcreativeTemplateId() {
    return adcreativeTemplateId;
  }

  public void setAdcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
  }

  public Adcreative adcreativeElements(AdcreativeCreativeElementsRead adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
    return this;
  }

  /**
   * Get adcreativeElements
   *
   * @return adcreativeElements
   */
  public AdcreativeCreativeElementsRead getAdcreativeElements() {
    return adcreativeElements;
  }

  public void setAdcreativeElements(AdcreativeCreativeElementsRead adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
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