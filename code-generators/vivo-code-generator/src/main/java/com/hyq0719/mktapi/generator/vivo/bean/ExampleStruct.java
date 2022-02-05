/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.generator.vivo.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-01-28 13:26:45
 */
@Data
public class ExampleStruct {

  /**
   * 日期数字 例如:20200824
   */
  @SerializedName("reportDate")
  private Integer reportDate = null;

  /**
   * 包名
   */
  @SerializedName("packageName")
  private String packageName = null;

  /**
   * 代理公司
   */
  @SerializedName("company")
  private String company = null;

  /**
   * 当日注册数
   */
  @SerializedName("registerNum")
  private Long registerNum = null;

  /**
   * 活跃数
   */
  @SerializedName("activeNum")
  private Long activeNum = null;

  /**
   * 启动量
   */
  @SerializedName("startupNum")
  private Long startupNum = null;

  /**
   * 启动率
   */
  @SerializedName("startupRate")
  private Double startupRate = null;

  /**
   * 启动均价 单位为元
   */
  @SerializedName("startupAveragePrice")
  private Double startupAveragePrice = null;

  /**
   * 付费用户数
   */
  @SerializedName("payNum")
  private Long payNum = null;

  /**
   * 消费量（V钻+礼券）
   */
  @SerializedName("orderAmount")
  private Long orderAmount = null;

  /**
   * 新付费用户数，当日注册用户中在当日付费的人数
   */
  @SerializedName("newPayNum")
  private Long newPayNum = null;

  /**
   * 新付费用户消费量，新付费用户在当日消费总量
   */
  @SerializedName("newOrderAmount")
  private Long newOrderAmount = null;

  /**
   * 消费V钻量
   */
  @SerializedName("vz")
  private Double vz = null;

  /**
   * 消费券量
   */
  @SerializedName("ticket")
  private Long ticket = null;

  /**
   * 充值人数
   */
  @SerializedName("rechargeNum")
  private Long rechargeNum = null;

  /**
   * 充值金额
   */
  @SerializedName("rechargeAmount")
  private Long rechargeAmount = null;

  /**
   * 次日留存率
   */
  @SerializedName("retain2d")
  private Long retain2d = null;

  /**
   * 3日留存率
   */
  @SerializedName("retain3d")
  private Long retain3d = null;

  /**
   * 七日留存率
   */
  @SerializedName("retain7d")
  private Long retain7d = null;

  /**
   * 7日ltv值
   */
  @SerializedName("ltv7")
  private Long ltv7 = null;

  /**
   * 15日ltv值
   */
  @SerializedName("ltv15")
  private Long ltv15 = null;

  /**
   * 30日ltv值
   */
  @SerializedName("ltv30")
  private Long ltv30 = null;

  /**
   * 45日ltv值
   */
  @SerializedName("ltv45")
  private Long ltv45 = null;

  /**
   * 60日ltv值
   */
  @SerializedName("ltv60")
  private Long ltv60 = null;

  /**
   * 变现实收
   */
  @SerializedName("actualIncome")
  private Long actualIncome = null;

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
   * 广告位
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 广告位，详见【附录-广告位枚举】
   */
  @SerializedName("placeTypeName")
  private String placeTypeName = null;

  /**
   * ，详见【附录-媒体类型枚举】
   */
  @SerializedName("mediaType")
  private Integer mediaType = null;

  /**
   * 媒体类型名称
   */
  @SerializedName("mediaTypeName")
  private String mediaTypeName = null;

  /**
   * 应用名称
   */
  @SerializedName("appName")
  private String appName = null;

  /**
   * 上报时间
   */
  @SerializedName("reportTime")
  private String reportTime = null;

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
   * 花费 单位为元
   */
  @SerializedName("spent")
  private Double spent = null;

  /**
   * 点击率
   */
  @SerializedName("clickRate")
  private Double clickRate = null;

  /**
   * cpc单位为元
   */
  @SerializedName("cpc")
  private Double cpc = null;

  /**
   * cpm单位为元
   */
  @SerializedName("cpm")
  private Double cpm = null;

  /**
   * cpd单位为元
   */
  @SerializedName("cpd")
  private Double cpd = null;

  /**
   * 下载率
   */
  @SerializedName("downloadRate")
  private Double downloadRate = null;

  /**
   * 激活量
   */
  @SerializedName("activateCount")
  private Long activateCount = null;

