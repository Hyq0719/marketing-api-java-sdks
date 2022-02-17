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
 * @date 2022-02-17 15:43:09
 */
@Data
public class AdSugKeywordEditPriceRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 关键词ID，多个逗号隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 出价（单位为毫分，1元=100000毫分，精确到元小数点后一位）
   */
  @SerializedName("price")
  private String price = null;

  public AdSugKeywordEditPriceRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdSugKeywordEditPriceRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdSugKeywordEditPriceRequest price(String price) {
    this.price = price;
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