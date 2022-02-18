package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeAdvancedProgramReviewDetailResponseStruct {
  @SerializedName("slogans")
  private List<String> slogans = null;

  @SerializedName("combine_detail_views")
  private List<CombineDetailsViewStruct> combineDetailViews = null;

  @SerializedName("unit_id")
  private Long unitId = null;


  public CreativeAdvancedProgramReviewDetailResponseStruct slogans(List<String> slogans) {
    this.slogans = slogans;
    return this;
  }

  public CreativeAdvancedProgramReviewDetailResponseStruct combineDetailViews(
    List<CombineDetailsViewStruct> combineDetailViews) {
    this.combineDetailViews = combineDetailViews;
    return this;
  }

  public CreativeAdvancedProgramReviewDetailResponseStruct unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
