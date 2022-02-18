package com.hyq0719.mktapi.tencent.bean.batch;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BatchCopyCampaignResult {

  @SerializedName("campaign_id")
  private Long campaignId;

  @SerializedName("campaign_name")
  private String campaignName;

  @SerializedName("status")
  private Integer status;

  @SerializedName("detailed_information_list")
  private List<BatchCopyDetailedInformation> detailedInformationList;

  public BatchCopyCampaignResult campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public BatchCopyCampaignResult campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public BatchCopyCampaignResult status(Integer status) {
    this.status = status;
    return this;
  }

  public BatchCopyCampaignResult detailedInformationList(List<BatchCopyDetailedInformation> detailedInformationList) {
    this.detailedInformationList = detailedInformationList;
    return this;
  }

  public BatchCopyCampaignResult addItem(BatchCopyDetailedInformation detailedInformation) {
    this.detailedInformationList.add(detailedInformation);
    return this;
  }

  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public List<BatchCopyDetailedInformation> getDetailedInformationList() {
    return detailedInformationList;
  }

  public void setDetailedInformationList(
    List<BatchCopyDetailedInformation> detailedInformationList) {
    this.detailedInformationList = detailedInformationList;
  }
}
