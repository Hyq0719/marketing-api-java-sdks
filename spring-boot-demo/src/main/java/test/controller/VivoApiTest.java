package test.controller;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.vivo.bean.common.VivoResponse;
import com.hyq0719.mktapi.vivo.bean.dataQuery.AdstatementSummaryQueryItemsStruct;
import com.hyq0719.mktapi.vivo.bean.dataQuery.AdstatementSummaryQueryRequest;
import com.hyq0719.mktapi.vivo.bean.dataQuery.AdstatementSummaryQueryResponseData;
import com.hyq0719.mktapi.vivo.bean.promotionService.*;
import com.hyq0719.mktapi.vivo.service.VivoSdkService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("vivo")
@Api(tags = "VIVO")
public class VivoApiTest {
  private final String advertiserId = "00000000";
  @Resource
  private VivoSdkService vivoSdkService;

  @GetMapping("/adstatement/summary/query/fetch")
  public List<AdstatementSummaryQueryItemsStruct> adstatementSummaryQuery() {
    List<AdstatementSummaryQueryItemsStruct> details = null;
    AdstatementSummaryQueryRequest request = new AdstatementSummaryQueryRequest()
      .advertiserId(advertiserId).summaryType("Hour").startDate("20211014").endDate("20211014")
      .pageSize(100);
    try {
      AdstatementSummaryQueryResponseData data = vivoSdkService.getDataQueryApi().adstatementSummaryQuery()
        .execute(request).getData();
      details = data.getItems();
      String lastId = data.getLastId();
      while (null != lastId) {
        request = request.lastId(lastId);
        data = vivoSdkService.getDataQueryApi().adstatementSummaryQuery().execute(request).getData();
        if (data.getItems() == null) {
          break;
        }
        details.addAll(data.getItems());
        lastId = data.getLastId();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return details;
  }

  @GetMapping("/ad/creative/pageInfo")
  public VivoResponse adCreativePageInfo() throws ApiException {
    AdCreativePageInfoRequest request = new AdCreativePageInfoRequest().advertiserId(advertiserId).pageSize(100);
    return vivoSdkService.getPromotionServiceApi().adCreativePageInfo().execute(request);
  }

  @GetMapping("/ad/creative/pageInfoByLastId")
  public VivoResponse adCreativePageInfoByLastId() throws ApiException {
    AdCreativePageInfoByLastIdRequest request = new AdCreativePageInfoByLastIdRequest().advertiserId(advertiserId)
      .lastId(0L).pageSize(100);
    return vivoSdkService.getPromotionServiceApi().adCreativePageInfoByLastId().execute(request);
  }

  @GetMapping("/ad/dmpTag/getNewBaseTags")
  public VivoResponse adDmpTagGetNewBaseTags() throws ApiException {
    AdDmpTagGetNewBaseTagsRequest request = new AdDmpTagGetNewBaseTagsRequest().advertiserId(advertiserId);
    return vivoSdkService.getPromotionServiceApi().adDmpTagGetNewBaseTags().execute(request);
  }

  @GetMapping("/ad/dmpTag/getCrowds")
  public VivoResponse adDmpTagGetCrowds() throws ApiException {
    AdDmpTagGetCrowdsRequest request = new AdDmpTagGetCrowdsRequest().advertiserId(advertiserId).mediaType(0);
    return vivoSdkService.getPromotionServiceApi().adDmpTagGetCrowds().execute(request);
  }

  @GetMapping("/ad/dmpTag/getAdvertiserTags")
  public VivoResponse adDmpTagGetAdvertiserTags() throws ApiException {
    AdDmpTagGetAdvertiserTagsRequest request = new AdDmpTagGetAdvertiserTagsRequest().advertiserId(advertiserId);
    return vivoSdkService.getPromotionServiceApi().adDmpTagGetAdvertiserTags().execute(request);
  }
}
