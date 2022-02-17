package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeCreateCreativeTagAdviseResponseStruct {
  @SerializedName("industry")
  private String industry = null;

  @SerializedName("secondIndustry")
  private String secondindustry = null;

  @SerializedName("tags")
  private List<String> tags = null;


  public CreativeCreateCreativeTagAdviseResponseStruct industry(String industry) {
    this.industry = industry;
    return this;
  }

  public CreativeCreateCreativeTagAdviseResponseStruct secondindustry(String secondindustry) {
    this.secondindustry = secondindustry;
    return this;
  }

  public CreativeCreateCreativeTagAdviseResponseStruct tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
