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
 * @date 2022-02-08 10:37:34
 */
@Data
public class AdCampaignPauseToggleRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 计划编号id，多个编号之间用,隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 计划启停状态 0-开启；1-暂停 详见 【附录-启停状态】
   */
  @SerializedName("startAndStop")
  private Integer startAndStop = null;

  public AdCampaignPauseToggleRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdCampaignPauseToggleRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdCampaignPauseToggleRequest startAndStop(Integer startAndStop) {
    this.startAndStop = startAndStop;
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