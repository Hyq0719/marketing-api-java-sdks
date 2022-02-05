/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataQuery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 21:31:30
 */
@Data
public class ChannelInfoQueryRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 加密后的广告来源参数信息字符串
   */
  @SerializedName("channelInfo")
  private String channelInfo = null;

  public ChannelInfoQueryRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ChannelInfoQueryRequest channelInfo(String channelInfo) {
    this.channelInfo = channelInfo;
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