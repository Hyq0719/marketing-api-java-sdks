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
 * @date 2022-02-08 13:25:33
 */
@Data
public class OcpxTransitionVoListStruct {

  /**
   * 转换目标id
   */
  @SerializedName("id")
  private Integer id = null;

  /**
   * 转换目标值
   */
  @SerializedName("cvType")
  private Integer cvType = null;

  /**
   * 出价类型 0：价格，1：ROI系数
   */
  @SerializedName("bidType")
  private Integer bidType = null;

  /**
   * 转换目标名称
   */
  @SerializedName("cvTypeName")
  private String cvTypeName = null;

  /**
   * 转换目标底价
   */
  @SerializedName("cvTypePrice")
  private Double cvTypePrice = null;

  /**
   * 转换目标阈值
   */
  @SerializedName("cvTypeThreshold")
  private Integer cvTypeThreshold = null;

  /**
   * 转换目标最最高价
   */
  @SerializedName("cvTypeMaxPrice")
  private Double cvTypeMaxPrice = null;

  public OcpxTransitionVoListStruct id(Integer id) {
    this.id = id;
    return this;
  }

  public OcpxTransitionVoListStruct cvType(Integer cvType) {
    this.cvType = cvType;
    return this;
  }

  public OcpxTransitionVoListStruct bidType(Integer bidType) {
    this.bidType = bidType;
    return this;
  }

  public OcpxTransitionVoListStruct cvTypeName(String cvTypeName) {
    this.cvTypeName = cvTypeName;
    return this;
  }

  public OcpxTransitionVoListStruct cvTypePrice(Double cvTypePrice) {
    this.cvTypePrice = cvTypePrice;
    return this;
  }

  public OcpxTransitionVoListStruct cvTypeThreshold(Integer cvTypeThreshold) {
    this.cvTypeThreshold = cvTypeThreshold;
    return this;
  }

  public OcpxTransitionVoListStruct cvTypeMaxPrice(Double cvTypeMaxPrice) {
    this.cvTypeMaxPrice = cvTypeMaxPrice;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}