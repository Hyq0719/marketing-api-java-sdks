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
 * @date 2022-02-08 13:11:39
 */
@Data
public class AdGroupBatchEditDailyBudgetRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 广告组主键ID，多个英文逗号隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 日限额:不限额填写-1;有限额时填写具体限额，单位为毫分，1元=100000毫分;
   */
  @SerializedName("dailyBudget")
  private Long dailyBudget = null;

  public AdGroupBatchEditDailyBudgetRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdGroupBatchEditDailyBudgetRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdGroupBatchEditDailyBudgetRequest dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
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