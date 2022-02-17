package com.hyq0719.mktapi.kuaishou.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class CampaignListRequest implements IPage {
  @SerializedName("unit_name")
  private String unitName = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("time_filter_type")
  private Integer timeFilterType = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("unit_ids")
  private List<Long> unitIds = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("page_size")
  private Integer pageSize = null;


  public CampaignListRequest unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  public CampaignListRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public CampaignListRequest timeFilterType(Integer timeFilterType) {
    this.timeFilterType = timeFilterType;
    return this;
  }

  public CampaignListRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public CampaignListRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public CampaignListRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public CampaignListRequest unitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
    return this;
  }

  public CampaignListRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CampaignListRequest status(Integer status) {
    this.status = status;
    return this;
  }

  public CampaignListRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public CampaignListRequest pageSize(Integer pageSize) {
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