  /**
   * 激活率
   */
  @SerializedName("activateRate")
  private Double activateRate = null;

  /**
   * 激活成本单位为元
   */
  @SerializedName("cpActivate")
  private Double cpActivate = null;

  /**
   * 注册量
   */
  @SerializedName("registerCount")
  private Long registerCount = null;

  /**
   * 注册率
   */
  @SerializedName("registerRate")
  private Double registerRate = null;

  /**
   * 注册成本单位为元
   */
  @SerializedName("cpRegister")
  private Double cpRegister = null;

  /**
   * 表单提交量
   */
  @SerializedName("formsubmitCount")
  private Long formsubmitCount = null;

  /**
   * 表单提交率
   */
  @SerializedName("formsubmitRate")
  private Double formsubmitRate = null;

  /**
   * 表单提交成本单位为元
   */
  @SerializedName("cpFormsubmit")
  private Double cpFormsubmit = null;

  /**
   * 普通激活
   */
  @SerializedName("normalActivateCount")
  private Long normalActivateCount = null;

  /**
   * 普通激活率
   */
  @SerializedName("normalActivateRate")
  private Double normalActivateRate = null;

  /**
   * 普通激活成本单位为元
   */
  @SerializedName("cpNormalActivate")
  private Double cpNormalActivate = null;

  /**
   * 广告主回传激活
   */
  @SerializedName("backActivateCount")
  private Long backActivateCount = null;

  /**
   * 广告主回传激活成本单位为元
   */
  @SerializedName("cpBackActivate")
  private Double cpBackActivate = null;

  /**
   * 广告主回传激活率
   */
  @SerializedName("backActivateRate")
  private Double backActivateRate = null;

  /**
   * 广告主回传注册
   */
  @SerializedName("backRegisterCount")
  private Long backRegisterCount = null;

  /**
   * 广告主回传注册成本单位为元
   */
  @SerializedName("cpBackRegister")
  private Double cpBackRegister = null;

  /**
   * 广告主回传注册率
   */
  @SerializedName("backRegisterRate")
  private Double backRegisterRate = null;

  /**
   * 加桌数
   */
  @SerializedName("addDesktopCount")
  private Long addDesktopCount = null;

  /**
   * 加桌率
   */
  @SerializedName("addDesktopRate")
  private Double addDesktopRate = null;

  /**
   * 加桌成本单位为元
   */
  @SerializedName("addDesktopAveragePrice")
  private Double addDesktopAveragePrice = null;

  /**
   * 自定义留存数
   */
  @SerializedName("customRetainCount")
  private Long customRetainCount = null;

  /**
   * 自定义留存率
   */
  @SerializedName("customRetainRate")
  private Double customRetainRate = null;

  /**
   * 自定义留存成本单位为元
   */
  @SerializedName("cpCustomRetain")
  private Double cpCustomRetain = null;

  /**
   * 游戏付费数
   */
  @SerializedName("gamePayCount")
  private Long gamePayCount = null;

  /**
   * 游戏付费率
   */
  @SerializedName("gamePayRate")
  private Double gamePayRate = null;

  /**
   * 游戏付费成本单位为元
   */
  @SerializedName("cpGamePay")
  private Double cpGamePay = null;

  /**
   * 自定义付费数
   */
  @SerializedName("customPayCount")
  private Long customPayCount = null;

  /**
   * 自定义付费率
   */
  @SerializedName("customPayRate")
  private Double customPayRate = null;

  /**
   * 自定义付费成本单位为元
   */
  @SerializedName("cpCustomPay")
  private Double cpCustomPay = null;

  /**
   * 自定义拉活数
   */
  @SerializedName("reactivation")
  private Long reactivation = null;

  /**
   * 自定义拉活率
   */
  @SerializedName("reactivationRate")
  private Double reactivationRate = null;

  /**
   * 自定义拉活成本单位为元
   */
  @SerializedName("cpReactivation")
  private Double cpReactivation = null;

  /**
   * 激活数(按计费时间)
   */
  @SerializedName("activateC")
  private Long activateC = null;

  /**
   * 激活率(按计费时间)
   */
  @SerializedName("activateCRate")
  private Double activateCRate = null;

  /**
   * 激活成本(按计费时间)单位为元
   */
  @SerializedName("cpActivateC")
  private Double cpActivateC = null;

  /**
   * 普通激活数(按计费时间)
   */
  @SerializedName("normalActivateC")
  private Long normalActivateC = null;

