package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdRejectReasonRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("ad_ids")
  private List<Long> adIds = null;

  public AdRejectReasonRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdRejectReasonRequest adIds(List<Long> adIds) {
    this.adIds = adIds;
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
