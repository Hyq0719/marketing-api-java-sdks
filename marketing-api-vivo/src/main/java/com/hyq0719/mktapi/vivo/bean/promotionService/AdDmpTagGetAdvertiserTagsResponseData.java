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
 * @date 2022-02-17 15:02:02
 */
@Data
public class AdDmpTagGetAdvertiserTagsResponseData {

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
  @SerializedName("isDeleted")
  private Integer isDeleted = null;

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

  public AdDmpTagGetAdvertiserTagsResponseData id(Long id) {
    this.id = id;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData tagId(Long tagId) {
    this.tagId = tagId;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData crowdName(String crowdName) {
    this.crowdName = crowdName;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData crowdType(Integer crowdType) {
    this.crowdType = crowdType;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData description(String description) {
    this.description = description;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData expireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData advertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData isDeleted(Integer isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData isValid(Integer isValid) {
    this.isValid = isValid;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData insertTime(String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData modifyOn(String modifyOn) {
    this.modifyOn = modifyOn;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData createType(String createType) {
    this.createType = createType;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData platformType(Integer platformType) {
    this.platformType = platformType;
    return this;
  }

  public AdDmpTagGetAdvertiserTagsResponseData quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}