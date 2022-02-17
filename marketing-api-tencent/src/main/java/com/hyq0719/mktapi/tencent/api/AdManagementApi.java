package com.hyq0719.mktapi.tencent.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.tencent.TencentApiRequest;
import com.hyq0719.mktapi.tencent.TencentDefaultFields;
import com.hyq0719.mktapi.tencent.bean.adcreatives.*;
import com.hyq0719.mktapi.tencent.bean.adgroups.*;
import com.hyq0719.mktapi.tencent.bean.ads.*;
import com.hyq0719.mktapi.tencent.bean.advertiser.AdvertiserUpdateDailyBudgetRequest;
import com.hyq0719.mktapi.tencent.bean.advertiser.AdvertiserUpdateDailyBudgetResponseData;
import com.hyq0719.mktapi.tencent.bean.campaigns.*;
import com.hyq0719.mktapi.tencent.bean.common.ConfigRequest;
import com.hyq0719.mktapi.tencent.bean.common.ConfigResponse;
import com.hyq0719.mktapi.tencent.bean.common.FilteringStruct;
import com.hyq0719.mktapi.tencent.bean.common.PageResponseData;
import com.hyq0719.mktapi.tencent.bean.targetings.TargetingsGetListStruct;

import java.util.List;

/**
 * 腾讯广告——广告管理api
 */
public class AdManagementApi extends AbstractTencentApi {
  /**
   * 推广计划
   */
  private volatile CampaignsGet campaignsGet;
  private volatile CampaignsAdd campaignsAdd;
  private volatile CampaignsUpdate campaignsUpdate;
  private volatile CampaignsDelete campaignsDelete;
  /**
   * 广告组
   */
  private volatile AdgroupsGet adgroupsGet;
  private volatile AdgroupsAdd adgroupsAdd;
  private volatile AdgroupsUpdate adgroupsUpdate;
  private volatile AdgroupsDelete adgroupsDelete;
  /**
   * 广告创意
   */
  private volatile AdcreativesGet adcreativesGet;
  private volatile AdcreativesAdd adcreativesAdd;
  private volatile AdcreativesUpdate adcreativesUpdate;
  private volatile AdcreativesDelete adcreativesDelete;
  /**
   * 广告
   */
  private volatile AdsGet adsGet;
  private volatile AdsAdd adsAdd;
  private volatile AdsUpdate adsUpdate;
  private volatile AdsDelete adsDelete;
  /**
   * 定向
   */
  private volatile TargetingsGet targetingsGet;
  /**
   * 批量操作
   */
  private volatile AdvertiserUpdateDailyBudget advertiserUpdateDailyBudget;
  private volatile CampaignsUpdateDailyBudget campaignsUpdateDailyBudget;
  private volatile AdgroupsUpdateDailyBudget adgroupsUpdateDailyBudget;
  private volatile CampaignsUpdateConfiguredStatus campaignsUpdateConfiguredStatus;
  private volatile AdgroupsUpdateConfiguredStatus adgroupsUpdateConfiguredStatus;
  private volatile AdsUpdateConfiguredStatus adsUpdateConfiguredStatus;
  private volatile AdgroupsUpdateDatetime adgroupsUpdateDatetime;
  private volatile AdgroupsUpdateBidAmount adgroupsUpdateBidAmount;

  public AdManagementApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public CampaignsGet campaignsGet() {
    if (campaignsGet == null) {
      synchronized (CampaignsGet.class) {
        if (campaignsGet == null) {
          campaignsGet = (CampaignsGet) init(CampaignsGet.class);
        }
      }
    }
    return campaignsGet;
  }

  public CampaignsAdd campaignsAdd() {
    if (campaignsAdd == null) {
      synchronized (CampaignsAdd.class) {
        if (campaignsAdd == null) {
          campaignsAdd = (CampaignsAdd) init(CampaignsAdd.class);
        }
      }
    }
    return campaignsAdd;
  }

