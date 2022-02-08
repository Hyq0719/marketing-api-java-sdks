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

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 13:25:33
 */
@Data
public class FilterConfigVoStruct {

  /**
   * 过滤已转换投放端页面可以渲染checkbox的选项范围值，对应管理后台选中配置选中的checkbox选项
   */
  @SerializedName("filterDaysItems")
  private List filterDaysItems = null;

  /**
   * 过滤已转换周期类型 0：用户自选 1：平台默认值 2：不过滤
   */
  @SerializedName("type")
  private Integer type = null;

  public FilterConfigVoStruct filterDaysItems(List filterDaysItems) {
    this.filterDaysItems = filterDaysItems;
    return this;
  }

  public FilterConfigVoStruct type(Integer type) {
    this.type = type;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}