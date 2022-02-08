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
 * @date 2022-02-08 14:39:37
 */
@Data
public class AdAdvertisementPageInfoListStruct {

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
   * 广告计划ID
   */
  @SerializedName("campaignId")
  private Long campaignId = null;

  /**
   * 所属计划名称
   */
  @SerializedName("campaignName")
  private String campaignName = null;

  /**
   * 所属广告组ID
   */
  @SerializedName("groupId")
  private String groupId = null;

  /**
   * 所属广告组名称
   */
  @SerializedName("groupName")
  private String groupName = null;

  /**
   * 展现形式： 1-信息流；2-开屏；3-banner；4-插屏广告；5-原生广告；6-锁屏广告；9-激励视频；10-搜索sug页；20-推荐列表(cpd);21-搜索提词(cpd);22-装机必备;23...
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 虚拟广告位id，多个逗号隔开
   */
  @SerializedName("virtualPositionId")
  private String virtualPositionId = null;

  /**
   * deepLink
   */
  @SerializedName("deepLink")
  private String deepLink = null;

  /**
   * 曝光监控地址
   */
  @SerializedName("viewMonitorUrl")
  private String viewMonitorUrl = null;

  /**
   * 监控地址
   */
  @SerializedName("clickMonitorUrl")
  private String clickMonitorUrl = null;

  /**
   * 广告出价模式，0：普通出价 1：跟随出价
   */
  @SerializedName("bidType")
  private Integer bidType = null;

  /**
   * 被跟随出价的app包名
   */
  @SerializedName("followAppPackageName")
  private String followAppPackageName = null;

  /**
   * 跟随出价的最高出价
   */
  @SerializedName("bidMaxPrice")
  private Long bidMaxPrice = null;

  /**
   * 选词模式 1-搜索题词，2-优选词包，0-展现形式为非选词模式的默认值
   */
  @SerializedName("wordChoiceModel")
  private Integer wordChoiceModel = null;

  /**
   * 创建时间  时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("createDate")
  private String createDate = null;

  /**
   * 修改时间 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("modifyDate")
  private String modifyDate = null;

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
   * CPD：是内容外显的H5页面id;CPC：自定义应用落地页的H5code
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
   * 流量优选开关，0：关闭，1：开启
   */
  @SerializedName("generalSwitch")
  private Integer generalSwitch = null;

  /**
   * 广告层级搜索题词
   */
  @SerializedName("programAdSearchWordDtos")
  private List<ProgramAdSearchWordDtosStruct> programAdSearchWordDtos = null;

  /**
   * 收拢状态，详见 【附录-广告收拢状态】
   */
  @SerializedName("status")
  private Integer status = null;

  /**
   * 收拢状态描述
   */
  @SerializedName("statusDesc")
  private String statusDesc = null;

  /**
   * 程序化广告，优选词包出价
   */
  @SerializedName("searchWordPackageBid")
  private Long searchWordPackageBid = null;

  /**
   * 综搜搜索词
   */
  @SerializedName("adSugKeyWordDtos")
  private AdSugKeyWordDtosStruct adSugKeyWordDtos = null;

  public AdAdvertisementPageInfoListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdAdvertisementPageInfoListStruct name(String name) {
    this.name = name;
    return this;
  }

  public AdAdvertisementPageInfoListStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdAdvertisementPageInfoListStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public AdAdvertisementPageInfoListStruct groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdAdvertisementPageInfoListStruct groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public AdAdvertisementPageInfoListStruct placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public AdAdvertisementPageInfoListStruct virtualPositionId(String virtualPositionId) {
    this.virtualPositionId = virtualPositionId;
    return this;
  }

  public AdAdvertisementPageInfoListStruct deepLink(String deepLink) {
    this.deepLink = deepLink;
    return this;
  }

  public AdAdvertisementPageInfoListStruct viewMonitorUrl(String viewMonitorUrl) {
    this.viewMonitorUrl = viewMonitorUrl;
    return this;
  }

