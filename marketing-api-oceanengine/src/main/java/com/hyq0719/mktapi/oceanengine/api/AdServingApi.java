package com.hyq0719.mktapi.oceanengine.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.common.util.JsonUtil;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;
import com.hyq0719.mktapi.oceanengine.OceanDefaultFields;
import com.hyq0719.mktapi.oceanengine.bean.ad.*;
import com.hyq0719.mktapi.oceanengine.bean.campaign.*;
import com.hyq0719.mktapi.oceanengine.bean.common.ConfigRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.common.PageResponseData;
import com.hyq0719.mktapi.oceanengine.bean.creative.*;

import java.util.List;

public class AdServingApi extends AbstractOceanApi {
  /**
   * 广告组
   */
  private volatile CampaignGet campaignGet;
  private volatile CampaignCreate campaignCreate;
  private volatile CampaignUpdate campaignUpdate;
  private volatile CampaignUpdateStatus campaignUpdateStatus;
  /**
   * 广告计划模块
   */
  private volatile AdGet adGet;
  private volatile AdCostProtectStatusGet adCostProtectStatusGet;
  private volatile AdRejectReason adRejectReason;
  private volatile AdCreate adCreate;
  private volatile AdUpdateApi adUpdateApi;
  private volatile AdUpdateStatus adUpdateStatus;
  private volatile AdUpdateBudget adUpdateBudget;
  private volatile AdUpdateBid adUpdateBid;
  /**
   * 广告创意模块
   */
  private volatile CreativeGet creativeGet;
  private volatile CreativeCustomCreativeCreate creativeCustomCreativeCreate;
  private volatile CreativeCustomCreativeUpdate creativeCustomCreativeUpdate;

  public AdServingApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public CampaignGet campaignGet() {
    if (campaignGet == null) {
      synchronized (CampaignGet.class) {
        if (campaignGet == null) {
          campaignGet = (CampaignGet) init(CampaignGet.class);
        }
      }
    }
    return campaignGet;
  }

  public CampaignCreate campaignCreate() {
    if (campaignCreate == null) {
      synchronized (CampaignCreate.class) {
        if (campaignCreate == null) {
          campaignCreate = (CampaignCreate) init(CampaignCreate.class);
        }
      }
    }
    return campaignCreate;
  }

  public CampaignUpdate campaignUpdate() {
    if (campaignUpdate == null) {
      synchronized (CampaignUpdate.class) {
        if (campaignUpdate == null) {
          campaignUpdate = (CampaignUpdate) init(CampaignUpdate.class);
        }
      }
    }
    return campaignUpdate;
  }

  public CampaignUpdateStatus campaignUpdateStatus() {
    if (campaignUpdateStatus == null) {
      synchronized (CampaignUpdateStatus.class) {
        if (campaignUpdateStatus == null) {
          campaignUpdateStatus = (CampaignUpdateStatus) init(CampaignUpdateStatus.class);
        }
      }
    }
    return campaignUpdateStatus;
  }

  public AdGet adGet() {
    if (adGet == null) {
      synchronized (AdGet.class) {
        if (adGet == null) {
          adGet = (AdGet) init(AdGet.class);
        }
      }
    }
    return adGet;
  }

  public AdCostProtectStatusGet adCostProtectStatusGet() {
    if (adCostProtectStatusGet == null) {
      synchronized (AdCostProtectStatusGet.class) {
        if (adCostProtectStatusGet == null) {
          adCostProtectStatusGet = (AdCostProtectStatusGet) init(AdCostProtectStatusGet.class);
        }
      }
    }
    return adCostProtectStatusGet;
  }

  public AdRejectReason adRejectReason() {
    if (adRejectReason == null) {
      synchronized (AdRejectReason.class) {
        if (adRejectReason == null) {
          adRejectReason = (AdRejectReason) init(AdRejectReason.class);
        }
      }
    }
    return adRejectReason;
  }

  public AdCreate adCreate() {
    if (adCreate == null) {
      synchronized (AdCreate.class) {
        if (adCreate == null) {
          adCreate = (AdCreate) init(AdCreate.class);
        }
      }
    }
    return adCreate;
  }

