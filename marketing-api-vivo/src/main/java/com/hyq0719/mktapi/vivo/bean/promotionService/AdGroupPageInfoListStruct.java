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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 11:34:09
 */
@Data
public class AdGroupPageInfoListStruct {

  /**
   * 广告组id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 广告计划id
   */
  @SerializedName("campaignId")
  private Long campaignId = null;

  /**
   * 应用包名
   */
  @SerializedName("appPackageName")
  private String appPackageName = null;

  /**
   * 渠道包id
   */
  @SerializedName("apkId")
  private Long apkId = null;

  /**
   * 投放开始日期 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("startDate")
  private String startDate = null;

  /**
   * 投放结束日期 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("endDate")
  private String endDate = null;

  /**
   * 计费模式 1：CPM 2：CPC 3：oCpc 4：CPD 5：oCPD
   */
  @SerializedName("chargeType")
  private Integer chargeType = null;

  /**
   * 转化目标： 1:下载 2:激活，其他转化目标详见【广告组转化目标类型】
   */
  @SerializedName("cvType")
  private Integer cvType = null;

  /**
   * 出价，对于OCPX来说，相当于第一阶段出价
   */
  @SerializedName("price")
  private Long price = null;

  /**
   * ocpx阶段的出价
   */
  @SerializedName("ocpxPrice")
  private Long ocpxPrice = null;

  /**
   * cpd业务,优质流量出价提升比例
   */
  @SerializedName("risePercent")
  private Integer risePercent = null;

  /**
   * CPD-是否勾选了动态出价 0:未选中  1:选中
   */
  @SerializedName("autoPriceCheck")
  private Integer autoPriceCheck = null;

  /**
   * 广告组名称，支持模糊查询
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 日限额，<=0代表不限
   */
  @SerializedName("dailyBudget")
  private Long dailyBudget = null;

  /**
   * 创建时间, 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("createDate")
  private String createDate = null;

  /**
   * 所属计划名称
   */
  @SerializedName("campaignName")
  private String campaignName = null;

  /**
   * 收拢状态，详见 【附录-广告组收拢状态】
   */
  @SerializedName("status")
  private Integer status = null;

  /**
   * 收拢状态描述
   */
  @SerializedName("statusDesc")
  private String statusDesc = null;

  /**
   * 活动ID，0代表非活动广告
   */
  @SerializedName("activityId")
  private Integer activityId = null;

  /**
   * 投放状态 1:快速投放 2:匀速投放
   */
  @SerializedName("spentType")
  private Integer spentType = null;

  /**
   * ocpx3阶段的出价
   */
  @SerializedName("ocpx3Price")
  private Long ocpx3Price = null;

  /**
   * 3阶段转化目标 1:下载 2:激活【广告组转化目标类型】
   */
  @SerializedName("cv3Type")
  private Integer cv3Type = null;

  /**
   * ocpx转化数据累计方式,0:按创意,1:按组
   */
  @SerializedName("ocpxStatisticsType")
  private Integer ocpxStatisticsType = null;

  /**
   * 如果广告组出价方式是OCPC 0:第一阶段 1:第二阶段 2:第三阶段
   */
  @SerializedName("ocpxState")
  private Integer ocpxState = null;

  /**
   * 双出价深度优化目标，【广告组转化目标类型】
   */
  @SerializedName("secondCvType")
  private Integer secondCvType = null;

  /**
   * 双出价阶段深度优化目标的出价，精确到毫厘，1元=100000
   */
  @SerializedName("secondOcpxPrice")
  private Double secondOcpxPrice = null;

  /**
   * 推广的网址
   */
  @SerializedName("webSiteUrl")
  private String webSiteUrl = null;

  /**
   * 投放时段
   */
  @SerializedName("scheduleTime")
  private String scheduleTime = null;

  /**
   * 广告行业一级分类
   */
  @SerializedName("industry1")
  private Integer industry1 = null;

  /**
   * 广告行业二级分类
   */
  @SerializedName("industry2")
  private Integer industry2 = null;

  /**
   * 修改时间, 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("modifyDate")
  private String modifyDate = null;

  /**
   * 删除标志 1:删除 0:未删除
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 暂停标识 1:暂停 0:未暂停
   */
  @SerializedName("pauseState")
  private Integer pauseState = null;

  /**
   * 暂停操作时间,时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("pauseTime")
  private String pauseTime = null;

  /**
   * 定向信息
   */
  @SerializedName("audienceDto")
  private AudienceDtoStruct audienceDto = null;

  /**
   * 应用详情页h5 code
   */
  @SerializedName("h5Code")
  private String h5Code = null;

  /**
   * 应用详情页类型 1：h5code 2：定制 3：悟空
   */
  @SerializedName("h5Type")
  private Integer h5Type = null;

  /**
   * 是否开启微信一键关注 0：否 1：是
   */
  @SerializedName("wechatFollow")
  private Integer wechatFollow = null;

  /**
   * 快应用deeplink
   */
  @SerializedName("rpkDeepLink")
  private String rpkDeepLink = null;

  /**
   * 快应用包名
   */
  @SerializedName("rpkPackage")
  private String rpkPackage = null;

  /**
   * 检索类型 0:普通广告 1:智能拓量广告 2:系统推荐定向广告
   */
  @SerializedName("retrieveType")
  private Integer retrieveType = null;

  /**
   * 可突破定向,逗号隔开，10-性别，11-年龄，13-地域，20-人群包 55- 兴趣行为
   */
  @SerializedName("ruleAudience")
  private String ruleAudience = null;

  /**
   * 选中的系统推荐人群（如：高下载人群；高留存人群）枚举值由算法返回营销平台的枚举决定，多个值之间用英文逗号分隔
   */
  @SerializedName("retrieveAudience")
  private String retrieveAudience = null;

