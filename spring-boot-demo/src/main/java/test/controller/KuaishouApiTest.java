package test.controller;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserInfoRequest;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserInfoResponseStruct;
import com.hyq0719.mktapi.kuaishou.bean.common.KshResponse;
import com.hyq0719.mktapi.kuaishou.bean.common.PageResponseData;
import com.hyq0719.mktapi.kuaishou.bean.report.ReportCampaignReportRequest;
import com.hyq0719.mktapi.kuaishou.bean.report.ReportCampaignReportResponseStruct;
import com.hyq0719.mktapi.kuaishou.bean.report.ReportUnitReportRequest;
import com.hyq0719.mktapi.kuaishou.bean.report.ReportUnitReportResponseStruct;
import com.hyq0719.mktapi.kuaishou.service.KshSdkService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("ksh")
@Api(tags = "磁力引擎")
public class KuaishouApiTest {
  private final Long advertiserId = 0000000L;
  @Resource
  private KshSdkService kshSdkService;

  @GetMapping("/report/campaign_report")
  public KshResponse<PageResponseData<ReportCampaignReportResponseStruct>> reportCampaignReport() throws ApiException {
    return kshSdkService.getDataReportApi().reportCampaignReport().execute(new ReportCampaignReportRequest()
      .advertiserId(advertiserId).startDate("2021-12-23").endDate("2021-12-23"));
  }

  @GetMapping("/report/unit_report")
  public KshResponse<PageResponseData<ReportUnitReportResponseStruct>> reportUnitReport() throws ApiException {
    return kshSdkService.getDataReportApi().reportUnitReport()
      .execute(new ReportUnitReportRequest()
        .advertiserId(advertiserId).startDate("2021-12-23").endDate("2021-12-23").page(1));
  }

  @GetMapping("/advertiser/info")
  public KshResponse<AdvertiserInfoResponseStruct> advertiserInfo() throws ApiException {
    return kshSdkService.getAccountServiceApi().advertiserInfo().execute(
      new AdvertiserInfoRequest().advertiserId(advertiserId));
  }
}
