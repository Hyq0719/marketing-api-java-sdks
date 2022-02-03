package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdRejectStruct {
  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("reject_data")
  private List<RejectDataStruct> rejectData = null;

  public AdRejectStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdRejectStruct rejectData(List<RejectDataStruct> rejectData) {
    this.rejectData = rejectData;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
