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
 * @date 2022-02-17 14:14:10
 */
@Data
public class AdSearchWordDtosStruct {

  /**
   * 搜索题词id
   */
  @SerializedName("id")
  private Integer id = null;

  /**
   * 搜索提测的关键词
   */
  @SerializedName("word")
  private String word = null;

  /**
   * 0-待审核 /1-有效 /2-无效
   */
  @SerializedName("state")
  private Short state = null;

  /**
   * 出价
   */
  @SerializedName("price")
  private Long price = null;

  /**
   * 来源：1-用户添加；2-优质词；3-热门词；4-竞品词；5-拓展词
   */
  @SerializedName("source")
  private Integer source = null;

  public AdSearchWordDtosStruct id(Integer id) {
    this.id = id;
    return this;
  }

  public AdSearchWordDtosStruct word(String word) {
    this.word = word;
    return this;
  }

  public AdSearchWordDtosStruct state(Short state) {
    this.state = state;
    return this;
  }

  public AdSearchWordDtosStruct price(Long price) {
    this.price = price;
    return this;
  }

  public AdSearchWordDtosStruct source(Integer source) {
    this.source = source;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}