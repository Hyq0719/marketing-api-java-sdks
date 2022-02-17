package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CreativeAdvancedProgramReviewDetailRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("unit_ids")
  private List<Long> unitIds = null;

  public CreativeAdvancedProgramReviewDetailRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CreativeAdvancedProgramReviewDetailRequest unitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }
}
