/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataQuery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 18:13:59
 */
@Data
public class AdstatementSummaryQueryResponseData {

  /**
   * 分页坐标
   */
  @SerializedName("lastId")
  private String lastId = null;

  /**
   * 列表
   */
  @SerializedName("items")
  private List<AdstatementSummaryQueryItemsStruct> items = null;

  public AdstatementSummaryQueryResponseData lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdstatementSummaryQueryResponseData items(List<AdstatementSummaryQueryItemsStruct> items) {
    this.items = items;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}