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
 * @date 2022-02-04 21:01:54
 */
@Data
public class AdstatementGameQueryRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 统计开始时间
   */
  @SerializedName("startDate")
  private String startDate = null;

  /**
   * 统计结束时间
   */
  @SerializedName("endDate")
  private String endDate = null;

  /**
   * 第一页不传，需要向下分页时，由上一页返回结果中获取lastId
   */
  @SerializedName("lastId")
  private String lastId = null;

  /**
   * 页面大小，最大不得超过10000
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  public AdstatementGameQueryRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdstatementGameQueryRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AdstatementGameQueryRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdstatementGameQueryRequest lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdstatementGameQueryRequest pageSize(Integer pageSize) {
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