  /**
   * 普通激活率(按计费时间)
   */
  @SerializedName("normalActivateCRate")
  private Double normalActivateCRate = null;

  /**
   * 普通激活成本(按计费时间)单位为元
   */
  @SerializedName("cpNormalActivateC")
  private Double cpNormalActivateC = null;

  /**
   * 广告主回传激活数(按计费时间)
   */
  @SerializedName("backActivateC")
  private Long backActivateC = null;

  /**
   * 广告主回传激活率(按计费时间)
   */
  @SerializedName("backActivateCRate")
  private Double backActivateCRate = null;

  /**
   * 广告主回传激活成本(按计费时间)单位为元
   */
  @SerializedName("cpBackActivateC")
  private Double cpBackActivateC = null;

  /**
   * 注册数(按计费时间)
   */
  @SerializedName("registerC")
  private Long registerC = null;

  /**
   * 注册率(按计费时间)
   */
  @SerializedName("registerCRate")
  private Double registerCRate = null;

  /**
   * 注册成本(按计费时间)单位为元
   */
  @SerializedName("cpRegisterC")
  private Double cpRegisterC = null;

  /**
   * 广告主回传注册数(按计费时间)
   */
  @SerializedName("backRegisterC")
  private Long backRegisterC = null;

  /**
   * 广告主回传注册率(按计费时间)
   */
  @SerializedName("backRegisterCRate")
  private Double backRegisterCRate = null;

  /**
   * 广告主回传注册成本(按计费时间)单位为元
   */
  @SerializedName("cpBackRegisterC")
  private Double cpBackRegisterC = null;

  /**
   * 加桌数(按计费时间)
   */
  @SerializedName("addDesktopC")
  private Long addDesktopC = null;

  /**
   * 加桌率(按计费时间)
   */
  @SerializedName("addDesktopCRate")
  private Double addDesktopCRate = null;

  /**
   * 加桌成本(按计费时间)单位为元
   */
  @SerializedName("cpAddDesktopC")
  private Double cpAddDesktopC = null;

  /**
   * 下载数(按计费时间)
   */
  @SerializedName("cDownloadCount")
  private Long cDownloadCount = null;

  /**
   * 下载率(按计费时间)
   */
  @SerializedName("cDownloadRate")
  private Double cDownloadRate = null;

  /**
   * 下载成本(按计费时间)单位为元
   */
  @SerializedName("cpCDownload")
  private Double cpCDownload = null;

  /**
   * 自定义留存数(按计费时间)
   */
  @SerializedName("customRetainC")
  private Long customRetainC = null;

  /**
   * 自定义留存率(按计费时间)
   */
  @SerializedName("customRetainCRate")
  private Double customRetainCRate = null;

  /**
   * 自定义留存成本(按计费时间)单位为元
   */
  @SerializedName("cpCustomRetainC")
  private Double cpCustomRetainC = null;

  /**
   * 游戏付费数(按计费时间)
   */
  @SerializedName("gamePayC")
  private Long gamePayC = null;

  /**
   * 游戏付费率(按计费时间)
   */
  @SerializedName("gamePayCRate")
  private Double gamePayCRate = null;

  /**
   * 游戏付费成本(按计费时间)单位为元
   */
  @SerializedName("cpGamePayC")
  private Double cpGamePayC = null;

  /**
   * 自定义付费数(按计费时间)
   */
  @SerializedName("customPayC")
  private Long customPayC = null;

  /**
   * 自定义付费率(按计费时间)
   */
  @SerializedName("customPayCRate")
  private Double customPayCRate = null;

  /**
   * 自定义付费成本(按计费时间)单位为元
   */
  @SerializedName("cpCustomPayC")
  private Double cpCustomPayC = null;

  /**
   * 自定义拉活数(按计费时间)
   */
  @SerializedName("reactivationC")
  private Long reactivationC = null;

  /**
   * 自定义拉活率(按计费时间)
   */
  @SerializedName("reactivationCRate")
  private Double reactivationCRate = null;

  /**
   * 自定义拉活成本(按计费时间)单位为元
   */
  @SerializedName("cpReactivationC")
  private Double cpReactivationC = null;

