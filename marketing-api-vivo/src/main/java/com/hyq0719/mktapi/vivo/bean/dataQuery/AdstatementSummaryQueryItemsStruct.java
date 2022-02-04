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
 * @date 2022-02-04 18:13:59
 */
@Data
public class AdstatementSummaryQueryItemsStruct {

  /**
   * 计划ID
   */
  @SerializedName("campaignId")
  private Long campaignId = null;

  /**
   * 计划名称
   */
  @SerializedName("campaignName")
  private String campaignName = null;

  /**
   * 广告组ID
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 广告组名称
   */
  @SerializedName("groupName")
  private String groupName = null;

  /**
   * 广告ID
   */
  @SerializedName("advertisementId")
  private Long advertisementId = null;

  /**
   * 广告名称
   */
  @SerializedName("advertisementName")
  private String advertisementName = null;

  /**
   * 创意ID
   */
  @SerializedName("creativeId")
  private Long creativeId = null;

  /**
   * 广告位类型，详见【附录-广告位枚举（广告报表）】
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 包名
   */
  @SerializedName("appPackage")
  private String appPackage = null;

  /**
   * 转化类型，详见【附录-广告组转化目标类型】
   */
  @SerializedName("cvType")
  private Integer cvType = null;

  /**
   * 上报时间,按天维度查询时返回例:20200824
   */
  @SerializedName("reportDate")
  private Integer reportDate = null;

  /**
   * 上报时间按小时维度查询时返回, 例:2020-06-28 11:00:00
   */
  @SerializedName("reportTime")
  private String reportTime = null;

  /**
   * 广告主ID
   */
  @SerializedName("advertiserId")
  private String advertiserId = null;

  /**
   * 曝光量
   */
  @SerializedName("showCount")
  private Long showCount = null;

  /**
   * 点击量
   */
  @SerializedName("clickCount")
  private Long clickCount = null;

  /**
   * 下载量
   */
  @SerializedName("downloadCount")
  private Long downloadCount = null;

  /**
   * 花费
   */
  @SerializedName("spent")
  private Double spent = null;

  /**
   * 新增激活数
   */
  @SerializedName("activateCount")
  private Long activateCount = null;

  /**
   * 游戏注册量
   */
  @SerializedName("registerCount")
  private Long registerCount = null;

  /**
   * 表单提交量
   */
  @SerializedName("formsubmitCount")
  private Long formsubmitCount = null;

  /**
   * 普通激活
   */
  @SerializedName("normalActivateCount")
  private Long normalActivateCount = null;

  /**
   * 自定义激活数
   */
  @SerializedName("backActivateCount")
  private Long backActivateCount = null;

  /**
   * 自定义注册量
   */
  @SerializedName("backRegisterCount")
  private Long backRegisterCount = null;

  /**
   * 加桌数
   */
  @SerializedName("addDesktopCount")
  private Long addDesktopCount = null;

  /**
   * 自定义留存数
   */
  @SerializedName("customRetainCount")
  private Long customRetainCount = null;

  /**
   * 游戏付费数
   */
  @SerializedName("gamePayCount")
  private Long gamePayCount = null;

  /**
   * 自定义付费数
   */
  @SerializedName("customPayCount")
  private Long customPayCount = null;

  /**
   * 自定义拉活数
   */
  @SerializedName("reactivation")
  private Long reactivation = null;

  /**
   * 游戏预约数
   */
  @SerializedName("gameAppointment")
  private Long gameAppointment = null;

  /**
   * 新增激活数(按计费时间)
   */
  @SerializedName("activateC")
  private Long activateC = null;

  /**
   * 自定义激活数(按计费时间)
   */
  @SerializedName("backActivateC")
  private Long backActivateC = null;

  /**
   * 游戏注册量(按计费时间)
   */
  @SerializedName("registerC")
  private Long registerC = null;

  /**
   * 自定义注册量(按计费时间)
   */
  @SerializedName("backRegisterC")
  private Long backRegisterC = null;

  /**
   * 加桌数(按计费时间)
   */
  @SerializedName("addDesktopC")
  private Long addDesktopC = null;

  /**
   * 下载数(按计费时间)
   */
  @SerializedName("cDownloadCount")
  private Long cDownloadCount = null;

  /**
   * 自定义留存数(按计费时间)
   */
  @SerializedName("customRetainC")
  private Long customRetainC = null;

  /**
   * 游戏付费数(按计费时间)
   */
  @SerializedName("gamePayC")
  private Long gamePayC = null;

  /**
   * 自定义付费数(按计费时间)
   */
  @SerializedName("customPayC")
  private Long customPayC = null;

  /**
   * 自定义拉活数(按计费时间)
   */
  @SerializedName("reactivationC")
  private Long reactivationC = null;

  /**
   * 网页购买(按计费时间)
   */
  @SerializedName("webPayC")
  private Long webPayC = null;

  /**
   * 游戏预约数(按计费时间)
   */
  @SerializedName("gameAppointmentC")
  private Long gameAppointmentC = null;

  public AdstatementSummaryQueryItemsStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct advertisementId(Long advertisementId) {
    this.advertisementId = advertisementId;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct advertisementName(String advertisementName) {
    this.advertisementName = advertisementName;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct appPackage(String appPackage) {
    this.appPackage = appPackage;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct cvType(Integer cvType) {
    this.cvType = cvType;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct reportDate(Integer reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct reportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct showCount(Long showCount) {
    this.showCount = showCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct clickCount(Long clickCount) {
    this.clickCount = clickCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct downloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct spent(Double spent) {
    this.spent = spent;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct activateCount(Long activateCount) {
    this.activateCount = activateCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct registerCount(Long registerCount) {
    this.registerCount = registerCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct formsubmitCount(Long formsubmitCount) {
    this.formsubmitCount = formsubmitCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct normalActivateCount(Long normalActivateCount) {
    this.normalActivateCount = normalActivateCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct backActivateCount(Long backActivateCount) {
    this.backActivateCount = backActivateCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct backRegisterCount(Long backRegisterCount) {
    this.backRegisterCount = backRegisterCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct addDesktopCount(Long addDesktopCount) {
    this.addDesktopCount = addDesktopCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct customRetainCount(Long customRetainCount) {
    this.customRetainCount = customRetainCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct gamePayCount(Long gamePayCount) {
    this.gamePayCount = gamePayCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct reactivation(Long reactivation) {
    this.reactivation = reactivation;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct gameAppointment(Long gameAppointment) {
    this.gameAppointment = gameAppointment;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct customPayCount(Long customPayCount) {
    this.customPayCount = customPayCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct activateC(Long activateC) {
    this.activateC = activateC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct backActivateC(Long backActivateC) {
    this.backActivateC = backActivateC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct registerC(Long registerC) {
    this.registerC = registerC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct backRegisterC(Long backRegisterC) {
    this.backRegisterC = backRegisterC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct addDesktopC(Long addDesktopC) {
    this.addDesktopC = addDesktopC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct cDownloadCount(Long cDownloadCount) {
    this.cDownloadCount = cDownloadCount;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct customRetainC(Long customRetainC) {
    this.customRetainC = customRetainC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct gamePayC(Long gamePayC) {
    this.gamePayC = gamePayC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct customPayC(Long customPayC) {
    this.customPayC = customPayC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct reactivationC(Long reactivationC) {
    this.reactivationC = reactivationC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct webPayC(Long webPayC) {
    this.webPayC = webPayC;
    return this;
  }

  public AdstatementSummaryQueryItemsStruct gameAppointmentC(Long gameAppointmentC) {
    this.gameAppointmentC = gameAppointmentC;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}