  /**
   * 渠道包的主键id
   */
  @SerializedName("channelId")
  private Long channelId = null;

  /**
   * apk状态
   */
  @SerializedName("apkState")
  private Integer apkState = null;

  /**
   * 转化数据过滤周期，无值或0标识关闭，有值标识开启，周期天数：7；30；365；1；-1（永久）
   */
  @SerializedName("conversionFilterCycle")
  private Integer conversionFilterCycle = null;

  /**
   * APP应用状态
   */
  @SerializedName("appState")
  private Integer appState = null;

  public AdGroupPageInfoListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdGroupPageInfoListStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdGroupPageInfoListStruct appPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
    return this;
  }

  public AdGroupPageInfoListStruct apkId(Long apkId) {
    this.apkId = apkId;
    return this;
  }

  public AdGroupPageInfoListStruct startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AdGroupPageInfoListStruct endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdGroupPageInfoListStruct chargeType(Integer chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  public AdGroupPageInfoListStruct cvType(Integer cvType) {
    this.cvType = cvType;
    return this;
  }

  public AdGroupPageInfoListStruct price(Long price) {
    this.price = price;
    return this;
  }

  public AdGroupPageInfoListStruct ocpxPrice(Long ocpxPrice) {
    this.ocpxPrice = ocpxPrice;
    return this;
  }

  public AdGroupPageInfoListStruct risePercent(Integer risePercent) {
    this.risePercent = risePercent;
    return this;
  }

  public AdGroupPageInfoListStruct autoPriceCheck(Integer autoPriceCheck) {
    this.autoPriceCheck = autoPriceCheck;
    return this;
  }

  public AdGroupPageInfoListStruct name(String name) {
    this.name = name;
    return this;
  }

  public AdGroupPageInfoListStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdGroupPageInfoListStruct createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public AdGroupPageInfoListStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public AdGroupPageInfoListStruct status(Integer status) {
    this.status = status;
    return this;
  }

  public AdGroupPageInfoListStruct statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

  public AdGroupPageInfoListStruct activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  public AdGroupPageInfoListStruct spentType(Integer spentType) {
    this.spentType = spentType;
    return this;
  }

  public AdGroupPageInfoListStruct ocpx3Price(Long ocpx3Price) {
    this.ocpx3Price = ocpx3Price;
    return this;
  }

  public AdGroupPageInfoListStruct cv3Type(Integer cv3Type) {
    this.cv3Type = cv3Type;
    return this;
  }

  public AdGroupPageInfoListStruct ocpxStatisticsType(Integer ocpxStatisticsType) {
    this.ocpxStatisticsType = ocpxStatisticsType;
    return this;
  }

  public AdGroupPageInfoListStruct ocpxState(Integer ocpxState) {
    this.ocpxState = ocpxState;
    return this;
  }

  public AdGroupPageInfoListStruct secondCvType(Integer secondCvType) {
    this.secondCvType = secondCvType;
    return this;
  }

  public AdGroupPageInfoListStruct secondOcpxPrice(Double secondOcpxPrice) {
    this.secondOcpxPrice = secondOcpxPrice;
    return this;
  }

  public AdGroupPageInfoListStruct webSiteUrl(String webSiteUrl) {
    this.webSiteUrl = webSiteUrl;
    return this;
  }

  public AdGroupPageInfoListStruct scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public AdGroupPageInfoListStruct industry1(Integer industry1) {
    this.industry1 = industry1;
    return this;
  }

  public AdGroupPageInfoListStruct industry2(Integer industry2) {
    this.industry2 = industry2;
    return this;
  }

  public AdGroupPageInfoListStruct modifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

  public AdGroupPageInfoListStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdGroupPageInfoListStruct pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  public AdGroupPageInfoListStruct pauseTime(String pauseTime) {
    this.pauseTime = pauseTime;
    return this;
  }

  public AdGroupPageInfoListStruct audienceDto(AudienceDtoStruct audienceDto) {
    this.audienceDto = audienceDto;
    return this;
  }

  public AdGroupPageInfoListStruct h5Code(String h5Code) {
    this.h5Code = h5Code;
    return this;
  }

  public AdGroupPageInfoListStruct h5Type(Integer h5Type) {
    this.h5Type = h5Type;
    return this;
  }

  public AdGroupPageInfoListStruct wechatFollow(Integer wechatFollow) {
    this.wechatFollow = wechatFollow;
    return this;
  }

  public AdGroupPageInfoListStruct rpkDeepLink(String rpkDeepLink) {
    this.rpkDeepLink = rpkDeepLink;
    return this;
  }

  public AdGroupPageInfoListStruct rpkPackage(String rpkPackage) {
    this.rpkPackage = rpkPackage;
    return this;
  }

  public AdGroupPageInfoListStruct retrieveType(Integer retrieveType) {
    this.retrieveType = retrieveType;
    return this;
  }

  public AdGroupPageInfoListStruct ruleAudience(String ruleAudience) {
    this.ruleAudience = ruleAudience;
    return this;
  }

  public AdGroupPageInfoListStruct retrieveAudience(String retrieveAudience) {
    this.retrieveAudience = retrieveAudience;
    return this;
  }

  public AdGroupPageInfoListStruct channelId(Long channelId) {
    this.channelId = channelId;
    return this;
  }

  public AdGroupPageInfoListStruct apkState(Integer apkState) {
    this.apkState = apkState;
    return this;
  }

  public AdGroupPageInfoListStruct conversionFilterCycle(Integer conversionFilterCycle) {
    this.conversionFilterCycle = conversionFilterCycle;
    return this;
  }

  public AdGroupPageInfoListStruct appState(Integer appState) {
    this.appState = appState;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}