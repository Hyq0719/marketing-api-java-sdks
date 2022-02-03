package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ReportAgentGetFilteringStruct {
  @SerializedName("advertiser_ids")
  private List<Long> advertiserIds = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("second_industry")
  private String secondIndustry = null;

  @SerializedName("active")
  private String active = null;

  @SerializedName("first_industry")
  private String firstIndustry = null;

  @SerializedName("account_status")
  private String accountStatus = null;

  @SerializedName("start_audit_pass_time")
  private String startAuditPassTime = null;

  @SerializedName("end_audit_pass_time")
  private String endAuditPassTime = null;

  @SerializedName("account_source")
  private String accountSource = null;

  public ReportAgentGetFilteringStruct advertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  public ReportAgentGetFilteringStruct companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  public ReportAgentGetFilteringStruct secondIndustry(String secondIndustry) {
    this.secondIndustry = secondIndustry;
    return this;
  }

  public ReportAgentGetFilteringStruct active(String active) {
    this.active = active;
    return this;
  }

  public ReportAgentGetFilteringStruct firstIndustry(String firstIndustry) {
    this.firstIndustry = firstIndustry;
    return this;
  }

  public ReportAgentGetFilteringStruct accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

  public ReportAgentGetFilteringStruct startAuditPassTime(String startAuditPassTime) {
    this.startAuditPassTime = startAuditPassTime;
    return this;
  }

  public ReportAgentGetFilteringStruct endAuditPassTime(String endAuditPassTime) {
    this.endAuditPassTime = endAuditPassTime;
    return this;
  }

  public ReportAgentGetFilteringStruct accountSource(String accountSource) {
    this.accountSource = accountSource;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
