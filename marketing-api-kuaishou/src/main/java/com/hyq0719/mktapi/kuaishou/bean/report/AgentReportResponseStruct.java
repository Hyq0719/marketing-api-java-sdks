package com.hyq0719.mktapi.kuaishou.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AgentReportResponseStruct {
  @SerializedName("total_rebate_real_charged_in_yuan")
  private Long totalRebateRealChargedInYuan = null;

  @SerializedName("real_charged_in_yuan")
  private Long realChargedInYuan = null;

  @SerializedName("direct_rebate_real_charged_in_yuan")
  private Long directRebateRealChargedInYuan = null;

  @SerializedName("industry")
  private String industry = null;

  @SerializedName("corporation_name")
  private String corporationName = null;

  @SerializedName("total_charged_in_yuan")
  private Long totalChargedInYuan = null;

  @SerializedName("charge_day_on_day_percent")
  private String chargeDayOnDayPercent = null;

  @SerializedName("first_cost_day")
  private Long firstCostDay = null;

  @SerializedName("product_name")
  private String productName = null;

  @SerializedName("contract_rebate_real_charged_in_yuan")
  private Long contractRebateRealChargedInYuan = null;

  @SerializedName("ad_item_click")
  private Long adItemClick = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("date_time")
  private String dateTime = null;

  @SerializedName("total_balance_in_yuan")
  private Long totalBalanceInYuan = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("ad_photo_impression")
  private Long adPhotoImpression = null;

  @SerializedName("account_name")
  private Long accountName = null;

  @SerializedName("credit_real_charged_in_yuan")
  private Long creditRealChargedInYuan = null;

  @SerializedName("photo_click_ratio")
  private String photoClickRatio = null;

  @SerializedName("second_industry")
  private String secondIndustry = null;

  @SerializedName("charged_campaign_count")
  private Long chargedCampaignCount = null;

  @SerializedName("ad_item_impression")
  private Long adItemImpression = null;

  @SerializedName("item_click_ratio")
  private String itemClickRatio = null;


  public AgentReportResponseStruct totalRebateRealChargedInYuan(Long totalRebateRealChargedInYuan) {
    this.totalRebateRealChargedInYuan = totalRebateRealChargedInYuan;
    return this;
  }

  public AgentReportResponseStruct realChargedInYuan(Long realChargedInYuan) {
    this.realChargedInYuan = realChargedInYuan;
    return this;
  }

  public AgentReportResponseStruct directRebateRealChargedInYuan(Long directRebateRealChargedInYuan) {
    this.directRebateRealChargedInYuan = directRebateRealChargedInYuan;
    return this;
  }

  public AgentReportResponseStruct industry(String industry) {
    this.industry = industry;
    return this;
  }

  public AgentReportResponseStruct corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  public AgentReportResponseStruct totalChargedInYuan(Long totalChargedInYuan) {
    this.totalChargedInYuan = totalChargedInYuan;
    return this;
  }

  public AgentReportResponseStruct chargeDayOnDayPercent(String chargeDayOnDayPercent) {
    this.chargeDayOnDayPercent = chargeDayOnDayPercent;
    return this;
  }

  public AgentReportResponseStruct firstCostDay(Long firstCostDay) {
    this.firstCostDay = firstCostDay;
    return this;
  }

  public AgentReportResponseStruct productName(String productName) {
    this.productName = productName;
    return this;
  }

  public AgentReportResponseStruct contractRebateRealChargedInYuan(Long contractRebateRealChargedInYuan) {
    this.contractRebateRealChargedInYuan = contractRebateRealChargedInYuan;
    return this;
  }

  public AgentReportResponseStruct adItemClick(Long adItemClick) {
    this.adItemClick = adItemClick;
    return this;
  }

  public AgentReportResponseStruct accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public AgentReportResponseStruct dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  public AgentReportResponseStruct totalBalanceInYuan(Long totalBalanceInYuan) {
    this.totalBalanceInYuan = totalBalanceInYuan;
    return this;
  }

  public AgentReportResponseStruct userId(Long userId) {
    this.userId = userId;
    return this;
  }

  public AgentReportResponseStruct adPhotoImpression(Long adPhotoImpression) {
    this.adPhotoImpression = adPhotoImpression;
    return this;
  }

  public AgentReportResponseStruct accountName(Long accountName) {
    this.accountName = accountName;
    return this;
  }

  public AgentReportResponseStruct creditRealChargedInYuan(Long creditRealChargedInYuan) {
    this.creditRealChargedInYuan = creditRealChargedInYuan;
    return this;
  }

  public AgentReportResponseStruct photoClickRatio(String photoClickRatio) {
    this.photoClickRatio = photoClickRatio;
    return this;
  }

  public AgentReportResponseStruct secondIndustry(String secondIndustry) {
    this.secondIndustry = secondIndustry;
    return this;
  }

  public AgentReportResponseStruct chargedCampaignCount(Long chargedCampaignCount) {
    this.chargedCampaignCount = chargedCampaignCount;
    return this;
  }

  public AgentReportResponseStruct adItemImpression(Long adItemImpression) {
    this.adItemImpression = adItemImpression;
    return this;
  }

  public AgentReportResponseStruct itemClickRatio(String itemClickRatio) {
    this.itemClickRatio = itemClickRatio;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
