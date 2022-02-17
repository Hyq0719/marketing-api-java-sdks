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
 * @date 2022-02-17 14:14:10
 */
@Data
public class AdCreativePageInfoListStruct {

  /**
   * 创意id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 所属广告
   */
  @SerializedName("advertisementId")
  private Long advertisementId = null;

  /**
   * 创意文案（CPD场景）
   */
  @SerializedName("adDesc")
  private String adDesc = null;

  /**
   * 标题
   */
  @SerializedName("title")
  private String title = null;

  /**
   * 副标题
   */
  @SerializedName("subTitle")
  private String subTitle = null;

  /**
   * 应用名
   */
  @SerializedName("appName")
  private String appName = null;

  /**
   * 产品名
   */
  @SerializedName("productName")
  private String productName = null;

  /**
   * 创建时间, 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("createDate")
  private String createDate = null;

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
   * 广告组ID
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 所属广告组名称
   */
  @SerializedName("groupName")
  private String groupName = null;

  /**
   * 广告名称
   */
  @SerializedName("advertisementName")
  private String advertisementName = null;

  /**
   * 所属广告的展现形式
   */
  @SerializedName("advertisementPlaceType")
  private Integer advertisementPlaceType = null;

  /**
   * 收拢状态，详见 【附录-广告创意收拢状态】
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
   * 出价阶段
   */
  @SerializedName("ocpxState")
  private Integer ocpxState = null;

  /**
   * 图片code，多个用逗号分割
   */
  @SerializedName("imgsCode")
  private String imgsCode = null;

  /**
   * 头像图片code
   */
  @SerializedName("avatarCode")
  private String avatarCode = null;

  /**
   * 视频code
   */
  @SerializedName("videoCode")
  private String videoCode = null;

  /**
   * dpa蓝图模板id
   */
  @SerializedName("dpaBlueprintTemplate")
  private Long dpaBlueprintTemplate = null;

  /**
   * 物料：图片url
   */
  @SerializedName("imgsUrl")
  private String imgsUrl = null;

  /**
   * 视频地址url
   */
  @SerializedName("videoUrl")
  private String videoUrl = null;

  /**
   * 物料：头像
   */
  @SerializedName("avatarUrl")
  private String avatarUrl = null;

  /**
   * 物料：图片完整路径url
   */
  @SerializedName("imgsFullUrl")
  private String imgsFullUrl = null;

  /**
   * 视频完整路径地址url
   */
  @SerializedName("videoFullUrl")
  private String videoFullUrl = null;

  /**
   * 物料：头像完整路径url
   */
  @SerializedName("avatarFullUrl")
  private String avatarFullUrl = null;

  /**
   * 修改时间,  时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("modifyDate")
  private String modifyDate = null;

  /**
   * 删除标志：删除:1, 未删除:0
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 暂停标识：暂停:1, 未暂停:0
   */
  @SerializedName("pauseState")
  private Integer pauseState = null;

  /**
   * 暂停操作时间,  时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("pauseTime")
  private String pauseTime = null;

  /**
   * 审核状态：待审核:1、审核通过:2、审核不通过:3
   */
  @SerializedName("auditState")
  private Integer auditState = null;

  /**
   * 审核备注
   */
  @SerializedName("auditRemark")
  private String auditRemark = null;

  /**
   * 冻结状态：1-冻结/0-未冻结
   */
  @SerializedName("freezingState")
  private Integer freezingState = null;

  /**
   * 冻结备注
   */
  @SerializedName("freezingRemark")
  private String freezingRemark = null;

  /**
   * 投放状态：0-不可投，1-可投放
   */
  @SerializedName("state")
  private Integer state = null;

  /**
   * 针对CPD外显的单独审核状态，0-待审核；1-审核通过; 2-审核不通过;-1删除
   */
  @SerializedName("h5AuditState")
  private Integer h5AuditState = null;

  /**
   * 唯一uuid
   */
  @SerializedName("uuid")
  private String uuid = null;

