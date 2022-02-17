package test.rest;

import com.hyq0719.mktapi.vivo.bean.dataQuery.AdstatementSummaryQueryItemsStruct;
import com.hyq0719.mktapi.vivo.bean.dataQuery.AdstatementSummaryQueryRequest;
import com.hyq0719.mktapi.vivo.bean.dataQuery.AdstatementSummaryQueryResponseData;
import com.hyq0719.mktapi.vivo.service.VivoSdkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("vivo")
public class VivoApiTest {
  @Resource
  private VivoSdkService vivoSdkService;
  private String advertiserId = "00000000";

  @GetMapping("/summary/query/fetch")
  public List<AdstatementSummaryQueryItemsStruct> test1() {
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
}
