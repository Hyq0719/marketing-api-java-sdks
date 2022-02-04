/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataQuery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 18:58:59
 */
@Data
public class AdstatementDownloadImeiQueryListStruct {

  /**
   * 记录标识
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 下载设备imei号，MD5加密；AndroidQ以下版本返回
   */
  @SerializedName("imei")
  private String imei = null;

  /**
   * 下载设备oaid，原文；AndroidQ及以上版本返回
   */
  @SerializedName("oaid")
  private String oaid = null;

  /**
   * 下载时间戳(毫秒级)
   */
  @SerializedName("downBegin")
  private Long downBegin = null;

  /**
   * 推广计划类型 0：商店 1：非商店 2：联盟 【附录-推广计划类型】
   */
  @SerializedName("mediaType")
  private Integer mediaType = null;

  /**
   * 广告位类型 1：信息流 2：开屏 3：Banner 4：插屏 5：原生 9：激励视频 28：优选流量 【附录-广告位类型枚举】
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 广告ID
   */
  @SerializedName("adId")
  private String adId = null;

  /**
   * 广告名称
   */
  @SerializedName("adName")
  private String adName = null;

  /**
   * 计划ID
   */
  @SerializedName("planId")
  private String planId = null;

  /**
   * 计划名称
   */
  @SerializedName("planName")
  private String planName = null;

  /**
   * 应用包名
   */
  @SerializedName("appPackage")
  private String appPackage = null;

  public AdstatementDownloadImeiQueryListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct imei(String imei) {
    this.imei = imei;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct oaid(String oaid) {
    this.oaid = oaid;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct downBegin(Long downBegin) {
    this.downBegin = downBegin;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct adId(String adId) {
    this.adId = adId;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct adName(String adName) {
    this.adName = adName;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct planId(String planId) {
    this.planId = planId;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct planName(String planName) {
    this.planName = planName;
    return this;
  }

  public AdstatementDownloadImeiQueryListStruct appPackage(String appPackage) {
    this.appPackage = appPackage;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}