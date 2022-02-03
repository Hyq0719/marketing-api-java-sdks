package com.hyq0719.mktapi.oceanengine.bean.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class PageResponseData<T> {
  @SerializedName("list")
  private List<T> list = null;

  @SerializedName("page_info")
  private ConfPageSize1000 pageInfo = null;

  public PageResponseData list(List<T> list) {
    this.list = list;
    return this;
  }

  public PageResponseData pageInfo(ConfPageSize1000 pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }
}
