package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeRejectStruct {
  @SerializedName("creative_id")
  private Long creativeId = null;

  @SerializedName("reject_data")
  private List<RejectDataStruct> rejectData = null;

  @SerializedName("material_reject")
  private List<MaterialRejectStruct> materialReject = null;

  public CreativeRejectStruct creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public CreativeRejectStruct rejectData(List<RejectDataStruct> rejectData) {
    this.rejectData = rejectData;
    return this;
  }

  public CreativeRejectStruct materialReject(List<MaterialRejectStruct> materialReject) {
    this.materialReject = materialReject;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
