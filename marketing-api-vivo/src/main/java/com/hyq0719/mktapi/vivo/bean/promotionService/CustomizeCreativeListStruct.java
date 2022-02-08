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
 * @date 2022-02-08 13:41:42
 */
@Data
public class CustomizeCreativeListStruct {

  /**
   * 展现形式，详见 【附录-广告创意展现形式】
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 虚拟广告位id，多个用英文逗号隔开
   */
  @SerializedName("virtualPositionId")
  private String virtualPositionId = null;

  /**
   * 创意物料规格id
   */
  @SerializedName("materialNormId")
  private Integer materialNormId = null;

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
   * 头像
   */
  @SerializedName("avatarCode")
  private String avatarCode = null;

  /**
   * 产品名
   */
  @SerializedName("productName")
  private String productName = null;

  /**
   * 应用名
   */
  @SerializedName("appName")
  private String appName = null;

  /**
   * 图片素材，多个用英文逗号隔开
   */
  @SerializedName("imgsCode")
  private String imgsCode = null;

  /**
   * 视频素材
   */
  @SerializedName("videoCode")
  private String videoCode = null;

  /**
   * dpa蓝图模板id，与imgsCode不可同时使用
   */
  @SerializedName("dpaBlueprintTemplate")
  private Long dpaBlueprintTemplate = null;

  /**
   * 综搜广告属性，搜索sug站点类型，同一个样式只能选取一种类型，可选值详见 【附录-h5类型】 综搜目前支持使用类型3：悟空站点
   */
  @SerializedName("sugSiteType")
  private Integer sugSiteType = null;

  /**
   * 综搜广告属性，搜索sug站点编码，多个用逗号隔开
   */
  @SerializedName("sugSiteCode")
  private String sugSiteCode = null;

  /**
   * 综搜广告属性，子链样式：子链名称，多个用配置符号隔开，子链至少三个，至多四个
   */
  @SerializedName("sugLinkName")
  private String sugLinkName = null;

  /**
   * 综搜广告属性，橱窗样式：图片名称，多个用配置符号隔开，都为空或都不为空
   */
  @SerializedName("sugImageName")
  private String sugImageName = null;

  /**
   * 综搜广告属性，子链样式：子链站点url，多个用逗号隔开
   */
  @SerializedName("sugLinkSiteUrl")
  private String sugLinkSiteUrl = null;

  /**
   * 综搜广告属性，橱窗样式：橱窗站点url，多个用逗号隔开
   */
  @SerializedName("sugImageSiteUrl")
  private String sugImageSiteUrl = null;

  public CustomizeCreativeListStruct placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public CustomizeCreativeListStruct virtualPositionId(String virtualPositionId) {
    this.virtualPositionId = virtualPositionId;
    return this;
  }

  public CustomizeCreativeListStruct materialNormId(Integer materialNormId) {
    this.materialNormId = materialNormId;
    return this;
  }

  public CustomizeCreativeListStruct title(String title) {
    this.title = title;
    return this;
  }

  public CustomizeCreativeListStruct subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  public CustomizeCreativeListStruct avatarCode(String avatarCode) {
    this.avatarCode = avatarCode;
    return this;
  }

  public CustomizeCreativeListStruct productName(String productName) {
    this.productName = productName;
    return this;
  }

  public CustomizeCreativeListStruct appName(String appName) {
    this.appName = appName;
    return this;
  }

  public CustomizeCreativeListStruct imgsCode(String imgsCode) {
    this.imgsCode = imgsCode;
    return this;
  }

  public CustomizeCreativeListStruct videoCode(String videoCode) {
    this.videoCode = videoCode;
    return this;
  }

  public CustomizeCreativeListStruct dpaBlueprintTemplate(Long dpaBlueprintTemplate) {
    this.dpaBlueprintTemplate = dpaBlueprintTemplate;
    return this;
  }

  public CustomizeCreativeListStruct sugSiteType(Integer sugSiteType) {
    this.sugSiteType = sugSiteType;
    return this;
  }

  public CustomizeCreativeListStruct sugSiteCode(String sugSiteCode) {
    this.sugSiteCode = sugSiteCode;
    return this;
  }

  public CustomizeCreativeListStruct sugLinkName(String sugLinkName) {
    this.sugLinkName = sugLinkName;
    return this;
  }

  public CustomizeCreativeListStruct sugImageName(String sugImageName) {
    this.sugImageName = sugImageName;
    return this;
  }

  public CustomizeCreativeListStruct sugLinkSiteUrl(String sugLinkSiteUrl) {
    this.sugLinkSiteUrl = sugLinkSiteUrl;
    return this;
  }

  public CustomizeCreativeListStruct sugImageSiteUrl(String sugImageSiteUrl) {
    this.sugImageSiteUrl = sugImageSiteUrl;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}