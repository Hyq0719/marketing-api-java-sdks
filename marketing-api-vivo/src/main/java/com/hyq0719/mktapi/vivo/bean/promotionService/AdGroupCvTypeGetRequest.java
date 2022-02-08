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
 * @date 2022-02-08 13:25:33
 */
@Data
public class AdGroupCvTypeGetRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 必填，推广目标，详见 【附录-推广目标】
   */
  @SerializedName("adType")
  private Integer adType = null;

  /**
   * 必填，投放渠道/媒体类型，详见 【附录-投放渠道/媒体类型】
   */
  @SerializedName("mediaType")
  private Integer mediaType = null;

  /**
   * 必填，0:展示广告; 1:搜索广告
   */
  @SerializedName("campaignType")
  private Integer campaignType = null;

  /**
   * 包名，ocpd必填
   */
  @SerializedName("appPackageName")
  private String appPackageName = null;

  /**
   * 广告计划是否使用流量优选：0-否；1-是
   */
  @SerializedName("optimizeFlag")
  private Integer optimizeFlag = null;

  public AdGroupCvTypeGetRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdGroupCvTypeGetRequest adType(Integer adType) {
    this.adType = adType;
    return this;
  }

  public AdGroupCvTypeGetRequest mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public AdGroupCvTypeGetRequest campaignType(Integer campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  public AdGroupCvTypeGetRequest appPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
    return this;
  }

  public AdGroupCvTypeGetRequest optimizeFlag(Integer optimizeFlag) {
    this.optimizeFlag = optimizeFlag;
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