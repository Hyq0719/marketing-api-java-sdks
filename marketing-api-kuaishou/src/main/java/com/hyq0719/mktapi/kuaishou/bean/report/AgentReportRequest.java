package com.hyq0719.mktapi.kuaishou.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import lombok.Data;

@Data
public class AgentReportRequest implements IPage {
  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("agent_id")
  private Long agentId = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("page_size")
  private Integer pageSize = null;


  public AgentReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AgentReportRequest agentId(Long agentId) {
    this.agentId = agentId;
    return this;
  }

  public AgentReportRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public AgentReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AgentReportRequest pageSize(Integer pageSize) {
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

  @Override
  public void exchangeCurrentPage(Integer page) {
    this.page = page;
  }

  @Override
  public Integer currentPageSize() {
    return pageSize;
  }
}
