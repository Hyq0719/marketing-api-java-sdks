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
public class CategoriesStruct {

  /**
   * 商品类目id
   */
  @SerializedName("categoryId")
  private Long categoryId = null;

  /**
   * 商品类目层级(1:一级类目 2:二级类目 3:三级类目 4:四级类目)
   */
  @SerializedName("categoryLevel")
  private Integer categoryLevel = null;

  public CategoriesStruct categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  public CategoriesStruct categoryLevel(Integer categoryLevel) {
    this.categoryLevel = categoryLevel;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}