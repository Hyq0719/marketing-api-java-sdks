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
 * @date 2022-02-04 21:09:34
 */
@Data
public class DeepLinkQueryRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 设备唯一标识imei/oaid
   */
  @SerializedName("deviceId")
  private String deviceId = null;

  /**
   * 唯一标识类型：IMEI/OAID 用于区别传来的到底是imei还是oaid
   */
  @SerializedName("deviceType")
  private String deviceType = null;

  /**
   * 应用包名
   */
  @SerializedName("packageName")
  private String packageName = null;

  public DeepLinkQueryRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public DeepLinkQueryRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  public DeepLinkQueryRequest deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  public DeepLinkQueryRequest packageName(String packageName) {
    this.packageName = packageName;
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