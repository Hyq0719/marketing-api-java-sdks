package test.controller;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.oceanengine.bean.advertiser.MajordomoAdvertiserSelectStruct;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.material.FileImageAdGetRequest;
import com.hyq0719.mktapi.oceanengine.bean.material.FileImageAdRequest;
import com.hyq0719.mktapi.oceanengine.bean.material.FileVideoAdGetRequest;
import com.hyq0719.mktapi.oceanengine.bean.material.ToolsVideoCoverSuggestRequest;
import com.hyq0719.mktapi.oceanengine.bean.report.ReportRequest;
import com.hyq0719.mktapi.oceanengine.service.OceanSdkService;
import com.hyq0719.mktapi.oceanengine.util.OceanDataPageFetcher;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.util.FileUtil;

import javax.annotation.Resource;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("ocean")
@Api(tags = "巨量引擎")
public class OceanEngineApiTest {

  private final Long advertiserId = 00000000L;
  private final Long testId = 00000000L;
  @Resource
  private OceanSdkService oceanSdkService;

  @GetMapping("/report/advertiser/get")
  public OceanResponse reportAdvertiserGet() throws ApiException {
    ReportRequest request = new ReportRequest().advertiserId(advertiserId).startDate("2022-02-10").endDate("2022-02-10");
    return oceanSdkService.getDataReportApi().reportAdvertiserGet().execute(request);
  }

  @GetMapping("/report/campaign/get")
  public OceanResponse reportCampaignGet() throws ApiException {
    ReportRequest request = new ReportRequest().advertiserId(advertiserId)
      .startDate("2022-02-10").endDate("2022-02-10").groupBy(Arrays.asList("STAT_GROUP_BY_FIELD_ID"));
    return oceanSdkService.getDataReportApi().reportCampaignGet().execute(request);
  }

  @GetMapping("/report/ad/get")
  public OceanResponse reportAdGet() throws ApiException {
    ReportRequest request = new ReportRequest().advertiserId(advertiserId)
      .startDate("2022-02-10").endDate("2022-02-10");
    return oceanSdkService.getDataReportApi().reportAdGet().execute(request);
  }

  @GetMapping("/report/creative/get")
  public OceanResponse reportCreativeGet() throws ApiException {
    ReportRequest request = new ReportRequest().advertiserId(advertiserId)
      .startDate("2022-02-10").endDate("2022-02-10");
    return oceanSdkService.getDataReportApi().reportCreativeGet().execute(request);
  }

  @GetMapping("/campaign/get/")
  public OceanResponse campaignGet() throws ApiException {
    OceanRequest request = new OceanRequest().advertiserId(advertiserId).page(1L).pageSize(100L);
    return oceanSdkService.getAdServingApi().campaignGet().execute(request);
  }

  @GetMapping("/file/image/get")
  public OceanResponse fileImageGet() throws ApiException {
    OceanRequest request = new OceanRequest().advertiserId(testId).page(1L).pageSize(100L);
    return oceanSdkService.getMaterialApi().fileImageGet().execute(request);
  }

  @GetMapping("/file/video/get")
  public OceanResponse fileVideoGet() throws ApiException {
    OceanRequest request = new OceanRequest().advertiserId(testId).page(1L).pageSize(100L);
    return oceanSdkService.getMaterialApi().fileVideoGet().execute(request);
  }

  @GetMapping("/tools/video_cover/suggest")
  public OceanResponse toolsVideoCoverSuggest() throws ApiException {
    ToolsVideoCoverSuggestRequest request = new ToolsVideoCoverSuggestRequest().advertiserId(advertiserId).videoId("");
    return oceanSdkService.getMaterialApi().toolsVideoCoverSuggest().execute(request);
  }

  @GetMapping("/file/image/ad/get")
  public OceanResponse fileImageAdGet() throws ApiException {
    FileImageAdGetRequest request = new FileImageAdGetRequest().advertiserId(testId).imageIds(
      Arrays.asList(""));
    return oceanSdkService.getMaterialApi().fileImageAdGet().execute(request);
  }

  @GetMapping("/file/video/ad/get")
  public OceanResponse fileVideoAdGet() throws ApiException {
    FileVideoAdGetRequest request = new FileVideoAdGetRequest().advertiserId(testId).videoIds(
      Arrays.asList(""));
    return oceanSdkService.getMaterialApi().fileVideoAdGet().execute(request);
  }

  @GetMapping("/file/image/ad")
  public OceanResponse fileImageAd() throws ApiException {
    File imageFile = new File("");
    FileImageAdRequest request = new FileImageAdRequest().advertiserId(testId).filename("")
      .imageSignature(FileUtil.getFileMD5(imageFile)).imageFile(
        imageFile).uploadType("UPLOAD_BY_FILE");
    return oceanSdkService.getMaterialApi().fileImageAd().execute(request);
  }
}
