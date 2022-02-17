package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

@Data
public class AdUnitUpdateBidRequest implements TokenKey {
  @SerializedName("bid")
  private Long bid = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;


  public AdUnitUpdateBidRequest bid(Long bid) {
    this.bid = bid;
    return this;
  }

  public AdUnitUpdateBidRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public AdUnitUpdateBidRequest advertiserId(Long advertiserId) {
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
