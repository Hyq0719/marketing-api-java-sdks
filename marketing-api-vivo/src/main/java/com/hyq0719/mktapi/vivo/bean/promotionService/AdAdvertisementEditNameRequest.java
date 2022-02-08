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
 * @date 2022-02-08 15:13:58
 */
@Data
public class AdAdvertisementEditNameRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 广告id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 广告名称
   */
  @SerializedName("name")
  private String name = null;

  public AdAdvertisementEditNameRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdAdvertisementEditNameRequest id(Long id) {
    this.id = id;
    return this;
  }

  public AdAdvertisementEditNameRequest name(String name) {
    this.name = name;
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