  public CampaignsUpdate campaignsUpdate() {
    if (campaignsUpdate == null) {
      synchronized (CampaignsUpdate.class) {
        if (campaignsUpdate == null) {
          campaignsUpdate = (CampaignsUpdate) init(CampaignsUpdate.class);
        }
      }
    }
    return campaignsUpdate;
  }

  public CampaignsDelete campaignsDelete() {
    if (campaignsDelete == null) {
      synchronized (CampaignsDelete.class) {
        if (campaignsDelete == null) {
          campaignsDelete = (CampaignsDelete) init(CampaignsDelete.class);
        }
      }
    }
    return campaignsDelete;
  }

  public AdgroupsGet adgroupsGet() {
    if (adgroupsGet == null) {
      synchronized (AdgroupsGet.class) {
        if (adgroupsGet == null) {
          adgroupsGet = (AdgroupsGet) init(AdgroupsGet.class);
        }
      }
    }
    return adgroupsGet;
  }

  public AdgroupsAdd adgroupsAdd() {
    if (adgroupsAdd == null) {
      synchronized (AdgroupsAdd.class) {
        if (adgroupsAdd == null) {
          adgroupsAdd = (AdgroupsAdd) init(AdgroupsAdd.class);
        }
      }
    }
    return adgroupsAdd;
  }

  public AdgroupsUpdate adgroupsUpdate() {
    if (adgroupsUpdate == null) {
      synchronized (AdgroupsUpdate.class) {
        if (adgroupsUpdate == null) {
          adgroupsUpdate = (AdgroupsUpdate) init(AdgroupsUpdate.class);
        }
      }
    }
    return adgroupsUpdate;
  }

  public AdgroupsDelete adgroupsDelete() {
    if (adgroupsDelete == null) {
      synchronized (AdgroupsDelete.class) {
        if (adgroupsDelete == null) {
          adgroupsDelete = (AdgroupsDelete) init(AdgroupsDelete.class);
        }
      }
    }
    return adgroupsDelete;
  }

  public AdcreativesGet adcreativesGet() {
    if (adcreativesGet == null) {
      synchronized (AdcreativesGet.class) {
        if (adcreativesGet == null) {
          adcreativesGet = (AdcreativesGet) init(AdcreativesGet.class);
        }
      }
    }
    return adcreativesGet;
  }

  public AdcreativesAdd adcreativesAdd() {
    if (adcreativesAdd == null) {
      synchronized (AdcreativesAdd.class) {
        if (adcreativesAdd == null) {
          adcreativesAdd = (AdcreativesAdd) init(AdcreativesAdd.class);
        }
      }
    }
    return adcreativesAdd;
  }

  public AdcreativesUpdate adcreativesUpdate() {
    if (adcreativesUpdate == null) {
      synchronized (AdcreativesUpdate.class) {
        if (adcreativesUpdate == null) {
          adcreativesUpdate = (AdcreativesUpdate) init(AdcreativesUpdate.class);
        }
      }
    }
    return adcreativesUpdate;
  }

  public AdcreativesDelete adcreativesDelete() {
    if (adcreativesDelete == null) {
      synchronized (AdcreativesDelete.class) {
        if (adcreativesDelete == null) {
          adcreativesDelete = (AdcreativesDelete) init(AdcreativesDelete.class);
        }
      }
    }
    return adcreativesDelete;
  }

  public AdsGet adsGet() {
    if (adsGet == null) {
      synchronized (AdsGet.class) {
        if (adsGet == null) {
          adsGet = (AdsGet) init(AdsGet.class);
        }
      }
    }
    return adsGet;
  }

  public AdsAdd adsAdd() {
    if (adsAdd == null) {
      synchronized (AdsAdd.class) {
        if (adsAdd == null) {
          adsAdd = (AdsAdd) init(AdsAdd.class);
        }
      }
    }
    return adsAdd;
  }