  public ExampleStruct reportDate(Integer reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  public ExampleStruct packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  public ExampleStruct company(String company) {
    this.company = company;
    return this;
  }

  public ExampleStruct registerNum(Long registerNum) {
    this.registerNum = registerNum;
    return this;
  }

  public ExampleStruct activeNum(Long activeNum) {
    this.activeNum = activeNum;
    return this;
  }

  public ExampleStruct startupNum(Long startupNum) {
    this.startupNum = startupNum;
    return this;
  }

  public ExampleStruct startupRate(Double startupRate) {
    this.startupRate = startupRate;
    return this;
  }

  public ExampleStruct startupAveragePrice(Double startupAveragePrice) {
    this.startupAveragePrice = startupAveragePrice;
    return this;
  }

  public ExampleStruct payNum(Long payNum) {
    this.payNum = payNum;
    return this;
  }

  public ExampleStruct orderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
    return this;
  }

  public ExampleStruct newPayNum(Long newPayNum) {
    this.newPayNum = newPayNum;
    return this;
  }

  public ExampleStruct newOrderAmount(Long newOrderAmount) {
    this.newOrderAmount = newOrderAmount;
    return this;
  }

  public ExampleStruct vz(Double vz) {
    this.vz = vz;
    return this;
  }

  public ExampleStruct ticket(Long ticket) {
    this.ticket = ticket;
    return this;
  }

  public ExampleStruct rechargeNum(Long rechargeNum) {
    this.rechargeNum = rechargeNum;
    return this;
  }

  public ExampleStruct rechargeAmount(Long rechargeAmount) {
    this.rechargeAmount = rechargeAmount;
    return this;
  }

  public ExampleStruct retain2d(Long retain2d) {
    this.retain2d = retain2d;
    return this;
  }

  public ExampleStruct retain3d(Long retain3d) {
    this.retain3d = retain3d;
    return this;
  }

  public ExampleStruct retain7d(Long retain7d) {
    this.retain7d = retain7d;
    return this;
  }

  public ExampleStruct ltv7(Long ltv7) {
    this.ltv7 = ltv7;
    return this;
  }

  public ExampleStruct ltv15(Long ltv15) {
    this.ltv15 = ltv15;
    return this;
  }

  public ExampleStruct ltv30(Long ltv30) {
    this.ltv30 = ltv30;
    return this;
  }

  public ExampleStruct ltv45(Long ltv45) {
    this.ltv45 = ltv45;
    return this;
  }

  public ExampleStruct ltv60(Long ltv60) {
    this.ltv60 = ltv60;
    return this;
  }

  public ExampleStruct actualIncome(Long actualIncome) {
    this.actualIncome = actualIncome;
    return this;
  }

  public ExampleStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public ExampleStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public ExampleStruct groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public ExampleStruct groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public ExampleStruct advertisementId(Long advertisementId) {
    this.advertisementId = advertisementId;
    return this;
  }

  public ExampleStruct advertisementName(String advertisementName) {
    this.advertisementName = advertisementName;
    return this;
  }

  public ExampleStruct creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public ExampleStruct placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public ExampleStruct placeTypeName(String placeTypeName) {
    this.placeTypeName = placeTypeName;
    return this;
  }

  public ExampleStruct mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public ExampleStruct mediaTypeName(String mediaTypeName) {
    this.mediaTypeName = mediaTypeName;
    return this;
  }

  public ExampleStruct appName(String appName) {
    this.appName = appName;
    return this;
  }

  public ExampleStruct reportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  public ExampleStruct showCount(Long showCount) {
    this.showCount = showCount;
    return this;
  }

  public ExampleStruct clickCount(Long clickCount) {
    this.clickCount = clickCount;
    return this;
  }

