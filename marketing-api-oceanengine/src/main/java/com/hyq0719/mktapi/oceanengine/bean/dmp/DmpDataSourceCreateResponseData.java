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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 18:56:45
 */
@Data
public class DmpDataSourceCreateResponseData {
  /**
   * 数据源id, 唯一标识数据源的字符串
   */
  @SerializedName("data_source_id")
  private String dataSourceId = null;

  public DmpDataSourceCreateResponseData dataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
