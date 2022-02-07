/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import com.google.gson.Gson;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 23:14:22
 */
@Data
public class PageInfoStruct {

  /**
   * 当前页数
   */
  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  /**
   * 分页大小
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 总页数
   */
  @SerializedName("pageCount")
  private Integer pageCount = null;

  /**
   * 总数据量
   */
  @SerializedName("rowCount")
  private Integer rowCount = null;

  public PageInfoStruct pageIndex (Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  public PageInfoStruct pageSize (Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public PageInfoStruct pageCount (Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  public PageInfoStruct rowCount (Integer rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}