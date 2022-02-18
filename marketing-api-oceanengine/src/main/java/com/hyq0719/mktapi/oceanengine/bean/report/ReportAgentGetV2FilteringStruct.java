/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 13:05:11
 */
@Data
public class ReportAgentGetV2FilteringStruct {
  /**
   * 广告主 id 列表，若选填该字段，则最少应上传1个广告主id，最多支持同时查询100个广告主。
   */
  @SerializedName("advertiser_ids")
  private List<Long> advertiserIds = null;

  /**
   * 广告主所属公司名称，若选填该字段，限制最小长度为1，最大长度为223。支持模糊查询。
   */
  @SerializedName("company_name")
  private String companyName = null;

  /**
   * 用户活跃状态。可选枚举值: ACTIVE表示活跃用户,SILENT表示沉默用户,ALL表示所有用户。不填写该字段则默认值为ALL。
   */
  @SerializedName("active")
  private String active = null;

  /**
   * 一级行业名称。可从【获取行业列表】接口获取。
   */
  @SerializedName("first_industry")
  private String firstIndustry = null;

  /**
   * 二级行业名称。可从【获取行业列表】接口获取。
   */
  @SerializedName("second_industry")
  private String secondIndustry = null;

  /**
   * 账户类型。详见【附录-账户类型】，可选枚举值: LUBAN_ACCOUNT,NORMAL_ADVERTISER。
   */
  @SerializedName("account_source")
  private String accountSource = null;

  /**
   * 账户状态。详见【附录-账户状态】，可选枚举值: STATUS_CONFIRM_FAIL,STATUS_CONFIRM_FAIL_END,STATUS_CONFIRM_MODIFY_FAIL,STATU...
   */
  @SerializedName("account_status")
  private String accountStatus = null;

  /**
   * 过审时间范围的开始时间。闭区间。格式：YYYY-MM-DD。表示过滤出账户资质审核通过时间在给定的过审时间范围内的广告主数据。
   */
  @SerializedName("start_audit_pass_time")
  private String startAuditPassTime = null;

  /**
   * 过审时间范围的结束时间。闭区间。格式：YYYY-MM-DD。表示过滤出账户资质审核通过时间在给定的过审时间范围内的广告主数据。
   */
  @SerializedName("end_audit_pass_time")
  private String endAuditPassTime = null;

  public ReportAgentGetV2FilteringStruct advertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  public ReportAgentGetV2FilteringStruct companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  public ReportAgentGetV2FilteringStruct active(String active) {
    this.active = active;
    return this;
  }

  public ReportAgentGetV2FilteringStruct firstIndustry(String firstIndustry) {
    this.firstIndustry = firstIndustry;
    return this;
  }

  public ReportAgentGetV2FilteringStruct secondIndustry(String secondIndustry) {
    this.secondIndustry = secondIndustry;
    return this;
  }

  public ReportAgentGetV2FilteringStruct accountSource(String accountSource) {
    this.accountSource = accountSource;
    return this;
  }

  public ReportAgentGetV2FilteringStruct accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

  public ReportAgentGetV2FilteringStruct startAuditPassTime(String startAuditPassTime) {
    this.startAuditPassTime = startAuditPassTime;
    return this;
  }

  public ReportAgentGetV2FilteringStruct endAuditPassTime(String endAuditPassTime) {
    this.endAuditPassTime = endAuditPassTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
