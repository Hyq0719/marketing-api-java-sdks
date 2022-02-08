package com.hyq0719.mktapi.oceanengine.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class CampaignUpdateStatusError {
  @SerializedName("campaign_id")
  private Long campaignId = null;
  @SerializedName("error_message")
  private String errorMessage = null;

  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignUpdateStatusError campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public CampaignUpdateStatusError errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
