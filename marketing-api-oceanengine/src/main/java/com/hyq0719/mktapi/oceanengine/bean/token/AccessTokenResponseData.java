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

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-02 22:45:12
 */
@Data
public class AccessTokenResponseData {
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

  /**
   * （将废弃，当前支持代理商角色账号授权可一次授权多个账号，请使用advertiser_ids字段获取授权账号ID）登录用户对应的广告账户ID, 如果授权多个广告主默认为第一个
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 授权的账户id列表；该字段返回授权选择的账户id，包括纵横组织、代理商、广告主等，具体角色说明可以通过【获取已授权账户】列表来获取
   */
  @SerializedName("advertiser_ids")
  private List advertiserIds = null;


  public AccessTokenResponseData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public AccessTokenResponseData expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  public AccessTokenResponseData refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  public AccessTokenResponseData refreshTokenExpiresIn(Long refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  public AccessTokenResponseData advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AccessTokenResponseData advertiserIds(List advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
