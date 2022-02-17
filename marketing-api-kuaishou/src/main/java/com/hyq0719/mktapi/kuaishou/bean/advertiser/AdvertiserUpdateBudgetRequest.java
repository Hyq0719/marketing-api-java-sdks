package com.hyq0719.mktapi.kuaishou.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

@Data
public class AdvertiserUpdateBudgetRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private Long advertiserId;

  @SerializedName("day_budget")
  private Long dayBudget;

  @SerializedName("day_budget_schedule")
  private Long dayBudgetSchedule;

  public AdvertiserUpdateBudgetRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdvertiserUpdateBudgetRequest dayBudget(Long dayBudget) {
    this.dayBudget = dayBudget;
    return this;
  }

  public AdvertiserUpdateBudgetRequest dayBudgetSchedule(Long dayBudgetSchedule) {
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
