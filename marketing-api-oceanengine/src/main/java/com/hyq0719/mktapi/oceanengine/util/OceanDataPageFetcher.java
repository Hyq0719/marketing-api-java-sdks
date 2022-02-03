package com.hyq0719.mktapi.oceanengine.util;

import com.hyq0719.mktapi.common.advice.ApiRequestAdvice;
import com.hyq0719.mktapi.common.util.DataPageFetcher;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;
import com.hyq0719.mktapi.oceanengine.bean.IPage;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.common.PageResponseData;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class OceanDataPageFetcher implements DataPageFetcher {

  public static <R, T extends IPage> List<R> fetchData(OceanApiRequest<T, OceanResponse<PageResponseData<R>>> handler,
                                                       ApiRequestAdvice apiRequestAdvice, T request) {
    List<R> details = null;
    try {
      OceanResponse<PageResponseData<R>> business = handler.execute(request, apiRequestAdvice);
      details = business.getData().getList();
      Long num = business.getData().getPageInfo().getTotalPage();
      while (num > 1) {
        request.exchangeCurrentPage(num.intValue());
        business = handler.execute(request, apiRequestAdvice);
        details.addAll(business.getData().getList());
        num--;
      }
    } catch (Exception e) {
      log.error(e.getMessage());
      e.printStackTrace();
    }
    return details;
  }

}
