/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 15:47:21
 */
@Data
public class AdSugKeywordEditSiteUrlRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 关键词ID，多个逗号隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 站点url
   */
  @SerializedName("siteUrl")
  private String siteUrl = null;

  /**
   * 站点编码
   */
  @SerializedName("siteCode")
  private String siteCode = null;

  /**
   * 站点类型：2-自定义；3-悟空建站；4-自定义h5;
   */
  @SerializedName("siteType")
  private String siteType = null;

  public AdSugKeywordEditSiteUrlRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdSugKeywordEditSiteUrlRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdSugKeywordEditSiteUrlRequest siteUrl(String siteUrl) {
    this.siteUrl = siteUrl;
    return this;
  }

  public AdSugKeywordEditSiteUrlRequest siteCode(String siteCode) {
    this.siteCode = siteCode;
    return this;
  }

  public AdSugKeywordEditSiteUrlRequest siteType(String siteType) {
    this.siteType = siteType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}