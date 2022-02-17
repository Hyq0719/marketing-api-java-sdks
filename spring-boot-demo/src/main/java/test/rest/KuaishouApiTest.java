package test.rest;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("ksh")
public class KuaishouApiTest {
  @Resource
  private KshSdkService kshSdkService;
  private Long advertiserId = 0000000L;

  @GetMapping("/report/campaign_report")
  public KshResponse<PageResponseData<ReportCampaignReportResponseStruct>> test1() throws ApiException {
    return kshSdkService.getDataReportApi().reportCampaignReport().execute(new ReportCampaignReportRequest()
            .advertiserId(advertiserId).startDate("2021-12-23").endDate("2021-12-23"));
  }

  @GetMapping("/report/unit_report")
  public KshResponse<PageResponseData<ReportUnitReportResponseStruct>> test2() throws ApiException {
    return kshSdkService.getDataReportApi().reportUnitReport()
            .execute(new ReportUnitReportRequest()
                    .advertiserId(advertiserId).startDate("2021-12-23").endDate("2021-12-23").page(1));
  }

  @GetMapping("/report/creative_report")
  public KshResponse<AdvertiserInfoResponseStruct> test3() throws ApiException {
    return kshSdkService.getAccountServiceApi().advertiserInfo().execute(
            new AdvertiserInfoRequest().advertiserId(advertiserId));
  }
}
