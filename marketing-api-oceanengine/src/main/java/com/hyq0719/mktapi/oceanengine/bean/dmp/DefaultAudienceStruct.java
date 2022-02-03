/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.dmp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 19:17:28
 */
@Data
public class DefaultAudienceStruct {
  /**
   * 广告主id
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 人群包id
   */
  @SerializedName("custom_audience_id")
  private Long customAudienceId = null;

  /**
   * 人群包名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 人群类型，枚举值见【DMP相关-人群类型】
   */
  @SerializedName("custom_type")
  private Long customType = null;

  /**
   * 来源，枚举值见【DMP相关-人群包来源】
   */
  @SerializedName("source")
  private String source = null;

  /**
   * 人群包状态，枚举值见【DMP相关-人群包状态】
   */
  @SerializedName("status")
  private Long status = null;

  /**
   * 推送状态，枚举值见【DMP相关-DMP推送状态】
   */
  @SerializedName("push_status")
  private Long pushStatus = null;

  /**
   * 上传数据源包含的人群数目
   */
  @SerializedName("upload_num")
  private Long uploadNum = null;

  /**
   * 人群包覆盖人群数目，基于"upload_num"：上传数据源包含的人群数目与uid对应后，再与头条系产品MAU交集后的数量（存在一个设备号/手机号对应多个uid的情况） 实际数量可能多于/少于"upl...
   */
  @SerializedName("cover_num")
  private Long coverNum = null;

  /**
   * 人群包过期时间
   */
  @SerializedName("expiry_date")
  private String expiryDate = null;

  /**
   * 人群包创建时间
   */
  @SerializedName("create_time")
  private String createTime = null;

  /**
   * 人群包修改时间
   */
  @SerializedName("modify_time")
  private String modifyTime = null;

  /**
   * 删除标志，枚举值："1"：已删除，"0"：未删除
   */
  @SerializedName("isdel")
  private Long isdel = null;

  /**
   * 计算子类型
   */
  @SerializedName("calculate_sub_type")
  private Long calculateSubType = null;

  /**
   * 计算类型
   */
  @SerializedName("calculate_type")
  private Long calculateType = null;

  /**
   * 数据源id
   */
  @SerializedName("data_source_id")
  private String dataSourceId = null;

  /**
   * 人群包标签，通过数据源创建的人群包，标签会默认为“API文件数据源”
   */
  @SerializedName("tag")
  private String tag = null;

  /**
   * 三方信息，均返回“非三方包”
   */
  @SerializedName("third_party_info")
  private String thirdPartyInfo = null;

  /**
   * 人群包可投放状态，只有当状态为CUSTOM_AUDIENCE_DELIVERY_STATUS_AVAILABLE时才可进行投放使用 可选值： CUSTOM_AUDIENCE_DELIVERY_STAT...
   */
  @SerializedName("delivery_status")
  private String deliveryStatus = null;

  public DefaultAudienceStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public DefaultAudienceStruct customAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
    return this;
  }

  public DefaultAudienceStruct name(String name) {
    this.name = name;
    return this;
  }

  public DefaultAudienceStruct customType(Long customType) {
    this.customType = customType;
    return this;
  }

  public DefaultAudienceStruct source(String source) {
    this.source = source;
    return this;
  }

  public DefaultAudienceStruct status(Long status) {
    this.status = status;
    return this;
  }

  public DefaultAudienceStruct pushStatus(Long pushStatus) {
    this.pushStatus = pushStatus;
    return this;
  }

  public DefaultAudienceStruct uploadNum(Long uploadNum) {
    this.uploadNum = uploadNum;
    return this;
  }

  public DefaultAudienceStruct coverNum(Long coverNum) {
    this.coverNum = coverNum;
    return this;
  }

  public DefaultAudienceStruct expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  public DefaultAudienceStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public DefaultAudienceStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  public DefaultAudienceStruct isdel(Long isdel) {
    this.isdel = isdel;
    return this;
  }

  public DefaultAudienceStruct calculateSubType(Long calculateSubType) {
    this.calculateSubType = calculateSubType;
    return this;
  }

  public DefaultAudienceStruct calculateType(Long calculateType) {
    this.calculateType = calculateType;
    return this;
  }

  public DefaultAudienceStruct dataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public DefaultAudienceStruct tag(String tag) {
    this.tag = tag;
    return this;
  }

  public DefaultAudienceStruct thirdPartyInfo(String thirdPartyInfo) {
    this.thirdPartyInfo = thirdPartyInfo;
    return this;
  }

  public DefaultAudienceStruct deliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