  /**
   * CPD的内容创意选项：0-无，1-搜索单图文，2-搜索文字链,3-搜索三图
   */
  @SerializedName("templateType")
  private Integer templateType = null;

  /**
   * 搜索题词列表
   */
  @SerializedName("adSearchWordDtos")
  private List<AdSearchWordDtosStruct> adSearchWordDtos = null;

  /**
   * 子创意列表
   */
  @SerializedName("adSubCreativeDtos")
  private List<AdSubCreativeDtosStruct> adSubCreativeDtos = null;

  /**
   * 出价
   */
  @SerializedName("price")
  private Long price = null;

  /**
   * 应用详情页
   */
  @SerializedName("pageUrl")
  private String pageUrl = null;

  /**
   * 应用详情页h5 code
   */
  @SerializedName("h5Code")
  private String h5Code = null;

  /**
   * 应用详情页类型，1：h5code，2：定制，3：悟空
   */
  @SerializedName("h5Type")
  private Integer h5Type = null;

  /**
   * 按钮id
   */
  @SerializedName("btnId")
  private Long btnId = null;

  /**
   * 按钮文案
   */
  @SerializedName("btnText")
  private String btnText = null;

  /**
   * 展现形式： 1-信息流；2-开屏；3-banner；4-插屏广告；5-原生广告；6-锁屏广告；9-激励视频；10-搜索sug页；20-推荐列表(cpd);21-搜索提词(cpd);22-装机必备;23...
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 创意类型，仅支持新版广告界面创建的创意返回该参数（2021.5.10新版界面全量）。详见 【附录-创意物料类型】
   */
  @SerializedName("normModel")
  private Integer normModel = null;

  /**
   * 虚拟广告位id，多个用逗号分隔
   */
  @SerializedName("virtualPositionId")
  private String virtualPositionId = null;

  /**
   * 投放位置id，多个用逗号分隔
   */
  @SerializedName("vpositionId")
  private String vpositionId = null;

  /**
   * 规格id
   */
  @SerializedName("normId")
  private Integer normId = null;

  /**
   * 深度优化的双出价阶段,1:单出价阶段,2:双出价阶段
   */
  @SerializedName("ocpxSubState")
  private Integer ocpxSubState = null;

  public AdCreativePageInfoListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdCreativePageInfoListStruct advertisementId(Long advertisementId) {
    this.advertisementId = advertisementId;
    return this;
  }

  public AdCreativePageInfoListStruct adDesc(String adDesc) {
    this.adDesc = adDesc;
    return this;
  }

  public AdCreativePageInfoListStruct title(String title) {
    this.title = title;
    return this;
  }

  public AdCreativePageInfoListStruct subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  public AdCreativePageInfoListStruct appName(String appName) {
    this.appName = appName;
    return this;
  }

  public AdCreativePageInfoListStruct productName(String productName) {
    this.productName = productName;
    return this;
  }

  public AdCreativePageInfoListStruct createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public AdCreativePageInfoListStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdCreativePageInfoListStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public AdCreativePageInfoListStruct groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdCreativePageInfoListStruct groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public AdCreativePageInfoListStruct advertisementName(String advertisementName) {
    this.advertisementName = advertisementName;
    return this;
  }

  public AdCreativePageInfoListStruct advertisementPlaceType(Integer advertisementPlaceType) {
    this.advertisementPlaceType = advertisementPlaceType;
    return this;
  }

  public AdCreativePageInfoListStruct status(Integer status) {
    this.status = status;
    return this;
  }

  public AdCreativePageInfoListStruct statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

  public AdCreativePageInfoListStruct activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  public AdCreativePageInfoListStruct ocpxState(Integer ocpxState) {
    this.ocpxState = ocpxState;
    return this;
  }

  public AdCreativePageInfoListStruct imgsCode(String imgsCode) {
    this.imgsCode = imgsCode;
    return this;
  }

  public AdCreativePageInfoListStruct avatarCode(String avatarCode) {
    this.avatarCode = avatarCode;
    return this;
  }

  public AdCreativePageInfoListStruct videoCode(String videoCode) {
    this.videoCode = videoCode;
    return this;
  }

