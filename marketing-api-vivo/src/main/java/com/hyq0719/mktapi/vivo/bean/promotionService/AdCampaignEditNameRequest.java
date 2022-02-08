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
 * @date 2022-02-08 10:18:14
 */
@Data
public class AdCampaignEditNameRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 计划编号id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 计划名称（计划名称长度 <= 40 个字符 且 不能与已有计划名称重复）
   */
  @SerializedName("name")
  private String name = null;

  public AdCampaignEditNameRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdCampaignEditNameRequest id(Long id) {
    this.id = id;
    return this;
  }

  public AdCampaignEditNameRequest name(String name) {
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