package com.hyq0719.mktapi.kuaishou.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CampaignUpdateStatusRequest implements TokenKey {

  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  @SerializedName("put_status")
  private Integer putStatus = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;


  public CampaignUpdateStatusRequest campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignUpdateStatusRequest putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public CampaignUpdateStatusRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public CampaignUpdateStatusRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
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
