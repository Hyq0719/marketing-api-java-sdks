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
 * @date 2022-02-17 14:45:28
 */
@Data
public class AdDmpTagGetCrowdsResponseData {

  /**
   * 人群包编号id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 人群ID
   */
  @SerializedName("tagId")
  private Long tagId = null;

  /**
   * 人群名称
   */
  @SerializedName("crowdName")
  private String crowdName = null;

  /**
   * 人群类型：1.上传人群,2扩量人群,3组合人群，详见【附录-人群类型】
   */
  @SerializedName("crowdType")
  private Integer crowdType = null;

  /**
   * 人群描述
   */
  @SerializedName("description")
  private String description = null;

  /**
   * 有效时间
   */
  @SerializedName("expireTime")
  private String expireTime = null;

  /**
   * 所属广告主id
   */
  @SerializedName("advertiserId")
  private Integer advertiserId = null;

  /**
   * 返回信息，详见【附录-返回码】
   */
  @SerializedName("createTime")
  private String createTime = null;

  /**
   * 删除标志：删除:1, 未删除:0，详见 【附录-删除标志】
   */
  @SerializedName("isDelete")
  private Integer isDelete = null;

  /**
   * 启用标志: 1-已启用  0-已禁用，详见 【附录-启用标志】
   */
  @SerializedName("isValid")
  private Integer isValid = null;

  /**
   * 标签同步更新至广告系统的插入时间
   */
  @SerializedName("insertTime")
  private String insertTime = null;

  /**
   * 修改时间
   */
  @SerializedName("modifyOn")
  private String modifyOn = null;

  /**
   * 创建来源：1：广告(前台)上传；2：运营(后台)上传
   */
  @SerializedName("createType")
  private String createType = null;

  /**
   * 所属平台：0：全平台；1：cpc平台；2：cpd平台
   */
  @SerializedName("platformType")
  private Integer platformType = null;

  /**
   * 覆盖的人数
   */
  @SerializedName("quantity")
  private Long quantity = null;

  public AdDmpTagGetCrowdsResponseData id(Long id) {
    this.id = id;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData tagId(Long tagId) {
    this.tagId = tagId;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData crowdName(String crowdName) {
    this.crowdName = crowdName;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData crowdType(Integer crowdType) {
    this.crowdType = crowdType;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData description(String description) {
    this.description = description;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData expireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData advertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData isDelete(Integer isDelete) {
    this.isDelete = isDelete;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData isValid(Integer isValid) {
    this.isValid = isValid;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData insertTime(String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData modifyOn(String modifyOn) {
    this.modifyOn = modifyOn;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData createType(String createType) {
    this.createType = createType;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData platformType(Integer platformType) {
    this.platformType = platformType;
    return this;
  }

  public AdDmpTagGetCrowdsResponseData quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}