package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdGetFilteringStruct {
  @SerializedName("ad_name")
  private String adName = null;

  @SerializedName("pricing_list")
  private List<String> pricingList = null;

  @SerializedName("ids")
  private List<Long> ids = null;

  @SerializedName("ad_create_time")
  private String adCreateTime = null;

  @SerializedName("ad_modify_time")
  private String adModifyTime = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("status")
  private String status = null;


  public AdGetFilteringStruct adName(String adName) {
    this.adName = adName;
    return this;
  }

  public AdGetFilteringStruct pricingList(List<String> pricingList) {
    this.pricingList = pricingList;
    return this;
  }

  public AdGetFilteringStruct ids(List<Long> ids) {
    this.ids = ids;
    return this;
  }

  public AdGetFilteringStruct adCreateTime(String adCreateTime) {
    this.adCreateTime = adCreateTime;
    return this;
  }

  public AdGetFilteringStruct adModifyTime(String adModifyTime) {
    this.adModifyTime = adModifyTime;
    return this;
  }

  public AdGetFilteringStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdGetFilteringStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
