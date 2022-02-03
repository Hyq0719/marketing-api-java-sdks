package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdsGetCostProtectStatusResponseListStruct {
  @SerializedName("status")
  private String status = null;

  @SerializedName("ad_id")
  private Long adId = null;

  public AdsGetCostProtectStatusResponseListStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdsGetCostProtectStatusResponseListStruct status(String status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
