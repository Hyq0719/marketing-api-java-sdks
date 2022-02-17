package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ReportAgentGetV2ListStruct {
  @SerializedName("today_cost")
  private Float todayCost = null;

  @SerializedName("x_hour_cpa_diff")
  private Float xHourCpaDiff = null;

  @SerializedName("yesterday_brand_cash_cost")
  private Float yesterdayBrandCashCost = null;

  @SerializedName("last_recharge_time")
  private String lastRechargeTime = null;

  @SerializedName("agent_id")
  private Long agentId = null;

  @SerializedName("agent_name")
  private String agentName = null;

  @SerializedName("account_status")
  private String accountStatus = null;

  @SerializedName("last_renew_amount")
  private Float lastRenewAmount = null;

  @SerializedName("total_renew_amount")
  private Float totalRenewAmount = null;

  @SerializedName("yesterday_mom_cost")
  private Float yesterdayMomCost = null;

  @SerializedName("yesterday_cost")
  private Float yesterdayCost = null;

  @SerializedName("ocpc_cost")
  private Float ocpcCost = null;

  @SerializedName("last_renew_time")
  private String lastRenewTime = null;

  @SerializedName("cpc")
  private Float cpc = null;

  @SerializedName("arpu_3cd")
  private Float arpu3cd = null;

  @SerializedName("x_hour_convert_diff")
  private Long xHourConvertDiff = null;

  @SerializedName("audit_pass_time")
  private String auditPassTime = null;

  @SerializedName("yesterday_cash_cost")
  private Float yesterdayCashCost = null;

  @SerializedName("history_cost")
  private Float historyCost = null;

  @SerializedName("ocpm_cost")
  private Float ocpmCost = null;

  @SerializedName("ctr")
  private Float ctr = null;

  @SerializedName("cpm")
  private Float cpm = null;

  @SerializedName("x_hour_cost_diff")
  private Float xHourCostDiff = null;

  @SerializedName("today_x_hour_cost")
  private Float todayXHourCost = null;

  @SerializedName("yesterday_x_hour_click")
  private Long yesterdayXHourClick = null;

  @SerializedName("cpa_cost")
  private Float cpaCost = null;

  @SerializedName("first_recharge_amount")
  private Float firstRechargeAmount = null;

  @SerializedName("yesterday_x_hour_cpa")
  private Float yesterdayXHourCpa = null;

  @SerializedName("history_cash_cost")
  private Float historyCashCost = null;

  @SerializedName("cash_balance")
  private Float cashBalance = null;

  @SerializedName("click")
  private Long click = null;

  @SerializedName("yesterday_x_hour_cpc")
  private Float yesterdayXHourCpc = null;

  @SerializedName("cpv_cost")
  private Float cpvCost = null;

  @SerializedName("yesterday_cost_diff")
  private Float yesterdayCostDiff = null;

  @SerializedName("x_hour_cpc_diff")
  private Float xHourCpcDiff = null;

  @SerializedName("transfer_amount")
  private Float transferAmount = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("first_industry")
  private String firstIndustry = null;

  @SerializedName("cpm_cost")
  private Float cpmCost = null;

  @SerializedName("yesterday_ad_number")
  private Float yesterdayAdNumber = null;

  @SerializedName("customer_type")
  private String customerType = null;

  @SerializedName("gd_cost")
  private Float gdCost = null;

  @SerializedName("yesterday_x_hour_convert")
  private Long yesterdayXHourConvert = null;

  @SerializedName("x_hour_click_diff")
  private Long xHourClickDiff = null;

  @SerializedName("yesterday_grants_cost")
  private Float yesterdayGrantsCost = null;

  @SerializedName("show")
  private Long show = null;

  @SerializedName("cpt_cost")
  private Float cptCost = null;

  @SerializedName("today_x_hour_cpa")
  private Float todayXHourCpa = null;

  @SerializedName("register_time")
  private String registerTime = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("cash_cost")
  private Float cashCost = null;

  @SerializedName("total_renew_number")
  private Float totalRenewNumber = null;

  @SerializedName("register_days")
  private Float registerDays = null;

  @SerializedName("today_x_hour_convert")
  private Long todayXHourConvert = null;

  @SerializedName("grants_cost")
  private Float grantsCost = null;

  @SerializedName("yesterday_bid_cash_cost")
  private Float yesterdayBidCashCost = null;

  @SerializedName("bid_cost")
  private Float bidCost = null;

  @SerializedName("brand_cost")
  private Float brandCost = null;

  @SerializedName("first_recharge_time")
  private String firstRechargeTime = null;

  @SerializedName("query_end_time")
  private Long queryEndTime = null;

  @SerializedName("cost")
  private Float cost = null;

  @SerializedName("company_id")
  private Long companyId = null;

  @SerializedName("first_cost_time")
  private String firstCostTime = null;

  @SerializedName("yesterday_x_hour_cost")
  private Float yesterdayXHourCost = null;

  @SerializedName("total_balance")
  private Float totalBalance = null;

  @SerializedName("cpc_cost")
  private Float cpcCost = null;

  @SerializedName("today_x_hour_cpc")
  private Float todayXHourCpc = null;

  @SerializedName("transfer_count")
  private Long transferCount = null;

  @SerializedName("second_industry")
  private String secondIndustry = null;

  @SerializedName("today_x_hour_click")
  private Long todayXHourClick = null;

  @SerializedName("advertiser_name")
  private String advertiserName = null;

  @SerializedName("valid_balance")
  private Float validBalance = null;

  @SerializedName("rant_balance")
  private Float rantBalance = null;

  @SerializedName("account_source")
  private String accountSource = null;


  public ReportAgentGetV2ListStruct todayCost(Float todayCost) {
    this.todayCost = todayCost;
    return this;
  }

  public ReportAgentGetV2ListStruct xHourCpaDiff(Float xHourCpaDiff) {
    this.xHourCpaDiff = xHourCpaDiff;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayBrandCashCost(Float yesterdayBrandCashCost) {
    this.yesterdayBrandCashCost = yesterdayBrandCashCost;
    return this;
  }

  public ReportAgentGetV2ListStruct lastRechargeTime(String lastRechargeTime) {
    this.lastRechargeTime = lastRechargeTime;
    return this;
  }

  public ReportAgentGetV2ListStruct agentId(Long agentId) {
    this.agentId = agentId;
    return this;
  }

  public ReportAgentGetV2ListStruct agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }

  public ReportAgentGetV2ListStruct accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

  public ReportAgentGetV2ListStruct lastRenewAmount(Float lastRenewAmount) {
    this.lastRenewAmount = lastRenewAmount;
    return this;
  }

  public ReportAgentGetV2ListStruct totalRenewAmount(Float totalRenewAmount) {
    this.totalRenewAmount = totalRenewAmount;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayMomCost(Float yesterdayMomCost) {
    this.yesterdayMomCost = yesterdayMomCost;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayCost(Float yesterdayCost) {
    this.yesterdayCost = yesterdayCost;
    return this;
  }

  public ReportAgentGetV2ListStruct ocpcCost(Float ocpcCost) {
    this.ocpcCost = ocpcCost;
    return this;
  }

  public ReportAgentGetV2ListStruct lastRenewTime(String lastRenewTime) {
    this.lastRenewTime = lastRenewTime;
    return this;
  }

  public ReportAgentGetV2ListStruct cpc(Float cpc) {
    this.cpc = cpc;
    return this;
  }

  public ReportAgentGetV2ListStruct arpu3cd(Float arpu3cd) {
    this.arpu3cd = arpu3cd;
    return this;
  }

  public ReportAgentGetV2ListStruct xHourConvertDiff(Long xHourConvertDiff) {
    this.xHourConvertDiff = xHourConvertDiff;
    return this;
  }

  public ReportAgentGetV2ListStruct auditPassTime(String auditPassTime) {
    this.auditPassTime = auditPassTime;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayCashCost(Float yesterdayCashCost) {
    this.yesterdayCashCost = yesterdayCashCost;
    return this;
  }

  public ReportAgentGetV2ListStruct historyCost(Float historyCost) {
    this.historyCost = historyCost;
    return this;
  }

  public ReportAgentGetV2ListStruct ocpmCost(Float ocpmCost) {
    this.ocpmCost = ocpmCost;
    return this;
  }

  public ReportAgentGetV2ListStruct ctr(Float ctr) {
    this.ctr = ctr;
    return this;
  }

  public ReportAgentGetV2ListStruct cpm(Float cpm) {
    this.cpm = cpm;
    return this;
  }

  public ReportAgentGetV2ListStruct xHourCostDiff(Float xHourCostDiff) {
    this.xHourCostDiff = xHourCostDiff;
    return this;
  }

  public ReportAgentGetV2ListStruct todayXHourCost(Float todayXHourCost) {
    this.todayXHourCost = todayXHourCost;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayXHourClick(Long yesterdayXHourClick) {
    this.yesterdayXHourClick = yesterdayXHourClick;
    return this;
  }

  public ReportAgentGetV2ListStruct cpaCost(Float cpaCost) {
    this.cpaCost = cpaCost;
    return this;
  }

  public ReportAgentGetV2ListStruct firstRechargeAmount(Float firstRechargeAmount) {
    this.firstRechargeAmount = firstRechargeAmount;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayXHourCpa(Float yesterdayXHourCpa) {
    this.yesterdayXHourCpa = yesterdayXHourCpa;
    return this;
  }

  public ReportAgentGetV2ListStruct historyCashCost(Float historyCashCost) {
    this.historyCashCost = historyCashCost;
    return this;
  }

  public ReportAgentGetV2ListStruct cashBalance(Float cashBalance) {
    this.cashBalance = cashBalance;
    return this;
  }

  public ReportAgentGetV2ListStruct click(Long click) {
    this.click = click;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayXHourCpc(Float yesterdayXHourCpc) {
    this.yesterdayXHourCpc = yesterdayXHourCpc;
    return this;
  }

  public ReportAgentGetV2ListStruct cpvCost(Float cpvCost) {
    this.cpvCost = cpvCost;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayCostDiff(Float yesterdayCostDiff) {
    this.yesterdayCostDiff = yesterdayCostDiff;
    return this;
  }

  public ReportAgentGetV2ListStruct xHourCpcDiff(Float xHourCpcDiff) {
    this.xHourCpcDiff = xHourCpcDiff;
    return this;
  }

  public ReportAgentGetV2ListStruct transferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

  public ReportAgentGetV2ListStruct companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  public ReportAgentGetV2ListStruct firstIndustry(String firstIndustry) {
    this.firstIndustry = firstIndustry;
    return this;
  }

  public ReportAgentGetV2ListStruct cpmCost(Float cpmCost) {
    this.cpmCost = cpmCost;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayAdNumber(Float yesterdayAdNumber) {
    this.yesterdayAdNumber = yesterdayAdNumber;
    return this;
  }

  public ReportAgentGetV2ListStruct customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

  public ReportAgentGetV2ListStruct gdCost(Float gdCost) {
    this.gdCost = gdCost;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayXHourConvert(Long yesterdayXHourConvert) {
    this.yesterdayXHourConvert = yesterdayXHourConvert;
    return this;
  }

  public ReportAgentGetV2ListStruct xHourClickDiff(Long xHourClickDiff) {
    this.xHourClickDiff = xHourClickDiff;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayGrantsCost(Float yesterdayGrantsCost) {
    this.yesterdayGrantsCost = yesterdayGrantsCost;
    return this;
  }

  public ReportAgentGetV2ListStruct show(Long show) {
    this.show = show;
    return this;
  }

  public ReportAgentGetV2ListStruct cptCost(Float cptCost) {
    this.cptCost = cptCost;
    return this;
  }

  public ReportAgentGetV2ListStruct todayXHourCpa(Float todayXHourCpa) {
    this.todayXHourCpa = todayXHourCpa;
    return this;
  }

  public ReportAgentGetV2ListStruct registerTime(String registerTime) {
    this.registerTime = registerTime;
    return this;
  }

  public ReportAgentGetV2ListStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ReportAgentGetV2ListStruct cashCost(Float cashCost) {
    this.cashCost = cashCost;
    return this;
  }

  public ReportAgentGetV2ListStruct totalRenewNumber(Float totalRenewNumber) {
    this.totalRenewNumber = totalRenewNumber;
    return this;
  }

  public ReportAgentGetV2ListStruct registerDays(Float registerDays) {
    this.registerDays = registerDays;
    return this;
  }

  public ReportAgentGetV2ListStruct todayXHourConvert(Long todayXHourConvert) {
    this.todayXHourConvert = todayXHourConvert;
    return this;
  }

  public ReportAgentGetV2ListStruct grantsCost(Float grantsCost) {
    this.grantsCost = grantsCost;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayBidCashCost(Float yesterdayBidCashCost) {
    this.yesterdayBidCashCost = yesterdayBidCashCost;
    return this;
  }

  public ReportAgentGetV2ListStruct bidCost(Float bidCost) {
    this.bidCost = bidCost;
    return this;
  }

  public ReportAgentGetV2ListStruct brandCost(Float brandCost) {
    this.brandCost = brandCost;
    return this;
  }

  public ReportAgentGetV2ListStruct firstRechargeTime(String firstRechargeTime) {
    this.firstRechargeTime = firstRechargeTime;
    return this;
  }

  public ReportAgentGetV2ListStruct queryEndTime(Long queryEndTime) {
    this.queryEndTime = queryEndTime;
    return this;
  }

  public ReportAgentGetV2ListStruct cost(Float cost) {
    this.cost = cost;
    return this;
  }

  public ReportAgentGetV2ListStruct companyId(Long companyId) {
    this.companyId = companyId;
    return this;
  }

  public ReportAgentGetV2ListStruct firstCostTime(String firstCostTime) {
    this.firstCostTime = firstCostTime;
    return this;
  }

  public ReportAgentGetV2ListStruct yesterdayXHourCost(Float yesterdayXHourCost) {
    this.yesterdayXHourCost = yesterdayXHourCost;
    return this;
  }

  public ReportAgentGetV2ListStruct totalBalance(Float totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

  public ReportAgentGetV2ListStruct cpcCost(Float cpcCost) {
    this.cpcCost = cpcCost;
    return this;
  }

  public ReportAgentGetV2ListStruct todayXHourCpc(Float todayXHourCpc) {
    this.todayXHourCpc = todayXHourCpc;
    return this;
  }

  public ReportAgentGetV2ListStruct transferCount(Long transferCount) {
    this.transferCount = transferCount;
    return this;
  }

  public ReportAgentGetV2ListStruct secondIndustry(String secondIndustry) {
    this.secondIndustry = secondIndustry;
    return this;
  }

  public ReportAgentGetV2ListStruct todayXHourClick(Long todayXHourClick) {
    this.todayXHourClick = todayXHourClick;
    return this;
  }

  public ReportAgentGetV2ListStruct advertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
    return this;
  }

  public ReportAgentGetV2ListStruct validBalance(Float validBalance) {
    this.validBalance = validBalance;
    return this;
  }

  public ReportAgentGetV2ListStruct rantBalance(Float rantBalance) {
    this.rantBalance = rantBalance;
    return this;
  }

  public ReportAgentGetV2ListStruct accountSource(String accountSource) {
    this.accountSource = accountSource;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
