package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdsGetRejectReasonResponseListStruct {
  @SerializedName("ad_reject")
  private AdRejectStruct adReject = null;

  @SerializedName("creative_reject")
  private List<CreativeRejectStruct> creativeReject = null;

  @SerializedName("material_reject")
  private List<MaterialRejectStruct> materialReject = null;

  public AdsGetRejectReasonResponseListStruct adReject(AdRejectStruct adReject) {
    this.adReject = adReject;
    return this;
  }

  public AdsGetRejectReasonResponseListStruct creativeReject(List<CreativeRejectStruct> creativeReject) {
    this.creativeReject = creativeReject;
    return this;
  }

  public AdsGetRejectReasonResponseListStruct materialReject(List<MaterialRejectStruct> materialReject) {
    this.materialReject = materialReject;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
