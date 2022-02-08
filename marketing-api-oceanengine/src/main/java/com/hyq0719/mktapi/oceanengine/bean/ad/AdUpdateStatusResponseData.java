package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdUpdateStatusResponseData {
  @SerializedName("ad_ids")
  private List<Long> adIds = null;
  @SerializedName("errors")
  private List<ErrorStruct> errorStructs = null;

  public AdUpdateStatusResponseData adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public AdUpdateStatusResponseData errors(List<ErrorStruct> errorStructs) {
    this.errorStructs = errorStructs;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
