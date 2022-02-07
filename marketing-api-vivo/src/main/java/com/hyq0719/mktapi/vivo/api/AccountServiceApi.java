package com.hyq0719.mktapi.vivo.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.vivo.VivoApiRequest;
import com.hyq0719.mktapi.vivo.bean.acoountService.*;
import com.hyq0719.mktapi.vivo.bean.common.VivoResponse;

import java.util.List;

public class AccountServiceApi extends AbstractVivoApi {
  private volatile AccountFetch accountFetch;
  private volatile AccountFetchAccount accountFetchAccount;
  private volatile AccountAdvertiserQuery accountAdvertiserQuery;
  private volatile AccountBalanceQuery accountBalanceQuery;
  private volatile FinanceUpdateDailyBudget financeUpdateDailyBudget;
  private volatile FinanceFundsQueryFounds financeFundsQueryFounds;
  private volatile FinanceTransferQueryTransfers financeTransferQueryTransfers;

  public AccountServiceApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public AccountFetch accountFetch() {
    if (accountFetch == null) {
      synchronized (AccountFetch.class) {
        if (accountFetch == null) {
          accountFetch = (AccountFetch) init(AccountFetch.class);
        }
      }
    }
    return accountFetch;
  }

  public AccountFetchAccount accountFetchAccount() {
    if (accountFetchAccount == null) {
      synchronized (AccountFetchAccount.class) {
        if (accountFetchAccount == null) {
          accountFetchAccount = (AccountFetchAccount) init(AccountFetchAccount.class);
        }
      }
    }
    return accountFetchAccount;
  }

  public AccountAdvertiserQuery accountAdvertiserQuery() {
    if (accountAdvertiserQuery == null) {
      synchronized (AccountAdvertiserQuery.class) {
        if (accountAdvertiserQuery == null) {
          accountAdvertiserQuery = (AccountAdvertiserQuery) init(AccountAdvertiserQuery.class);
        }
      }
    }
    return accountAdvertiserQuery;
  }

  public AccountBalanceQuery accountBalanceQuery() {
    if (accountBalanceQuery == null) {
      synchronized (AccountBalanceQuery.class) {
        if (accountBalanceQuery == null) {
          accountBalanceQuery = (AccountBalanceQuery) init(AccountBalanceQuery.class);
        }
      }
    }
    return accountBalanceQuery;
  }

  public FinanceUpdateDailyBudget financeUpdateDailyBudget() {
    if (financeUpdateDailyBudget == null) {
      synchronized (FinanceUpdateDailyBudget.class) {
        if (financeUpdateDailyBudget == null) {
          financeUpdateDailyBudget = (FinanceUpdateDailyBudget) init(FinanceUpdateDailyBudget.class);
        }
      }
    }
    return financeUpdateDailyBudget;
  }

  public FinanceFundsQueryFounds financeFundsQueryFounds() {
    if (financeFundsQueryFounds == null) {
      synchronized (FinanceFundsQueryFounds.class) {
        if (financeFundsQueryFounds == null) {
          financeFundsQueryFounds = (FinanceFundsQueryFounds) init(FinanceFundsQueryFounds.class);
        }
      }
    }
    return financeFundsQueryFounds;
  }

  public FinanceTransferQueryTransfers financeTransferQueryTransfers() {
    if (financeTransferQueryTransfers == null) {
      synchronized (FinanceTransferQueryTransfers.class) {
        if (financeTransferQueryTransfers == null) {
          financeTransferQueryTransfers = (FinanceTransferQueryTransfers) init(FinanceTransferQueryTransfers.class);
        }
      }
    }
    return financeTransferQueryTransfers;
  }

  @ApiRequestMapping(value = "/account/fetch", method = RequestConstants.GET, usePostBody =
          false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AccountFetch extends VivoApiRequest<AccountFetchRequest, VivoResponse<AccountFetchResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AccountFetchRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/account/fetch/account", method = RequestConstants.GET, usePostBody =
          false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AccountFetchAccount extends VivoApiRequest<AccountFetchAccountRequest,
          VivoResponse<AccountFetchAccountResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AccountFetchAccountRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/account/advertiser/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AccountAdvertiserQuery extends VivoApiRequest<AccountAdvertiserQueryRequest,
          VivoResponse<AccountAdvertiserQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AccountAdvertiserQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/account/balance/query", method = RequestConstants.GET, usePostBody =
          false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AccountBalanceQuery extends VivoApiRequest<AccountBalanceQueryRequest,
          VivoResponse<AccountBalanceQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AccountBalanceQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/finance/update/dailyBudget", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class FinanceUpdateDailyBudget extends VivoApiRequest<FinanceUpdateDailyBudgetRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                FinanceUpdateDailyBudgetRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/finance/transfer/queryTransfers", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class FinanceFundsQueryFounds extends VivoApiRequest<FinanceFundsQueryFoundsRequest,
          VivoResponse<FinanceFundsQueryFoundsResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                FinanceFundsQueryFoundsRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/finance/transfer/queryTransfers", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class FinanceTransferQueryTransfers extends VivoApiRequest<FinanceTransferQueryTransfersRequest,
          VivoResponse<FinanceTransferQueryTransfersResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                FinanceTransferQueryTransfersRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }
}
