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
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 21:37:43
 */
@Data
public class AdstatementQuickGameQueryResponseData {

  /**
   * 页数
   */
  @SerializedName("pageCount")
  private Integer pageCount = null;

  /**
   * 分页坐标
   */
  @SerializedName("lastId")
  private String lastId = null;

  /**
   * 分页大小
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 总条数
   */
  @SerializedName("total")
  private Integer total = null;

  /**
   * 列表
   */
  @SerializedName("items")
  private List<AdstatementQuickGameQueryItemsStruct> items = null;

  public AdstatementQuickGameQueryResponseData pageCount (Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  public AdstatementQuickGameQueryResponseData lastId (String lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdstatementQuickGameQueryResponseData pageSize (Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public AdstatementQuickGameQueryResponseData total (Integer total) {
    this.total = total;
    return this;
  }

  public AdstatementQuickGameQueryResponseData items (List<AdstatementQuickGameQueryItemsStruct> items) {
    this.items = items;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}