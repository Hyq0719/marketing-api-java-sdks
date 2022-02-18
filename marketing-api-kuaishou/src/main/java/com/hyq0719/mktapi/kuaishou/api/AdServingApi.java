package com.hyq0719.mktapi.kuaishou.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.common.util.JsonUtil;
import com.hyq0719.mktapi.kuaishou.KshApiRequest;
import com.hyq0719.mktapi.kuaishou.bean.ad_unit.*;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserBudgetGetRequest;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserBudgetGetResponseStruct;
import com.hyq0719.mktapi.kuaishou.bean.advertiser.AdvertiserUpdateBudgetRequest;
import com.hyq0719.mktapi.kuaishou.bean.campaign.*;
import com.hyq0719.mktapi.kuaishou.bean.common.KshResponse;
import com.hyq0719.mktapi.kuaishou.bean.common.PageResponseData;
import com.hyq0719.mktapi.kuaishou.bean.creative.*;
import com.hyq0719.mktapi.kuaishou.bean.tool.ToolAudiencePredictionRequest;
import com.hyq0719.mktapi.kuaishou.bean.tool.ToolAudiencePredictionResponseStruct;
import com.hyq0719.mktapi.kuaishou.bean.tool.ToolOperationRecordListRequest;
import com.hyq0719.mktapi.kuaishou.bean.tool.ToolOperationRecordListResponseStruct;

import java.util.List;

/**
 * 磁力引擎-广告投放
 */
public class AdServingApi extends AbstractKshApi {

  /**
   * 获取各层级信息
   */
  private volatile CampaignList campaignList;
  private volatile AdUnitList adUnitList;
  private volatile CreativeList creativeList;
  private volatile CreativeAdvancedProgramList creativeAdvancedProgramList;
  private volatile CreativeAdvancedProgramReviewDetail creativeAdvancedProgramReviewDetail;
  private volatile ToolOperationRecordList toolOperationRecordList;
  private volatile ToolAudiencePrediction toolAudiencePrediction;
  /**
   * 账户层级
   */
  private volatile AdvertiserBudgetGet advertiserBudgetGet;
  private volatile AdvertiserUpdateBudget advertiserUpdateBudget;
  /**
   * 广告计划
   */
  private volatile CampaignCreate campaignCreate;
  private volatile CampaignUpdate campaignUpdate;
  private volatile CampaignUpdateStatus campaignUpdateStatus;
  /**
   * 广告组
   */
  private volatile AdUnitCreate adUnitCreate;
  private volatile AdUnitUpdate adUnitUpdate;
  private volatile AdUnitUpdateDayBudget adUnitUpdateDayBudget;
  private volatile AdUnitUpdateStatus adUnitUpdateStatus;
  private volatile AdUnitUpdateBid adUnitUpdateBid;
  /**
   * 广告创意
   */
  private volatile CreativeCreate creativeCreate;
  private volatile CreativeBatchUpdate creativeBatchUpdate;
  private volatile CreativeUpdate creativeUpdate;
  private volatile CreativeUpdateStatus creativeUpdateStatus;
  private volatile CreativeCreatePreview creativeCreatePreview;
  private volatile CreativeCreateCreativeTagAdvise creativeCreateCreativeTagAdvise;

  public AdServingApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public CampaignList campaignList() {
    if (campaignList == null) {
      synchronized (CampaignList.class) {
        if (campaignList == null) {
          campaignList = (CampaignList) init(CampaignList.class);
        }
      }
    }
    return campaignList;
  }

  public AdUnitList adUnitList() {
    if (adUnitList == null) {
      synchronized (AdUnitList.class) {
        if (adUnitList == null) {
          adUnitList = (AdUnitList) init(AdUnitList.class);
        }
      }
    }
    return adUnitList;
  }

  public CreativeList creativeList() {
    if (creativeList == null) {
      synchronized (CreativeList.class) {
        if (creativeList == null) {
          creativeList = (CreativeList) init(CreativeList.class);
        }
      }
    }
    return creativeList;
  }

  public CreativeAdvancedProgramList creativeAdvancedProgramList() {
    if (creativeAdvancedProgramList == null) {
      synchronized (CreativeAdvancedProgramList.class) {
        if (creativeAdvancedProgramList == null) {
          creativeAdvancedProgramList = (CreativeAdvancedProgramList) init(CreativeAdvancedProgramList.class);
        }
      }
    }
    return creativeAdvancedProgramList;
  }

