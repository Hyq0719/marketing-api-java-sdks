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
 * @date 2022-02-17 14:19:08
 */
@Data
public class AdCreativePageInfoByLastIdDataStruct {

  /**
   * 创意id
   */
  @SerializedName("id")
  private Long id = null;

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
   * 广告id
   */
  @SerializedName("advertisementId")
  private Long advertisementId = null;

  /**
   * 唯一uuid
   */
  @SerializedName("uuid")
  private String uuid = null;

  /**
   * 商店创意文案
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
   * 标题，动态词包转化成name，编辑时回传该属性于title字段 用于兼容现有广告创意编辑接口，后续可能直接使用词包id，即用title属性
   */
  @SerializedName("titleConvertName")
  private String titleConvertName = null;

  /**
   * 副标题，动态词包转化成name，编辑时回传该属性于subTitle字段 用于兼容现有广告创意编辑接口，后续可能直接使用词包id，即用subTitle属性
   */
  @SerializedName("subTitleConvertName")
  private String subTitleConvertName = null;

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
   * 物料：头像url
   */
  @SerializedName("avatarUrl")
  private String avatarUrl = null;

  /**
   * 视频地址url
   */
  @SerializedName("videoUrl")
  private String videoUrl = null;

  /**
   * 创建时间
   */
  @SerializedName("createDate")
  private String createDate = null;

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
   * 审核状态：待审核:0、审核通过:1、审核不通过:2
   */
  @SerializedName("auditState")
  private Integer auditState = null;

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
   * 针对CPD外显的单独审核状态，0-待审核；1-审核通过; 2-审核不通过;-1删除
   */
  @SerializedName("h5AuditState")
  private Integer h5AuditState = null;

  /**
   * CPD的内容创意选项：0-无，1-搜索单图文，2-搜索文字链,3-搜索三图
   */
  @SerializedName("templateType")
  private Integer templateType = null;

  /**
   * 商店搜索题词列表
   */
  @SerializedName("adSearchWordDtos")
  private List<AdSearchWordDtosStruct> adSearchWordDtos = null;

  /**
   * 子创意列表
   */
  @SerializedName("adSubCreativeDtos")
  private List<AdSubCreativeDtosStruct> adSubCreativeDtos = null;

  /**
   * 活动ID，0代表非活动广告
   */
  @SerializedName("activityId")
  private Integer activityId = null;

  /**
   * 如果广告组出价方式是OCPC,0:第一阶段,1:第二阶段
   */
  @SerializedName("ocpxState")
  private Integer ocpxState = null;

  /**
   * 出价
   */
  @SerializedName("price")
  private Long price = null;

  /**
   * 商店内容外显落地页地址
   */
  @SerializedName("pageUrl")
  private String pageUrl = null;

  /**
   * 商店内容外显落地页编码
   */
  @SerializedName("h5Code")
  private String h5Code = null;

  /**
   * 商店内容外显落地页类型：5-CPD自定义H5
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
   * 展现形式： 1-信息流；2-开屏；3-banner；4-插屏广告；5-原生广告；6-锁屏广告；9-激励视频；20-推荐列表(cpd);21-搜索提词(cpd);22-装机必备;23-红包
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 创意类型：1-横版大图；2-小图；3-组图；4-横版视频；10-竖版视频。自定义类型广告才有值
   */
  @SerializedName("normModel")
  private Integer normModel = null;

  /**
   * 虚拟广告位id，多个用逗号分隔
   */
  @SerializedName("virtualPositionId")
  private String virtualPositionId = null;

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

  /**
   * 综搜广告，搜索sug站点类型，同一个样式只能选取一种类型
   */
  @SerializedName("sugSiteType")
  private Integer sugSiteType = null;

  /**
   * 综搜广告，搜索sug站点编码，多个用逗号隔开
   */
  @SerializedName("sugSiteCode")
  private String sugSiteCode = null;

  /**
   * 综搜广告，子链样式：子链名称，多个用配置符号隔开，子链至少三个，至多四个
   */
  @SerializedName("sugLinkName")
  private String sugLinkName = null;

