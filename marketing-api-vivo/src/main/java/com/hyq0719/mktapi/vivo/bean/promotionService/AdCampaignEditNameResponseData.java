/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 10:18:14
 */
@Data
public class AdCampaignEditNameResponseData {

  /**
   * 计划编号id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 计划所属的广告主ID
   */
  @SerializedName("userId")
  private String userId = null;

  /**
   * 计划名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 推广目标，详见 【附录-推广目标】
   */
  @SerializedName("adType")
  private Integer adType = null;

  /**
   * 投放渠道/媒体类型，详见 【附录-投放渠道/媒体类型】
   */
  @SerializedName("mediaType")
  private Integer mediaType = null;

  /**
   * 计划日限额:不限额显示-1，有限额以毫分为单位显示，1元=100000毫分
   */
  @SerializedName("dailyBudget")
  private Long dailyBudget = null;

  /**
   * 日限额状态：到达日限额:1, 未到:0
   */
  @SerializedName("dailyBudgetState")
  private Integer dailyBudgetState = null;

  /**
   * 是否使用流量优选：0-否；1-是 计划优选，详见 【附录-优选流量】
   */
  @SerializedName("optimizeFlag")
  private Integer optimizeFlag = null;

  /**
   * 创建时间, 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("createDate")
  private String createDate = null;

  /**
   * 创建人
   */
  @SerializedName("creator")
  private String creator = null;

  /**
   * 修改时间, 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("modifyDate")
  private String modifyDate = null;

  /**
   * 修改人
   */
  @SerializedName("modifier")
  private String modifier = null;

  /**
   * 删除标志：删除:1, 未删除:0，详见 【附录-删除标志】
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 暂停标识：暂停:1, 未暂停:0，详见 【附录-删除标志】
   */
  @SerializedName("pauseState")
  private Integer pauseState = null;

  /**
   * 暂停操作时间, 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("pauseTime")
  private String pauseTime = null;

  /**
   * 活动ID，0代表非活动广告
   */
  @SerializedName("activityId")
  private Integer activityId = null;

  /**
   * 广告类型：0-展示广告；1-搜索广告；
   */
  @SerializedName("campaignType")
  private Integer campaignType = null;

  public AdCampaignEditNameResponseData id(Long id) {
    this.id = id;
    return this;
  }

  public AdCampaignEditNameResponseData userId(String userId) {
    this.userId = userId;
    return this;
  }

  public AdCampaignEditNameResponseData name(String name) {
    this.name = name;
    return this;
  }

  public AdCampaignEditNameResponseData adType(Integer adType) {
    this.adType = adType;
    return this;
  }

  public AdCampaignEditNameResponseData mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public AdCampaignEditNameResponseData dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdCampaignEditNameResponseData dailyBudgetState(Integer dailyBudgetState) {
    this.dailyBudgetState = dailyBudgetState;
    return this;
  }

  public AdCampaignEditNameResponseData optimizeFlag(Integer optimizeFlag) {
    this.optimizeFlag = optimizeFlag;
    return this;
  }

  public AdCampaignEditNameResponseData createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public AdCampaignEditNameResponseData creator(String creator) {
    this.creator = creator;
    return this;
  }

  public AdCampaignEditNameResponseData modifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

  public AdCampaignEditNameResponseData modifier(String modifier) {
    this.modifier = modifier;
    return this;
  }

  public AdCampaignEditNameResponseData deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdCampaignEditNameResponseData pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  public AdCampaignEditNameResponseData pauseTime(String pauseTime) {
    this.pauseTime = pauseTime;
    return this;
  }

  public AdCampaignEditNameResponseData activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  public AdCampaignEditNameResponseData campaignType(Integer campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}