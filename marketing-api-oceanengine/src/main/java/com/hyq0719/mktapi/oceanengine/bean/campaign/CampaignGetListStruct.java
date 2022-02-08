package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CampaignGetListStruct {
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


  public CampaignGetListStruct campaignCreateTime(String campaignCreateTime) {
    this.campaignCreateTime = campaignCreateTime;
    return this;
  }

  public CampaignGetListStruct campaignModifyTime(String campaignModifyTime) {
    this.campaignModifyTime = campaignModifyTime;
    return this;
  }

  public CampaignGetListStruct landingType(String landingType) {
    this.landingType = landingType;
    return this;
  }

  public CampaignGetListStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  public CampaignGetListStruct name(String name) {
    this.name = name;
    return this;
  }

  public CampaignGetListStruct deliveryRelatedNum(String deliveryRelatedNum) {
    this.deliveryRelatedNum = deliveryRelatedNum;
    return this;
  }

  public CampaignGetListStruct uniqueFk(String uniqueFk) {
    this.uniqueFk = uniqueFk;
    return this;
  }

  public CampaignGetListStruct budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

  public CampaignGetListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public CampaignGetListStruct deliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  public CampaignGetListStruct budget(Long budget) {
    this.budget = budget;
    return this;
  }

  public CampaignGetListStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
