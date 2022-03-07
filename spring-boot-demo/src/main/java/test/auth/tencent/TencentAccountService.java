package test.auth.tencent;

import com.hyq0719.mktapi.common.util.DigestUtil;
import com.hyq0719.mktapi.tencent.bean.account.adAccount.BusinessManagerRelationsGetListStruct;
import com.hyq0719.mktapi.tencent.bean.common.PageResponseData;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import test.auth.bean.Result;
import test.util.ResultConverter;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author hyq0719
 * @date 2022/3/7 12:08 下午
 */
@Service
public class TencentAccountService {
  @Resource
  OkHttpClient httpClient;

  /**
   * @param accessToken access token
   * @return 子账号集合
   */
  public List<String> getSubAccounts(String accessToken) {
    Result<PageResponseData<BusinessManagerRelationsGetListStruct>> result =
      businessManagerRelationsGet(accessToken, 1, 100);
    if (!result.successful()) {
      return new ArrayList<>();
    }
    Long totalPage = result.data().getPageInfo().getTotalPage();
    List<BusinessManagerRelationsGetListStruct> pageList = result.data().getList();
    List<BusinessManagerRelationsGetListStruct> total = new ArrayList<>(pageList);
    for (int i = 2; i < totalPage.intValue(); i++) {
      result = businessManagerRelationsGet(accessToken, i, 100);
      pageList = result.data().getList();
      total.addAll(pageList);
    }
    return total.stream().map(x -> String.valueOf(x.getAccountId())).collect(Collectors.toList());
  }

  public Result<PageResponseData<BusinessManagerRelationsGetListStruct>> businessManagerRelationsGet
    (String accessToken, int page, int pageSize) {
    String url = String.format("https://api.e.qq.com/v1.3/business_manager_relations/get?access_token=%s" +
        "&timestamp=%s&nonce=%s",
      accessToken, System.currentTimeMillis() / 1000, DigestUtil.encrypt(UUID.randomUUID().toString()));
    HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(url)).newBuilder();
    urlBuilder.addQueryParameter("page", "" + page);
    urlBuilder.addQueryParameter("page_size", "" + pageSize);

    Request request = new Request.Builder().url(urlBuilder.build()).get().build();
//        OkHttpClient httpsClient = gethttpClient();
    try (Response response = httpClient.newCall(request).execute()) {
      if (!response.isSuccessful()) {
        return Result.ofFail(response.code(), response.message());
      }
      String strResult = Objects.requireNonNull(response.body()).string();
      return ResultConverter.parseTencentResult(strResult, BusinessManagerRelationsGetListStruct.class);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return Result.ofFail();
  }
}
