package com.hyq0719.mktapi.kuaishou.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.kuaishou.KshApiRequest;
import com.hyq0719.mktapi.kuaishou.bean.common.KshResponse;
import com.hyq0719.mktapi.kuaishou.bean.common.PageResponseData;
import com.hyq0719.mktapi.kuaishou.bean.report.*;

public class DataReportApi extends AbstractKshApi {

  private volatile AgentReport agentReport;
  private volatile ReportAccountReport reportAccountReport;
  private volatile ReportCampaignReport reportCampaignReport;
  private volatile ReportUnitReport reportUnitReport;
  private volatile ReportCreativeReport reportCreativeReport;

  public DataReportApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public AgentReport agentReport() {
    if (agentReport == null) {
      synchronized (AgentReport.class) {
        if (agentReport == null) {
          agentReport = (AgentReport) init(AgentReport.class);
        }
      }
    }
    return agentReport;
  }

  public ReportAccountReport reportAccountReport() {
    if (reportAccountReport == null) {
      synchronized (ReportAccountReport.class) {
        if (reportAccountReport == null) {
          reportAccountReport = (ReportAccountReport) init(ReportAccountReport.class);
        }
      }
    }
    return reportAccountReport;
  }

  public ReportCampaignReport reportCampaignReport() {
    if (reportCampaignReport == null) {
      synchronized (ReportCampaignReport.class) {
        if (reportCampaignReport == null) {
          reportCampaignReport = (ReportCampaignReport) init(ReportCampaignReport.class);
        }
      }
    }
    return reportCampaignReport;
  }

  public ReportUnitReport reportUnitReport() {
    if (reportUnitReport == null) {
      synchronized (ReportUnitReport.class) {
        if (reportUnitReport == null) {
          reportUnitReport = (ReportUnitReport) init(ReportUnitReport.class);
        }
      }
    }
    return reportUnitReport;
  }

  public ReportCreativeReport reportCreativeReport() {
    if (reportCreativeReport == null) {
      synchronized (ReportCreativeReport.class) {
        if (reportCreativeReport == null) {
          reportCreativeReport = (ReportCreativeReport) init(ReportCreativeReport.class);
        }
      }
    }
    return reportCreativeReport;
  }

  @ApiRequestMapping(value = "/report/account_report", method = RequestConstants.POST)
  public class ReportAccountReport
    extends KshApiRequest<ReportAccountReportRequest,
    KshResponse<PageResponseData<ReportAccountReportResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/report/campaign_report", method = RequestConstants.POST)
  public class ReportCampaignReport
    extends KshApiRequest<ReportCampaignReportRequest,
    KshResponse<PageResponseData<ReportCampaignReportResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/report/unit_report", method = RequestConstants.POST)
  public class ReportUnitReport
    extends KshApiRequest<ReportUnitReportRequest,
    KshResponse<PageResponseData<ReportUnitReportResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/report/creative_report", method = RequestConstants.POST)
  public class ReportCreativeReport
    extends KshApiRequest<ReportCreativeReportRequest,
    KshResponse<PageResponseData<ReportCreativeReportResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/agent/report", method = RequestConstants.POST)
  public class AgentReport
    extends KshApiRequest<AgentReportRequest, KshResponse<PageResponseData<AgentReportResponseStruct>>> {
  }

}
