package test.rest;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.oceanengine.bean.common.ConfigRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.material.FileImageAdGetRequest;
import com.hyq0719.mktapi.oceanengine.bean.material.FileImageAdRequest;
import com.hyq0719.mktapi.oceanengine.bean.material.FileVideoAdGetRequest;
import com.hyq0719.mktapi.oceanengine.bean.material.ToolsVideoCoverSuggestRequest;
import com.hyq0719.mktapi.oceanengine.bean.report.ReportAdvertiserGetRequest;
import com.hyq0719.mktapi.oceanengine.service.OceanSdkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.util.FileUtil;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@RestController
@RequestMapping("ocean")
public class OceanEngineApiTest {

  @Resource
  private OceanSdkService oceanSdkService;
  private Long advertiserId = 00000000L;
  private Long testId = 00000000L;

  @GetMapping("/report/advertiser/get")
  public OceanResponse test5() throws ApiException {
    ReportAdvertiserGetRequest cr = new ReportAdvertiserGetRequest().advertiserId(advertiserId).startDate(
            "2021-12-10").endDate("2021-12-10");
    return oceanSdkService.getDataReportApi().reportAdvertiserGet().execute(cr);
  }

  @GetMapping("/campaign/get")
  public OceanResponse test7() throws ApiException {
    ConfigRequest request = new ConfigRequest().advertiserId(advertiserId).page(1L).pageSize(100L);
    return oceanSdkService.getAdServingApi().campaignGet().execute(request);
  }

  @GetMapping("/file/image/get")
  public OceanResponse test10() throws ApiException {
    ConfigRequest request = new ConfigRequest().advertiserId(testId).page(1L).pageSize(100L);
    return oceanSdkService.getMaterialApi().fileImageGet().execute(request);
  }

  @GetMapping("/file/video/get")
  public OceanResponse test11() throws ApiException {
    ConfigRequest request = new ConfigRequest().advertiserId(testId).page(1L).pageSize(100L);
    return oceanSdkService.getMaterialApi().fileVideoGet().execute(request);
  }

  @GetMapping("/tools/video_cover/suggest")
  public OceanResponse test12() throws ApiException {
    ToolsVideoCoverSuggestRequest request = new ToolsVideoCoverSuggestRequest().advertiserId(advertiserId).videoId("");
    return oceanSdkService.getMaterialApi().toolsVideoCoverSuggest().execute(request);
  }

  @GetMapping("/file/image/ad/get")
  public OceanResponse test13() throws ApiException {
    FileImageAdGetRequest request = new FileImageAdGetRequest().advertiserId(testId).imageIds(
            Arrays.asList(""));
    return oceanSdkService.getMaterialApi().fileImageAdGet().execute(request);
  }

  @GetMapping("/file/video/ad/get")
  public OceanResponse test14() throws ApiException {
    FileVideoAdGetRequest request = new FileVideoAdGetRequest().advertiserId(testId).videoIds(
            Arrays.asList(""));
    return oceanSdkService.getMaterialApi().fileVideoAdGet().execute(request);
  }

  @GetMapping("/file/image/ad")
  public OceanResponse test15() throws ApiException {
    File imageFile = new File("");
    FileImageAdRequest request = new FileImageAdRequest().advertiserId(testId).filename("")
            .imageSignature(FileUtil.getFileMD5(imageFile)).imageFile(
            imageFile).uploadType("UPLOAD_BY_FILE");
    return oceanSdkService.getMaterialApi().fileImageAd().execute(request);
  }
}
