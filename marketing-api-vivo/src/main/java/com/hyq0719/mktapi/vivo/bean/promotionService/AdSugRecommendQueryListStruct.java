package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @date 2022/2/17 4:06 下午
 */
@Data
public class AdSugRecommendQueryListStruct {

  @SerializedName("num")
  private String num = null;
  @SerializedName("word")
  private String word = null;

  public AdSugRecommendQueryListStruct num(String num) {
    this.num = num;
    return this;
  }

  public AdSugRecommendQueryListStruct word(String word) {
    this.word = word;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
