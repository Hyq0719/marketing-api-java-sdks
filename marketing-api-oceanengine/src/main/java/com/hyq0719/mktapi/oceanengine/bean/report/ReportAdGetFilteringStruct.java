package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ReportAdGetFilteringStruct {
  @SerializedName("pricings")
  private List<String> pricings = null;

  @SerializedName("landing_types")
  private List<String> landingTypes = null;

  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  @SerializedName("ad_name")
  private String adName = null;

  @SerializedName("ad_ids")
  private List<Long> adIds = null;

  @SerializedName("status")
  private String status = null;


  public ReportAdGetFilteringStruct pricings(List<String> pricings) {
    this.pricings = pricings;
    return this;
  }

  public ReportAdGetFilteringStruct landingTypes(List<String> landingTypes) {
    this.landingTypes = landingTypes;
    return this;
  }

  public ReportAdGetFilteringStruct campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportAdGetFilteringStruct adName(String adName) {
    this.adName = adName;
    return this;
  }

  public ReportAdGetFilteringStruct adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public ReportAdGetFilteringStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
