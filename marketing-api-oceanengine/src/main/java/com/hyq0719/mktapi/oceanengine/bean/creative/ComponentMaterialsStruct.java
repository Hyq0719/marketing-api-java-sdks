package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ComponentMaterialsStruct {
  @SerializedName("component_id")
  private Long componentId = null;

  public ComponentMaterialsStruct componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
