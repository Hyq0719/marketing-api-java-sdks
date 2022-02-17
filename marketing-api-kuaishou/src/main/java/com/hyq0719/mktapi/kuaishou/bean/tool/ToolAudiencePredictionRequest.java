package com.hyq0719.mktapi.kuaishou.bean.tool;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class ToolAudiencePredictionRequest implements TokenKey {
  @SerializedName("fans_star")
  private List<Long> fansStar = null;

  @SerializedName("ages_range")
  private List<Integer> agesRange = null;

  @SerializedName("gender")
  private Integer gender = null;

  @SerializedName("android_osv")
  private Integer androidOsv = null;

  @SerializedName("business_interest_type")
  private Integer businessInterestType = null;

  @SerializedName("app_ids")
  private List<Long> appIds = null;

  @SerializedName("app_interest")
  private List<Long> appInterest = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("platform_os")
  private Integer platformOs = null;

  @SerializedName("network")
  private Integer network = null;

  @SerializedName("population")
  private List<Long> population = null;

  @SerializedName("device_price")
  private List<Integer> devicePrice = null;

  @SerializedName("business_interest")
  private List<Long> businessInterest = null;

  @SerializedName("device_brand")
  private List<Integer> deviceBrand = null;

  @SerializedName("ios_osv")
  private Integer iosOsv = null;

  @SerializedName("exclude_population")
  private List<Long> excludePopulation = null;

  @SerializedName("region")
  private List<Long> region = null;

  @SerializedName("interest_video")
  private List<Long> interestVideo = null;


  public ToolAudiencePredictionRequest fansStar(List<Long> fansStar) {
    this.fansStar = fansStar;
    return this;
  }

  public ToolAudiencePredictionRequest agesRange(List<Integer> agesRange) {
    this.agesRange = agesRange;
    return this;
  }

  public ToolAudiencePredictionRequest gender(Integer gender) {
    this.gender = gender;
    return this;
  }

  public ToolAudiencePredictionRequest androidOsv(Integer androidOsv) {
    this.androidOsv = androidOsv;
    return this;
  }

  public ToolAudiencePredictionRequest businessInterestType(Integer businessInterestType) {
    this.businessInterestType = businessInterestType;
    return this;
  }

  public ToolAudiencePredictionRequest appIds(List<Long> appIds) {
    this.appIds = appIds;
    return this;
  }

  public ToolAudiencePredictionRequest appInterest(List<Long> appInterest) {
    this.appInterest = appInterest;
    return this;
  }

  public ToolAudiencePredictionRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ToolAudiencePredictionRequest platformOs(Integer platformOs) {
    this.platformOs = platformOs;
    return this;
  }

  public ToolAudiencePredictionRequest network(Integer network) {
    this.network = network;
    return this;
  }

  public ToolAudiencePredictionRequest population(List<Long> population) {
    this.population = population;
    return this;
  }

  public ToolAudiencePredictionRequest devicePrice(List<Integer> devicePrice) {
    this.devicePrice = devicePrice;
    return this;
  }

  public ToolAudiencePredictionRequest businessInterest(List<Long> businessInterest) {
    this.businessInterest = businessInterest;
    return this;
  }

  public ToolAudiencePredictionRequest deviceBrand(List<Integer> deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  public ToolAudiencePredictionRequest iosOsv(Integer iosOsv) {
    this.iosOsv = iosOsv;
    return this;
  }

  public ToolAudiencePredictionRequest excludePopulation(List<Long> excludePopulation) {
    this.excludePopulation = excludePopulation;
    return this;
  }

  public ToolAudiencePredictionRequest region(List<Long> region) {
    this.region = region;
    return this;
  }

  public ToolAudiencePredictionRequest interestVideo(List<Long> interestVideo) {
    this.interestVideo = interestVideo;
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
