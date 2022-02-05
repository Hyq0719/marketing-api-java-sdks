/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dmpTag;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 22:21:52
 */
@Data
public class AdDmpTagCreateRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 人群包标识类型：IMEI,IMEIMD5,MOBILE,MOBILEMD5,MAC,MACMD5,OAID,OAIDMD5【附录-人群管理 标识类型】
   */
  @SerializedName("matchType")
  private String matchType = null;

  /**
   * 人群包名称；最多30个字符，只允许传入数字、字母、“_”;不允许传入其他字符
   */
  @SerializedName("crowdName")
  private String crowdName = null;

  /**
   * 人群包名描述信息，限制255个字符
   */
  @SerializedName("description")
  private String description = null;

  /**
   * 人群包文件上传文件标识fileId，逗号分隔。最多允许传入10个
   */
  @SerializedName("fileIds")
  private String fileIds = null;

  /**
   * 有效期（天），允许传入的值为：30、90、365
   */
  @SerializedName("expireDay")
  private Integer expireDay = null;

  public AdDmpTagCreateRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdDmpTagCreateRequest matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

  public AdDmpTagCreateRequest crowdName(String crowdName) {
    this.crowdName = crowdName;
    return this;
  }

  public AdDmpTagCreateRequest description(String description) {
    this.description = description;
    return this;
  }

  public AdDmpTagCreateRequest fileIds(String fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public AdDmpTagCreateRequest expireDay(Integer expireDay) {
    this.expireDay = expireDay;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}