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
 * @date 2022-02-04 18:38:37
 */
@Data
public class AdstatementPromptQueryRequest implements TokenKey {

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
   * 提词类型 0搜索词，1优选词包 2跟随词包
   */
  @SerializedName("promptType")
  private Integer promptType = null;

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

  /**
   * 汇总方式:DAY(按天汇总),HOUR(按小时汇总)
   */
  @SerializedName("summaryType")
  private String summaryType = null;

  public AdstatementPromptQueryRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdstatementPromptQueryRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AdstatementPromptQueryRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdstatementPromptQueryRequest promptType(Integer promptType) {
    this.promptType = promptType;
    return this;
  }

  public AdstatementPromptQueryRequest lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdstatementPromptQueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public AdstatementPromptQueryRequest summaryType(String summaryType) {
    this.summaryType = summaryType;
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