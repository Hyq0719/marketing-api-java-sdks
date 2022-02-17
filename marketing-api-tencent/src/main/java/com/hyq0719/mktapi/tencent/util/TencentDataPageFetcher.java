package com.hyq0719.mktapi.tencent.util;

import com.hyq0719.mktapi.common.advice.ApiRequestAdvice;
import com.hyq0719.mktapi.common.util.DataPageFetcher;
import com.hyq0719.mktapi.tencent.TencentApiRequest;
import com.hyq0719.mktapi.tencent.bean.IPage;
import com.hyq0719.mktapi.tencent.bean.common.ConfigResponse;
import com.hyq0719.mktapi.tencent.bean.common.PageResponseData;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class TencentDataPageFetcher implements DataPageFetcher {

  public static <R, T extends IPage> List<R> fetchData(
          TencentApiRequest<T, ConfigResponse<PageResponseData<R>>> handler,
          ApiRequestAdvice apiRequestAdvice, T request) {
    List<R> details = null;
    try {
      ConfigResponse<PageResponseData<R>> business = handler.execute(request, apiRequestAdvice);
      details = business.getData().getList();
      Long totalCount = business.getData().getPageInfo().getTotalNumber();
      Integer pageSize = request.currentPageSize();
      Long num = totalCount / pageSize + 1;
      while (num > 1) {
        request.exchangeCurrentPage(num.intValue());
        details.addAll(handler.execute(request, apiRequestAdvice).getData().getList());
        num--;
      }
    } catch (Exception e) {
      log.error(e.getMessage());
      e.printStackTrace();
    }
    return details;
  }
}
