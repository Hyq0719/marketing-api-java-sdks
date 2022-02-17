package com.hyq0719.mktapi.kuaishou.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @date 2022/2/17 9:38 上午
 */
@Data
public class CampaignListResponseStruct {

  @SerializedName("campaign_id")
  private String campaignId = null;

  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("put_status")
  private String putStatus = null;

  @SerializedName("create_channel")
  private String createChannel = null;

  @SerializedName("day_budget")
  private Long dayBudget = null;

  @SerializedName("day_budget_schedule")
  private List<Long> dayBudgetSchedule = null;

  @SerializedName("campaign_type")
  private String campaignType = null;

  @SerializedName("create_time")
  private String createTime = null;

  @SerializedName("update_time")
  private String updateTime = null;

  @SerializedName("campaign_sub_type")
  private Integer campaignSubType = null;

  @SerializedName("ad_type")
  private Integer adType = null;

  public CampaignListResponseStruct campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public CampaignListResponseStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public CampaignListResponseStruct putStatus(String putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public CampaignListResponseStruct createChannel(String createChannel) {
    this.createChannel = createChannel;
    return this;
  }

  public CampaignListResponseStruct dayBudget(Long dayBudget) {
    this.dayBudget = dayBudget;
    return this;
  }

  public CampaignListResponseStruct dayBudgetSchedule(List<Long> dayBudgetSchedule) {
    this.dayBudgetSchedule = dayBudgetSchedule;
    return this;
  }

  public CampaignListResponseStruct campaignType(String campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  public CampaignListResponseStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public CampaignListResponseStruct updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public CampaignListResponseStruct campaignSubType(Integer campaignSubType) {
    this.campaignSubType = campaignSubType;
    return this;
  }

  public CampaignListResponseStruct adType(Integer adType) {
    this.adType = adType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
