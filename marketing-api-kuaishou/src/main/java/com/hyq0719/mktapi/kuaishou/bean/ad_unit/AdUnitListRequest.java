package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class AdUnitListRequest implements IPage {
  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("campaign_type")
  private Integer campaignType = null;

  @SerializedName("unit_ids")
  private List<Long> unitIds = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("unit_name")
  private String unitName = null;

  @SerializedName("app_name")
  private String appName = null;

  @SerializedName("time_filter_type")
  private Integer timeFilterType = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("page_size")
  private Integer pageSize = null;


  public AdUnitListRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdUnitListRequest campaignType(Integer campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  public AdUnitListRequest unitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
    return this;
  }

  public AdUnitListRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdUnitListRequest unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  public AdUnitListRequest appName(String appName) {
    this.appName = appName;
    return this;
  }

  public AdUnitListRequest timeFilterType(Integer timeFilterType) {
    this.timeFilterType = timeFilterType;
    return this;
  }

  public AdUnitListRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public AdUnitListRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public AdUnitListRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdUnitListRequest status(Integer status) {
    this.status = status;
    return this;
  }

  public AdUnitListRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AdUnitListRequest pageSize(Integer pageSize) {
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
