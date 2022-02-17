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
 * @date 2022-02-17 14:45:28
 */
@Data
public class AdDmpTagGetCrowdsRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 投放渠道/媒体类型 ：0-商店，1-vivo自有流量，2-广告联盟，详见【附录-投放渠道/媒体类型】
   */
  @SerializedName("mediaType")
  private Integer mediaType = null;

  public AdDmpTagGetCrowdsRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdDmpTagGetCrowdsRequest mediaType(Integer mediaType) {
    this.mediaType = mediaType;
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