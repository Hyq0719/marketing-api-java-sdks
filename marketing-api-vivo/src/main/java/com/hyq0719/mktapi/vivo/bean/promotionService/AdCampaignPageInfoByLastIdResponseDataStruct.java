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

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 10:32:18
 */
@Data
public class AdCampaignPageInfoByLastIdResponseDataStruct {

  /**
   * 数据列表
   */
  @SerializedName("data")
  private List<AdCampaignPageInfoByLastIdResponseDataStruct> data = null;

  /**
   * 推广计划id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 计划所属的广告主ID
   */
  @SerializedName("userId")
  private String userId = null;

  /**
   * 名称
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
   * 创建时间, 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("createDate")
  private String createDate = null;

  /**
   * 删除状态：0-未删除，1-删除
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 暂停标识 1:暂停 0:未暂停
   */
  @SerializedName("pauseState")
  private Integer pauseState = null;

  /**
   * 暂停操作时间,时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("pauseTime")
  private String pauseTime = null;

  /**
   * 日限额状态：0-未到，1-到达日限额
   */
  @SerializedName("dailyBudgetState")
  private Integer dailyBudgetState = null;

  /**
   * 活动ID，0代表非活动广告
   */
  @SerializedName("activityId")
  private Integer activityId = null;

  /**
   * 是否使用流量优选：0-否；1-是 计划优选，详见 【附录-优选流量】
   */
  @SerializedName("optimizeFlag")
  private Integer optimizeFlag = null;

  /**
   * 推广计划类型：0-展示广告（默认）；1-综搜广告
   */
  @SerializedName("campaignType")
  private Integer campaignType = null;

  public AdCampaignPageInfoByLastIdResponseDataStruct data(List<AdCampaignPageInfoByLastIdResponseDataStruct> data) {
    this.data = data;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct userId(String userId) {
    this.userId = userId;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct name(String name) {
    this.name = name;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct adType(Integer adType) {
    this.adType = adType;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct pauseTime(String pauseTime) {
    this.pauseTime = pauseTime;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct dailyBudgetState(Integer dailyBudgetState) {
    this.dailyBudgetState = dailyBudgetState;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct optimizeFlag(Integer optimizeFlag) {
    this.optimizeFlag = optimizeFlag;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseDataStruct campaignType(Integer campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}