package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

@Data
public class CampaignUpdateRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;
  @SerializedName("campaign_name")
  private String campaignName = null;
  @SerializedName("budget")
  private Float budget = null;
  @SerializedName("budget_mode")
  private String budgetMode = null;
  @SerializedName("modify_time")
  private String modifyTime = null;
  @SerializedName("campaign_id")
  private Long campaignId = null;

  public CampaignUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CampaignUpdateRequest budget(Float budget) {
    this.budget = budget;
    return this;
  }

  public CampaignUpdateRequest budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

  public CampaignUpdateRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public CampaignUpdateRequest campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public CampaignUpdateRequest modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
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
