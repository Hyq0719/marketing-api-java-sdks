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
 * @date 2022-02-08 10:51:27
 */
@Data
public class DpaGoodsConfigStruct {

  /**
   * 商品库id
   */
  @SerializedName("cpId")
  private Long cpId = null;

  /**
   * 商品类目
   */
  @SerializedName("categories")
  private CategoriesStruct categories = null;

  public DpaGoodsConfigStruct cpId(Long cpId) {
    this.cpId = cpId;
    return this;
  }

  public DpaGoodsConfigStruct categories(CategoriesStruct categories) {
    this.categories = categories;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}