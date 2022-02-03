package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdcreativesCustomUpdateRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("creative_list")
  private List<CreativeListStruct> creativeList = null;

  @SerializedName("ad_data")
  private AdDataStruct adData = null;

  public AdcreativesCustomUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdcreativesCustomUpdateRequest adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdcreativesCustomUpdateRequest creativeList(List<CreativeListStruct> creativeList) {
    this.creativeList = creativeList;
    return this;
  }

  public AdcreativesCustomUpdateRequest adData(AdDataStruct adData) {
    this.adData = adData;
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