  public AdUpdateApi adUpdateApi() {
    if (adUpdateApi == null) {
      synchronized (AdUpdateApi.class) {
        if (adUpdateApi == null) {
          adUpdateApi = (AdUpdateApi) init(AdUpdateApi.class);
        }
      }
    }
    return adUpdateApi;
  }

  public AdUpdateStatus adUpdateStatus() {
    if (adUpdateStatus == null) {
      synchronized (AdUpdateStatus.class) {
        if (adUpdateStatus == null) {
          adUpdateStatus = (AdUpdateStatus) init(AdUpdateStatus.class);
        }
      }
    }
    return adUpdateStatus;
  }

  public AdUpdateBudget adUpdateBudget() {
    if (adUpdateBudget == null) {
      synchronized (AdUpdateBudget.class) {
        if (adUpdateBudget == null) {
          adUpdateBudget = (AdUpdateBudget) init(AdUpdateBudget.class);
        }
      }
    }
    return adUpdateBudget;
  }

  public AdUpdateBid adUpdateBid() {
    if (adUpdateBid == null) {
      synchronized (AdUpdateBid.class) {
        if (adUpdateBid == null) {
          adUpdateBid = (AdUpdateBid) init(AdUpdateBid.class);
        }
      }
    }
    return adUpdateBid;
  }

  public CreativeGet creativeGet() {
    if (creativeGet == null) {
      synchronized (CreativeGet.class) {
        if (creativeGet == null) {
          creativeGet = (CreativeGet) init(CreativeGet.class);
        }
      }
    }
    return creativeGet;
  }

  public CreativeCustomCreativeCreate creativeCustomCreativeCreate() {
    if (creativeCustomCreativeCreate == null) {
      synchronized (CreativeCustomCreativeCreate.class) {
        if (creativeCustomCreativeCreate == null) {
          creativeCustomCreativeCreate = (CreativeCustomCreativeCreate) init(
                  CreativeCustomCreativeCreate.class);
        }
      }
    }
    return creativeCustomCreativeCreate;
  }

  public CreativeCustomCreativeUpdate creativeCustomCreativeUpdate() {
    if (creativeCustomCreativeUpdate == null) {
      synchronized (CreativeCustomCreativeUpdate.class) {
        if (creativeCustomCreativeUpdate == null) {
          creativeCustomCreativeUpdate = (CreativeCustomCreativeUpdate) init(
                  CreativeCustomCreativeUpdate.class);
        }
      }
    }
    return creativeCustomCreativeUpdate;
  }

