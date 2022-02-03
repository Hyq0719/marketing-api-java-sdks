/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.token;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-02 22:45:12
 */
@Data
public class AccessTokenRequest implements TokenKey {
  /**
   * 开发者申请的应用APP_ID，可通过“应用管理”界面查看
   */
  @SerializedName("app_id")
  private Long appId = null;

  /**
   * 开发者应用的私钥Secret，可通过“应用管理”界面查看（确保填入secret与app_id对应以免报错！）
   */
  @SerializedName("secret")
  private String secret = null;

  /**
   * 授权类型。允许值: "auth_code"
   */
  @SerializedName("grant_type")
  private String grantType = null;

  /**
   * 授权码，在授权完成后回调时会提供该授权码，只有10分钟有效期，且只能使用一次，获取详情可见OAuth2.0授权
   */
  @SerializedName("auth_code")
  private String authCode = null;


  public AccessTokenRequest appId(Long appId) {
    this.appId = appId;
    return this;
  }

  public AccessTokenRequest secret(String secret) {
    this.secret = secret;
    return this;
  }

  public AccessTokenRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  public AccessTokenRequest authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return null;
  }
}
