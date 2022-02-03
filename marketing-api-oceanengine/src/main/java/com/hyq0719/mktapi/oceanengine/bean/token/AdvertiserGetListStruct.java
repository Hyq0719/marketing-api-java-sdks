/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.token;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 00:14:16
 */
@Data
public class AdvertiserGetListStruct {
  /**
   * 账号id
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 账号名称
   */
  @SerializedName("advertiser_name")
  private String advertiserName = null;

  /**
   * 旧版账号角色，1-普通广告主，2-纵横组织账户，3-一级代理商，4-二级代理商，6-星图账号
   */
  @SerializedName("advertiser_role")
  private Long advertiserRole = null;

  /**
   * 授权有效性，允许值：true/false；false表示对应的user在客户中心/一站式平台代理商平台变更了对此账号的权限,需要到对应平台进行调整过来；
   */
  @SerializedName("is_valid")
  private Boolean isValid = null;

  /**
   * 新版账号角色，见【枚举值-账户角色】
   */
  @SerializedName("account_role")
  private String accountRole = null;

  public AdvertiserGetListStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdvertiserGetListStruct advertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
    return this;
  }

  public AdvertiserGetListStruct advertiserRole(Long advertiserRole) {
    this.advertiserRole = advertiserRole;
    return this;
  }

  public AdvertiserGetListStruct isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  public AdvertiserGetListStruct accountRole(String accountRole) {
    this.accountRole = accountRole;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
