package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class ReportRequest<F> implements IPage {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("fields")
  private List<String> fields = null;

  @SerializedName("group_by")
  private List<String> groupBy = null;

  @SerializedName("time_granularity")
  private String timeGranularity = null;

  @SerializedName("filtering")
  private F filtering = null;

  @SerializedName("order_field")
  private String orderField = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  public ReportRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public ReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public ReportRequest fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public ReportRequest groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public ReportRequest timeGranularity(String timeGranularity) {
    this.timeGranularity = timeGranularity;
    return this;
  }

  public ReportRequest<F> filtering(F filtering) {
    this.filtering = filtering;
    return this;
  }

  public ReportRequest orderField(String orderField) {
    this.orderField = orderField;
    return this;
  }

  public ReportRequest orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

  public ReportRequest page(Long page) {
    this.page = page;
    return this;
  }

  public ReportRequest pageSize(Long pageSize) {
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
