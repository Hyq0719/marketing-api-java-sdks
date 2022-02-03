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
 * @date 2022-02-03 00:05:06
 */
@Data
public class AdvertiserGetRequest implements TokenKey {
  /**
   * 授权access_token，从"获取Access Token"和“刷新Access Token”的返回结果中得到
   */
  @SerializedName("access_token")
  private String accessToken = null;

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

  public AdvertiserGetRequest accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public AdvertiserGetRequest appId(Long appId) {
    this.appId = appId;
    return this;
  }

  public AdvertiserGetRequest secret(String secret) {
    this.secret = secret;
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
