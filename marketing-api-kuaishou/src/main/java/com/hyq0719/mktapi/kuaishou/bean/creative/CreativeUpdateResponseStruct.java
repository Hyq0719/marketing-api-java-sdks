package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CreativeUpdateResponseStruct {
  @SerializedName("creative_id")
  private Long creativeId = null;

  public CreativeUpdateResponseStruct creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
