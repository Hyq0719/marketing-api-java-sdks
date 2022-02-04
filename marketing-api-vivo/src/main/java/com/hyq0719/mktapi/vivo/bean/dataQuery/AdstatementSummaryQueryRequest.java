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
 * @date 2022-02-04 18:13:59
 */
@Data
public class AdstatementSummaryQueryRequest implements TokenKey {

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
   * 页面大小，最大不得超过200
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 汇总方式:DAY(按天汇总),HOUR(按小时汇总),SUMMARY(汇总)
   */
  @SerializedName("summaryType")
  private String summaryType = null;

  /**
   * 层级:ACCOUNT(账户层级),CAMPAIGN(计划层级),GROUP(广告组层级),ADVERTISEMENT(广告层级),CREATIVE(创意层级，默认层级)
   */
  @SerializedName("level")
  private String level = null;

  /**
   * 按id过滤
   */
  @SerializedName("filterFieldIds")
  private FilterFieldIdsStruct filterFieldIds = null;

  public AdstatementSummaryQueryRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdstatementSummaryQueryRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AdstatementSummaryQueryRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdstatementSummaryQueryRequest lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdstatementSummaryQueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public AdstatementSummaryQueryRequest summaryType(String summaryType) {
    this.summaryType = summaryType;
    return this;
  }

  public AdstatementSummaryQueryRequest level(String level) {
    this.level = level;
    return this;
  }

  public AdstatementSummaryQueryRequest filterFieldIds(FilterFieldIdsStruct filterFieldIds) {
    this.filterFieldIds = filterFieldIds;
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