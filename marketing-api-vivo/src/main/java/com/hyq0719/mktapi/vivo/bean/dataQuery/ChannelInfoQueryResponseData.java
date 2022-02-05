/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataQuery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 21:31:30
 */
@Data
public class ChannelInfoQueryResponseData {

  /**
   * 创意ID
   */
  @SerializedName("adId")
  private Long adId = null;

  public ChannelInfoQueryResponseData adId(Long adId) {
    this.adId = adId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}