package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CampaignsUpdateStatusRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;
  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;
  @SerializedName("opt_status")
  private String optStatus = null;


  public CampaignsUpdateStatusRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CampaignsUpdateStatusRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignsUpdateStatusRequest optStatus(String optStatus) {
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
