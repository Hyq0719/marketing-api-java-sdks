package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdsGetCostProtectStatusResponseData {
  @SerializedName("list")
  private List<AdsGetCostProtectStatusResponseListStruct> list = null;

  public AdsGetCostProtectStatusResponseData list(List<AdsGetCostProtectStatusResponseListStruct> list) {
    this.list = list;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
