/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 13:05:11
 */
@Data
public class ReportAgentGetV2Request implements TokenKey {
  /**
   * 代理商id。
   */
  @SerializedName("agent_id")
  private Long agentId = null;

  /**
   * 开始时间。格式：YYYY-MM-DD。闭区间,可选日期范围是今天以前（不允许包括今天）。 如果选填该字段，则查询的是历史数据。 如果要查询今天的实时数据，则不能填该字段。
   */
  @SerializedName("start_date")
  private String startDate = null;

  /**
   * 结束时间。格式：YYYY-MM-DD。闭区间,可选日期范围是今天以前（不允许包括今天）。 如果选填了开始时间，则结束时间必填，开始时间与结束时间的跨度不能超过30天。 如果选填该字段，则查询的是历史数...
   */
  @SerializedName("end_date")
  private String endDate = null;

  /**
   * 筛选条件。
   */
  @SerializedName("filtering")
  private ReportAgentGetV2FilteringStruct reportAgentGetV2Filtering = null;

  /**
   * 页码。默认值: 1。
   */
  @SerializedName("page")
  private Long page = null;

  /**
   * 页面大小，即一页展示的数据数量。取值范围: 1-1000；默认值: 20。
   */
  @SerializedName("page_size")
  private Long pageSize = null;

  public ReportAgentGetV2Request agentId (Long agentId) {
    this.agentId = agentId;
    return this;
  }

  public ReportAgentGetV2Request startDate (String startDate) {
    this.startDate = startDate;
    return this;
  }

  public ReportAgentGetV2Request endDate (String endDate) {
    this.endDate = endDate;
    return this;
  }

  public ReportAgentGetV2Request reportAgentGetV2Filtering (ReportAgentGetV2FilteringStruct reportAgentGetV2Filtering) {
    this.reportAgentGetV2Filtering = reportAgentGetV2Filtering;
    return this;
  }

  public ReportAgentGetV2Request page (Long page) {
    this.page = page;
    return this;
  }

  public ReportAgentGetV2Request pageSize (Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(agentId);
  }
}