  public ExampleStruct downloadCount(Long downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

  public ExampleStruct spent(Double spent) {
    this.spent = spent;
    return this;
  }

  public ExampleStruct clickRate(Double clickRate) {
    this.clickRate = clickRate;
    return this;
  }

  public ExampleStruct cpc(Double cpc) {
    this.cpc = cpc;
    return this;
  }

  public ExampleStruct cpm(Double cpm) {
    this.cpm = cpm;
    return this;
  }

  public ExampleStruct cpd(Double cpd) {
    this.cpd = cpd;
    return this;
  }

  public ExampleStruct downloadRate(Double downloadRate) {
    this.downloadRate = downloadRate;
    return this;
  }

  public ExampleStruct activateCount(Long activateCount) {
    this.activateCount = activateCount;
    return this;
  }

  public ExampleStruct activateRate(Double activateRate) {
    this.activateRate = activateRate;
    return this;
  }

  public ExampleStruct cpActivate(Double cpActivate) {
    this.cpActivate = cpActivate;
    return this;
  }

  public ExampleStruct registerCount(Long registerCount) {
    this.registerCount = registerCount;
    return this;
  }

  public ExampleStruct registerRate(Double registerRate) {
    this.registerRate = registerRate;
    return this;
  }

  public ExampleStruct cpRegister(Double cpRegister) {
    this.cpRegister = cpRegister;
    return this;
  }

  public ExampleStruct formsubmitCount(Long formsubmitCount) {
    this.formsubmitCount = formsubmitCount;
    return this;
  }

  public ExampleStruct formsubmitRate(Double formsubmitRate) {
    this.formsubmitRate = formsubmitRate;
    return this;
  }

  public ExampleStruct cpFormsubmit(Double cpFormsubmit) {
    this.cpFormsubmit = cpFormsubmit;
    return this;
  }

  public ExampleStruct normalActivateCount(Long normalActivateCount) {
    this.normalActivateCount = normalActivateCount;
    return this;
  }

  public ExampleStruct normalActivateRate(Double normalActivateRate) {
    this.normalActivateRate = normalActivateRate;
    return this;
  }

  public ExampleStruct cpNormalActivate(Double cpNormalActivate) {
    this.cpNormalActivate = cpNormalActivate;
    return this;
  }

  public ExampleStruct backActivateCount(Long backActivateCount) {
    this.backActivateCount = backActivateCount;
    return this;
  }

  public ExampleStruct cpBackActivate(Double cpBackActivate) {
    this.cpBackActivate = cpBackActivate;
    return this;
  }

  public ExampleStruct backActivateRate(Double backActivateRate) {
    this.backActivateRate = backActivateRate;
    return this;
  }

  public ExampleStruct backRegisterCount(Long backRegisterCount) {
    this.backRegisterCount = backRegisterCount;
    return this;
  }

  public ExampleStruct cpBackRegister(Double cpBackRegister) {
    this.cpBackRegister = cpBackRegister;
    return this;
  }

  public ExampleStruct backRegisterRate(Double backRegisterRate) {
    this.backRegisterRate = backRegisterRate;
    return this;
  }

  public ExampleStruct addDesktopCount(Long addDesktopCount) {
    this.addDesktopCount = addDesktopCount;
    return this;
  }

  public ExampleStruct addDesktopRate(Double addDesktopRate) {
    this.addDesktopRate = addDesktopRate;
    return this;
  }

  public ExampleStruct addDesktopAveragePrice(Double addDesktopAveragePrice) {
    this.addDesktopAveragePrice = addDesktopAveragePrice;
    return this;
  }

  public ExampleStruct customRetainCount(Long customRetainCount) {
    this.customRetainCount = customRetainCount;
    return this;
  }

  public ExampleStruct customRetainRate(Double customRetainRate) {
    this.customRetainRate = customRetainRate;
    return this;
  }

  public ExampleStruct cpCustomRetain(Double cpCustomRetain) {
    this.cpCustomRetain = cpCustomRetain;
    return this;
  }

  public ExampleStruct gamePayCount(Long gamePayCount) {
    this.gamePayCount = gamePayCount;
    return this;
  }

  public ExampleStruct gamePayRate(Double gamePayRate) {
    this.gamePayRate = gamePayRate;
    return this;
  }

  public ExampleStruct cpGamePay(Double cpGamePay) {
    this.cpGamePay = cpGamePay;
    return this;
  }

  public ExampleStruct customPayCount(Long customPayCount) {
    this.customPayCount = customPayCount;
    return this;
  }

  public ExampleStruct customPayRate(Double customPayRate) {
    this.customPayRate = customPayRate;
    return this;
  }

  public ExampleStruct cpCustomPay(Double cpCustomPay) {
    this.cpCustomPay = cpCustomPay;
    return this;
  }

  public ExampleStruct reactivation(Long reactivation) {
    this.reactivation = reactivation;
    return this;
  }

  public ExampleStruct reactivationRate(Double reactivationRate) {
    this.reactivationRate = reactivationRate;
    return this;
  }

  public ExampleStruct cpReactivation(Double cpReactivation) {
    this.cpReactivation = cpReactivation;
    return this;
  }

  public ExampleStruct activateC(Long activateC) {
    this.activateC = activateC;
    return this;
  }

  public ExampleStruct activateCRate(Double activateCRate) {
    this.activateCRate = activateCRate;
    return this;
  }

  public ExampleStruct cpActivateC(Double cpActivateC) {
    this.cpActivateC = cpActivateC;
    return this;
  }

  public ExampleStruct normalActivateC(Long normalActivateC) {
    this.normalActivateC = normalActivateC;
    return this;
  }

  public ExampleStruct normalActivateCRate(Double normalActivateCRate) {
    this.normalActivateCRate = normalActivateCRate;
    return this;
  }

  public ExampleStruct cpNormalActivateC(Double cpNormalActivateC) {
    this.cpNormalActivateC = cpNormalActivateC;
    return this;
  }

  public ExampleStruct backActivateC(Long backActivateC) {
    this.backActivateC = backActivateC;
    return this;
  }

  public ExampleStruct backActivateCRate(Double backActivateCRate) {
    this.backActivateCRate = backActivateCRate;
    return this;
  }

  public ExampleStruct cpBackActivateC(Double cpBackActivateC) {
    this.cpBackActivateC = cpBackActivateC;
    return this;
  }

  public ExampleStruct registerC(Long registerC) {
    this.registerC = registerC;
    return this;
  }

  public ExampleStruct registerCRate(Double registerCRate) {
    this.registerCRate = registerCRate;
    return this;
  }

  public ExampleStruct cpRegisterC(Double cpRegisterC) {
    this.cpRegisterC = cpRegisterC;
    return this;
  }

  public ExampleStruct backRegisterC(Long backRegisterC) {
    this.backRegisterC = backRegisterC;
    return this;
  }

  public ExampleStruct backRegisterCRate(Double backRegisterCRate) {
    this.backRegisterCRate = backRegisterCRate;
    return this;
  }

  public ExampleStruct cpBackRegisterC(Double cpBackRegisterC) {
    this.cpBackRegisterC = cpBackRegisterC;
    return this;
  }

  public ExampleStruct addDesktopC(Long addDesktopC) {
    this.addDesktopC = addDesktopC;
    return this;
  }

  public ExampleStruct addDesktopCRate(Double addDesktopCRate) {
    this.addDesktopCRate = addDesktopCRate;
    return this;
  }

  public ExampleStruct cpAddDesktopC(Double cpAddDesktopC) {
    this.cpAddDesktopC = cpAddDesktopC;
    return this;
  }

  public ExampleStruct cDownloadCount(Long cDownloadCount) {
    this.cDownloadCount = cDownloadCount;
    return this;
  }

  public ExampleStruct cDownloadRate(Double cDownloadRate) {
    this.cDownloadRate = cDownloadRate;
    return this;
  }

  public ExampleStruct cpCDownload(Double cpCDownload) {
    this.cpCDownload = cpCDownload;
    return this;
  }

  public ExampleStruct customRetainC(Long customRetainC) {
    this.customRetainC = customRetainC;
    return this;
  }

  public ExampleStruct customRetainCRate(Double customRetainCRate) {
    this.customRetainCRate = customRetainCRate;
    return this;
  }

  public ExampleStruct cpCustomRetainC(Double cpCustomRetainC) {
    this.cpCustomRetainC = cpCustomRetainC;
    return this;
  }

  public ExampleStruct gamePayC(Long gamePayC) {
    this.gamePayC = gamePayC;
    return this;
  }

  public ExampleStruct gamePayCRate(Double gamePayCRate) {
    this.gamePayCRate = gamePayCRate;
    return this;
  }

  public ExampleStruct cpGamePayC(Double cpGamePayC) {
    this.cpGamePayC = cpGamePayC;
    return this;
  }

  public ExampleStruct customPayC(Long customPayC) {
    this.customPayC = customPayC;
    return this;
  }

  public ExampleStruct customPayCRate(Double customPayCRate) {
    this.customPayCRate = customPayCRate;
    return this;
  }

  public ExampleStruct cpCustomPayC(Double cpCustomPayC) {
    this.cpCustomPayC = cpCustomPayC;
    return this;
  }

  public ExampleStruct reactivationC(Long reactivationC) {
    this.reactivationC = reactivationC;
    return this;
  }

  public ExampleStruct reactivationCRate(Double reactivationCRate) {
    this.reactivationCRate = reactivationCRate;
    return this;
  }

  public ExampleStruct cpReactivationC(Double cpReactivationC) {
    this.cpReactivationC = cpReactivationC;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}