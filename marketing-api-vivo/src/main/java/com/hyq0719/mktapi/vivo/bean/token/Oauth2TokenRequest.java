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
 * @date 2022-02-04 16:08:53
 */
@Data
public class Oauth2TokenRequest implements TokenKey {

  /**
   * 应用 id，在开发者官网创建应用后获得，可通过应用列表 查看
   */
  @SerializedName("client_id")
  private Integer clientId = null;

  /**
   * 应用秘钥
   */
  @SerializedName("client_secret")
  private String clientSecret = null;

  /**
   * 获取token方式，目前固定值为code，表示根据authorization_code获得
   */
  @SerializedName("grant_type")
  private String grantType = null;

  /**
   * 绑定应用的时候获取到的authorization_code值
   */
  @SerializedName("code")
  private String code = null;

  public Oauth2TokenRequest clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  public Oauth2TokenRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public Oauth2TokenRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  public Oauth2TokenRequest code(String code) {
    this.code = code;
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