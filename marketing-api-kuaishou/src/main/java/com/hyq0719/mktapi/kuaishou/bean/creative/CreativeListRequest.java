package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class CreativeListRequest implements IPage {
  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("creative_name")
  private String creativeName = null;

  @SerializedName("creative_ids")
  private List<Long> creativeIds = null;

  @SerializedName("creative_id")
  private Long creativeId = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("time_filter_type")
  private Integer timeFilterType = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("actionbar_click_url")
  private String actionbarClickUrl = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("page_size")
  private Integer pageSize = null;


  public CreativeListRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public CreativeListRequest creativeName(String creativeName) {
    this.creativeName = creativeName;
    return this;
  }

  public CreativeListRequest creativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
    return this;
  }

  public CreativeListRequest creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public CreativeListRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CreativeListRequest timeFilterType(Integer timeFilterType) {
    this.timeFilterType = timeFilterType;
    return this;
  }

  public CreativeListRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public CreativeListRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public CreativeListRequest actionbarClickUrl(String actionbarClickUrl) {
    this.actionbarClickUrl = actionbarClickUrl;
    return this;
  }

  public CreativeListRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public CreativeListRequest status(Integer status) {
    this.status = status;
    return this;
  }

  public CreativeListRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public CreativeListRequest pageSize(Integer pageSize) {
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
