package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CampaignCreateResponseData {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  public CampaignCreateResponseData campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
