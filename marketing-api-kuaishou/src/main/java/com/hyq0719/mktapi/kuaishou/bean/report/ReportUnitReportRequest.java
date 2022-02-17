package com.hyq0719.mktapi.kuaishou.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class ReportUnitReportRequest implements IPage {
  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  @SerializedName("campaign_type")
  private Integer campaignType = null;

  @SerializedName("start_date_min")
  private String startDateMin = null;

  @SerializedName("unit_ids")
  private List<Long> unitIds = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("report_dims")
  private List<String> reportDims = null;

  @SerializedName("app_name")
  private String appName = null;

  @SerializedName("temporal_granularity")
  private String temporalGranularity = null;

  @SerializedName("end_date_min")
  private String endDateMin = null;

  @SerializedName("optimize_target")
  private String optimizeTarget = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("unit_id")
  private Integer unitId = null;

  @SerializedName("campaign_id")
  private Integer campaignId = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("page_size")
  private Integer pageSize = null;


  public ReportUnitReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public ReportUnitReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportUnitReportRequest campaignType(Integer campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  public ReportUnitReportRequest startDateMin(String startDateMin) {
    this.startDateMin = startDateMin;
    return this;
  }

  public ReportUnitReportRequest unitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
    return this;
  }

  public ReportUnitReportRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ReportUnitReportRequest reportDims(List<String> reportDims) {
    this.reportDims = reportDims;
    return this;
  }

  public ReportUnitReportRequest appName(String appName) {
    this.appName = appName;
    return this;
  }

  public ReportUnitReportRequest temporalGranularity(String temporalGranularity) {
    this.temporalGranularity = temporalGranularity;
    return this;
  }

  public ReportUnitReportRequest endDateMin(String endDateMin) {
    this.endDateMin = endDateMin;
    return this;
  }

  public ReportUnitReportRequest optimizeTarget(String optimizeTarget) {
    this.optimizeTarget = optimizeTarget;
    return this;
  }

  public ReportUnitReportRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public ReportUnitReportRequest unitId(Integer unitId) {
    this.unitId = unitId;
    return this;
  }

  public ReportUnitReportRequest campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public ReportUnitReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public ReportUnitReportRequest status(Integer status) {
    this.status = status;
    return this;
  }

  public ReportUnitReportRequest pageSize(Integer pageSize) {
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
