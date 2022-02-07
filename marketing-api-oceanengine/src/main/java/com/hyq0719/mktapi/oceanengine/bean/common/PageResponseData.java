package com.hyq0719.mktapi.oceanengine.bean.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class PageResponseData<T> {
  @SerializedName("list")
  private List<T> list = null;

  @SerializedName("page_info")
  private PageInfo pageInfo = null;

  public PageResponseData<T> list(List<T> list) {
    this.list = list;
    return this;
  }

  public PageResponseData<T> pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }
}
