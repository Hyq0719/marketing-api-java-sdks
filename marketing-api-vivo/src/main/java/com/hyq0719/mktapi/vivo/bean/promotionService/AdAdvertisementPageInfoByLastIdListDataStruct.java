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
 * @date 2022-02-08 14:48:35
 */
@Data
public class AdAdvertisementPageInfoByLastIdListDataStruct {

  /**
   * 该批次的最大ID
   */
  @SerializedName("lastId")
  private Long lastId = null;

  /**
   * 分页大小
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 数据列表
   */
  @SerializedName("data")
  private List<AdAdvertisementPageInfoByLastIdListDataStruct> data = null;

  /**
   * 广告id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 广告名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 用户id
   */
  @SerializedName("userId")
  private String userId = null;

  /**
   * 推广计划id
   */
  @SerializedName("campaignId")
  private Long campaignId = null;

  /**
   * 广告组id
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 展现形式 CPD 11:推荐列表 12:广告提词 13:banner 14:开屏 15:插屏 16:原生  CPC 21:信息流 22:banner
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 虚拟广告位id，多个逗号隔开
   */
  @SerializedName("virtualPositionId")
  private String virtualPositionId = null;

  /**
   * deepLink链接
   */
  @SerializedName("deepLink")
  private String deepLink = null;

  /**
   * 曝光监控地址，非商店、联盟广告数据有经过urlEncode，商店没有
   */
  @SerializedName("viewMonitorUrl")
  private String viewMonitorUrl = null;

  /**
   * 点击监控地址，非商店、联盟广告数据有经过urlEncode，商店没有
   */
  @SerializedName("clickMonitorUrl")
  private String clickMonitorUrl = null;

  /**
   * 创建时间
   */
  @SerializedName("createDate")
  private String createDate = null;

  /**
   * 删除标志 1:删除0:未删除
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 暂停标识 1:暂停 0:未暂停
   */
  @SerializedName("pauseState")
  private Integer pauseState = null;

  /**
   * 暂停操作时间 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("pauseTime")
  private String pauseTime = null;

  /**
   * 对应物料规格id
   */
  @SerializedName("normId")
  private Integer normId = null;

  /**
   * 落地页
   */
  @SerializedName("pageUrl")
  private String pageUrl = null;

  /**
   * 自定义应用落地页的H5code
   */
  @SerializedName("h5Code")
  private String h5Code = null;

  /**
   * 应用详情页类型 1：h5code 2：定制 3：悟空
   */
  @SerializedName("h5Type")
  private Integer h5Type = null;

  /**
   * 活动ID，0代表非活动广告
   */
  @SerializedName("activityId")
  private Integer activityId = null;

  /**
   * 动态商品广告的h5链接参数值
   */
  @SerializedName("dpaH5Value")
  private String dpaH5Value = null;

  /**
   * 动态商品广告的deepLink链接参数值
   */
  @SerializedName("dpaDeepLinkValue")
  private String dpaDeepLinkValue = null;

  /**
   * 流量类型：0-老广告；1-自定义；2-优选
   */
  @SerializedName("positionType")
  private Integer positionType = null;

  /**
   * 广告生成类型 0:自定义广告 1:程序化广告 默认0
   */
  @SerializedName("genType")
  private Integer genType = null;

  /**
   * 创意包来源 0:自定义 1:选择
   */
  @SerializedName("programPkgSource")
  private Integer programPkgSource = null;

  /**
   * 程序包ID
   */
  @SerializedName("programPkgId")
  private Long programPkgId = null;

  /**
   * 创意包状态
   */
  @SerializedName("programPkgStatus")
  private Integer programPkgStatus = null;

  /**
   * 商店程序化广告层级搜索题词
   */
  @SerializedName("programAdSearchWordDtos")
  private List<ProgramAdSearchWordDtosStruct> programAdSearchWordDtos = null;

  public AdAdvertisementPageInfoByLastIdListDataStruct lastId(Long lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct data(List<AdAdvertisementPageInfoByLastIdListDataStruct> data) {
    this.data = data;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct name(String name) {
    this.name = name;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct userId(String userId) {
    this.userId = userId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct virtualPositionId(String virtualPositionId) {
    this.virtualPositionId = virtualPositionId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct deepLink(String deepLink) {
    this.deepLink = deepLink;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct viewMonitorUrl(String viewMonitorUrl) {
    this.viewMonitorUrl = viewMonitorUrl;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct clickMonitorUrl(String clickMonitorUrl) {
    this.clickMonitorUrl = clickMonitorUrl;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct pauseTime(String pauseTime) {
    this.pauseTime = pauseTime;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct normId(Integer normId) {
    this.normId = normId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct h5Code(String h5Code) {
    this.h5Code = h5Code;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct h5Type(Integer h5Type) {
    this.h5Type = h5Type;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct dpaH5Value(String dpaH5Value) {
    this.dpaH5Value = dpaH5Value;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct dpaDeepLinkValue(String dpaDeepLinkValue) {
    this.dpaDeepLinkValue = dpaDeepLinkValue;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct positionType(Integer positionType) {
    this.positionType = positionType;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct genType(Integer genType) {
    this.genType = genType;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct programPkgSource(Integer programPkgSource) {
    this.programPkgSource = programPkgSource;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct programPkgId(Long programPkgId) {
    this.programPkgId = programPkgId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct programPkgStatus(Integer programPkgStatus) {
    this.programPkgStatus = programPkgStatus;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdListDataStruct programAdSearchWordDtos(List<ProgramAdSearchWordDtosStruct> programAdSearchWordDtos) {
    this.programAdSearchWordDtos = programAdSearchWordDtos;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}