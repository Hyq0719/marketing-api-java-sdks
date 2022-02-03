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
 * @date 2022-02-03 21:33:23
 */
@Data
public class CustomAudienceListStruct {
  /**
   * 人群包ID
   */
  @SerializedName("custom_audience_id")
  private Long customAudienceId = null;

  /**
   * 人群包是否被删除,枚举值："1"：已删除，"0"：未删除
   */
  @SerializedName("isdel")
  private Long isdel = null;

  /**
   * 数据源ID
   */
  @SerializedName("data_source_id")
  private String dataSourceId = null;

  /**
   * 人群包名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 人群包来源， 详见【附录-DMP相关-人群包来源】
   */
  @SerializedName("source")
  private String source = null;

  /**
   * 人群包状态，详见【附录-DMP相关-人群包状态】
   */
  @SerializedName("status")
  private Long status = null;

  /**
   * 人群包覆盖人群数目，基于"upload_num"：上传数据源包含的人群数目与uid对应后，再与头条系产品MAU交集后的数量（存在一个设备号/手机号对应多个uid的情况） 实际数量可能多于/少于"upl...
   */
  @SerializedName("cover_num")
  private Long coverNum = null;

  /**
   * 上传数据源包含的人群数目
   */
  @SerializedName("upload_num")
  private Long uploadNum = null;

  /**
   * 人群包标签
   */
  @SerializedName("tag")
  private String tag = null;

  /**
   * 推送状态，详见【附录-DMP相关-DMP推送状态】
   */
  @SerializedName("push_status")
  private Long pushStatus = null;

  /**
   * 人群包可投放状态，只有当状态为CUSTOM_AUDIENCE_DELIVERY_STATUS_AVAILABLE时才可进行投放使用 可选值： CUSTOM_AUDIENCE_DELIVERY_STAT...
   */
  @SerializedName("delivery_status")
  private String deliveryStatus = null;

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
   * 是否为三方包，均返回“非三方包”
   */
  @SerializedName("third_party_info")
  private String thirdPartyInfo = null;

  public CustomAudienceListStruct customAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
    return this;
  }

  public CustomAudienceListStruct isdel(Long isdel) {
    this.isdel = isdel;
    return this;
  }

  public CustomAudienceListStruct dataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public CustomAudienceListStruct name(String name) {
    this.name = name;
    return this;
  }

  public CustomAudienceListStruct source(String source) {
    this.source = source;
    return this;
  }

  public CustomAudienceListStruct status(Long status) {
    this.status = status;
    return this;
  }

  public CustomAudienceListStruct coverNum(Long coverNum) {
    this.coverNum = coverNum;
    return this;
  }

  public CustomAudienceListStruct uploadNum(Long uploadNum) {
    this.uploadNum = uploadNum;
    return this;
  }

  public CustomAudienceListStruct tag(String tag) {
    this.tag = tag;
    return this;
  }

  public CustomAudienceListStruct pushStatus(Long pushStatus) {
    this.pushStatus = pushStatus;
    return this;
  }

  public CustomAudienceListStruct deliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

  public CustomAudienceListStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public CustomAudienceListStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  public CustomAudienceListStruct thirdPartyInfo(String thirdPartyInfo) {
    this.thirdPartyInfo = thirdPartyInfo;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