  @ApiRequestMapping(value = "/campaign/get", method = RequestConstants.GET, usePostBody = false,
          contentTypes = {
                  RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class CampaignGet extends OceanApiRequest<ConfigRequest<CampaignsGetFilteringStruct>,
          OceanResponse<PageResponseData<CampaignsGetListStruct>>> {

    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest<CampaignsGetFilteringStruct> configRequest) {
      Long advertiserId = configRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      CampaignsGetFilteringStruct filtering = configRequest.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FILTERING, JsonUtil.toJsonString(filtering)));
      }
      Long page = configRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = configRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      List<String> fields = configRequest.getFields();
      if (fields == null) {
        fields = OceanDefaultFields.BASE_CAMPAIGN_GET_FIEDS;
      }
      localVarCollectionQueryParams.addAll(parameterToPairs("multi", "fields", fields));
    }
  }

  @ApiRequestMapping(value = "/campaign/create/", method = RequestConstants.POST)
  public class CampaignCreate extends OceanApiRequest<CampaignsAddRequest, OceanResponse<CampaignsAddResponseData>> {
  }

  @ApiRequestMapping(value = "/campaign/update/", method = RequestConstants.POST)
  public class CampaignUpdate extends OceanApiRequest<CampaignsUpdateRequest, OceanResponse<CampaignsUpdateResponseData>> {
  }

  @ApiRequestMapping(value = "/campaign/update/status/ ", method = RequestConstants.POST)
  public class CampaignUpdateStatus
          extends OceanApiRequest<CampaignsUpdateStatusRequest, OceanResponse<CampaignsUpdateStatusResponseData>> {
  }

  @ApiRequestMapping(value = "/ad/get/", method = RequestConstants.GET, usePostBody = false, contentTypes = {
          RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdGet extends OceanApiRequest<ConfigRequest<AdsGetFilteringStruct>,
          OceanResponse<PageResponseData<AdsGetResponseListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest<AdsGetFilteringStruct> configRequest) {
      Long advertiserId = configRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      AdsGetFilteringStruct filtering = configRequest.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FILTERING, JsonUtil.toJsonString(filtering)));
      }
      Long page = configRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = configRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      List<String> fields = configRequest.getFields();
      if (fields != null) {
        localVarCollectionQueryParams.addAll(parameterToPairs("multi", "fields", fields));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/cost_protect_status/get/", method = RequestConstants.GET, usePostBody =
          false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdCostProtectStatusGet extends OceanApiRequest<AdsGetCostProtectStatusRequest,
          OceanResponse<AdsGetCostProtectStatusResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdsGetCostProtectStatusRequest adsGetCostProtectStatusRequest) {
      Long advertiserId = adsGetCostProtectStatusRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      List<Long> adIds = adsGetCostProtectStatusRequest.getAdIds();
      if (adIds != null) {
        localVarQueryParams.addAll(parameterToPair("ad_ids", JsonUtil.toJsonString(adIds)));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/reject_reason/", method = RequestConstants.GET, usePostBody = false,
          contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdRejectReason
          extends OceanApiRequest<AdsGetRejectReasonRequest, OceanResponse<AdsGetRejectReasonResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdsGetRejectReasonRequest adsGetRejectReasonRequest) {
      Long advertiserId = adsGetRejectReasonRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      List<Long> adIds = adsGetRejectReasonRequest.getAdIds();
      if (adIds != null) {
        localVarQueryParams.addAll(parameterToPair("ad_ids", JsonUtil.toJsonString(adIds)));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/create/", method = RequestConstants.POST)
  public class AdCreate extends OceanApiRequest<AdsAddRequest, OceanResponse<AdsAddResponseData>> {
  }

  @ApiRequestMapping(value = "/ad/update/", method = RequestConstants.POST)
  public class AdUpdateApi extends OceanApiRequest<AdsUpdateRequest, OceanResponse<AdsUpdateResponseData>> {
  }

  @ApiRequestMapping(value = "/ad/update/status/", method = RequestConstants.POST)
  public class AdUpdateStatus
          extends OceanApiRequest<AdsUpdateStatusRequest, OceanResponse<AdsUpdateStatusResponseData>> {
  }

  @ApiRequestMapping(value = "/ad/update/budget/", method = RequestConstants.POST)
  public class AdUpdateBudget
          extends OceanApiRequest<AdsUpdateBudgetRequest, OceanResponse<AdsUpdateBudgetResponseData>> {
  }

  @ApiRequestMapping(value = "/ad/update/bid/", method = RequestConstants.POST)
  public class AdUpdateBid extends OceanApiRequest<AdsUpdateBidRequest, OceanResponse<AdsUpdateBidResponseData>> {
  }

  @ApiRequestMapping(value = "/creative/get/", method = RequestConstants.GET, usePostBody = false,
          contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class CreativeGet
          extends OceanApiRequest<ConfigRequest<AdcreativesGetFilteringStruct>,
          OceanResponse<PageResponseData<AdcreativesGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ConfigRequest<AdcreativesGetFilteringStruct> configRequest) {
      Long advertiserId = configRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      AdcreativesGetFilteringStruct filtering = configRequest.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FILTERING, JsonUtil.toJsonString(filtering)));
      }
      Long page = configRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = configRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      List<String> fields = configRequest.getFields();
      if (fields != null) {
        localVarCollectionQueryParams.addAll(parameterToPairs("multi", "fields", fields));
      }
    }

  }

  @ApiRequestMapping(value = "/creative/custom_creative/create/", method = RequestConstants.POST)
  public class CreativeCustomCreativeCreate
          extends OceanApiRequest<AdcreativesCustomAddRequest, OceanResponse<AdcreativesCustomAddResponseData>> {
  }

  @ApiRequestMapping(value = "/creative/custom_creative/update/", method = RequestConstants.POST)
  public class CreativeCustomCreativeUpdate
          extends OceanApiRequest<AdcreativesCustomUpdateRequest, OceanResponse<AdcreativesCustomUpdateResponseData>> {
  }

}
