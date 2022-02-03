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
 * @date 2022-02-02 23:51:05
 */
@Data
public class RefreshTokenResponseData {
  /**
   * 用于验证权限的token
   */
  @SerializedName("access_token")
  private String accessToken = null;

  /**
   * access_token剩余有效时间,单位(秒)
   */
  @SerializedName("expires_in")
  private Long expiresIn = null;

  /**
   * 刷新access_token,用于获取新的access_token和refresh_token，并且刷新过期时间
   */
  @SerializedName("refresh_token")
  private String refreshToken = null;

  /**
   * refresh_token剩余有效时间,单位(秒)
   */
  @SerializedName("refresh_token_expires_in")
  private Long refreshTokenExpiresIn = null;


  public RefreshTokenResponseData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public RefreshTokenResponseData expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  public RefreshTokenResponseData refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  public RefreshTokenResponseData refreshTokenExpiresIn(Long refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
