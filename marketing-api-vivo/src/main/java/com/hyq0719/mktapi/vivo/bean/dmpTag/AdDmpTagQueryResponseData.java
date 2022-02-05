/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dmpTag;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 22:51:36
 */
@Data
public class AdDmpTagQueryResponseData {

  /**
   * 人群包id
   */
  @SerializedName("crowdId")
  private Long crowdId = null;

  /**
   * 人群包状态码 1：计算中，2：可用，3：错误，4：无效 【附录-人群管理 人群包状态】
   */
  @SerializedName("crowdStatus")
  private Integer crowdStatus = null;

  /**
   * 人群包推送状态：0-未推送，1-推送中，2-推送成功 3-推送失败 4-准备推送 【附录-人群管理 人群包推送状态】
   */
  @SerializedName("pushStatus")
  private Integer pushStatus = null;

  /**
   * 人群包状态描述
   */
  @SerializedName("msg")
  private String msg = null;

  /**
   * 人群包是否可以更新： 0-不可更新，1-更新 【附录-人群管理 人群包更新状态】
   */
  @SerializedName("isAllowUpdate")
  private Integer isAllowUpdate = null;

  /**
   * 人群包标识类型：IMEI,IMEIMD5,MOBILE,MOBILEMD5,MAC,MACMD5,OAID,OAIDMD5 【附录-人群管理 标识类型】
   */
  @SerializedName("matchType")
  private String matchType = null;

  public AdDmpTagQueryResponseData crowdId(Long crowdId) {
    this.crowdId = crowdId;
    return this;
  }

  public AdDmpTagQueryResponseData crowdStatus(Integer crowdStatus) {
    this.crowdStatus = crowdStatus;
    return this;
  }

  public AdDmpTagQueryResponseData pushStatus(Integer pushStatus) {
    this.pushStatus = pushStatus;
    return this;
  }

  public AdDmpTagQueryResponseData msg(String msg) {
    this.msg = msg;
    return this;
  }

  public AdDmpTagQueryResponseData isAllowUpdate(Integer isAllowUpdate) {
    this.isAllowUpdate = isAllowUpdate;
    return this;
  }

  public AdDmpTagQueryResponseData matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}