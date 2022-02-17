package test.rest;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.tencent.TencentApiRequest;
import com.hyq0719.mktapi.tencent.bean.campaigns.CampaignsGetListStruct;
import com.hyq0719.mktapi.tencent.bean.common.ConfigRequest;
import com.hyq0719.mktapi.tencent.bean.common.ConfigResponse;
import com.hyq0719.mktapi.tencent.bean.common.PageResponseData;
import com.hyq0719.mktapi.tencent.bean.targetings.TargetingsGetListStruct;
import com.hyq0719.mktapi.tencent.service.TencentSdkService;
import com.hyq0719.mktapi.tencent.util.TencentDataPageFetcher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("tencent")
public class TencentApiTest {
  @Resource
  private TencentSdkService tencentSdkService;
  private long accountId = 0000000L;

  @GetMapping("/campaign/get")
  public List<CampaignsGetListStruct> test1() {
    return TencentDataPageFetcher.fetchData(tencentSdkService.getAdManagementApi().campaignsGet(),
            (apiResponse) -> System.out.println("api.count.tencent"),
            new ConfigRequest().fields(Arrays.asList("campaign_id", "campaign_name", "configured_status",
                    "campaign_type", "promoted_object_type", "daily_budget", "budget_reach_date",
                    "created_time", "last_modified_time", "speed_mode", "is_deleted"))
                    .accountId(accountId).page(1L).pageSize(500L));
  }

  @GetMapping("/targeting/get")
  public List<TargetingsGetListStruct> test2() {
    TencentApiRequest<ConfigRequest,
            ConfigResponse<PageResponseData<TargetingsGetListStruct>>>
            request = tencentSdkService.getAdManagementApi().targetingsGet();
    return TencentDataPageFetcher.fetchData(request, (apiResponse) -> System.out.println("api.count.tencent"),
            new ConfigRequest().accountId(accountId).page(1L).pageSize(500L)
                    .fields(Arrays.asList("targeting_id", "targeting_name", "targeting")));
  }

  @GetMapping("/fund/get")
  public ConfigResponse test3() throws ApiException {
    return tencentSdkService.getAccountManagementApi().fundsGet().execute(new ConfigRequest().accountId(accountId));
  }

}
