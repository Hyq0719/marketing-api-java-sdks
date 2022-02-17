package com.hyq0719.mktapi.kuaishou.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * 分页配置信息
 */
@Data
public class PageResponseData<T> {
  @SerializedName("total_count")
  private Long totalCount = null;

  private List<T> details = null;

  public PageResponseData page(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  public PageResponseData details(List<T> details) {
    this.details = details;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
