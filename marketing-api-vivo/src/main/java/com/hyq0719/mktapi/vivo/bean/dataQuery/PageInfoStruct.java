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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 18:58:59
 */
@Data
public class PageInfoStruct {

  /**
   * 总数据条数
   */
  @SerializedName("totalNumber")
  private Integer totalNumber = null;

  /**
   * 总页数
   */
  @SerializedName("totalPage")
  private Integer totalPage = null;

  /**
   * 分页大小
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 总页数
   */
  @SerializedName("pageNum")
  private Integer pageNum = null;

  public PageInfoStruct totalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  public PageInfoStruct totalPage(Integer totalPage) {
    this.totalPage = totalPage;
    return this;
  }

  public PageInfoStruct pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public PageInfoStruct pageNum(Integer pageNum) {
    this.pageNum = pageNum;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}