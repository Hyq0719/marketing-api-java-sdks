/*
 * Marketing API 腾讯广告
 * Marketing API 腾讯广告
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.tencent.bean.oauth;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import com.google.gson.Gson;

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-03-06 21:08:15
 */
@Data
public class AuthorizerInfoStruct {

  /**
   * 授权的推广帐号对应的 QQ 号
   */
  @SerializedName("account_uin")
  private Integer accountUin = null;

  /**
   * 授权的推广帐号 id，大部分接口均需同步该字段，请妥善保存
   */
  @SerializedName("account_id")
  private Integer accountId = null;

  /**
   * 权限列表，若为空，则表示拥有所属应用的所有权限
   */
  @SerializedName("scope_list")
  private List<String> scopeList = null;

  /**
   * 授权的推广帐号对应的微信帐号 id
   */
  @SerializedName("wechat_account_id")
  private String wechatAccountId = null;

  /**
   * 授权账号身份类型，授权账号类型广告主,代理商,T1 账户,商务管家账户，[枚举详情]
   */
  @SerializedName("account_role_type")
  private String accountRoleType = null;

  /**
   * 账号类型，[枚举详情]
   */
  @SerializedName("account_type")
  private String accountType = null;

  /**
   * 角色，[枚举详情]
   */
  @SerializedName("role_type")
  private String roleType = null;

  public AuthorizerInfoStruct accountUin (Integer accountUin) {
    this.accountUin = accountUin;
    return this;
  }

  public AuthorizerInfoStruct accountId (Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  public AuthorizerInfoStruct scopeList (List<String> scopeList) {
    this.scopeList = scopeList;
    return this;
  }

  public AuthorizerInfoStruct wechatAccountId (String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
    return this;
  }

  public AuthorizerInfoStruct accountRoleType (String accountRoleType) {
    this.accountRoleType = accountRoleType;
    return this;
  }

  public AuthorizerInfoStruct accountType (String accountType) {
    this.accountType = accountType;
    return this;
  }

  public AuthorizerInfoStruct roleType (String roleType) {
    this.roleType = roleType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
