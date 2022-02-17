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

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 15:55:58
 */
@Data
public class AdSugRecommendQueryRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 搜索词 最多支持5个，必填
   */
  @SerializedName("query")
  private List<String> query = null;

  /**
   * 广告组
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 排序字段 asc-顺排 desc-倒排
   */
  @SerializedName("orderby")
  private String orderby = null;

  public AdSugRecommendQueryRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdSugRecommendQueryRequest query(List<String> query) {
    this.query = query;
    return this;
  }

  public AdSugRecommendQueryRequest groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdSugRecommendQueryRequest orderby(String orderby) {
    this.orderby = orderby;
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