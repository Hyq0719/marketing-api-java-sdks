package com.hyq0719.mktapi.kuaishou.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.kuaishou.KshApiRequest;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserFundGetRequest;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserFundGetResponseStruct;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserInfoRequest;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserInfoResponseStruct;
import com.hyq0719.mktapi.kuaishou.bean.common.KshResponse;

public class AccountServiceApi extends AbstractKshApi {

  private volatile AdvertiserInfo advertiserInfo;
  private volatile AdvertiserFund advertiserFund;

  public AccountServiceApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public AdvertiserInfo advertiserInfo() {
    if (advertiserInfo == null) {
      synchronized (AdvertiserInfo.class) {
        if (advertiserInfo == null) {
          advertiserInfo = (AdvertiserInfo) init(AdvertiserInfo.class);
        }
      }
    }
    return advertiserInfo;
  }

  public AdvertiserFund advertiserFund() {
    if (advertiserFund == null) {
      synchronized (AdvertiserFund.class) {
        if (advertiserFund == null) {
          advertiserFund = (AdvertiserFund) init(AdvertiserFund.class);
        }
      }
    }
    return advertiserFund;
  }

  @ApiRequestMapping(value = "/advertiser/info", method = RequestConstants.POST)
  public class AdvertiserInfo
          extends KshApiRequest<AdvertiserInfoRequest, KshResponse<AdvertiserInfoResponseStruct>> {
  }

  @ApiRequestMapping(value = "/advertiser/fund/get", method = RequestConstants.POST)
  public class AdvertiserFund
          extends KshApiRequest<AdvertiserFundGetRequest, KshResponse<AdvertiserFundGetResponseStruct>> {
  }
}
