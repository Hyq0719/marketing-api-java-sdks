package com.hyq0719.mktapi.kuaishou.util;

import com.hyq0719.mktapi.common.advice.ApiRequestAdvice;
import com.hyq0719.mktapi.common.util.DataPageFetcher;
import com.hyq0719.mktapi.kuaishou.KshApiRequest;
import com.hyq0719.mktapi.kuaishou.bean.IPage;
import com.hyq0719.mktapi.kuaishou.bean.common.KshResponse;
import com.hyq0719.mktapi.kuaishou.bean.common.PageResponseData;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class KshDataPageFetcher implements DataPageFetcher {

  public static <R, T extends IPage> List<R> fetchData(KshApiRequest<T, KshResponse<PageResponseData<R>>> handler,
                                                       ApiRequestAdvice apiRequestAdvice, T request) {
    List<R> details = null;
    try {
      KshResponse<PageResponseData<R>> business = handler.execute(request, apiRequestAdvice);
      details = business.getData().getDetails();
      Long totalCount = business.getData().getTotalCount();
      Integer pageSize = request.currentPageSize();
      Long num = totalCount / pageSize + 1;
      while (num > 1) {
        request.exchangeCurrentPage(num.intValue());
        details.addAll(handler.execute(request, apiRequestAdvice).getData().getDetails());
        num--;
      }
    } catch (Exception e) {
      log.error(e.getMessage());
      e.printStackTrace();
    }
    return details;
  }
}
