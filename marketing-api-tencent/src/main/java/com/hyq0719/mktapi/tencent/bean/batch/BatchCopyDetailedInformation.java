package com.hyq0719.mktapi.tencent.bean.batch;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class BatchCopyDetailedInformation {

  @SerializedName("account_id")
  private Long accountId;

  @SerializedName("fail_rate")
  private Float failRate;

  @SerializedName("fail_count")
  private Integer failCount;

  @SerializedName("error_map")
  private Map<Integer, BatchCopyDetailedInformationStruct> errorMap;

  public BatchCopyDetailedInformation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public BatchCopyDetailedInformation failRate(Float failRate) {
    this.failRate = failRate;
    return this;
  }

  public BatchCopyDetailedInformation failCount(Integer failCount) {
    this.failCount = failCount;
    return this;
  }

  public BatchCopyDetailedInformation errorMap(Map<Integer, BatchCopyDetailedInformationStruct> errorMap) {
    this.errorMap = errorMap;
    return this;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Float getFailRate() {
    return failRate;
  }

  public void setFailRate(Float failRate) {
    this.failRate = failRate;
  }

  public Integer getFailCount() {
    return failCount;
  }

  public void setFailCount(Integer failCount) {
    this.failCount = failCount;
  }

  public Map<Integer, BatchCopyDetailedInformationStruct> getErrorMap() {
    return errorMap;
  }

  public void setErrorMap(
    Map<Integer, BatchCopyDetailedInformationStruct> errorMap) {
    this.errorMap = errorMap;
  }
}
