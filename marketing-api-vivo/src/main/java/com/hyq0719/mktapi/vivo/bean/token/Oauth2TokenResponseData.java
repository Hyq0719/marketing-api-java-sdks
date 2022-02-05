/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.token;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 16:08:53
 */
@Data
public class Oauth2TokenResponseData {

  /**
   * accessToken值
   */
  @SerializedName("access_token")
  private String accessToken = null;

  /**
   * refreshToken值
   */
  @SerializedName("refresh_token")
  private String refreshToken = null;

  /**
   * 时间戳(毫秒),accessToken截止的有效日期
   */
  @SerializedName("token_date")
  private Long tokenDate = null;

  /**
   * 时间戳(毫秒),refreshTokenDate截止的有效日期
   */
  @SerializedName("refresh_token_date")
  private Long refreshTokenDate = null;

  public Oauth2TokenResponseData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public Oauth2TokenResponseData refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  public Oauth2TokenResponseData tokenDate(Long tokenDate) {
    this.tokenDate = tokenDate;
    return this;
  }

  public Oauth2TokenResponseData refreshTokenDate(Long refreshTokenDate) {
    this.refreshTokenDate = refreshTokenDate;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}