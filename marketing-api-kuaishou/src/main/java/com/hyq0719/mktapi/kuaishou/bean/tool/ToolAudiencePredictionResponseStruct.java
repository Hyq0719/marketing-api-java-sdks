package com.hyq0719.mktapi.kuaishou.bean.tool;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ToolAudiencePredictionResponseStruct {
  @SerializedName("audiencePredictionNum")
  private Long audiencePredictionNum = null;

  public ToolAudiencePredictionResponseStruct audiencePredictionNum(Long audiencePredictionNum) {
    this.audiencePredictionNum = audiencePredictionNum;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
