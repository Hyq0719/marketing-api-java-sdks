package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdUnitUpdateDayBudgetRequest implements TokenKey {
  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("day_budget")
  private Long dayBudget = null;

  @SerializedName("day_budget_schedule")
  private List<Long> dayBudgetSchedule = null;


  public AdUnitUpdateDayBudgetRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public AdUnitUpdateDayBudgetRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdUnitUpdateDayBudgetRequest dayBudget(Long dayBudget) {
    this.dayBudget = dayBudget;
    return this;
  }

  public AdUnitUpdateDayBudgetRequest dayBudgetSchedule(List<Long> dayBudgetSchedule) {
    this.dayBudgetSchedule = dayBudgetSchedule;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}
