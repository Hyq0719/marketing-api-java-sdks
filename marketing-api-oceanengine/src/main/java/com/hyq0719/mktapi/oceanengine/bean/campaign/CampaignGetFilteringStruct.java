package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CampaignGetFilteringStruct {
  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("campaign_create_time")
  private String campaignCreateTime = null;

  @SerializedName("landing_type")
  private String landingType = null;

  @SerializedName("ids")
  private List<Long> ids = null;

  @SerializedName("status")
  private String status = null;


  public CampaignGetFilteringStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public CampaignGetFilteringStruct campaignCreateTime(String campaignCreateTime) {
    this.campaignCreateTime = campaignCreateTime;
    return this;
  }

  public CampaignGetFilteringStruct landingType(String landingType) {
    this.landingType = landingType;
    return this;
  }

  public CampaignGetFilteringStruct ids(List<Long> ids) {
    this.ids = ids;
    return this;
  }

  public CampaignGetFilteringStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
