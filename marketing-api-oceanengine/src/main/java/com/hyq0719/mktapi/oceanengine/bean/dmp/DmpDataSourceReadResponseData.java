/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.dmp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 19:17:28
 */
@Data
public class DmpDataSourceReadResponseData {
  /**
   * 数据信息列表
   */
  @SerializedName("data_list")
  private List<DmpDataSourceReadDataListStruct> dataList = null;

  public DmpDataSourceReadResponseData dataList(List<DmpDataSourceReadDataListStruct> dataList) {
    this.dataList = dataList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
