package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CampaignUpdateStatusRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;
  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;
  @SerializedName("opt_status")
  private String optStatus = null;


  public CampaignUpdateStatusRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CampaignUpdateStatusRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignUpdateStatusRequest optStatus(String optStatus) {
    this.optStatus = optStatus;
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
