package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @date 2022/2/17 4:04 下午
 */
@Data
public class AdSugRecommendQueryItemsStruct {
  @SerializedName("list")
  private List<AdSugRecommendQueryListStruct> list = null;

  public AdSugRecommendQueryItemsStruct list(List<AdSugRecommendQueryListStruct> list) {
    this.list = list;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
