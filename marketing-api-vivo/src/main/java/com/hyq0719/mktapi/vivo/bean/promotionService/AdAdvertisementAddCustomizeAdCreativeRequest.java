/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 13:41:42
 */
@Data
public class AdAdvertisementAddCustomizeAdCreativeRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 创意参数对象，以下为字段说明
   */
  @SerializedName("creativeList")
  private List<CustomizeCreativeListStruct> creativeList = null;

  /**
   * 广告组id
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 广告名称，200个字符以内
   */
  @SerializedName("name")
  private String name = null;

  /**
   * deepLink链接 推广计划为快生态类型时不支持
   */
  @SerializedName("deepLink")
  private String deepLink = null;

  /**
   * 曝光监控地址，非商店、联盟广告新增或修改该属性的时候，会进行编码，商店的不会
   */
  @SerializedName("viewMonitorUrl")
  private String viewMonitorUrl = null;

  /**
   * 点击监控地址，非商店、联盟广告新增或修改该属性的时候，会进行编码，商店的不会
   */
  @SerializedName("clickMonitorUrl")
  private String clickMonitorUrl = null;

  /**
   * 详情页地址
   */
  @SerializedName("pageUrl")
  private String pageUrl = null;

  /**
   * 详情页id编码
   */
  @SerializedName("h5Code")
  private String h5Code = null;

  /**
   * 详情页类型，详见 【附录-h5类型】 推广计划为快应用类型广告不支持 推广计划为应用下载且展现形式为原生广告不支持 展现形式为激励视频广告不支持
   */
  @SerializedName("h5Type")
  private Integer h5Type = null;

  /**
   * 流量优选开关，0：关闭，1：开启
   */
  @SerializedName("generalSwitch")
  private Integer generalSwitch = null;

  /**
   * 搜索广告必填对象，综搜提词参数对象，以下为字段说明
   */
  @SerializedName("adSugKeyWordDtos")
  private List<AdSugKeyWordDtosStruct> adSugKeyWordDtos = null;

  public AdAdvertisementAddCustomizeAdCreativeRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest creativeList(List<CustomizeCreativeListStruct> creativeList) {
    this.creativeList = creativeList;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest deepLink(String deepLink) {
    this.deepLink = deepLink;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest viewMonitorUrl(String viewMonitorUrl) {
    this.viewMonitorUrl = viewMonitorUrl;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest clickMonitorUrl(String clickMonitorUrl) {
    this.clickMonitorUrl = clickMonitorUrl;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest h5Code(String h5Code) {
    this.h5Code = h5Code;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest h5Type(Integer h5Type) {
    this.h5Type = h5Type;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest generalSwitch(Integer generalSwitch) {
    this.generalSwitch = generalSwitch;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeRequest adSugKeyWordDtos(List<AdSugKeyWordDtosStruct> adSugKeyWordDtos) {
    this.adSugKeyWordDtos = adSugKeyWordDtos;
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