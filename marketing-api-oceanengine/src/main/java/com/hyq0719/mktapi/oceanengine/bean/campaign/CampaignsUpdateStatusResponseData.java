package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CampaignsUpdateStatusResponseData {
  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;
  @SerializedName("errors")
  private List<CampaignsUpdateStatusError> errors = null;

  public CampaignsUpdateStatusResponseData campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignsUpdateStatusResponseData errors(List<CampaignsUpdateStatusError> errors) {
    this.errors = errors;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
