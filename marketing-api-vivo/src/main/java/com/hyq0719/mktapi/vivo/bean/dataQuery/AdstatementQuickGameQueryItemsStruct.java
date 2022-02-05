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

import java.math.BigDecimal;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 21:37:43
 */
@Data
public class AdstatementQuickGameQueryItemsStruct {

  /**
   * 日期数字 例如:20200824
   */
  @SerializedName("reportDate")
  private Integer reportDate = null;

  /**
   * 创意id
   */
  @SerializedName("creativeId")
  private Long creativeId = null;

  /**
   * 广告id
   */
  @SerializedName("advertisementId")
  private Long advertisementId = null;

  /**
   * 广告名称
   */
  @SerializedName("advertisementName")
  private String advertisementName = null;

  /**
   * 广告组id
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 广告组名称
   */
  @SerializedName("groupName")
  private String groupName = null;

  /**
   * 计划id
   */
  @SerializedName("campaignId")
  private Long campaignId = null;

  /**
   * 计划名称
   */
  @SerializedName("campaignName")
  private String campaignName = null;

  /**
   * 广告主id
   */
  @SerializedName("advertiserId")
  private String advertiserId = null;

  /**
   * 包名
   */
  @SerializedName("appPackage")
  private String appPackage = null;

  /**
   * 应用名称
   */
  @SerializedName("appName")
  private String appName = null;

  /**
   * 曝光
   */
  @SerializedName("showCount")
  private Long showCount = null;

  /**
   * 点击
   */
  @SerializedName("clickCount")
  private Long clickCount = null;

  /**
   * 点击率
   */
  @SerializedName("clickRate")
  private BigDecimal clickRate = null;

  /**
   * 新增转化率
   */
  @SerializedName("addConRate")
  private BigDecimal addConRate = null;

  /**
   * 新增用户成本
   */
  @SerializedName("perAddSpent")
  private BigDecimal perAddSpent = null;

  /**
   * cpc
   */
  @SerializedName("cpc")
  private BigDecimal cpc = null;

  /**
   * cpm
   */
  @SerializedName("cpm")
  private BigDecimal cpm = null;

  /**
   * 收入(元)
   */
  @SerializedName("spent")
  private BigDecimal spent = null;

  /**
   * 新增用户数
   */
  @SerializedName("addUserCnt")
  private Long addUserCnt = null;

  /**
   * 买量日活
   */
  @SerializedName("buyUserCnt")
  private Long buyUserCnt = null;

  /**
   * 次留
   */
  @SerializedName("addRet2Cnt")
  private Long addRet2Cnt = null;

  /**
   * 三日留存
   */
  @SerializedName("addRet3Cnt")
  private Long addRet3Cnt = null;

  /**
   * 七日留存
   */
  @SerializedName("addRet7Cnt")
  private Long addRet7Cnt = null;

  /**
   * 快游戏广告变现金额
   */
  @SerializedName("fgameSharingSpent")
  private BigDecimal fgameSharingSpent = null;

  /**
   * 广告变现LTV1,新增用户数当天产生的广告变现收入/当天新增用户数
   */
  @SerializedName("addUserLtv1Spent")
  private BigDecimal addUserLtv1Spent = null;

  /**
   * 广告变现LTV3，新增用户数近三天产生的广告变现收入/三天前统计的新增用户数
   */
  @SerializedName("addUserLtv3Spent")
  private BigDecimal addUserLtv3Spent = null;

  /**
   * 广告变现LTV7，新增用户数近7天产生的广告变现收入/7天前统计的新增用户数
   */
  @SerializedName("addUserLtv7Spent")
  private BigDecimal addUserLtv7Spent = null;

  /**
   * 广告变现LTV15，新增用户数近15天产生的广告变现收入/15天前统计的新增用户数
   */
  @SerializedName("addUserLtv15Spent")
  private BigDecimal addUserLtv15Spent = null;

