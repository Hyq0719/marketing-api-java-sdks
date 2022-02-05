/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataQuery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 18:58:59
 */
@Data
public class AdstatementDownloadImeiQueryRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 每页获取最后一个id值,起始页传0
   */
  @SerializedName("lastId")
  private Long lastId = null;

  /**
   * 下载日期，时间格式为'yyyyMMdd', 如:"20200820"
   */
  @SerializedName("reportDate")
  private String reportDate = null;

  /**
   * 每页条数，默认值：100
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  public AdstatementDownloadImeiQueryRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdstatementDownloadImeiQueryRequest lastId(Long lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdstatementDownloadImeiQueryRequest reportDate(String reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  public AdstatementDownloadImeiQueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
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