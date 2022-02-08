/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 13:41:42
 */
@Data
public class AdAdvertisementAddCustomizeAdCreativeResponseData {

  /**
   * 广告id
   */
  @SerializedName("adId")
  private Long adId = null;

  /**
   * 创意id列表
   */
  @SerializedName("creativeIdList")
  private List<Long> creativeIdList = null;

  public AdAdvertisementAddCustomizeAdCreativeResponseData adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdAdvertisementAddCustomizeAdCreativeResponseData creativeIdList(List<Long> creativeIdList) {
    this.creativeIdList = creativeIdList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}