  public AdsUpdate adsUpdate() {
    if (adsUpdate == null) {
      synchronized (AdsAdd.class) {
        if (adsUpdate == null) {
          adsUpdate = (AdsUpdate) init(AdsUpdate.class);
        }
      }
    }
    return adsUpdate;
  }

  public AdsDelete adsDelete() {
    if (adsDelete == null) {
      synchronized (AdsDelete.class) {
        if (adsDelete == null) {
          adsDelete = (AdsDelete) init(AdsDelete.class);
        }
      }
    }
    return adsDelete;
  }

  public TargetingsGet targetingsGet() {
    if (targetingsGet == null) {
      synchronized (TargetingsGet.class) {
        if (targetingsGet == null) {
          targetingsGet = (TargetingsGet) init(TargetingsGet.class);
        }
      }
    }
    return targetingsGet;
  }

  public AdvertiserUpdateDailyBudget advertiserUpdateDailyBudget() {
    if (advertiserUpdateDailyBudget == null) {
      synchronized (AdvertiserUpdateDailyBudget.class) {
        if (advertiserUpdateDailyBudget == null) {
          advertiserUpdateDailyBudget = (AdvertiserUpdateDailyBudget) init(AdvertiserUpdateDailyBudget.class);
        }
      }
    }
    return advertiserUpdateDailyBudget;
  }

  public CampaignsUpdateDailyBudget campaignsUpdateDailyBudget() {
    if (campaignsUpdateDailyBudget == null) {
      synchronized (CampaignsUpdateDailyBudget.class) {
        if (campaignsUpdateDailyBudget == null) {
          campaignsUpdateDailyBudget = (CampaignsUpdateDailyBudget) init(CampaignsUpdateDailyBudget.class);
        }
      }
    }
    return campaignsUpdateDailyBudget;
  }

  public AdgroupsUpdateDailyBudget adgroupsUpdateDailyBudget() {
    if (adgroupsUpdateDailyBudget == null) {
      synchronized (AdgroupsUpdateDailyBudget.class) {
        if (adgroupsUpdateDailyBudget == null) {
          adgroupsUpdateDailyBudget = (AdgroupsUpdateDailyBudget) init(AdgroupsUpdateDailyBudget.class);
        }
      }
    }
    return adgroupsUpdateDailyBudget;
  }

  public CampaignsUpdateConfiguredStatus campaignsUpdateConfiguredStatus() {
    if (campaignsUpdateConfiguredStatus == null) {
      synchronized (CampaignsUpdateConfiguredStatus.class) {
        if (campaignsUpdateConfiguredStatus == null) {
          campaignsUpdateConfiguredStatus = (CampaignsUpdateConfiguredStatus) init(
                  CampaignsUpdateConfiguredStatus.class);
        }
      }
    }
    return campaignsUpdateConfiguredStatus;
  }

  public AdgroupsUpdateConfiguredStatus adgroupsUpdateConfiguredStatus() {
    if (adgroupsUpdateConfiguredStatus == null) {
      synchronized (AdgroupsUpdateConfiguredStatus.class) {
        if (adgroupsUpdateConfiguredStatus == null) {
          adgroupsUpdateConfiguredStatus = (AdgroupsUpdateConfiguredStatus) init(
                  AdgroupsUpdateConfiguredStatus.class);
        }
      }
    }
    return adgroupsUpdateConfiguredStatus;
  }

  public AdgroupsUpdateBidAmount adgroupsUpdateBidAmount() {
    if (adgroupsUpdateBidAmount == null) {
      synchronized (AdgroupsUpdateBidAmount.class) {
        if (adgroupsUpdateBidAmount == null) {
          adgroupsUpdateBidAmount = (AdgroupsUpdateBidAmount) init(AdgroupsUpdateBidAmount.class);
        }
      }
    }
    return adgroupsUpdateBidAmount;
  }

