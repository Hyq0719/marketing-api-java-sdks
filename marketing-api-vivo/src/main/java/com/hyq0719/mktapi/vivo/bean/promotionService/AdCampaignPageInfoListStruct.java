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
 * @date 2022-02-08 10:24:12
 */
@Data
public class AdCampaignPageInfoListStruct {

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
   * 日限额状态： 0-未到 1-到达日限额
   */
  @SerializedName("dailyBudgetState")
  private Integer dailyBudgetState = null;

  /**
   * 删除标志 1:删除 0:未删除
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 暂停标识 1:暂停 0:未暂停
   */
  @SerializedName("pauseState")
  private Integer pauseState = null;

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
   * 收拢状态，详见 【附录-广告计划收拢状态】
   */
  @SerializedName("status")
  private Integer status = null;

  /**
   * 收拢状态描述
   */
  @SerializedName("statusDesc")
  private String statusDesc = null;

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

  public AdCampaignPageInfoListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdCampaignPageInfoListStruct userId(String userId) {
    this.userId = userId;
    return this;
  }

  public AdCampaignPageInfoListStruct name(String name) {
    this.name = name;
    return this;
  }

  public AdCampaignPageInfoListStruct adType(Integer adType) {
    this.adType = adType;
    return this;
  }

  public AdCampaignPageInfoListStruct mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public AdCampaignPageInfoListStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdCampaignPageInfoListStruct dailyBudgetState(Integer dailyBudgetState) {
    this.dailyBudgetState = dailyBudgetState;
    return this;
  }

  public AdCampaignPageInfoListStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdCampaignPageInfoListStruct pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  public AdCampaignPageInfoListStruct optimizeFlag(Integer optimizeFlag) {
    this.optimizeFlag = optimizeFlag;
    return this;
  }

  public AdCampaignPageInfoListStruct createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public AdCampaignPageInfoListStruct status(Integer status) {
    this.status = status;
    return this;
  }

  public AdCampaignPageInfoListStruct statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

  public AdCampaignPageInfoListStruct activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  public AdCampaignPageInfoListStruct campaignType(Integer campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}