package test.controller;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.tencent.TencentApiRequest;
import com.hyq0719.mktapi.tencent.bean.campaigns.CampaignsGetListStruct;
import com.hyq0719.mktapi.tencent.bean.common.PageResponseData;
import com.hyq0719.mktapi.tencent.bean.common.TencentRequest;
import com.hyq0719.mktapi.tencent.bean.common.TencentResponse;
import com.hyq0719.mktapi.tencent.bean.targetings.TargetingsGetListStruct;
import com.hyq0719.mktapi.tencent.service.TencentSdkService;
import com.hyq0719.mktapi.tencent.util.TencentDataPageFetcher;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("tencent")
@Api(tags = "腾讯广告")
public class TencentApiTest {
  private final long accountId = 0000000L;
  @Resource
  private TencentSdkService tencentSdkService;

  @GetMapping("/campaign/get")
  public List<CampaignsGetListStruct> campaignsGet() {
    return TencentDataPageFetcher.fetchData(tencentSdkService.getAdManagementApi().campaignsGet(),
      (apiResponse) -> System.out.println("api.count.tencent"),
      new TencentRequest().fields(Arrays.asList("campaign_id", "campaign_name", "configured_status",
        "campaign_type", "promoted_object_type", "daily_budget", "budget_reach_date",
        "created_time", "last_modified_time", "speed_mode", "is_deleted"))
        .accountId(accountId).page(1L).pageSize(500L), null);
  }

  @GetMapping("/targeting/get")
  public List<TargetingsGetListStruct> targetingsGet() {
    TencentApiRequest<TencentRequest,
      TencentResponse<PageResponseData<TargetingsGetListStruct>>>
      request = tencentSdkService.getAdManagementApi().targetingsGet();
    return TencentDataPageFetcher.fetchData(request, (apiResponse) -> System.out.println("api.count.tencent"),
      new TencentRequest().accountId(accountId).page(1L).pageSize(500L)
        .fields(Arrays.asList("targeting_id", "targeting_name", "targeting")), null);
  }

  @GetMapping("/fund/get")
  public TencentResponse fundsGet() throws ApiException {
    return tencentSdkService.getAccountManagementApi().fundsGet().execute(new TencentRequest().accountId(accountId));
  }

}
