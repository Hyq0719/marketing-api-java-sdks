package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ReportCreativeGetFilteringStruct {
  @SerializedName("image_modes")
  private List<String> imageModes = null;

  @SerializedName("creative_material_modes")
  private List<String> creativeMaterialModes = null;

  @SerializedName("pricings")
  private List<String> pricings = null;

  @SerializedName("landing_types")
  private List<String> landingTypes = null;

  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  @SerializedName("ad_ids")
  private List<Long> adIds = null;

  @SerializedName("creative_ids")
  private List<Long> creativeIds = null;

  @SerializedName("inventory_types")
  private List<String> inventoryTypes = null;

  @SerializedName("status")
  private String status = null;


  public ReportCreativeGetFilteringStruct imageModes(List<String> imageModes) {
    this.imageModes = imageModes;
    return this;
  }

  public ReportCreativeGetFilteringStruct creativeMaterialModes(List<String> creativeMaterialModes) {
    this.creativeMaterialModes = creativeMaterialModes;
    return this;
  }

  public ReportCreativeGetFilteringStruct pricings(List<String> pricings) {
    this.pricings = pricings;
    return this;
  }

  public ReportCreativeGetFilteringStruct landingTypes(List<String> landingTypes) {
    this.landingTypes = landingTypes;
    return this;
  }

  public ReportCreativeGetFilteringStruct campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportCreativeGetFilteringStruct adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public ReportCreativeGetFilteringStruct creativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
    return this;
  }

  public ReportCreativeGetFilteringStruct inventoryTypes(List<String> inventoryTypes) {
    this.inventoryTypes = inventoryTypes;
    return this;
  }

  public ReportCreativeGetFilteringStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
