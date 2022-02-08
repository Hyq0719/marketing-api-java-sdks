/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 13:52:40
 */
@Data
public class WordDtoListStruct {

  /**
   * 搜索词
   */
  @SerializedName("word")
  private String word = null;

  /**
   * 出价，单位毫分，1元=100000毫分，转化成元精确到小数点后一位，搜索提词创意选填
   */
  @SerializedName("price")
  private String price = null;

  public WordDtoListStruct word(String word) {
    this.word = word;
    return this;
  }

  public WordDtoListStruct price(String price) {
    this.price = price;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}