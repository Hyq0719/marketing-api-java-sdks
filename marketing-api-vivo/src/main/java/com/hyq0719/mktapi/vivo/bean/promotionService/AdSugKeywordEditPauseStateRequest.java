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
 * @date 2022-02-17 15:51:17
 */
@Data
public class AdSugKeywordEditPauseStateRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 关键词ID，多个逗号隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 关键词启停状态  0-开启；1-暂停
   */
  @SerializedName("pauseState")
  private String pauseState = null;

  public AdSugKeywordEditPauseStateRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdSugKeywordEditPauseStateRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdSugKeywordEditPauseStateRequest pauseState(String pauseState) {
    this.pauseState = pauseState;
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