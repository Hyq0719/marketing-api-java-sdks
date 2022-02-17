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
 * @date 2022-02-17 13:29:26
 */
@Data
public class ReportCreativeGetFilteringStruct {
  /**
   * 广告组id列表：按照campaign_id过滤，最多支持100个
   */
  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  /**
   * 广告计划id列表：按照 ad_id 过滤，最多支持100个
   */
  @SerializedName("ad_ids")
  private List<Long> adIds = null;

  /**
   * 广告创意id列表：按照 creative_id 过滤，最多支持100个
   */
  @SerializedName("creative_ids")
  private List<Long> creativeIds = null;

  /**
   * 广告位置列表：按照广告位置过滤，详见【附录-首选投放位置】
   */
  @SerializedName("inventory_types")
  private List<String> inventoryTypes = null;

  /**
   * 出价方式列表：按照出价方式过滤，详见【附录-计划出价类型】
   */
  @SerializedName("pricings")
  private List<String> pricings = null;

  /**
   * 素材类型列表：按照类型过滤，详见【附录-素材类型】
   */
  @SerializedName("image_modes")
  private List<String> imageModes = null;

  /**
   * 创意类型列表：按照创意类型过滤，STATIC_ASSEMBLE 表示程序化创意，INTERVENE表示自定义创意。
   */
  @SerializedName("creative_material_modes")
  private List<String> creativeMaterialModes = null;

  /**
   * 推广目的列表：按照广告组推广目的过滤,详见【附录-推广目的类型】 允许值: "LINK","APP","DPA","GOODS","STORE","SHOP","AWEME"
   */
  @SerializedName("landing_types")
  private List<String> landingTypes = null;

  /**
   * 广告创意状态：按照广告创意状态过滤，默认为返回“所有不包含已删除”，如果要返回所有包含已删除有对应枚举表示，详见【附录-创意状态】
   */
  @SerializedName("status")
  private String status = null;

  /**
   * 投放模式筛选。 允许值: STANDARD:标准投放。 ADLAB_FREE:管家&省心投放
   */
  @SerializedName("delivery_mode")
  private List<String> deliveryMode = null;

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

  public ReportCreativeGetFilteringStruct pricings(List<String> pricings) {
    this.pricings = pricings;
    return this;
  }

  public ReportCreativeGetFilteringStruct imageModes(List<String> imageModes) {
    this.imageModes = imageModes;
    return this;
  }

  public ReportCreativeGetFilteringStruct creativeMaterialModes(List<String> creativeMaterialModes) {
    this.creativeMaterialModes = creativeMaterialModes;
    return this;
  }

  public ReportCreativeGetFilteringStruct landingTypes(List<String> landingTypes) {
    this.landingTypes = landingTypes;
    return this;
  }

  public ReportCreativeGetFilteringStruct status(String status) {
    this.status = status;
    return this;
  }

  public ReportCreativeGetFilteringStruct deliveryMode(List<String> deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
