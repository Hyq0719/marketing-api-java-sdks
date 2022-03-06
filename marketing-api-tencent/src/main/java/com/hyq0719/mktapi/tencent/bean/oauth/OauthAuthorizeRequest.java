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
 * @date 2022-03-06 19:53:11
 */
@Data
public class OauthAuthorizeRequest implements TokenKey {

  /**
   * 应用 id，在开发者官网创建应用后获得，可通过 [应用程序管理页面] 查看
   */
  @SerializedName("client_id")
  private Integer clientId = null;

  /**
   * 应用回调地址，仅支持 http 和 https，不支持指定端口号，且主域名必须与创建应用时登记的回调域名一致，若地址携带参数，需要对地址进行 urlencode 字段长度最小 1 字节，长度最大 10...
   */
  @SerializedName("redirect_uri")
  private String redirectUri = null;

  /**
   * 验证请求有效性参数，值为用户自取，用于阻止跨站请求伪造攻击 字段长度最小 0 字节，长度最大 512 字节
   */
  @SerializedName("state")
  private String state = null;

  /**
   * 授权范围，可选值：ads_management（广告投放）、ads_insights（数据洞察）、account_management（帐号服务）、audience_management（人群管理）、...
   */
  @SerializedName("scope")
  private String scope = null;

  /**
   * 授权账号类型，登录账号类型 QQ（默认值），微信，[枚举详情] 枚举列表：{ ACCOUNT_TYPE_WECHAT, ACCOUNT_TYPE_QQ }
   */
  @SerializedName("account_type")
  private String accountType = null;

  /**
   * 授权页面展示账号类型(QQ 账号/微信账号)数量，当取值为 1 时授权页面仅展示 account_type 指定的账号类型，当取值为 2 时授权页面展示所有账号类型授权页面，默认优先显示 accoun...
   */
  @SerializedName("account_display_number")
  private Integer accountDisplayNumber = null;

  public OauthAuthorizeRequest clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  public OauthAuthorizeRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  public OauthAuthorizeRequest state(String state) {
    this.state = state;
    return this;
  }

  public OauthAuthorizeRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

  public OauthAuthorizeRequest accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  public OauthAuthorizeRequest accountDisplayNumber(Integer accountDisplayNumber) {
    this.accountDisplayNumber = accountDisplayNumber;
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
