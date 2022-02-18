/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 13:21:13
 */
@Data
public class ReportAdGetFilteringStruct {
  /**
   * 广告组id列表：按照campaign_id过滤，最多支持100个
   */
  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  /**
   * 广告计划名称：按照ad_name过滤，字符串长度限制1-30
   */
  @SerializedName("ad_name")
  private String adName = null;

  /**
   * 广告计划id列表：按照 ad_id 过滤，最多支持100个
   */
  @SerializedName("ad_ids")
  private List<Long> adIds = null;

  /**
   * 出价方式列表：按照出价方式过滤，详见【附录-计划出价类型】
   */
  @SerializedName("pricings")
  private List<String> pricings = null;

  /**
   * 推广目的列表：按照广告组推广目的过滤,详见【附录-推广目的类型】 允许值: "LINK","APP","DPA","GOODS","STORE","SHOP","AWEME"
   */
  @SerializedName("landing_types")
  private List<String> landingTypes = null;

  /**
   * 广告计划状态：按照广告计划状态过滤，默认为返回“所有不包含已删除”，如果要返回所有包含已删除有对应枚举表示，详见【附录-广告计划投放状态】
   */
  @SerializedName("status")
  private String status = null;

  /**
   * 投放模式筛选。 允许值: STANDARD:标准投放。 ADLAB_FREE:管家&省心投放
   */
  @SerializedName("delivery_mode")
  private List<String> deliveryMode = null;

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

  public ReportAdGetFilteringStruct pricings(List<String> pricings) {
    this.pricings = pricings;
    return this;
  }

  public ReportAdGetFilteringStruct landingTypes(List<String> landingTypes) {
    this.landingTypes = landingTypes;
    return this;
  }

  public ReportAdGetFilteringStruct status(String status) {
    this.status = status;
    return this;
  }

  public ReportAdGetFilteringStruct deliveryMode(List<String> deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
