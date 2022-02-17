package com.hyq0719.mktapi.kuaishou.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CampaignCreateResponseStruct {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  public CampaignCreateResponseStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
