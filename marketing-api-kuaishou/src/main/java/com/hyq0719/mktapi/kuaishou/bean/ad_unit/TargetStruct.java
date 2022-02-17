package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class TargetStruct {
  @SerializedName("fans_star")
  private List<Long> fansStar = null;

  @SerializedName("gender")
  private Integer gender = null;

  @SerializedName("intelli_extend")
  private IntelliExtendStruct intelliExtend = null;

  @SerializedName("media")
  private List<Long> media = null;

  @SerializedName("network")
  private Integer network = null;

  @SerializedName("device_price")
  private List<Integer> devicePrice = null;

  @SerializedName("media_source_type")
  private Integer mediaSourceType = null;

  @SerializedName("exclude_population")
  private List<Long> excludePopulation = null;

  @SerializedName("interest_video")
  private List<Long> interestVideo = null;

  @SerializedName("district_ids")
  private List<Long> districtIds = null;

  @SerializedName("ages_range")
  private List<Integer> agesRange = null;

  @SerializedName("android_osv")
  private Integer androidOsv = null;

  @SerializedName("business_interest_type")
  private Integer businessInterestType = null;

  @SerializedName("app_ids")
  private List<Long> appIds = null;

  @SerializedName("app_names")
  private List<String> appNames = null;

  @SerializedName("app_interest")
  private List<Long> appInterest = null;

  @SerializedName("filter_converted_level")
  private Integer filterConvertedLevel = null;

  @SerializedName("platform_os")
  private Integer platformOs = null;

  @SerializedName("population")
  private List<Long> population = null;

  @SerializedName("business_interest")
  private List<Long> businessInterest = null;

//    @SerializedName("behavior_interest")
//    private String behaviorInterest = null;

  @SerializedName("device_brand")
  private List<Integer> deviceBrand = null;

  @SerializedName("ios_osv")
  private Integer iosOsv = null;

  @SerializedName("region")
  private List<Long> region = null;

  @SerializedName("age")
  private AgeStruct age = null;

  @SerializedName("exclude_media")
  private List<Long> excludeMedia = null;


  public TargetStruct fansStar(List<Long> fansStar) {
    this.fansStar = fansStar;
    return this;
  }

  public TargetStruct gender(Integer gender) {
    this.gender = gender;
    return this;
  }

  public TargetStruct intelliExtend(IntelliExtendStruct intelliExtend) {
    this.intelliExtend = intelliExtend;
    return this;
  }

  public TargetStruct media(List<Long> media) {
    this.media = media;
    return this;
  }

  public TargetStruct network(Integer network) {
    this.network = network;
    return this;
  }

  public TargetStruct devicePrice(List<Integer> devicePrice) {
    this.devicePrice = devicePrice;
    return this;
  }

  public TargetStruct mediaSourceType(Integer mediaSourceType) {
    this.mediaSourceType = mediaSourceType;
    return this;
  }

  public TargetStruct excludePopulation(List<Long> excludePopulation) {
    this.excludePopulation = excludePopulation;
    return this;
  }

  public TargetStruct interestVideo(List<Long> interestVideo) {
    this.interestVideo = interestVideo;
    return this;
  }

  public TargetStruct districtIds(List<Long> districtIds) {
    this.districtIds = districtIds;
    return this;
  }

  public TargetStruct agesRange(List<Integer> agesRange) {
    this.agesRange = agesRange;
    return this;
  }

  public TargetStruct androidOsv(Integer androidOsv) {
    this.androidOsv = androidOsv;
    return this;
  }

  public TargetStruct businessInterestType(Integer businessInterestType) {
    this.businessInterestType = businessInterestType;
    return this;
  }

  public TargetStruct appIds(List<Long> appIds) {
    this.appIds = appIds;
    return this;
  }

  public TargetStruct appNames(List<String> appNames) {
    this.appNames = appNames;
    return this;
  }

  public TargetStruct appInterest(List<Long> appInterest) {
    this.appInterest = appInterest;
    return this;
  }

  public TargetStruct filterConvertedLevel(Integer filterConvertedLevel) {
    this.filterConvertedLevel = filterConvertedLevel;
    return this;
  }

  public TargetStruct platformOs(Integer platformOs) {
    this.platformOs = platformOs;
    return this;
  }

  public TargetStruct population(List<Long> population) {
    this.population = population;
    return this;
  }

  public TargetStruct businessInterest(List<Long> businessInterest) {
    this.businessInterest = businessInterest;
    return this;
  }

  //    public TargetStruct behaviorInterest (String behaviorInterest) {
//        this.behaviorInterest = behaviorInterest;
//        return this;
//    }
  public TargetStruct deviceBrand(List<Integer> deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  public TargetStruct iosOsv(Integer iosOsv) {
    this.iosOsv = iosOsv;
    return this;
  }

  public TargetStruct region(List<Long> region) {
    this.region = region;
    return this;
  }

  public TargetStruct age(AgeStruct age) {
    this.age = age;
    return this;
  }

  public TargetStruct excludeMedia(List<Long> excludeMedia) {
    this.excludeMedia = excludeMedia;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
