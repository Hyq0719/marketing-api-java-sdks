package com.hyq0719.mktapi.kuaishou.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CampaignUpdateRequest implements TokenKey {
  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("day_budget")
  private Long dayBudget = null;

  @SerializedName("day_budget_schedule")
  private List<Long> dayBudgetSchedule = null;


  public CampaignUpdateRequest campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public CampaignUpdateRequest type(Integer type) {
    this.type = type;
    return this;
  }

  public CampaignUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CampaignUpdateRequest dayBudget(Long dayBudget) {
    this.dayBudget = dayBudget;
    return this;
  }

  public CampaignUpdateRequest dayBudgetSchedule(List<Long> dayBudgetSchedule) {
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
