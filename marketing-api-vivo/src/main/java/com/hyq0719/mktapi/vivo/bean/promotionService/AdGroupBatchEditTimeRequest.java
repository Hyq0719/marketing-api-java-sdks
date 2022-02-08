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
 * @date 2022-02-08 13:16:54
 */
@Data
public class AdGroupBatchEditTimeRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 广告组ID，多个逗号隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 投放时段
   */
  @SerializedName("scheduleTime")
  private String scheduleTime = null;

  public AdGroupBatchEditTimeRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdGroupBatchEditTimeRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdGroupBatchEditTimeRequest scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
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