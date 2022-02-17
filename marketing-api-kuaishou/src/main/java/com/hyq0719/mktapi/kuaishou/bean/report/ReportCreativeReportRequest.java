package com.hyq0719.mktapi.kuaishou.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class ReportCreativeReportRequest implements IPage {
  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("campaign_type")
  private Integer campaignType = null;

  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  @SerializedName("creative_ids")
  private List<Long> creativeIds = null;

  @SerializedName("start_date_min")
  private String startDateMin = null;

  @SerializedName("unit_ids")
  private List<Long> unitIds = null;

  @SerializedName("creative_id")
  private Integer creativeId = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("report_dims")
  private List<String> reportDims = null;

  @SerializedName("temporal_granularity")
  private String temporalGranularity = null;

  @SerializedName("end_date_min")
  private String endDateMin = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("page_size")
  private Integer pageSize = null;


  public ReportCreativeReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public ReportCreativeReportRequest campaignType(Integer campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  public ReportCreativeReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportCreativeReportRequest creativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
    return this;
  }

  public ReportCreativeReportRequest startDateMin(String startDateMin) {
    this.startDateMin = startDateMin;
    return this;
  }

  public ReportCreativeReportRequest unitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
    return this;
  }

  public ReportCreativeReportRequest creativeId(Integer creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public ReportCreativeReportRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ReportCreativeReportRequest reportDims(List<String> reportDims) {
    this.reportDims = reportDims;
    return this;
  }

  public ReportCreativeReportRequest temporalGranularity(String temporalGranularity) {
    this.temporalGranularity = temporalGranularity;
    return this;
  }

  public ReportCreativeReportRequest endDateMin(String endDateMin) {
    this.endDateMin = endDateMin;
    return this;
  }

  public ReportCreativeReportRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public ReportCreativeReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public ReportCreativeReportRequest pageSize(Integer pageSize) {
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
    this.page = page;
  }

  @Override
  public Integer currentPageSize() {
    return pageSize;
  }
}
