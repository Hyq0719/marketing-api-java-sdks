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
 * @date 2022-02-17 14:39:24
 */
@Data
public class AdDmpTagGetNewBaseTagsRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 计划类型：0-商店、1-非商店、2-联盟
   */
  @SerializedName("mediaType")
  private Integer mediaType = null;

  /**
   * 推广目标：1-普通网址，2-应用下载，3-动态商品，8-快生态，9-游戏预约
   */
  @SerializedName("adType")
  private Integer adType = null;

  /**
   * 广告类型：0-展示广告（默认）；1-综搜广告
   */
  @SerializedName("campaignType")
  private Integer campaignType = null;

  public AdDmpTagGetNewBaseTagsRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdDmpTagGetNewBaseTagsRequest mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public AdDmpTagGetNewBaseTagsRequest adType(Integer adType) {
    this.adType = adType;
    return this;
  }

  public AdDmpTagGetNewBaseTagsRequest campaignType(Integer campaignType) {
    this.campaignType = campaignType;
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