  public AdsUpdateConfiguredStatus adsUpdateConfiguredStatus() {
    if (adsUpdateConfiguredStatus == null) {
      synchronized (AdsUpdateConfiguredStatus.class) {
        if (adsUpdateConfiguredStatus == null) {
          adsUpdateConfiguredStatus = (AdsUpdateConfiguredStatus) init(AdsUpdateConfiguredStatus.class);
        }
      }
    }
    return adsUpdateConfiguredStatus;
  }

  public AdgroupsUpdateDatetime adgroupsUpdateDatetime() {
    if (adgroupsUpdateDatetime == null) {
      synchronized (AdgroupsUpdateDatetime.class) {
        if (adgroupsUpdateDatetime == null) {
          adgroupsUpdateDatetime = (AdgroupsUpdateDatetime) init(AdgroupsUpdateDatetime.class);
        }
      }
    }
    return adgroupsUpdateDatetime;
  }

  @ApiRequestMapping(value = "/campaigns/get", method = RequestConstants.GET, usePostBody = false,
          contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN}, version = "v1.3")
  public class CampaignsGet
          extends TencentApiRequest<ConfigRequest, ConfigResponse<PageResponseData<CampaignsGetListStruct>>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest configRequest) {
      Long accountId = configRequest.getAccountId();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      List<FilteringStruct> filtering = configRequest.getFiltering();
      if (filtering != null) {
        localVarCollectionQueryParams.addAll(
                parameterToPairs(MULTI, FILTERING, filtering));
      }
      Long page = configRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = configRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      Boolean isDeleted = configRequest.getDeleted();
      if (isDeleted != null) {
        localVarQueryParams.addAll(parameterToPair(IS_DELETED, isDeleted));
      }
      List<String> fields = configRequest.getFields();
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_CAMPAIGN_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }

    @Override
    public void paramValidate(ConfigRequest configRequest) throws ApiException {
      Long accountId = configRequest.getAccountId();
      if (accountId == null) {
        throw new ApiException("Missing the required parameter 'accountId' when calling campaignsGet(Async)");
      }
    }
  }

  @ApiRequestMapping(value = "/campaigns/add", method = RequestConstants.POST)
  public class CampaignsAdd extends TencentApiRequest<CampaignsAddRequest, ConfigResponse<CampaignsAddResponseData>> {
  }

  @ApiRequestMapping(value = "/campaigns/update", method = RequestConstants.POST)
  public class CampaignsUpdate
          extends TencentApiRequest<CampaignsUpdateRequest, ConfigResponse<CampaignsUpdateResponseData>> {
  }

  @ApiRequestMapping(value = "/campaigns/delete", method = RequestConstants.POST)
  public class CampaignsDelete
          extends TencentApiRequest<CampaignsDeleteRequest, ConfigResponse<CampaignsDeleteResponseData>> {
  }

  @ApiRequestMapping(value = "/adgroups/get", method = RequestConstants.GET, usePostBody = false,
          contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  private class AdgroupsGet
          extends TencentApiRequest<ConfigRequest, ConfigResponse<PageResponseData<AdgroupsGetListStruct>>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest configRequest) {
      Long accountId = configRequest.getAccountId();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      List<FilteringStruct> filtering = configRequest.getFiltering();
      if (filtering != null) {
        localVarCollectionQueryParams.addAll(
                parameterToPairs(MULTI, FILTERING, filtering));
      }
      Long page = configRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = configRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      Boolean isDeleted = configRequest.getDeleted();
      if (isDeleted != null) {
        localVarQueryParams.addAll(parameterToPair(IS_DELETED, isDeleted));
      }
      List<String> fields = configRequest.getFields();
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_ADGROUP_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }

    @Override
    public void paramValidate(ConfigRequest configRequest) throws ApiException {
      Long accountId = configRequest.getAccountId();
      if (accountId == null) {
        throw new ApiException(
                "Missing the required parameter 'accountId' when calling adgroupsGet(Async)");
      }
    }
  }

  @ApiRequestMapping(value = "/adgroups/add", method = RequestConstants.POST)
  private class AdgroupsAdd extends TencentApiRequest<AdgroupsAddRequest, ConfigResponse<AdgroupsAddResponseData>> {
  }

  @ApiRequestMapping(value = "/adgroups/update", method = RequestConstants.POST)
  private class AdgroupsUpdate
          extends TencentApiRequest<AdgroupsUpdateRequest, ConfigResponse<AdgroupsUpdateResponseData>> {
  }

  @ApiRequestMapping(value = "/adgroups/delete", method = RequestConstants.POST)
  private class AdgroupsDelete
          extends TencentApiRequest<AdgroupsDeleteRequest, ConfigResponse<AdgroupsDeleteResponseData>> {
  }

  @ApiRequestMapping(value = "/adcreatives/get", method = RequestConstants.GET, usePostBody = false,
          contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdcreativesGet
          extends TencentApiRequest<ConfigRequest, ConfigResponse<PageResponseData<AdcreativesGetListStruct>>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest configRequest) {
      Long accountId = configRequest.getAccountId();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      List<FilteringStruct> filtering = configRequest.getFiltering();
      if (filtering != null) {
        localVarCollectionQueryParams.addAll(
                parameterToPairs(MULTI, FILTERING, filtering));
      }
      Long page = configRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = configRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      Boolean isDeleted = configRequest.getDeleted();
      if (isDeleted != null) {
        localVarQueryParams.addAll(parameterToPair(IS_DELETED, isDeleted));
      }
      Boolean linkPageTypeCompatible = configRequest.getLinkPageTypeCompatible();
      if (linkPageTypeCompatible != null) {
        localVarQueryParams.addAll(
                parameterToPair("link_page_type_compatible", linkPageTypeCompatible));
      }
      List<String> fields = configRequest.getFields();
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_ADCREATIVE_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }
  }

  @ApiRequestMapping(value = "/adcreatives/add", method = RequestConstants.POST)
  public class AdcreativesAdd
          extends TencentApiRequest<AdcreativesAddRequest, ConfigResponse<AdcreativesAddResponseData>> {
  }

  @ApiRequestMapping(value = "/adcreatives/update", method = RequestConstants.POST)
  public class AdcreativesUpdate
          extends TencentApiRequest<AdcreativesUpdateRequest, ConfigResponse<AdcreativesUpdateResponseData>> {
  }

  @ApiRequestMapping(value = "/adcreatives/delete", method = RequestConstants.POST)
  public class AdcreativesDelete
          extends TencentApiRequest<AdcreativesDeleteRequest, ConfigResponse<AdcreativesDeleteResponseData>> {
  }

  @ApiRequestMapping(value = "/ads/get", method = RequestConstants.GET, usePostBody = false, contentTypes = {
          RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  private class AdsGet extends TencentApiRequest<ConfigRequest, ConfigResponse<PageResponseData<AdsGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest configRequest) {
      Long accountId = configRequest.getAccountId();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      List<FilteringStruct> filtering = configRequest.getFiltering();
      if (filtering != null) {
        localVarCollectionQueryParams.addAll(
                parameterToPairs(MULTI, FILTERING, filtering));
      }
      Long page = configRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = configRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      Boolean isDeleted = configRequest.getDeleted();
      if (isDeleted != null) {
        localVarQueryParams.addAll(parameterToPair(IS_DELETED, isDeleted));
      }
      List<String> fields = configRequest.getFields();
      if (fields == null || fields.isEmpty()) {
        fields = TencentDefaultFields.BASE_ADS_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }
  }

  @ApiRequestMapping(value = "/ads/add", method = RequestConstants.POST)
  private class AdsAdd extends TencentApiRequest<AdsAddRequest, ConfigResponse<AdsAddResponseData>> {
  }

  @ApiRequestMapping(value = "/ads/update", method = RequestConstants.POST)
  private class AdsUpdate extends TencentApiRequest<AdsUpdateRequest, ConfigResponse<AdsUpdateResponseData>> {
  }

  @ApiRequestMapping(value = "/ads/delete", method = RequestConstants.POST)
  private class AdsDelete extends TencentApiRequest<AdsDeleteRequest, ConfigResponse<AdsDeleteResponseData>> {
  }

  @ApiRequestMapping(value = "/targetings/get", method = RequestConstants.GET, usePostBody = false,
          contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class TargetingsGet
          extends TencentApiRequest<ConfigRequest, ConfigResponse<PageResponseData<TargetingsGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest configRequest) {
      Long accountId = configRequest.getAccountId();
      if (accountId != null) {
        localVarQueryParams.addAll(parameterToPair(ACCOUNT_ID, accountId));
      }
      List<FilteringStruct> filtering = configRequest.getFiltering();
      if (filtering != null) {
        localVarCollectionQueryParams.addAll(
                parameterToPairs(MULTI, FILTERING, filtering));
      }
      Long page = configRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = configRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      Boolean isDeleted = configRequest.getDeleted();
      if (isDeleted != null) {
        localVarQueryParams.addAll(parameterToPair(IS_DELETED, isDeleted));
      }
      List<String> fields = configRequest.getFields();
      localVarCollectionQueryParams.addAll(parameterToPairs(MULTI, "fields", fields));
    }
  }

  @ApiRequestMapping(value = "/advertiser/update_daily_budget", method = RequestConstants.POST)
  public class AdvertiserUpdateDailyBudget
          extends TencentApiRequest<AdvertiserUpdateDailyBudgetRequest,
          ConfigResponse<AdvertiserUpdateDailyBudgetResponseData>> {
  }

  @ApiRequestMapping(value = "/campaigns/update_daily_budget", method = RequestConstants.POST)
  public class CampaignsUpdateDailyBudget
          extends TencentApiRequest<CampaignsUpdateDailyBudgetRequest,
          ConfigResponse<CampaignsUpdateDailyBudgetResponseData>> {
  }

  @ApiRequestMapping(value = "/adgroups/update_daily_budget", method = RequestConstants.POST)
  private class AdgroupsUpdateDailyBudget
          extends TencentApiRequest<AdgroupsUpdateDailyBudgetRequest,
          ConfigResponse<AdgroupsUpdateDailyBudgetResponseData>> {
  }

  @ApiRequestMapping(value = "/campaigns/update_configured_status", method = RequestConstants.POST)
  public class CampaignsUpdateConfiguredStatus
          extends TencentApiRequest<CampaignsUpdateConfiguredStatusRequest,
          ConfigResponse<CampaignsUpdateConfiguredStatusResponseData>> {
  }

  @ApiRequestMapping(value = "/adgroups/update_configured_status", method = RequestConstants.POST)
  private class AdgroupsUpdateConfiguredStatus
          extends TencentApiRequest<AdgroupsUpdateConfiguredStatusRequest,
          ConfigResponse<AdgroupsUpdateConfiguredStatusResponseData>> {
  }

  @ApiRequestMapping(value = "/ads/update_configured_status", method = RequestConstants.POST)
  private class AdsUpdateConfiguredStatus
          extends TencentApiRequest<AdsUpdateConfiguredStatusRequest,
          ConfigResponse<AdsUpdateConfiguredStatusResponseData>> {
  }

  @ApiRequestMapping(value = "/adgroups/update_datetime", method = RequestConstants.POST)
  private class AdgroupsUpdateDatetime
          extends TencentApiRequest<AdgroupsUpdateDatetimeRequest,
          ConfigResponse<AdgroupsUpdateDatetimeResponseData>> {
  }

  @ApiRequestMapping(value = "/adgroups/update_bid_amount", method = RequestConstants.POST)
  private class AdgroupsUpdateBidAmount
          extends TencentApiRequest<AdgroupsUpdateBidAmountRequest, ConfigResponse<AdgroupsUpdateBidAmountResponseData>> {
  }

}
