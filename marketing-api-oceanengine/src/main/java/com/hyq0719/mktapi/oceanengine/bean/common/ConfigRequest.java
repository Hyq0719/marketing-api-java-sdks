package com.hyq0719.mktapi.oceanengine.bean.common;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.IPage;
import lombok.Data;

import java.util.List;

@Data
public class ConfigRequest<F> implements IPage {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("filtering")
  private F filtering = null;

  @SerializedName("fields")
  private List<String> fields = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  public ConfigRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ConfigRequest filtering(F filtering) {
    this.filtering = filtering;
    return this;
  }

  public ConfigRequest fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public ConfigRequest page(Long page) {
    this.page = page;
    return this;
  }

  public ConfigRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
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
