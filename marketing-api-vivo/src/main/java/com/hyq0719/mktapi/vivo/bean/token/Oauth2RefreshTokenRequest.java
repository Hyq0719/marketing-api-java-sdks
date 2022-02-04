/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.token;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 16:34:26
 */
@Data
public class Oauth2RefreshTokenRequest implements TokenKey {

  /**
   * 应用 id，在开发者官网创建应用后获得，可通过应用列表 查看
   */
  @SerializedName("client_id")
  private String clientId = null;

  /**
   * 应用秘钥
   */
  @SerializedName("client_secret")
  private String clientSecret = null;

  /**
   * refresh_token值
   */
  @SerializedName("refresh_token")
  private String refreshToken = null;

  public Oauth2RefreshTokenRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public Oauth2RefreshTokenRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public Oauth2RefreshTokenRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
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