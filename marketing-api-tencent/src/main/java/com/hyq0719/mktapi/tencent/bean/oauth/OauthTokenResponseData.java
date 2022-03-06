/*
 * Marketing API 腾讯广告
 * Marketing API 腾讯广告
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.tencent.bean.oauth;

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
public class OauthTokenResponseData {

  /**
   * 权限信息，当 grant_type=refresh_token 时不返回
   */
  @SerializedName("authorizer_info")
  private AuthorizerInfoStruct authorizerInfo = null;

  /**
   * 应用 access token
   */
  @SerializedName("access_token")
  private String accessToken = null;

  /**
   * 应用 refresh token，当 grant_type=refresh_token 时不返回
   */
  @SerializedName("refresh_token")
  private String refreshToken = null;

  /**
   * access_token 过期时间，单位（秒）
   */
  @SerializedName("access_token_expires_in")
  private Integer accessTokenExpiresIn = null;

  /**
   * refresh_token 过期时间，单位（秒），当 grant_type=refresh_token 时不返回
   */
  @SerializedName("refresh_token_expires_in")
  private Integer refreshTokenExpiresIn = null;

  public OauthTokenResponseData authorizerInfo (AuthorizerInfoStruct authorizerInfo) {
    this.authorizerInfo = authorizerInfo;
    return this;
  }

  public OauthTokenResponseData accessToken (String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public OauthTokenResponseData refreshToken (String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  public OauthTokenResponseData accessTokenExpiresIn (Integer accessTokenExpiresIn) {
    this.accessTokenExpiresIn = accessTokenExpiresIn;
    return this;
  }

  public OauthTokenResponseData refreshTokenExpiresIn (Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
