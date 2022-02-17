package com.hyq0719.mktapi.tencent.bean.batch;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ComposeBatchCopyResponse {

  @SerializedName("list")
  private List<BatchCopyCampaignResult> list;

  public ComposeBatchCopyResponse list(List<BatchCopyCampaignResult> list) {
    this.list = list;
    return this;
  }

  public List<BatchCopyCampaignResult> getList() {
    return list;
  }

  public void setList(List<BatchCopyCampaignResult> list) {
    this.list = list;
  }
}
