/*
 * Marketing API 腾讯广告
 * Marketing API 腾讯广告
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.tencent.bean.account.adAccount;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-03-07 10:35:33
 */
@Data
public class BusinessManagerRelationsGetListStruct {

  /**
   * 推广帐号 id，有操作权限的帐号 id，包括代理商和广告主帐号 id
   */
  @SerializedName("account_id")
  private Integer accountId = null;

  /**
   * 企业名称
   */
  @SerializedName("corporation_name")
  private String corporationName = null;

  /**
   * 商务管家账号类型，[枚举详情]
   */
  @SerializedName("account_type")
  private String accountType = null;

  public BusinessManagerRelationsGetListStruct accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  public BusinessManagerRelationsGetListStruct corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  public BusinessManagerRelationsGetListStruct accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