  /**
   * 广告变现LTV30，新增用户数近30天产生的广告变现收入/30天前统计的新增用户数
   */
  @SerializedName("addUserLtv30Spent")
  private BigDecimal addUserLtv30Spent = null;

  /**
   * 新增用户数当天产生的广告变现收入（分成收入）/当天统计的收入
   */
  @SerializedName("addUserRoi1Spent")
  private BigDecimal addUserRoi1Spent = null;

  /**
   * 广告变现ROI3，新增用户数近3天产生的广告变现收入/3天前统计的收入
   */
  @SerializedName("addUserRoi3Spent")
  private BigDecimal addUserRoi3Spent = null;

  /**
   * 广告变现ROI7，新增用户数近7天产生的广告变现收入/7天前统计的收入
   */
  @SerializedName("addUserRoi7Spent")
  private BigDecimal addUserRoi7Spent = null;

  /**
   * 广告变现ROI15，新增用户数近15天产生的广告变现收入/15天前统计的收入
   */
  @SerializedName("addUserRoi15Spent")
  private BigDecimal addUserRoi15Spent = null;

  /**
   * 广告变现ROI30，新增用户数近30天产生的广告变现收入/30天前统计的收入
   */
  @SerializedName("addUserRoi30Spent")
  private BigDecimal addUserRoi30Spent = null;

  /**
   * 订单总额，当日活跃用户订单总金额
   */
  @SerializedName("csmeAmt")
  private BigDecimal csmeAmt = null;

  /**
   * V钻消耗额，当日活跃用户V钻总金额
   */
  @SerializedName("csmeVzAmt")
  private BigDecimal csmeVzAmt = null;

  /**
   * 礼券消耗额，当日活跃用户礼券总金额
   */
  @SerializedName("csmeTicketAmt")
  private BigDecimal csmeTicketAmt = null;

  /**
   * 消费用户数，当日产生充值的用户数
   */
  @SerializedName("csmeUserCnt")
  private Long csmeUserCnt = null;

  /**
   * 当日注册当日消费用户数，当日注册且当日产生消费的用户
   */
  @SerializedName("newCsmeUserCnt")
  private Long newCsmeUserCnt = null;

  /**
   * 当日注册当日消费量，当日注册且当日产生消费的用户消费总金额
   */
  @SerializedName("newCsmeUserAmt")
  private Long newCsmeUserAmt = null;

  /**
   * 内购流水LTV1，当日注册用户数当天产生的付费/当天统计的收入（spent）
   */
  @SerializedName("csmeUserAmtLtv1")
  private BigDecimal csmeUserAmtLtv1 = null;

  /**
   * 内购流水LTV3，当日注册用户数近3天产生的付费/3天前统计的收入（spent）
   */
  @SerializedName("csmeUserAmtLtv3")
  private BigDecimal csmeUserAmtLtv3 = null;

  /**
   * 内购流水LTV7，当日注册用户数近7天产生的付费/7天前统计的收入（spent）
   */
  @SerializedName("csmeUserAmtLtv7")
  private BigDecimal csmeUserAmtLtv7 = null;

  /**
   * 内购流水LTV15，当日注册用户数近15天产生的付费/15天前统计的收入（spent）
   */
  @SerializedName("csmeUserAmtLtv15")
  private BigDecimal csmeUserAmtLtv15 = null;

