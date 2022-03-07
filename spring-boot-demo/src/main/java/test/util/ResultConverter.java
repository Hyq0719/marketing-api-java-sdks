package test.util;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.hyq0719.mktapi.tencent.bean.common.PageResponseData;
import com.hyq0719.mktapi.tencent.bean.common.TencentResponse;
import test.auth.bean.Result;

/**
 * @author hyq0719
 * @date 2022/3/7 3:50 下午
 */
public class ResultConverter {
  @SuppressWarnings("unchecked")
  public static <T> Result<PageResponseData<T>> parseTencentResult(String str, Class<T> clazz) {
    Gson gson = new Gson();
    TencentResponse<PageResponseData<T>> result = gson.fromJson(str, new TypeToken<TencentResponse<PageResponseData<T>>>() {
    }.getType());
    if (result.getCode() != 0) {
      return Result.ofFail(Math.toIntExact(result.getCode()), result.getMessage());
    }
    PageResponseData<T> responseData = result.getData();
    if (responseData == null || responseData.getList() == null
      || responseData.getPageInfo() == null) {
      return Result.ofFail("解析出错");
    }
    return Result.ofSuccessful(responseData);
  }
}
