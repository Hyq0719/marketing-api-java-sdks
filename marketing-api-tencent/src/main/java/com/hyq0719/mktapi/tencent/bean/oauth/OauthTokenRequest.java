/*
 * Marketing API 腾讯广告
 * Marketing API 腾讯广告
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.tencent.bean.oauth;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.tencent.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-03-06 21:03:22
 */
@Data
public class OauthTokenRequest implements TokenKey {

  /**
   * 应用 id，在开发者官网创建应用后获得，可通过 [应用程序管理页面] 查看
   */
  @SerializedName("client_id")
  private Integer clientId = null;

  /**
   * 应用 secret，在开发者官网创建应用后获得，可通过 [应用程序管理页面] 查看 字段长度最小 1 字节，长度最大 256 字节
   */
  @SerializedName("client_secret")
  private String clientSecret = null;

  /**
   * 请求的类型，可选值：authorization_code（授权码方式获取 token）、refresh_token（刷新 token） 字段长度最小 1 字节，长度最大 64 字节
   */
  @SerializedName("grant_type")
  private String grantType = null;

  /**
   * OAuth 认证 code，可通过获取 Authorization Code 接口获取，当 grant_type=authorization_code 时必填 字段长度最小 1 字节，长度最大 64 ...
   */
  @SerializedName("authorization_code")
  private String authorizationCode = null;

  /**
   * 应用 refresh token，当 grant_type=refresh_token 时必填 字段长度最小 1 字节，长度最大 256 字节
   */
  @SerializedName("refresh_token")
  private String refreshToken = null;

  /**
   * 应用回调地址，当 grant_type=authorization_code 时，redirect_uri 为必传参数，仅支持 http 和 https，不支持指定端口号，且传入的地址需要与获取 au...
   */
  @SerializedName("redirect_uri")
  private String redirectUri = null;

  public OauthTokenRequest clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  public OauthTokenRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public OauthTokenRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  public OauthTokenRequest authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  public OauthTokenRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  public OauthTokenRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
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
