package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ReportCampaignGetFilteringStruct {
  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("landing_types")
  private List<String> landingTypes = null;

  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  @SerializedName("status")
  private String status = null;


  public ReportCampaignGetFilteringStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public ReportCampaignGetFilteringStruct landingTypes(List<String> landingTypes) {
    this.landingTypes = landingTypes;
    return this;
  }

  public ReportCampaignGetFilteringStruct campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportCampaignGetFilteringStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