  public AdstatementQuickGameQueryItemsStruct reportDate (Integer reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct creativeId (Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct advertisementId (Long advertisementId) {
    this.advertisementId = advertisementId;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct advertisementName (String advertisementName) {
    this.advertisementName = advertisementName;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct groupId (Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct groupName (String groupName) {
    this.groupName = groupName;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct campaignId (Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct campaignName (String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct advertiserId (String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct appPackage (String appPackage) {
    this.appPackage = appPackage;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct appName (String appName) {
    this.appName = appName;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct showCount (Long showCount) {
    this.showCount = showCount;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct clickCount (Long clickCount) {
    this.clickCount = clickCount;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct clickRate (BigDecimal clickRate) {
    this.clickRate = clickRate;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addConRate (BigDecimal addConRate) {
    this.addConRate = addConRate;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct perAddSpent (BigDecimal perAddSpent) {
    this.perAddSpent = perAddSpent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct cpc (BigDecimal cpc) {
    this.cpc = cpc;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct cpm (BigDecimal cpm) {
    this.cpm = cpm;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct spent (BigDecimal spent) {
    this.spent = spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserCnt (Long addUserCnt) {
    this.addUserCnt = addUserCnt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct buyUserCnt (Long buyUserCnt) {
    this.buyUserCnt = buyUserCnt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addRet2Cnt (Long addRet2Cnt) {
    this.addRet2Cnt = addRet2Cnt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addRet3Cnt (Long addRet3Cnt) {
    this.addRet3Cnt = addRet3Cnt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addRet7Cnt (Long addRet7Cnt) {
    this.addRet7Cnt = addRet7Cnt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct fgameSharingSpent (BigDecimal fgameSharingSpent) {
    this.fgameSharingSpent = fgameSharingSpent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserLtv1Spent (BigDecimal addUserLtv1Spent) {
    this.addUserLtv1Spent = addUserLtv1Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserLtv3Spent (BigDecimal addUserLtv3Spent) {
    this.addUserLtv3Spent = addUserLtv3Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserLtv7Spent (BigDecimal addUserLtv7Spent) {
    this.addUserLtv7Spent = addUserLtv7Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserLtv15Spent (BigDecimal addUserLtv15Spent) {
    this.addUserLtv15Spent = addUserLtv15Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserLtv30Spent (BigDecimal addUserLtv30Spent) {
    this.addUserLtv30Spent = addUserLtv30Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserRoi1Spent (BigDecimal addUserRoi1Spent) {
    this.addUserRoi1Spent = addUserRoi1Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserRoi3Spent (BigDecimal addUserRoi3Spent) {
    this.addUserRoi3Spent = addUserRoi3Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserRoi7Spent (BigDecimal addUserRoi7Spent) {
    this.addUserRoi7Spent = addUserRoi7Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserRoi15Spent (BigDecimal addUserRoi15Spent) {
    this.addUserRoi15Spent = addUserRoi15Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct addUserRoi30Spent (BigDecimal addUserRoi30Spent) {
    this.addUserRoi30Spent = addUserRoi30Spent;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct csmeAmt (BigDecimal csmeAmt) {
    this.csmeAmt = csmeAmt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct csmeVzAmt (BigDecimal csmeVzAmt) {
    this.csmeVzAmt = csmeVzAmt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct csmeTicketAmt (BigDecimal csmeTicketAmt) {
    this.csmeTicketAmt = csmeTicketAmt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct csmeUserCnt (Long csmeUserCnt) {
    this.csmeUserCnt = csmeUserCnt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct newCsmeUserCnt (Long newCsmeUserCnt) {
    this.newCsmeUserCnt = newCsmeUserCnt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct newCsmeUserAmt (Long newCsmeUserAmt) {
    this.newCsmeUserAmt = newCsmeUserAmt;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct csmeUserAmtLtv1 (BigDecimal csmeUserAmtLtv1) {
    this.csmeUserAmtLtv1 = csmeUserAmtLtv1;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct csmeUserAmtLtv3 (BigDecimal csmeUserAmtLtv3) {
    this.csmeUserAmtLtv3 = csmeUserAmtLtv3;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct csmeUserAmtLtv7 (BigDecimal csmeUserAmtLtv7) {
    this.csmeUserAmtLtv7 = csmeUserAmtLtv7;
    return this;
  }

  public AdstatementQuickGameQueryItemsStruct csmeUserAmtLtv15 (BigDecimal csmeUserAmtLtv15) {
    this.csmeUserAmtLtv15 = csmeUserAmtLtv15;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}