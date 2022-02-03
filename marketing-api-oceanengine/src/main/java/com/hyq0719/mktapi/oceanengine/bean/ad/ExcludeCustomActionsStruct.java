package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.common.ConfPageSize1000;

public class ExcludeCustomActionsStruct {
  @SerializedName("days")
  private Long days = null;

  @SerializedName("code")
  private Long code = null;

  @SerializedName("schedule_type")
  private String scheduleType = null;

  @SerializedName("smart_bid_type")
  private String smartBidType = null;

  @SerializedName("flow_control_mode")
  private String flowControlMode = null;

  @SerializedName("end_time")
  private String endTime = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("deep_bid_type")
  private String deepBidType = null;

  @SerializedName("dpa_recommend_type")
  private Long dpaRecommendType = null;

  @SerializedName("schedule_time")
  private String scheduleTime = null;

  @SerializedName("adjust_cpa")
  private Long adjustCpa = null;

  @SerializedName("deep_cpabid")
  private Long deepCpabid = null;

  @SerializedName("roi_goal")
  private Float roiGoal = null;

  @SerializedName("cpa_bid")
  private Long cpaBid = null;

  @SerializedName("budget_mode")
  private String budgetMode = null;

  @SerializedName("bid")
  private Long bid = null;

  @SerializedName("pricing")
  private String pricing = null;

  @SerializedName("luban_roi_goal")
  private Float lubanRoiGoal = null;

  @SerializedName("budget")
  private Float budget = null;

  @SerializedName("page_info")
  private ConfPageSize1000 pageInfo = null;

  public ExcludeCustomActionsStruct days(Long days) {
    this.days = days;
    return this;
  }

  public ExcludeCustomActionsStruct code(Long code) {
    this.code = code;
    return this;
  }

  public ExcludeCustomActionsStruct scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  public ExcludeCustomActionsStruct smartBidType(String smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  public ExcludeCustomActionsStruct flowControlMode(String flowControlMode) {
    this.flowControlMode = flowControlMode;
    return this;
  }

  public ExcludeCustomActionsStruct endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public ExcludeCustomActionsStruct startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public ExcludeCustomActionsStruct deepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
    return this;
  }

  public ExcludeCustomActionsStruct dpaRecommendType(Long dpaRecommendType) {
    this.dpaRecommendType = dpaRecommendType;
    return this;
  }

  public ExcludeCustomActionsStruct scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public ExcludeCustomActionsStruct adjustCpa(Long adjustCpa) {
    this.adjustCpa = adjustCpa;
    return this;
  }

  public ExcludeCustomActionsStruct deepCpabid(Long deepCpabid) {
    this.deepCpabid = deepCpabid;
    return this;
  }

  public ExcludeCustomActionsStruct roiGoal(Float roiGoal) {
    this.roiGoal = roiGoal;
    return this;
  }

  public ExcludeCustomActionsStruct cpaBid(Long cpaBid) {
    this.cpaBid = cpaBid;
    return this;
  }

  public ExcludeCustomActionsStruct budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

  public ExcludeCustomActionsStruct bid(Long bid) {
    this.bid = bid;
    return this;
  }

  public ExcludeCustomActionsStruct pricing(String pricing) {
    this.pricing = pricing;
    return this;
  }

  public ExcludeCustomActionsStruct lubanRoiGoal(Float lubanRoiGoal) {
    this.lubanRoiGoal = lubanRoiGoal;
    return this;
  }

  public ExcludeCustomActionsStruct budget(Float budget) {
    this.budget = budget;
    return this;
  }

  public ExcludeCustomActionsStruct pageInfo(ConfPageSize1000 pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  public Long getDays() {
    return days;
  }

  public void setDays(Long days) {
    this.days = days;
  }

  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public String getScheduleType() {
    return scheduleType;
  }

  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }

  public String getSmartBidType() {
    return smartBidType;
  }

  public void setSmartBidType(String smartBidType) {
    this.smartBidType = smartBidType;
  }

  public String getFlowControlMode() {
    return flowControlMode;
  }

  public void setFlowControlMode(String flowControlMode) {
    this.flowControlMode = flowControlMode;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getDeepBidType() {
    return deepBidType;
  }

  public void setDeepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
  }

  public Long getDpaRecommendType() {
    return dpaRecommendType;
  }

  public void setDpaRecommendType(Long dpaRecommendType) {
    this.dpaRecommendType = dpaRecommendType;
  }

  public String getScheduleTime() {
    return scheduleTime;
  }

  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }

  public Long getAdjustCpa() {
    return adjustCpa;
  }

  public void setAdjustCpa(Long adjustCpa) {
    this.adjustCpa = adjustCpa;
  }

  public Long getDeepCpabid() {
    return deepCpabid;
  }

  public void setDeepCpabid(Long deepCpabid) {
    this.deepCpabid = deepCpabid;
  }

  public Float getRoiGoal() {
    return roiGoal;
  }

  public void setRoiGoal(Float roiGoal) {
    this.roiGoal = roiGoal;
  }

  public Long getCpaBid() {
    return cpaBid;
  }

  public void setCpaBid(Long cpaBid) {
    this.cpaBid = cpaBid;
  }

  public String getBudgetMode() {
    return budgetMode;
  }

  public void setBudgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
  }

  public Long getBid() {
    return bid;
  }

  public void setBid(Long bid) {
    this.bid = bid;
  }

  public String getPricing() {
    return pricing;
  }

  public void setPricing(String pricing) {
    this.pricing = pricing;
  }

  public Float getLubanRoiGoal() {
    return lubanRoiGoal;
  }

  public void setLubanRoiGoal(Float lubanRoiGoal) {
    this.lubanRoiGoal = lubanRoiGoal;
  }

  public Float getBudget() {
    return budget;
  }

  public void setBudget(Float budget) {
    this.budget = budget;
  }

  public ConfPageSize1000 getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(ConfPageSize1000 pageInfo) {
    this.pageInfo = pageInfo;
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
