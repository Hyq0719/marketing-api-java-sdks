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
 * @date 2022-02-04 21:09:34
 */
@Data
public class DeepLinkQueryResponseData {

  /**
   * deeplink地址
   */
  @SerializedName("deeplink")
  private String deeplink = null;

  /**
   * 下载时间
   */
  @SerializedName("downloadTime")
  private String downloadTime = null;

  public DeepLinkQueryResponseData deeplink(String deeplink) {
    this.deeplink = deeplink;
    return this;
  }

  public DeepLinkQueryResponseData downloadTime(String downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}