package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdUnitUpdateStatusRequest implements TokenKey {
  @SerializedName("put_status")
  private Integer putStatus = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("unit_ids")
  private List<Long> unitIds = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;


  public AdUnitUpdateStatusRequest putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public AdUnitUpdateStatusRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public AdUnitUpdateStatusRequest unitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
    return this;
  }

  public AdUnitUpdateStatusRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
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

}
