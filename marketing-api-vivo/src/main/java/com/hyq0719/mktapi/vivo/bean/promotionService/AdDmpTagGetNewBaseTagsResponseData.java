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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:39:24
 */
@Data
public class AdDmpTagGetNewBaseTagsResponseData {

  /**
   * 地域定向
   */
  @SerializedName("region")
  private List<BaseTagResDto> region = null;

  /**
   * 性别定向
   */
  @SerializedName("sex")
  private List<BaseTagResDto> sex = null;

  /**
   * 年龄定向
   */
  @SerializedName("age")
  private List<BaseTagResDto> age = null;

  /**
   * 应用分类
   */
  @SerializedName("appCategoryList")
  private List<BaseTagResDto> appCategoryList = null;

  /**
   * 游戏分类
   */
  @SerializedName("gameCategoryList")
  private List<BaseTagResDto> gameCategoryList = null;

  /**
   * 兴趣行为
   */
  @SerializedName("interest")
  private List<BaseTagResDto> interest = null;

  /**
   * 安卓版本定向
   */
  @SerializedName("androidVersion")
  private List<BaseTagResDto> androidVersion = null;

  /**
   * 购机价格定向
   */
  @SerializedName("phonePrice")
  private List<BaseTagResDto> phonePrice = null;

  /**
   * 手机系列定向
   */
  @SerializedName("phoneSeries")
  private List<BaseTagResDto> phoneSeries = null;

  /**
   * 网络运营商定向
   */
  @SerializedName("networkOperator")
  private List<BaseTagResDto> networkOperator = null;

  public AdDmpTagGetNewBaseTagsResponseData region(List<BaseTagResDto> region) {
    this.region = region;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData sex(List<BaseTagResDto> sex) {
    this.sex = sex;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData age(List<BaseTagResDto> age) {
    this.age = age;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData appCategoryList(List<BaseTagResDto> appCategoryList) {
    this.appCategoryList = appCategoryList;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData gameCategoryList(List<BaseTagResDto> gameCategoryList) {
    this.gameCategoryList = gameCategoryList;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData interest(List<BaseTagResDto> interest) {
    this.interest = interest;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData androidVersion(List<BaseTagResDto> androidVersion) {
    this.androidVersion = androidVersion;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData phonePrice(List<BaseTagResDto> phonePrice) {
    this.phonePrice = phonePrice;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData phoneSeries(List<BaseTagResDto> phoneSeries) {
    this.phoneSeries = phoneSeries;
    return this;
  }

  public AdDmpTagGetNewBaseTagsResponseData networkOperator(List<BaseTagResDto> networkOperator) {
    this.networkOperator = networkOperator;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}