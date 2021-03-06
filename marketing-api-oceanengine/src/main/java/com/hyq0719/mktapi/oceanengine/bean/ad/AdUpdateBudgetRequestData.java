package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdUpdateBudgetRequestData {
  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("budget")
  private Long budget = null;

  public AdUpdateBudgetRequestData adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdUpdateBudgetRequestData budget(Long budget) {
    this.budget = budget;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
