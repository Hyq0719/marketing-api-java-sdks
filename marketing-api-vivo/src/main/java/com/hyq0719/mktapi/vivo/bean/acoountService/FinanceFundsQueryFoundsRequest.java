/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 23:52:23
 */
@Data
public class FinanceFundsQueryFoundsRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 资金类型，枚举值：all 全部,cash 现金,appstore 商店虚拟金,feed 非商店虚拟金,league 联盟虚拟金,general 通用虚拟金
   */
  @SerializedName("type")
  private String type = null;

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

  public FinanceFundsQueryFoundsRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FinanceFundsQueryFoundsRequest type (String type) {
    this.type = type;
    return this;
  }

  public FinanceFundsQueryFoundsRequest pageIndex (Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  public FinanceFundsQueryFoundsRequest pageSize (Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public FinanceFundsQueryFoundsRequest startDate (String startDate) {
    this.startDate = startDate;
    return this;
  }

  public FinanceFundsQueryFoundsRequest endDate (String endDate) {
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