  public CreativeAdvancedProgramReviewDetail creativeAdvancedProgramReviewDetail() {
    if (creativeAdvancedProgramReviewDetail == null) {
      synchronized (CreativeAdvancedProgramReviewDetail.class) {
        if (creativeAdvancedProgramReviewDetail == null) {
          creativeAdvancedProgramReviewDetail = (CreativeAdvancedProgramReviewDetail) init(
            CreativeAdvancedProgramReviewDetail.class);
        }
      }
    }
    return creativeAdvancedProgramReviewDetail;
  }

  public ToolOperationRecordList toolOperationRecordList() {
    if (toolOperationRecordList == null) {
      synchronized (ToolOperationRecordList.class) {
        if (toolOperationRecordList == null) {
          toolOperationRecordList = (ToolOperationRecordList) init(ToolOperationRecordList.class);
        }
      }
    }
    return toolOperationRecordList;
  }

  public ToolAudiencePrediction toolAudiencePrediction() {
    if (toolAudiencePrediction == null) {
      synchronized (ToolAudiencePrediction.class) {
        if (toolAudiencePrediction == null) {
          toolAudiencePrediction = (ToolAudiencePrediction) init(ToolAudiencePrediction.class);
        }
      }
    }
    return toolAudiencePrediction;
  }

  public AdvertiserBudgetGet advertiserBudgetGet() {
    if (advertiserBudgetGet == null) {
      synchronized (AdvertiserBudgetGet.class) {
        if (advertiserBudgetGet == null) {
          advertiserBudgetGet = (AdvertiserBudgetGet) init(AdvertiserBudgetGet.class);
        }
      }
    }
    return advertiserBudgetGet;
  }

