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
 * @date 2022-02-08 13:14:14
 */
@Data
public class AdGroupBatchEditDateRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 广告组ID，多个逗号隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 投放开始日期, yyyy-MM-dd
   */
  @SerializedName("startDate")
  private String startDate = null;

  /**
   * 投放结束日期, yyyy-MM-dd（投放结束时间设置为2038-01-19即为长期投放；）
   */
  @SerializedName("endDate")
  private String endDate = null;

  public AdGroupBatchEditDateRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdGroupBatchEditDateRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdGroupBatchEditDateRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AdGroupBatchEditDateRequest endDate(String endDate) {
    this.endDate = endDate;
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