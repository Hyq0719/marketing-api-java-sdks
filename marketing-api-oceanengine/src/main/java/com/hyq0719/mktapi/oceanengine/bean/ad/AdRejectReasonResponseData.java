package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdRejectReasonResponseData {
  @SerializedName("list")
  private List<AdRejectReasonResponseListStruct> list = null;

  public AdRejectReasonResponseData list(List<AdRejectReasonResponseListStruct> list) {
    this.list = list;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