  public AdvertiserUpdateBudget advertiserUpdateBudget() {
    if (advertiserUpdateBudget == null) {
      synchronized (AdvertiserUpdateBudget.class) {
        if (advertiserUpdateBudget == null) {
          advertiserUpdateBudget = (AdvertiserUpdateBudget) init(AdvertiserUpdateBudget.class);
        }
      }
    }
    return advertiserUpdateBudget;
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

  public AdUnitCreate adUnitCreate() {
    if (adUnitCreate == null) {
      synchronized (AdUnitCreate.class) {
        if (adUnitCreate == null) {
          adUnitCreate = (AdUnitCreate) init(AdUnitCreate.class);
        }
      }
    }
    return adUnitCreate;
  }

  public AdUnitUpdate adUnitUpdate() {
    if (adUnitUpdate == null) {
      synchronized (AdUnitUpdate.class) {
        if (adUnitUpdate == null) {
          adUnitUpdate = (AdUnitUpdate) init(AdUnitUpdate.class);
        }
      }
    }
    return adUnitUpdate;
  }

  public AdUnitUpdateDayBudget adUnitUpdateDayBudget() {
    if (adUnitUpdateDayBudget == null) {
      synchronized (AdUnitUpdateDayBudget.class) {
        if (adUnitUpdateDayBudget == null) {
          adUnitUpdateDayBudget = (AdUnitUpdateDayBudget) init(AdUnitUpdateDayBudget.class);
        }
      }
    }
    return adUnitUpdateDayBudget;
  }

  public AdUnitUpdateStatus adUnitUpdateStatus() {
    if (adUnitUpdateStatus == null) {
      synchronized (AdUnitUpdateStatus.class) {
        if (adUnitUpdateStatus == null) {
          adUnitUpdateStatus = (AdUnitUpdateStatus) init(AdUnitUpdateStatus.class);
        }
      }
    }
    return adUnitUpdateStatus;
  }

  public AdUnitUpdateBid adUnitUpdateBid() {
    if (adUnitUpdateBid == null) {
      synchronized (AdUnitUpdateBid.class) {
        if (adUnitUpdateBid == null) {
          adUnitUpdateBid = (AdUnitUpdateBid) init(AdUnitUpdateBid.class);
        }
      }
    }
    return adUnitUpdateBid;
  }

  public CreativeCreate creativeCreate() {
    if (creativeCreate == null) {
      synchronized (CreativeCreate.class) {
        if (creativeCreate == null) {
          creativeCreate = (CreativeCreate) init(CreativeCreate.class);
        }
      }
    }
    return creativeCreate;
  }

  public CreativeBatchUpdate creativeBatchUpdate() {
    if (creativeBatchUpdate == null) {
      synchronized (CreativeBatchUpdate.class) {
        if (creativeBatchUpdate == null) {
          creativeBatchUpdate = (CreativeBatchUpdate) init(CreativeBatchUpdate.class);
        }
      }
    }
    return creativeBatchUpdate;
  }

  public CreativeUpdate creativeUpdate() {
    if (creativeUpdate == null) {
      synchronized (CreativeUpdate.class) {
        if (creativeUpdate == null) {
          creativeUpdate = (CreativeUpdate) init(CreativeUpdate.class);
        }
      }
    }
    return creativeUpdate;
  }

  public CreativeUpdateStatus creativeUpdateStatus() {
    if (creativeUpdateStatus == null) {
      synchronized (CreativeUpdateStatus.class) {
        if (creativeUpdateStatus == null) {
          creativeUpdateStatus = (CreativeUpdateStatus) init(CreativeUpdateStatus.class);
        }
      }
    }
    return creativeUpdateStatus;
  }

  public CreativeCreatePreview creativeCreatePreview() {
    if (creativeCreatePreview == null) {
      synchronized (CreativeCreatePreview.class) {
        if (creativeCreatePreview == null) {
          creativeCreatePreview = (CreativeCreatePreview) init(CreativeCreatePreview.class);
        }
      }
    }
    return creativeCreatePreview;
  }

  public CreativeCreateCreativeTagAdvise creativeCreateCreativeTagAdvise() {
    if (creativeCreateCreativeTagAdvise == null) {
      synchronized (CreativeCreateCreativeTagAdvise.class) {
        if (creativeCreateCreativeTagAdvise == null) {
          creativeCreateCreativeTagAdvise = (CreativeCreateCreativeTagAdvise) init(
            CreativeCreateCreativeTagAdvise.class);
        }
      }
    }
    return creativeCreateCreativeTagAdvise;
  }

  @ApiRequestMapping(value = "/campaign/list", method = RequestConstants.POST)
  public class CampaignList extends KshApiRequest<CampaignListRequest, KshResponse<PageResponseData<CampaignListResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/ad_unit/list", method = RequestConstants.POST)
  public class AdUnitList
    extends KshApiRequest<AdUnitListRequest, KshResponse<PageResponseData<AdUnitListResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/creative/list", method = RequestConstants.POST)
  public class CreativeList
    extends KshApiRequest<CreativeListRequest, KshResponse<PageResponseData<CreativeListResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/creative/advanced/program/list", method = RequestConstants.POST, version = "v2")
  public class CreativeAdvancedProgramList
    extends KshApiRequest<CreativeAdvancedProgramListRequest,
    KshResponse<PageResponseData<CreativeAdvancedProgramListResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/creative/advanced/program/review_detail", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN}, version = "v2")
  public class CreativeAdvancedProgramReviewDetail
    extends KshApiRequest<CreativeAdvancedProgramReviewDetailRequest,
    KshResponse<CreativeAdvancedProgramReviewDetailResponseStruct>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                CreativeAdvancedProgramReviewDetailRequest creativeAdvancedProgramReviewDetailRequest) {
      Long advertiserId = creativeAdvancedProgramReviewDetailRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair("advertiser_id", advertiserId));
      }
      List<Long> unitIds = creativeAdvancedProgramReviewDetailRequest.getUnitIds();
      if (unitIds != null) {
        localVarQueryParams.addAll(parameterToPair("unit_ids", JsonUtil.toJsonString(unitIds)));
      }
    }
  }

  @ApiRequestMapping(value = "/tool/operation_record/list", method = RequestConstants.POST)
  public class ToolOperationRecordList
    extends KshApiRequest<ToolOperationRecordListRequest,
    KshResponse<PageResponseData<ToolOperationRecordListResponseStruct>>> {
  }

  @ApiRequestMapping(value = "/tool/audience/prediction", method = RequestConstants.POST)
  public class ToolAudiencePrediction
    extends KshApiRequest<ToolAudiencePredictionRequest, KshResponse<ToolAudiencePredictionResponseStruct>> {
  }

  @ApiRequestMapping(value = "/advertiser/budget/get", method = RequestConstants.POST)
  public class AdvertiserBudgetGet
    extends KshApiRequest<AdvertiserBudgetGetRequest, KshResponse<AdvertiserBudgetGetResponseStruct>> {
  }

  @ApiRequestMapping(value = "/advertiser/update/budget", method = RequestConstants.POST)
  public class AdvertiserUpdateBudget extends KshApiRequest<AdvertiserUpdateBudgetRequest, KshResponse> {
  }

  @ApiRequestMapping(value = "/campaign/create", method = RequestConstants.POST)
  public class CampaignCreate
    extends KshApiRequest<CampaignCreateRequest, KshResponse<CampaignCreateResponseStruct>> {
  }

  @ApiRequestMapping(value = "/campaign/update", method = RequestConstants.POST)
  public class CampaignUpdate
    extends KshApiRequest<CampaignUpdateRequest, KshResponse<CampaignUpdateResponseStruct>> {
  }

  @ApiRequestMapping(value = "/campaign/update/status", method = RequestConstants.POST, version = "v2")
  public class CampaignUpdateStatus
    extends KshApiRequest<CampaignUpdateStatusRequest, KshResponse<CampaignUpdateStatusResponseStruct>> {
  }

  @ApiRequestMapping(value = "/ad_unit/create", method = RequestConstants.POST, version = "v2")
  public class AdUnitCreate extends KshApiRequest<AdUnitCreateRequest, KshResponse<AdUnitCreateResponseStruct>> {
  }

  @ApiRequestMapping(value = "/ad_unit/update", method = RequestConstants.POST, version = "v2")
  public class AdUnitUpdate extends KshApiRequest<AdUnitUpdateRequest, KshResponse<AdUnitUpdateResponseStruct>> {
  }

  @ApiRequestMapping(value = "/ad_unit/update/day_budget", method = RequestConstants.POST)
  public class AdUnitUpdateDayBudget extends KshApiRequest<AdUnitUpdateDayBudgetRequest, KshResponse> {
  }

  @ApiRequestMapping(value = "/ad_unit/update/status", method = RequestConstants.POST)
  public class AdUnitUpdateStatus
    extends KshApiRequest<AdUnitUpdateStatusRequest, KshResponse<AdUnitUpdateStatusResponseStruct>> {
  }

  @ApiRequestMapping(value = "/ad_unit/update/bid", method = RequestConstants.POST)
  public class AdUnitUpdateBid extends KshApiRequest<AdUnitUpdateBidRequest, KshResponse> {
  }

  @ApiRequestMapping(value = "/creative/create", method = RequestConstants.POST, version = "v2")
  public class CreativeCreate
    extends KshApiRequest<CreativeCreateRequest, KshResponse<CreativeCreateResponseStruct>> {
  }

  @ApiRequestMapping(value = "/creative/batch/update", method = RequestConstants.POST, version = "v2")
  private class CreativeBatchUpdate
    extends KshApiRequest<CreativeBatchUpdateRequest, KshResponse<CreativeBatchUpdateResponseStruct>> {
  }

  @ApiRequestMapping(value = "/creative/update", method = RequestConstants.POST, version = "v2")
  private class CreativeUpdate
    extends KshApiRequest<CreativeUpdateRequest, KshResponse<CreativeUpdateResponseStruct>> {
  }

  @ApiRequestMapping(value = "/creative/update/status", method = RequestConstants.POST)
  private class CreativeUpdateStatus
    extends KshApiRequest<CreativeUpdateStatusRequest, KshResponse<CreativeUpdateStatusResponseStruct>> {
  }

  @ApiRequestMapping(value = "/creative/create/preview", method = RequestConstants.POST)
  public class CreativeCreatePreview extends KshApiRequest<CreativeCreatePreviewRequest, KshResponse> {
  }

  @ApiRequestMapping(value = "/creative/create/creative_tag/advise", method = RequestConstants.POST)
  public class CreativeCreateCreativeTagAdvise
    extends KshApiRequest<CreativeCreateCreativeTagAdviseRequest,
    KshResponse<CreativeCreateCreativeTagAdviseResponseStruct>> {
  }
}
