package test.auth.oceanengine;

import com.hyq0719.mktapi.oceanengine.bean.advertiser.MajordomoAdvertiserSelectStruct;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanRequest;
import com.hyq0719.mktapi.oceanengine.service.OceanSdkService;
import com.hyq0719.mktapi.oceanengine.util.OceanDataPageFetcher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 巨量引擎账号服务
 *
 * @author hyq0719
 * @date 2022/3/2 5:50 下午
 */
@Service
public class OceanAccountService {
  @Resource
  private OceanSdkService oceanSdkService;

  /**
   * @param advertiserId 广告主账号
   * @param accessToken  access token
   * @return 子账号集合
   */
  public List<String> getOceanSubAccounts(String advertiserId, String accessToken) {
    List<MajordomoAdvertiserSelectStruct> data = OceanDataPageFetcher.fetchData(
      oceanSdkService.getAccountServiceApi().majordomoAdvertiserSelect(),
      apiResponse -> {}, new OceanRequest().advertiserId(Long.valueOf(advertiserId)), accessToken);
    return data.stream().map(x -> String.valueOf(x.getAdvertiserId())).collect(Collectors.toList());
  }
}