  public AdAdvertisementPageInfoListStruct clickMonitorUrl(String clickMonitorUrl) {
    this.clickMonitorUrl = clickMonitorUrl;
    return this;
  }

  public AdAdvertisementPageInfoListStruct bidType(Integer bidType) {
    this.bidType = bidType;
    return this;
  }

  public AdAdvertisementPageInfoListStruct followAppPackageName(String followAppPackageName) {
    this.followAppPackageName = followAppPackageName;
    return this;
  }

  public AdAdvertisementPageInfoListStruct bidMaxPrice(Long bidMaxPrice) {
    this.bidMaxPrice = bidMaxPrice;
    return this;
  }

  public AdAdvertisementPageInfoListStruct wordChoiceModel(Integer wordChoiceModel) {
    this.wordChoiceModel = wordChoiceModel;
    return this;
  }

  public AdAdvertisementPageInfoListStruct createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public AdAdvertisementPageInfoListStruct modifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

  public AdAdvertisementPageInfoListStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdAdvertisementPageInfoListStruct pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  public AdAdvertisementPageInfoListStruct pauseTime(String pauseTime) {
    this.pauseTime = pauseTime;
    return this;
  }

  public AdAdvertisementPageInfoListStruct normId(Integer normId) {
    this.normId = normId;
    return this;
  }

  public AdAdvertisementPageInfoListStruct pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  public AdAdvertisementPageInfoListStruct h5Code(String h5Code) {
    this.h5Code = h5Code;
    return this;
  }

  public AdAdvertisementPageInfoListStruct h5Type(Integer h5Type) {
    this.h5Type = h5Type;
    return this;
  }

  public AdAdvertisementPageInfoListStruct activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  public AdAdvertisementPageInfoListStruct dpaH5Value(String dpaH5Value) {
    this.dpaH5Value = dpaH5Value;
    return this;
  }

  public AdAdvertisementPageInfoListStruct dpaDeepLinkValue(String dpaDeepLinkValue) {
    this.dpaDeepLinkValue = dpaDeepLinkValue;
    return this;
  }

  public AdAdvertisementPageInfoListStruct positionType(Integer positionType) {
    this.positionType = positionType;
    return this;
  }

  public AdAdvertisementPageInfoListStruct genType(Integer genType) {
    this.genType = genType;
    return this;
  }

  public AdAdvertisementPageInfoListStruct programPkgSource(Integer programPkgSource) {
    this.programPkgSource = programPkgSource;
    return this;
  }

  public AdAdvertisementPageInfoListStruct programPkgId(Long programPkgId) {
    this.programPkgId = programPkgId;
    return this;
  }

  public AdAdvertisementPageInfoListStruct programPkgStatus(Integer programPkgStatus) {
    this.programPkgStatus = programPkgStatus;
    return this;
  }

  public AdAdvertisementPageInfoListStruct generalSwitch(Integer generalSwitch) {
    this.generalSwitch = generalSwitch;
    return this;
  }

  public AdAdvertisementPageInfoListStruct programAdSearchWordDtos
          (List<ProgramAdSearchWordDtosStruct> programAdSearchWordDtos) {
    this.programAdSearchWordDtos = programAdSearchWordDtos;
    return this;
  }

  public AdAdvertisementPageInfoListStruct status(Integer status) {
    this.status = status;
    return this;
  }

  public AdAdvertisementPageInfoListStruct statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

  public AdAdvertisementPageInfoListStruct searchWordPackageBid(Long searchWordPackageBid) {
    this.searchWordPackageBid = searchWordPackageBid;
    return this;
  }

  public AdAdvertisementPageInfoListStruct adSugKeyWordDtos(AdSugKeyWordDtosStruct adSugKeyWordDtos) {
    this.adSugKeyWordDtos = adSugKeyWordDtos;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}