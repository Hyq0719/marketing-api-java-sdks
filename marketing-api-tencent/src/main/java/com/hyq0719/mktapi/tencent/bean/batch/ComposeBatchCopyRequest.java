package com.hyq0719.mktapi.tencent.bean.batch;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.tencent.bean.adcreatives.AdcreativesAddRequest;
import com.hyq0719.mktapi.tencent.bean.adgroups.AdgroupsAddRequest;
import com.hyq0719.mktapi.tencent.bean.ads.AdsAddRequest;
import com.hyq0719.mktapi.tencent.bean.campaigns.CampaignsAddRequest;

import java.util.List;
import java.util.Map;

public class ComposeBatchCopyRequest {
  @SerializedName("record_id")
  private Integer recordId;

  @SerializedName("campaign_map")
  private Map<Long, CampaignsAddRequest> campaignMap;

  @SerializedName("adgroup_map")
  private Map<Long, AdgroupsAddRequest> adgroupMap;

  @SerializedName("adcreative_map")
  private Map<Long, AdcreativesAddRequest> adcreativeMap;

  @SerializedName("ad_list")
  private List<AdsAddRequest> asList;

  @SerializedName("account_ids")
  private List<Long> accountIds;

  @SerializedName("copy_number")
  private Integer copyNumber;

  public ComposeBatchCopyRequest recordId(Integer recordId) {
    this.recordId = recordId;
    return this;
  }

  public ComposeBatchCopyRequest campaignMap(Map<Long, CampaignsAddRequest> campaignMap) {
    this.campaignMap = campaignMap;
    return this;
  }

  public ComposeBatchCopyRequest adgroupMap(Map<Long, AdgroupsAddRequest> adgroupMap) {
    this.adgroupMap = adgroupMap;
    return this;
  }

  public ComposeBatchCopyRequest adcreativeMap(Map<Long, AdcreativesAddRequest> adcreativeMap) {
    this.adcreativeMap = adcreativeMap;
    return this;
  }

  public ComposeBatchCopyRequest asList(List<AdsAddRequest> asList) {
    this.asList = asList;
    return this;
  }

  public ComposeBatchCopyRequest accountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public ComposeBatchCopyRequest copyNumber(Integer copyNumber) {
    this.copyNumber = copyNumber;
    return this;
  }

  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public Map<Long, CampaignsAddRequest> getCampaignMap() {
    return campaignMap;
  }

  public void setCampaignMap(
          Map<Long, CampaignsAddRequest> campaignMap) {
    this.campaignMap = campaignMap;
  }

  public Map<Long, AdgroupsAddRequest> getAdgroupMap() {
    return adgroupMap;
  }

  public void setAdgroupMap(
          Map<Long, AdgroupsAddRequest> adgroupMap) {
    this.adgroupMap = adgroupMap;
  }

  public Map<Long, AdcreativesAddRequest> getAdcreativeMap() {
    return adcreativeMap;
  }

  public void setAdcreativeMap(
          Map<Long, AdcreativesAddRequest> adcreativeMap) {
    this.adcreativeMap = adcreativeMap;
  }

  public List<AdsAddRequest> getAsList() {
    return asList;
  }

  public void setAsList(List<AdsAddRequest> asList) {
    this.asList = asList;
  }

  public List<Long> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
  }

  public Integer getCopyNumber() {
    return copyNumber;
  }

  public void setCopyNumber(Integer copyNumber) {
    this.copyNumber = copyNumber;
  }
}
