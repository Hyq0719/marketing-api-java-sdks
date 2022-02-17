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
 * @date 2022-02-17 15:49:14
 */
@Data
public class AdSugKeywordEditMatchTypeRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 关键词ID，多个逗号隔开
   */
  @SerializedName("ids")
  private String ids = null;

  /**
   * 匹配方式：0-精准匹配；1-短语匹配；2-宽泛匹配
   */
  @SerializedName("matchType")
  private Integer matchType = null;

  public AdSugKeywordEditMatchTypeRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdSugKeywordEditMatchTypeRequest ids(String ids) {
    this.ids = ids;
    return this;
  }

  public AdSugKeywordEditMatchTypeRequest matchType(Integer matchType) {
    this.matchType = matchType;
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