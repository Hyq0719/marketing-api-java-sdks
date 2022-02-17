package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class CreativeAdvancedProgramListRequest implements IPage {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("time_filter_type")
  private Integer timeFilterType = null;

  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("unit_ids")
  private List<Long> unitIds = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("page_size")
  private Integer pageSize = null;

  public CreativeAdvancedProgramListRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CreativeAdvancedProgramListRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public CreativeAdvancedProgramListRequest timeFilterType(Integer timeFilterType) {
    this.timeFilterType = timeFilterType;
    return this;
  }

  public CreativeAdvancedProgramListRequest packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  public CreativeAdvancedProgramListRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public CreativeAdvancedProgramListRequest unitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
    return this;
  }

  public CreativeAdvancedProgramListRequest status(Integer status) {
    this.status = status;
    return this;
  }

  public CreativeAdvancedProgramListRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public CreativeAdvancedProgramListRequest pageSize(Integer pageSize) {
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
