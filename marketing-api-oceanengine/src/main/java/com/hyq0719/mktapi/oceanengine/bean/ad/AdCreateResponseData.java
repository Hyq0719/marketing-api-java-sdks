package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdCreateResponseData {
  @SerializedName("ad_id")
  private Long adId = null;

  public AdCreateResponseData adId(Long adId) {
    this.adId = adId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
