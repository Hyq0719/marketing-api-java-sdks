package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

@Data
public class CreativeCreateCreativeTagAdviseRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  public CreativeCreateCreativeTagAdviseRequest advertiserId(Long advertiserId) {
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
