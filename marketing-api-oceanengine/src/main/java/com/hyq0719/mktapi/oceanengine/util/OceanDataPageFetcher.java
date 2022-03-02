package com.hyq0719.mktapi.oceanengine.util;

import com.hyq0719.mktapi.common.advice.ApiRequestAdvice;
import com.hyq0719.mktapi.common.util.DataPageFetcher;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;
import com.hyq0719.mktapi.oceanengine.bean.IPage;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.common.PageResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
public class OceanDataPageFetcher implements DataPageFetcher {

  /**
   * 批量执行请求
   *
   * @param handler          执行请求
   * @param apiRequestAdvice 请求增强
   * @param request          请求
   * @param token            access token，若为空值则查询缓存
   * @param <R>              响应类
   * @param <T>              请求类
   * @return 响应列表
   */
  public static <R, T extends IPage> List<R> fetchData(OceanApiRequest<T, OceanResponse<PageResponseData<R>>> handler,
                                                       ApiRequestAdvice apiRequestAdvice, T request, String token) {
    List<R> details = new ArrayList<>();
    try {
      OceanResponse<PageResponseData<R>> response = handler.execute(request, apiRequestAdvice, token);
      if (!response.isSuccessful()) {
        return details;
      }
      PageResponseData<R> data = response.getData();
      if (Objects.isNull(data)) {
        return details;
      }
      details = response.getData().getList();
      Long num = response.getData().getPageInfo().getTotalPage();
      while (num > 1) {
        request.exchangeCurrentPage(num.intValue());
        response = handler.execute(request, apiRequestAdvice);
        if (!response.isSuccessful()) {
          break;
        }
        data = response.getData();
        if (Objects.isNull(data)) {
          return details;
        }
        List<R> list = response.getData().getList();
        if (CollectionUtils.isEmpty(list)) {
          break;
        }
        details.addAll(list);
        num--;
      }
    } catch (Exception e) {
      log.error(e.getMessage());
      e.printStackTrace();
    }
    return details;
  }

}