  public AdCreativePageInfoListStruct dpaBlueprintTemplate(Long dpaBlueprintTemplate) {
    this.dpaBlueprintTemplate = dpaBlueprintTemplate;
    return this;
  }

  public AdCreativePageInfoListStruct imgsUrl(String imgsUrl) {
    this.imgsUrl = imgsUrl;
    return this;
  }

  public AdCreativePageInfoListStruct videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  public AdCreativePageInfoListStruct avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  public AdCreativePageInfoListStruct imgsFullUrl(String imgsFullUrl) {
    this.imgsFullUrl = imgsFullUrl;
    return this;
  }

  public AdCreativePageInfoListStruct videoFullUrl(String videoFullUrl) {
    this.videoFullUrl = videoFullUrl;
    return this;
  }

  public AdCreativePageInfoListStruct avatarFullUrl(String avatarFullUrl) {
    this.avatarFullUrl = avatarFullUrl;
    return this;
  }

  public AdCreativePageInfoListStruct modifyDate(String modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

  public AdCreativePageInfoListStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdCreativePageInfoListStruct pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  public AdCreativePageInfoListStruct pauseTime(String pauseTime) {
    this.pauseTime = pauseTime;
    return this;
  }

  public AdCreativePageInfoListStruct auditState(Integer auditState) {
    this.auditState = auditState;
    return this;
  }

  public AdCreativePageInfoListStruct auditRemark(String auditRemark) {
    this.auditRemark = auditRemark;
    return this;
  }

  public AdCreativePageInfoListStruct freezingState(Integer freezingState) {
    this.freezingState = freezingState;
    return this;
  }

  public AdCreativePageInfoListStruct freezingRemark(String freezingRemark) {
    this.freezingRemark = freezingRemark;
    return this;
  }

  public AdCreativePageInfoListStruct state(Integer state) {
    this.state = state;
    return this;
  }

  public AdCreativePageInfoListStruct h5AuditState(Integer h5AuditState) {
    this.h5AuditState = h5AuditState;
    return this;
  }

  public AdCreativePageInfoListStruct uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public AdCreativePageInfoListStruct templateType(Integer templateType) {
    this.templateType = templateType;
    return this;
  }

  public AdCreativePageInfoListStruct adSearchWordDtos(List<AdSearchWordDtosStruct> adSearchWordDtos) {
    this.adSearchWordDtos = adSearchWordDtos;
    return this;
  }

  public AdCreativePageInfoListStruct adSubCreativeDtos(List<AdSubCreativeDtosStruct> adSubCreativeDtos) {
    this.adSubCreativeDtos = adSubCreativeDtos;
    return this;
  }

  public AdCreativePageInfoListStruct price(Long price) {
    this.price = price;
    return this;
  }

  public AdCreativePageInfoListStruct pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  public AdCreativePageInfoListStruct h5Code(String h5Code) {
    this.h5Code = h5Code;
    return this;
  }

  public AdCreativePageInfoListStruct h5Type(Integer h5Type) {
    this.h5Type = h5Type;
    return this;
  }

  public AdCreativePageInfoListStruct btnId(Long btnId) {
    this.btnId = btnId;
    return this;
  }

  public AdCreativePageInfoListStruct btnText(String btnText) {
    this.btnText = btnText;
    return this;
  }

  public AdCreativePageInfoListStruct placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public AdCreativePageInfoListStruct normModel(Integer normModel) {
    this.normModel = normModel;
    return this;
  }

  public AdCreativePageInfoListStruct virtualPositionId(String virtualPositionId) {
    this.virtualPositionId = virtualPositionId;
    return this;
  }

  public AdCreativePageInfoListStruct vpositionId(String vpositionId) {
    this.vpositionId = vpositionId;
    return this;
  }

  public AdCreativePageInfoListStruct normId(Integer normId) {
    this.normId = normId;
    return this;
  }

  public AdCreativePageInfoListStruct ocpxSubState(Integer ocpxSubState) {
    this.ocpxSubState = ocpxSubState;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}