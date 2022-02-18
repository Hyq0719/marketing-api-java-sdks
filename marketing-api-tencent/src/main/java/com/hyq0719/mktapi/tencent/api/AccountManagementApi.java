package com.hyq0719.mktapi.tencent.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.tencent.TencentApiRequest;
import com.hyq0719.mktapi.tencent.TencentDefaultFields;
import com.hyq0719.mktapi.tencent.bean.common.ConfigRequest;
import com.hyq0719.mktapi.tencent.bean.common.ConfigResponse;
import com.hyq0719.mktapi.tencent.bean.common.ListResponse;
import com.hyq0719.mktapi.tencent.bean.funds.FundsGetListStruct;
import com.hyq0719.mktapi.tencent.bean.wechat_funds.WechatFundsGetResponseData;

import java.util.List;

/**
 * 腾讯广告——账号管理api
 */
public class AccountManagementApi extends AbstractTencentApi {
  /**
   * 资金账户
   */
  private volatile FundsGet fundsGet;
  private volatile WechatFundsGet wechatFundsGet;

  public AccountManagementApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public FundsGet fundsGet() {
    if (fundsGet == null) {
      synchronized (FundsGet.class) {
        if (fundsGet == null) {
          fundsGet = (FundsGet) init(FundsGet.class);
        }
      }
    }
    return fundsGet;
  }

  public WechatFundsGet wechatFundsGet() {
    if (wechatFundsGet == null) {
      synchronized (WechatFundsGet.class) {
        if (wechatFundsGet == null) {
          wechatFundsGet = (WechatFundsGet) init(WechatFundsGet.class);
        }
      }
    }
    return wechatFundsGet;
  }

  @ApiRequestMapping(value = "/funds/get", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {
      RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class FundsGet extends TencentApiRequest<ConfigRequest, ConfigResponse<ListResponse<FundsGetListStruct>>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest configRequest) {
      Long accountId = configRequest.getAccountId();
      List<String> fields = configRequest.getFields();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_FUND_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }
  }

  @ApiRequestMapping(value = "/wechat_funds/get", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class WechatFundsGet extends TencentApiRequest<ConfigRequest, ConfigResponse<WechatFundsGetResponseData>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest configRequest) {
      Long accountId = configRequest.getAccountId();
      List<String> fields = configRequest.getFields();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_WECHAT_FUND_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }
  }
}
