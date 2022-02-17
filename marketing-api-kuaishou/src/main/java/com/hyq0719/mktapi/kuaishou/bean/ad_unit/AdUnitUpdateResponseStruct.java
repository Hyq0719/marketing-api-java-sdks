package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdUnitUpdateResponseStruct {
  @SerializedName("unit_ids")
  private List<Long> unitIds = null;

  public AdUnitUpdateResponseStruct campaignId(List<Long> unitIds) {
    this.unitIds = unitIds;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
