/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 23:52:23
 */
@Data
public class FinanceFundsQueryFoundsResponseData {

  /**
   * 对象数据
   */
  @SerializedName("list")
  private List<FinanceFundsQueryFoundsListStruct> list = null;

  /**
   * 分页信息
   */
  @SerializedName("pageInfo")
  private PageInfoStruct pageInfo = null;

  public FinanceFundsQueryFoundsResponseData list (List<FinanceFundsQueryFoundsListStruct> list) {
    this.list = list;
    return this;
  }

  public FinanceFundsQueryFoundsResponseData pageInfo (PageInfoStruct pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}