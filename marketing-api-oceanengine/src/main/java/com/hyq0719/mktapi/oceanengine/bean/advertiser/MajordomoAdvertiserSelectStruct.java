package com.hyq0719.mktapi.oceanengine.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class MajordomoAdvertiserSelectStruct {

  @SerializedName("advertiser_id")
  private Long advertiserId;

  @SerializedName("advertiser_name")
  private String advertiserName;

  public MajordomoAdvertiserSelectStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public MajordomoAdvertiserSelectStruct advertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
