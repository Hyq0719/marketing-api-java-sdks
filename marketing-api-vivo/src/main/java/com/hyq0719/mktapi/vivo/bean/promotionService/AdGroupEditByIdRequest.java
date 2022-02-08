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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 11:26:46
 */
@Data
public class AdGroupEditByIdRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 广告组id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 基础定向，定向信息参考【定向管理】，字段如下
   */
  @SerializedName("audienceInfo")
  private AudienceInfoStruct audienceInfo = null;

  /**
   * 投放开始日期
   */
  @SerializedName("startDate")
  private String startDate = null;

  /**
   * 投放结束日期（投放结束时间设置为2038-01-19即为长期投放；）
   */
  @SerializedName("endDate")
  private String endDate = null;

  /**
   * 广告投放时段，默认全时段投放，格式是48*7位字符串，且都是0或1。也就是以半个小时为最小粒度，周一至周日每天分为48个区段，0为不投放，1为投放。
   */
  @SerializedName("scheduleTime")
  private String scheduleTime = null;

  /**
   * 转化目标，商店动态出价首次开启时需要传值，指定转化目标，其他场景不需要传值
   */
  @SerializedName("cvType")
  private Integer cvType = null;

  /**
   * 一阶段出价，单位毫分，1元=100000毫分
   */
  @SerializedName("price")
  private Long price = null;

  /**
   * 二阶段出价，单位毫分，1元=100000毫分
   */
  @SerializedName("ocpxPrice")
  private Long ocpxPrice = null;

  /**
   * 开启动态出价后，出价的提升比例，如20%存储的值是20
   */
  @SerializedName("risePercent")
  private Integer risePercent = null;

  /**
   * 是否开启动态出价，0：否，1：是，只有CPD广告允许使用 （使用商店人群包定向必须回传“0”）
   */
  @SerializedName("autoPriceCheck")
  private Integer autoPriceCheck = null;

  /**
   * 广告组名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 日预算，单位毫分，1元=100000毫分 ，-1表示不限
   */
  @SerializedName("dailyBudget")
  private Long dailyBudget = null;

  /**
   * 一级行业分类id
   */
  @SerializedName("industry1")
  private Integer industry1 = null;

  /**
   * 二级行业分类id
   */
  @SerializedName("industry2")
  private Integer industry2 = null;

  /**
   * 投放状态，1:快速投放，2:匀速投放
   */
  @SerializedName("spentType")
  private Integer spentType = null;

  /**
   * 三阶段出价，单位毫分，1元=100000毫分
   */
  @SerializedName("ocpx3Price")
  private Long ocpx3Price = null;

  /**
   * 检索类型：0-普通广告，1-智能拓量广告，2-系统推荐定向广告
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
   * 深度优化出价，单位毫分，1元=100000毫分
   */
  @SerializedName("secondOcpxPrice")
  private Long secondOcpxPrice = null;

  /**
   * 转化数据过滤周期，0标识关闭，其他标识开启，周期天数：7；30；365
   */
  @SerializedName("conversionFilterCycle")
  private Integer conversionFilterCycle = null;

  /**
   * 是否微信一键关注，0否 1是，仅支持联盟普通网址的自定义URL，开启该功能需要开通对应白名单权限
   */
  @SerializedName("wechatFollow")
  private Integer wechatFollow = null;

  /**
   * 出价策略：0-稳定拿量，1-优先拿量
   */
  @SerializedName("biddingStrategy")
  private Integer biddingStrategy = null;

  /**
   * 商品库配置,动态商品广告必传
   */
  @SerializedName("dpaGoodsConfig")
  private DpaGoodsConfigStruct dpaGoodsConfig = null;

  public AdGroupEditByIdRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdGroupEditByIdRequest id(Long id) {
    this.id = id;
    return this;
  }

  public AdGroupEditByIdRequest audienceInfo(AudienceInfoStruct audienceInfo) {
    this.audienceInfo = audienceInfo;
    return this;
  }

  public AdGroupEditByIdRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AdGroupEditByIdRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdGroupEditByIdRequest scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public AdGroupEditByIdRequest cvType(Integer cvType) {
    this.cvType = cvType;
    return this;
  }

  public AdGroupEditByIdRequest price(Long price) {
    this.price = price;
    return this;
  }

  public AdGroupEditByIdRequest ocpxPrice(Long ocpxPrice) {
    this.ocpxPrice = ocpxPrice;
    return this;
  }

  public AdGroupEditByIdRequest risePercent(Integer risePercent) {
    this.risePercent = risePercent;
    return this;
  }

  public AdGroupEditByIdRequest autoPriceCheck(Integer autoPriceCheck) {
    this.autoPriceCheck = autoPriceCheck;
    return this;
  }

  public AdGroupEditByIdRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdGroupEditByIdRequest dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdGroupEditByIdRequest industry1(Integer industry1) {
    this.industry1 = industry1;
    return this;
  }

  public AdGroupEditByIdRequest industry2(Integer industry2) {
    this.industry2 = industry2;
    return this;
  }

  public AdGroupEditByIdRequest spentType(Integer spentType) {
    this.spentType = spentType;
    return this;
  }

  public AdGroupEditByIdRequest ocpx3Price(Long ocpx3Price) {
    this.ocpx3Price = ocpx3Price;
    return this;
  }

  public AdGroupEditByIdRequest retrieveType(Integer retrieveType) {
    this.retrieveType = retrieveType;
    return this;
  }

  public AdGroupEditByIdRequest ruleAudience(String ruleAudience) {
    this.ruleAudience = ruleAudience;
    return this;
  }

  public AdGroupEditByIdRequest retrieveAudience(String retrieveAudience) {
    this.retrieveAudience = retrieveAudience;
    return this;
  }

  public AdGroupEditByIdRequest secondOcpxPrice(Long secondOcpxPrice) {
    this.secondOcpxPrice = secondOcpxPrice;
    return this;
  }

  public AdGroupEditByIdRequest conversionFilterCycle(Integer conversionFilterCycle) {
    this.conversionFilterCycle = conversionFilterCycle;
    return this;
  }

  public AdGroupEditByIdRequest wechatFollow(Integer wechatFollow) {
    this.wechatFollow = wechatFollow;
    return this;
  }

  public AdGroupEditByIdRequest biddingStrategy(Integer biddingStrategy) {
    this.biddingStrategy = biddingStrategy;
    return this;
  }

  public AdGroupEditByIdRequest dpaGoodsConfig(DpaGoodsConfigStruct dpaGoodsConfig) {
    this.dpaGoodsConfig = dpaGoodsConfig;
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