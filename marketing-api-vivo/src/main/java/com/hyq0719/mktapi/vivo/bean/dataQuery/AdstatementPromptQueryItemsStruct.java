/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataQuery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 18:38:37
 */
@Data
public class AdstatementPromptQueryItemsStruct {

  /**
   * 应用名称
   */
  @SerializedName("appName")
  private String appName = null;

  /**
   * 计划ID
   */
  @SerializedName("campaignId")
  private Long campaignId = null;

  /**
   * 计划名称
   */
  @SerializedName("campaignName")
  private String campaignName = null;

  /**
   * 广告组ID
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 广告组名称
   */
  @SerializedName("groupName")
  private String groupName = null;

  /**
   * 广告ID
   */
  @SerializedName("advertisementId")
  private Long advertisementId = null;

  /**
   * 广告名称
   */
  @SerializedName("advertisementName")
  private String advertisementName = null;

  /**
   * 创意ID
   */
  @SerializedName("creativeId")
  private Long creativeId = null;

  /**
   * cpm 单位为元;
   */
  @SerializedName("cpm")
  private Double cpm = null;

  /**
   * cpd 单位为元;
   */
  @SerializedName("cpd")
  private Double cpd = null;

  /**
   * 下载量
   */
  @SerializedName("downloadCount")
  private Long downloadCount = null;

  /**
   * 下载率
   */
  @SerializedName("downloadRate")
  private Double downloadRate = null;

  /**
   * 曝光量
   */
  @SerializedName("showCount")
  private Long showCount = null;

  /**
   * 花费 单位为元;
   */
  @SerializedName("spent")
  private Double spent = null;

  /**
   * 广告主ID
   */
  @SerializedName("uuid")
  private String uuid = null;

  /**
   * 提词
   */
  @SerializedName("prompt")
  private String prompt = null;

  /**
   * 提词类型 0搜索词，1优选词包 2跟随词包
   */
  @SerializedName("promptType")
  private Integer promptType = null;

  /**
   * 上报时间
   */
  @SerializedName("reportTime")
  private String reportTime = null;

  public AdstatementPromptQueryItemsStruct appName(String appName) {
    this.appName = appName;
    return this;
  }

  public AdstatementPromptQueryItemsStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdstatementPromptQueryItemsStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public AdstatementPromptQueryItemsStruct groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdstatementPromptQueryItemsStruct groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public AdstatementPromptQueryItemsStruct advertisementId(Long advertisementId) {
    this.advertisementId = advertisementId;
    return this;
  }

  public AdstatementPromptQueryItemsStruct advertisementName(String advertisementName) {
    this.advertisementName = advertisementName;
    return this;
  }

  public AdstatementPromptQueryItemsStruct creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public AdstatementPromptQueryItemsStruct cpm(Double cpm) {
    this.cpm = cpm;
    return this;
  }

  public AdstatementPromptQueryItemsStruct cpd(Double cpd) {
    this.cpd = cpd;
    return this;
  }

  public AdstatementPromptQueryItemsStruct downloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

  public AdstatementPromptQueryItemsStruct downloadRate(Double downloadRate) {
    this.downloadRate = downloadRate;
    return this;
  }

  public AdstatementPromptQueryItemsStruct showCount(Long showCount) {
    this.showCount = showCount;
    return this;
  }

  public AdstatementPromptQueryItemsStruct spent(Double spent) {
    this.spent = spent;
    return this;
  }

  public AdstatementPromptQueryItemsStruct uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public AdstatementPromptQueryItemsStruct prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  public AdstatementPromptQueryItemsStruct promptType(Integer promptType) {
    this.promptType = promptType;
    return this;
  }

  public AdstatementPromptQueryItemsStruct reportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}