  /**
   * 综搜广告，橱窗样式：图片名称，多个用配置符号隔开，都为空或都不为空
   */
  @SerializedName("sugImageName")
  private String sugImageName = null;

  /**
   * 综搜广告，子链样式：子链站点url，多个用逗号隔开
   */
  @SerializedName("sugLinkSiteUrl")
  private String sugLinkSiteUrl = null;

  /**
   * 综搜广告，橱窗样式：橱窗站点url，多个用逗号隔开
   */
  @SerializedName("sugImageSiteUrl")
  private String sugImageSiteUrl = null;

  /**
   * 商店优选词包出价
   */
  @SerializedName("searchWordPackageBid")
  private Long searchWordPackageBid = null;

  public AdCreativePageInfoByLastIdDataStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct userId(String userId) {
    this.userId = userId;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct advertisementId(Long advertisementId) {
    this.advertisementId = advertisementId;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct adDesc(String adDesc) {
    this.adDesc = adDesc;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct title(String title) {
    this.title = title;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct titleConvertName(String titleConvertName) {
    this.titleConvertName = titleConvertName;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct subTitleConvertName(String subTitleConvertName) {
    this.subTitleConvertName = subTitleConvertName;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct appName(String appName) {
    this.appName = appName;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct productName(String productName) {
    this.productName = productName;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct imgsCode(String imgsCode) {
    this.imgsCode = imgsCode;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct avatarCode(String avatarCode) {
    this.avatarCode = avatarCode;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct videoCode(String videoCode) {
    this.videoCode = videoCode;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct dpaBlueprintTemplate(Long dpaBlueprintTemplate) {
    this.dpaBlueprintTemplate = dpaBlueprintTemplate;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct imgsUrl(String imgsUrl) {
    this.imgsUrl = imgsUrl;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct pauseTime(String pauseTime) {
    this.pauseTime = pauseTime;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct auditState(Integer auditState) {
    this.auditState = auditState;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct freezingState(Integer freezingState) {
    this.freezingState = freezingState;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct freezingRemark(String freezingRemark) {
    this.freezingRemark = freezingRemark;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct h5AuditState(Integer h5AuditState) {
    this.h5AuditState = h5AuditState;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct templateType(Integer templateType) {
    this.templateType = templateType;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct adSearchWordDtos(List<AdSearchWordDtosStruct> adSearchWordDtos) {
    this.adSearchWordDtos = adSearchWordDtos;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct adSubCreativeDtos(List<AdSubCreativeDtosStruct> adSubCreativeDtos) {
    this.adSubCreativeDtos = adSubCreativeDtos;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct ocpxState(Integer ocpxState) {
    this.ocpxState = ocpxState;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct price(Long price) {
    this.price = price;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct h5Code(String h5Code) {
    this.h5Code = h5Code;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct h5Type(Integer h5Type) {
    this.h5Type = h5Type;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct btnId(Long btnId) {
    this.btnId = btnId;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct btnText(String btnText) {
    this.btnText = btnText;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct normModel(Integer normModel) {
    this.normModel = normModel;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct virtualPositionId(String virtualPositionId) {
    this.virtualPositionId = virtualPositionId;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct normId(Integer normId) {
    this.normId = normId;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct ocpxSubState(Integer ocpxSubState) {
    this.ocpxSubState = ocpxSubState;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct sugSiteType(Integer sugSiteType) {
    this.sugSiteType = sugSiteType;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct sugSiteCode(String sugSiteCode) {
    this.sugSiteCode = sugSiteCode;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct sugLinkName(String sugLinkName) {
    this.sugLinkName = sugLinkName;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct sugImageName(String sugImageName) {
    this.sugImageName = sugImageName;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct sugLinkSiteUrl(String sugLinkSiteUrl) {
    this.sugLinkSiteUrl = sugLinkSiteUrl;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct sugImageSiteUrl(String sugImageSiteUrl) {
    this.sugImageSiteUrl = sugImageSiteUrl;
    return this;
  }

  public AdCreativePageInfoByLastIdDataStruct searchWordPackageBid(Long searchWordPackageBid) {
    this.searchWordPackageBid = searchWordPackageBid;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}