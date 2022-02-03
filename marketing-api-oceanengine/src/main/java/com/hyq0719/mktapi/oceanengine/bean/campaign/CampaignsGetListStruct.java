package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CampaignsGetListStruct {
  @SerializedName("campaign_create_time")
  private String campaignCreateTime = null;

  @SerializedName("campaign_modify_time")
  private String campaignModifyTime = null;

  @SerializedName("landing_type")
  private String landingType = null;

  @SerializedName("modify_time")
  private String modifyTime = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("delivery_related_num")
  private String deliveryRelatedNum = null;

  @SerializedName("unique_fk")
  private String uniqueFk = null;

  @SerializedName("budget_mode")
  private String budgetMode = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("delivery_mode")
  private String deliveryMode = null;

  @SerializedName("budget")
  private Long budget = null;

  @SerializedName("status")
  private String status = null;


  public CampaignsGetListStruct campaignCreateTime(String campaignCreateTime) {
    this.campaignCreateTime = campaignCreateTime;
    return this;
  }

  public CampaignsGetListStruct campaignModifyTime(String campaignModifyTime) {
    this.campaignModifyTime = campaignModifyTime;
    return this;
  }

  public CampaignsGetListStruct landingType(String landingType) {
    this.landingType = landingType;
    return this;
  }

  public CampaignsGetListStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  public CampaignsGetListStruct name(String name) {
    this.name = name;
    return this;
  }

  public CampaignsGetListStruct deliveryRelatedNum(String deliveryRelatedNum) {
    this.deliveryRelatedNum = deliveryRelatedNum;
    return this;
  }

  public CampaignsGetListStruct uniqueFk(String uniqueFk) {
    this.uniqueFk = uniqueFk;
    return this;
  }

  public CampaignsGetListStruct budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

  public CampaignsGetListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public CampaignsGetListStruct deliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  public CampaignsGetListStruct budget(Long budget) {
    this.budget = budget;
    return this;
  }

  public CampaignsGetListStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
