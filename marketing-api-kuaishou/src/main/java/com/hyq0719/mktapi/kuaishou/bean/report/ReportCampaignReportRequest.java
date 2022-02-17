package com.hyq0719.mktapi.kuaishou.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class ReportCampaignReportRequest implements IPage {
  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("report_dims")
  private List<String> reportDims = null;

  @SerializedName("temporal_granularity")
  private String temporalGranularity = null;

  @SerializedName("end_date_min")
  private String endDateMin = null;

  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  @SerializedName("campaign_type")
  private Integer campaignType = null;

  @SerializedName("start_date_min")
  private String startDateMin = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("page_size")
  private Integer pageSize = null;


  public ReportCampaignReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public ReportCampaignReportRequest reportDims(List<String> reportDims) {
    this.reportDims = reportDims;
    return this;
  }

  public ReportCampaignReportRequest temporalGranularity(String temporalGranularity) {
    this.temporalGranularity = temporalGranularity;
    return this;
  }

  public ReportCampaignReportRequest endDateMin(String endDateMin) {
    this.endDateMin = endDateMin;
    return this;
  }

  public ReportCampaignReportRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportCampaignReportRequest campaignType(Integer campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  public ReportCampaignReportRequest startDateMin(String startDateMin) {
    this.startDateMin = startDateMin;
    return this;
  }

  public ReportCampaignReportRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public ReportCampaignReportRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ReportCampaignReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public ReportCampaignReportRequest pageSize(Integer pageSize) {
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
