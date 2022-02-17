package com.hyq0719.mktapi.kuaishou.bean.advertiser;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

@Data
public class AdvertiserFundGetRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private Long advertiserId;

  public AdvertiserFundGetRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }
}
