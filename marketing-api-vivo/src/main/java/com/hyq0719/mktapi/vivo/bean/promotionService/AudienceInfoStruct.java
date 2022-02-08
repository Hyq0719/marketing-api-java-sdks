/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 10:51:27
 */
@Data
public class AudienceInfoStruct {

  /**
   * 地域定向id列表
   */
  @SerializedName("regionList")
  private List regionList = null;

  /**
   * 用户性别id列表
   */
  @SerializedName("sexList")
  private List sexList = null;

  /**
   * 用户年龄id列表
   */
  @SerializedName("ageList")
  private List ageList = null;

  /**
   * 人群包id列表（定向）
   */
  @SerializedName("customList")
  private List customList = null;

  /**
   * 人群包id列表（排除）
   */
  @SerializedName("excludeCustomList")
  private List excludeCustomList = null;

  /**
   * 安装定向，1：不限；2：未安装；3：已安装
   */
  @SerializedName("installedApp")
  private Integer installedApp = null;

  /**
   * 网络，1：不限；2： WIFI
   */
  @SerializedName("network")
  private Integer network = null;

  /**
   * 意图词包id列表
   */
  @SerializedName("purposeWordCrowdIds")
  private List purposeWordCrowdIds = null;

  /**
   * 意图类目id列表
   */
  @SerializedName("purposeCategoryCrowdIds")
  private List purposeCategoryCrowdIds = null;

  /**
   * 兴趣行为
   */
  @SerializedName("interestSet")
  private Set interestSet = null;

  /**
   * 安卓版本
   */
  @SerializedName("androidVersionSet")
  private Set androidVersionSet = null;

  /**
   * 购机价格
   */
  @SerializedName("phonePriceSet")
  private Set phonePriceSet = null;

  /**
   * 手机系列
   */
  @SerializedName("phoneSeriesSet")
  private Set phoneSeriesSet = null;

  /**
   * 网络运营商
   */
  @SerializedName("networkOperatorSet")
  private Set networkOperatorSet = null;

  /**
   * 安装行为。不为空时，属性period、behavior必填，appCategoryCode、gameCategoryCode不可同时为空，可以单独空
   */
  @SerializedName("installBehavior")
  private InstallBehaviorStruct installBehavior = null;

  /**
   * 启动行为。不为空时，属性period、behavior必填，appCategoryCode、gameCategoryCode不可同时为空，可以单独空
   */
  @SerializedName("startBehavior")
  private StartBehaviorStruct startBehavior = null;

  public AudienceInfoStruct regionList(List regionList) {
    this.regionList = regionList;
    return this;
  }

  public AudienceInfoStruct sexList(List sexList) {
    this.sexList = sexList;
    return this;
  }

  public AudienceInfoStruct ageList(List ageList) {
    this.ageList = ageList;
    return this;
  }

  public AudienceInfoStruct customList(List customList) {
    this.customList = customList;
    return this;
  }

  public AudienceInfoStruct excludeCustomList(List excludeCustomList) {
    this.excludeCustomList = excludeCustomList;
    return this;
  }

  public AudienceInfoStruct installedApp(Integer installedApp) {
    this.installedApp = installedApp;
    return this;
  }

  public AudienceInfoStruct network(Integer network) {
    this.network = network;
    return this;
  }

  public AudienceInfoStruct purposeWordCrowdIds(List purposeWordCrowdIds) {
    this.purposeWordCrowdIds = purposeWordCrowdIds;
    return this;
  }

  public AudienceInfoStruct purposeCategoryCrowdIds(List purposeCategoryCrowdIds) {
    this.purposeCategoryCrowdIds = purposeCategoryCrowdIds;
    return this;
  }

  public AudienceInfoStruct interestSet(Set interestSet) {
    this.interestSet = interestSet;
    return this;
  }

  public AudienceInfoStruct androidVersionSet(Set androidVersionSet) {
    this.androidVersionSet = androidVersionSet;
    return this;
  }

  public AudienceInfoStruct phonePriceSet(Set phonePriceSet) {
    this.phonePriceSet = phonePriceSet;
    return this;
  }

  public AudienceInfoStruct phoneSeriesSet(Set phoneSeriesSet) {
    this.phoneSeriesSet = phoneSeriesSet;
    return this;
  }

  public AudienceInfoStruct networkOperatorSet(Set networkOperatorSet) {
    this.networkOperatorSet = networkOperatorSet;
    return this;
  }

  public AudienceInfoStruct installBehavior(InstallBehaviorStruct installBehavior) {
    this.installBehavior = installBehavior;
    return this;
  }

  public AudienceInfoStruct startBehavior(StartBehaviorStruct startBehavior) {
    this.startBehavior = startBehavior;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}