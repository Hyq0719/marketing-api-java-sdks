package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @date 2022/2/17 4:02 下午
 */
@Data
public class AdSugRecommendQueryResponse {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("items")
  private AdSugRecommendQueryItemsStruct items = null;

  public AdSugRecommendQueryResponse code(Long code) {
    this.code = code;
    return this;
  }

  public AdSugRecommendQueryResponse message(String message) {
    this.message = message;
    return this;
  }

  public AdSugRecommendQueryResponse items(AdSugRecommendQueryItemsStruct items) {
    this.items = items;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
