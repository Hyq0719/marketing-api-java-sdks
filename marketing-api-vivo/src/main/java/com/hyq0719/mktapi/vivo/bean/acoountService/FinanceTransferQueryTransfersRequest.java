/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;
import com.google.gson.Gson;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 00:23:45
 */
@Data
public class FinanceTransferQueryTransfersRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 起始页，不填时默认查询第一页
   */
  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  /**
   * 页大小，不填默认size=10
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 统计开始时间，时间格式为'yyyy-MM-dd', 如:"2021-02-01"
   */
  @SerializedName("startDate")
  private String startDate = null;

  /**
   * 统计结束时间，时间格式为'yyyy-MM-dd', 如:"2021-02-02",查询时间段跨度不能超过90天
   */
  @SerializedName("endDate")
  private String endDate = null;

  public FinanceTransferQueryTransfersRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FinanceTransferQueryTransfersRequest pageIndex (Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  public FinanceTransferQueryTransfersRequest pageSize (Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public FinanceTransferQueryTransfersRequest startDate (String startDate) {
    this.startDate = startDate;
    return this;
  }

  public FinanceTransferQueryTransfersRequest endDate (String endDate) {
    this.endDate = endDate;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}