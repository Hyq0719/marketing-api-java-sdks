package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class ReportAdvertiserGetRequest implements IPage {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("group_by")
  private List<String> groupBy = null;

  @SerializedName("time_granularity")
  private String timeGranularity = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  public ReportAdvertiserGetRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ReportAdvertiserGetRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public ReportAdvertiserGetRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public ReportAdvertiserGetRequest groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public ReportAdvertiserGetRequest timeGranularity(String timeGranularity) {
    this.timeGranularity = timeGranularity;
    return this;
  }

  public ReportAdvertiserGetRequest page(Long page) {
    this.page = page;
    return this;
  }

  public ReportAdvertiserGetRequest pageSize(Long pageSize) {
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

  @Override
  public void exchangeCurrentPage(Integer page) {
    this.page = Long.valueOf(page);
  }

  @Override
  public Integer currentPageSize() {
    return Math.toIntExact(pageSize);
  }
}
