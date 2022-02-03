package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

@Data
public class CampaignsAddRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;
  @SerializedName("budget")
  private Float budget = null;
  @SerializedName("budget_mode")
  private String budgetMode = null;
  @SerializedName("campaign_name")
  private String campaignName = null;
  @SerializedName("campaign_type")
  private String campaignType = null;
  @SerializedName("delivery_related_num")
  private String deliveryRelatedNum = null;
  @SerializedName("landing_type")
  private String landingType = null;
  @SerializedName("marketing_purpose")
  private String marketingPurpose = null;
  @SerializedName("operation")
  private String operation = null;

  public CampaignsAddRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CampaignsAddRequest budget(Float budget) {
    this.budget = budget;
    return this;
  }

  public CampaignsAddRequest budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

  public CampaignsAddRequest campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public CampaignsAddRequest campaignType(String campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  public CampaignsAddRequest deliveryRelatedNum(String deliveryRelatedNum) {
    this.deliveryRelatedNum = deliveryRelatedNum;
    return this;
  }

  public CampaignsAddRequest landingType(String landingType) {
    this.landingType = landingType;
    return this;
  }

  public CampaignsAddRequest marketingPurpose(String marketingPurpose) {
    this.marketingPurpose = marketingPurpose;
    return this;
  }

  public CampaignsAddRequest operation(String operation) {
    this.operation = operation;
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
