package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdcreativesAdvancedProgramAddResponseStruct {

  @SerializedName("unit_id")
  private Long unitId = null;

  public AdcreativesAdvancedProgramAddResponseStruct unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
