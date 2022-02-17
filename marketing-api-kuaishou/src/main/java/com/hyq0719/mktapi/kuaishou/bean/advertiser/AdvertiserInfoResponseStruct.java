package com.hyq0719.mktapi.kuaishou.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdvertiserInfoResponseStruct {
  @SerializedName("primary_industry_name")
  private String primaryIndustryName = null;

  @SerializedName("industry_id")
  private Long industryId = null;

  @SerializedName("industry_name")
  private String industryName = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("primary_industry_id")
  private Long primaryIndustryId = null;

  @SerializedName("corporation_name")
  private String corporationName = null;


  public AdvertiserInfoResponseStruct primaryIndustryName(String primaryIndustryName) {
    this.primaryIndustryName = primaryIndustryName;
    return this;
  }

  public AdvertiserInfoResponseStruct industryId(Long industryId) {
    this.industryId = industryId;
    return this;
  }

  public AdvertiserInfoResponseStruct industryName(String industryName) {
    this.industryName = industryName;
    return this;
  }

  public AdvertiserInfoResponseStruct userId(Long userId) {
    this.userId = userId;
    return this;
  }

  public AdvertiserInfoResponseStruct userName(String userName) {
    this.userName = userName;
    return this;
  }

  public AdvertiserInfoResponseStruct primaryIndustryId(Long primaryIndustryId) {
    this.primaryIndustryId = primaryIndustryId;
    return this;
  }

  public AdvertiserInfoResponseStruct corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
