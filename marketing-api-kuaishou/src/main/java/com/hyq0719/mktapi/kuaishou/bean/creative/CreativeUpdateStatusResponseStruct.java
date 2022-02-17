package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeUpdateStatusResponseStruct {
  @SerializedName("creative_ids")
  private List<Long> creativeIds = null;

  public CreativeUpdateStatusResponseStruct creativeIds(List<Long> creativeId) {
    this.creativeIds = creativeId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
