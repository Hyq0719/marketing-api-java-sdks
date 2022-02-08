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
 * @date 2022-02-08 13:19:23
 */
@Data
public class AdGroupBatchEditPriceRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 广告组ID，多个逗号隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 一阶段出价，单位毫分，1元=100000毫分
   */
  @SerializedName("price")
  private Long price = null;

  /**
   * 二阶段出价，单位毫分，1元=100000毫分
   */
  @SerializedName("ocpxPrice")
  private Long ocpxPrice = null;

  /**
   * 三阶段出价，单位毫分，1元=100000毫分
   */
  @SerializedName("ocpx3Price")
  private Long ocpx3Price = null;

  /**
   * 深度优化出价，单位毫分，1元=100000毫分
   */
  @SerializedName("secondOcpxPrice")
  private Long secondOcpxPrice = null;

  public AdGroupBatchEditPriceRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdGroupBatchEditPriceRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdGroupBatchEditPriceRequest price(Long price) {
    this.price = price;
    return this;
  }

  public AdGroupBatchEditPriceRequest ocpxPrice(Long ocpxPrice) {
    this.ocpxPrice = ocpxPrice;
    return this;
  }

  public AdGroupBatchEditPriceRequest ocpx3Price(Long ocpx3Price) {
    this.ocpx3Price = ocpx3Price;
    return this;
  }

  public AdGroupBatchEditPriceRequest secondOcpxPrice(Long secondOcpxPrice) {
    this.secondOcpxPrice = secondOcpxPrice;
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