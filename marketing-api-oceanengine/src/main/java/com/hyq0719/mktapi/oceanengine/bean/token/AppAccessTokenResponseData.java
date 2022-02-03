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
 * @date 2022-02-03 10:12:58
 */
@Data
public class AppAccessTokenResponseData {
  /**
   * 应用级别token
   */
  @SerializedName("access_token")
  private String accessToken = null;

  /**
   * access_token剩余有效时间,单位(秒)
   */
  @SerializedName("expires_in")
  private Long expiresIn = null;

  public AppAccessTokenResponseData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public AppAccessTokenResponseData expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
