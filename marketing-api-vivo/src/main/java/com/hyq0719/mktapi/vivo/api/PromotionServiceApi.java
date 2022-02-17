package com.hyq0719.mktapi.vivo.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.vivo.VivoApiRequest;
import com.hyq0719.mktapi.vivo.bean.common.VivoResponse;
import com.hyq0719.mktapi.vivo.bean.promotionService.*;

import java.util.List;

/**
 * @author hyq0719
 * @description vivo商业开放平台——推广服务
 */
public class PromotionServiceApi extends AbstractVivoApi {
  /**
   * 广告计划管理
   */
  private volatile AdCampaignAdd adCampaignAdd;
  private volatile AdCampaignDel adCampaignDel;
  private volatile AdCampaignEditById adCampaignEditById;
  private volatile AdCampaignEditName adCampaignEditName;
  private volatile AdCampaignEditDailyBudget adCampaignEditDailyBudget;
  private volatile AdCampaignPageInfo adCampaignPageInfo;
  private volatile AdCampaignPageInfoByLastId adCampaignPageInfoByLastId;
  private volatile AdCampaignPauseToggle adCampaignPauseToggle;
  private volatile AdCampaignBatchDel adCampaignBatchDel;

  /**
   * 广告组管理
   */
  private volatile AdGroupAdd adGroupAdd;
  private volatile AdGroupEditById adGroupEditById;
  private volatile AdGroupPageInfo adGroupPageInfo;
  private volatile AdGroupPageInfoByLastId adGroupPageInfoByLastId;
  private volatile AdGroupBatchDel adGroupBatchDel;
  private volatile AdGroupBatchEditDailyBudget adGroupBatchEditDailyBudget;
  private volatile AdGroupBatchEditDate adGroupBatchEditDate;
  private volatile AdGroupBatchEditTime adGroupBatchEditTime;
  private volatile AdGroupBatchEditPrice adGroupBatchEditPrice;
  private volatile AdGroupPauseToggle adGroupPauseToggle;
  private volatile AdGroupEditName adGroupEditName;
  private volatile AdGroupCvTypeGet adGroupCvTypeGet;
  private volatile AdGroupQuerySkipSwitch adGroupQuerySkipSwitch;

  /**
   * 广告管理
   */
  private volatile AdAdvertisementAddCustomizeAdCreative adAdvertisementAddCustomizeAdCreative;
  private volatile AdAdvertisementEditCustomizeAdCreative adAdvertisementEditCustomizeAdCreative;
  private volatile AdAdvertisementAdd adAdvertisementAdd;
  private volatile AdAdvertisementEditById adAdvertisementEditById;
  private volatile AdAdvertisementPageInfo adAdvertisementPageInfo;
  private volatile AdAdvertisementPageInfoByLastId adAdvertisementPageInfoByLastId;
  private volatile AdAdvertisementDel adAdvertisementDel;
  private volatile AdAdvertisementEditName adAdvertisementEditName;
  private volatile AdAdvertisementPauseToggle adAdvertisementPauseToggle;
  private volatile AdAdvertisementBatchDel adAdvertisementBatchDel;

  /**
   * 创意管理
   */
  private volatile AdCreativePageInfo adCreativePageInfo;
  private volatile AdCreativePageInfoByLastId adCreativePageInfoByLastId;
  private volatile AdCreativeDel adCreativeDel;
  private volatile AdCreativePauseToggle adCreativePauseToggle;
  private volatile AdCreativeQueryAuditState adCreativeQueryAuditState;

  /**
   * 定向管理
   */
  private volatile AdDmpTagGetNewBaseTags adDmpTagGetNewBaseTags;
  private volatile AdDmpTagGetCrowds adDmpTagGetCrowds;
  private volatile PurposewordList purposewordList;
  private volatile PurposewordCategory purposewordCategory;
  private volatile AdDmpTagGetAdvertiserTags adDmpTagGetAdvertiserTags;

  /**
   * 非商店搜索广告-关键词
   */
  private volatile AdSugKeywordEditPrice adSugKeywordEditPrice;
  private volatile AdSugKeywordEditSiteUrl adSugKeywordEditSiteUrl;
  private volatile AdSugKeywordEditMatchType adSugKeywordEditMatchType;
  private volatile AdSugKeywordEditPauseState adSugKeywordEditPauseState;
  private volatile AdSugKeywordDel adSugKeywordDel;

  /**
   * 非商店搜索管理
   */
  private volatile AdSugRecommendQuery adSugRecommendQuery;

  public PromotionServiceApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public AdCampaignAdd adCampaignAdd() {
    if (adCampaignAdd == null) {
      synchronized (AdCampaignAdd.class) {
        if (adCampaignAdd == null) {
          adCampaignAdd = (AdCampaignAdd) init(AdCampaignAdd.class);
        }
      }
    }
    return adCampaignAdd;
  }

  public AdCampaignDel adCampaignDel() {
    if (adCampaignDel == null) {
      synchronized (AdCampaignDel.class) {
        if (adCampaignDel == null) {
          adCampaignDel = (AdCampaignDel) init(AdCampaignDel.class);
        }
      }
    }
    return adCampaignDel;
  }

  public AdCampaignEditById adCampaignEditById() {
    if (adCampaignEditById == null) {
      synchronized (AdCampaignEditById.class) {
        if (adCampaignEditById == null) {
          adCampaignEditById = (AdCampaignEditById) init(AdCampaignEditById.class);
        }
      }
    }
    return adCampaignEditById;
  }

  public AdCampaignEditName adCampaignEditName() {
    if (adCampaignEditName == null) {
      synchronized (AdCampaignEditName.class) {
        if (adCampaignEditName == null) {
          adCampaignEditName = (AdCampaignEditName) init(AdCampaignEditName.class);
        }
      }
    }
    return adCampaignEditName;
  }

  public AdCampaignEditDailyBudget adCampaignEditDailyBudget() {
    if (adCampaignEditDailyBudget == null) {
      synchronized (AdCampaignEditDailyBudget.class) {
        if (adCampaignEditDailyBudget == null) {
          adCampaignEditDailyBudget = (AdCampaignEditDailyBudget) init(AdCampaignEditDailyBudget.class);
        }
      }
    }
    return adCampaignEditDailyBudget;
  }

  public AdCampaignPageInfo adCampaignPageInfo() {
    if (adCampaignPageInfo == null) {
      synchronized (AdCampaignPageInfo.class) {
        if (adCampaignPageInfo == null) {
          adCampaignPageInfo = (AdCampaignPageInfo) init(AdCampaignPageInfo.class);
        }
      }
    }
    return adCampaignPageInfo;
  }

  public AdCampaignPageInfoByLastId adCampaignPageInfoByLastId() {
    if (adCampaignPageInfoByLastId == null) {
      synchronized (AdCampaignPageInfoByLastId.class) {
        if (adCampaignPageInfoByLastId == null) {
          adCampaignPageInfoByLastId = (AdCampaignPageInfoByLastId) init(AdCampaignPageInfoByLastId.class);
        }
      }
    }
    return adCampaignPageInfoByLastId;
  }

  public AdCampaignPauseToggle adCampaignPauseToggle() {
    if (adCampaignPauseToggle == null) {
      synchronized (AdCampaignPauseToggle.class) {
        if (adCampaignPauseToggle == null) {
          adCampaignPauseToggle = (AdCampaignPauseToggle) init(AdCampaignPauseToggle.class);
        }
      }
    }
    return adCampaignPauseToggle;
  }

  public AdCampaignBatchDel adCampaignBatchDel() {
    if (adCampaignBatchDel == null) {
      synchronized (AdCampaignBatchDel.class) {
        if (adCampaignBatchDel == null) {
          adCampaignBatchDel = (AdCampaignBatchDel) init(AdCampaignBatchDel.class);
        }
      }
    }
    return adCampaignBatchDel;
  }

  public AdGroupAdd adGroupAdd() {
    if (adGroupAdd == null) {
      synchronized (AdGroupAdd.class) {
        if (adGroupAdd == null) {
          adGroupAdd = (AdGroupAdd) init(AdGroupAdd.class);
        }
      }
    }
    return adGroupAdd;
  }

  public AdGroupEditById adGroupEditById() {
    if (adGroupEditById == null) {
      synchronized (AdGroupEditById.class) {
        if (adGroupEditById == null) {
          adGroupEditById = (AdGroupEditById) init(AdGroupEditById.class);
        }
      }
    }
    return adGroupEditById;
  }

  public AdGroupPageInfo adGroupPageInfo() {
    if (adGroupPageInfo == null) {
      synchronized (AdGroupPageInfo.class) {
        if (adGroupPageInfo == null) {
          adGroupPageInfo = (AdGroupPageInfo) init(AdGroupPageInfo.class);
        }
      }
    }
    return adGroupPageInfo;
  }

  public AdGroupPageInfoByLastId adGroupPageInfoByLastId() {
    if (adGroupPageInfoByLastId == null) {
      synchronized (AdGroupPageInfoByLastId.class) {
        if (adGroupPageInfoByLastId == null) {
          adGroupPageInfoByLastId = (AdGroupPageInfoByLastId) init(AdGroupPageInfoByLastId.class);
        }
      }
    }
    return adGroupPageInfoByLastId;
  }

  public AdGroupBatchDel adGroupBatchDel() {
    if (adGroupBatchDel == null) {
      synchronized (AdGroupBatchDel.class) {
        if (adGroupBatchDel == null) {
          adGroupBatchDel = (AdGroupBatchDel) init(AdGroupBatchDel.class);
        }
      }
    }
    return adGroupBatchDel;
  }

  public AdGroupBatchEditDailyBudget adGroupBatchEditDailyBudget() {
    if (adGroupBatchEditDailyBudget == null) {
      synchronized (AdGroupBatchEditDailyBudget.class) {
        if (adGroupBatchEditDailyBudget == null) {
          adGroupBatchEditDailyBudget = (AdGroupBatchEditDailyBudget) init(AdGroupBatchEditDailyBudget.class);
        }
      }
    }
    return adGroupBatchEditDailyBudget;
  }

  public AdGroupBatchEditDate adGroupBatchEditDate() {
    if (adGroupBatchEditDate == null) {
      synchronized (AdGroupBatchEditDate.class) {
        if (adGroupBatchEditDate == null) {
          adGroupBatchEditDate = (AdGroupBatchEditDate) init(AdGroupBatchEditDate.class);
        }
      }
    }
    return adGroupBatchEditDate;
  }

  public AdGroupBatchEditTime adGroupBatchEditTime() {
    if (adGroupBatchEditTime == null) {
      synchronized (AdGroupBatchEditTime.class) {
        if (adGroupBatchEditTime == null) {
          adGroupBatchEditTime = (AdGroupBatchEditTime) init(AdGroupBatchEditTime.class);
        }
      }
    }
    return adGroupBatchEditTime;
  }

  public AdGroupBatchEditPrice adGroupBatchEditPrice() {
    if (adGroupBatchEditPrice == null) {
      synchronized (AdGroupBatchEditPrice.class) {
        if (adGroupBatchEditPrice == null) {
          adGroupBatchEditPrice = (AdGroupBatchEditPrice) init(AdGroupBatchEditPrice.class);
        }
      }
    }
    return adGroupBatchEditPrice;
  }

  public AdGroupPauseToggle adGroupPauseToggle() {
    if (adGroupPauseToggle == null) {
      synchronized (AdGroupPauseToggle.class) {
        if (adGroupPauseToggle == null) {
          adGroupPauseToggle = (AdGroupPauseToggle) init(AdGroupPauseToggle.class);
        }
      }
    }
    return adGroupPauseToggle;
  }

  public AdGroupEditName adGroupEditName() {
    if (adGroupEditName == null) {
      synchronized (AdGroupEditName.class) {
        if (adGroupEditName == null) {
          adGroupEditName = (AdGroupEditName) init(AdGroupEditName.class);
        }
      }
    }
    return adGroupEditName;
  }

  public AdGroupCvTypeGet adGroupCvTypeGet() {
    if (adGroupCvTypeGet == null) {
      synchronized (AdGroupCvTypeGet.class) {
        if (adGroupCvTypeGet == null) {
          adGroupCvTypeGet = (AdGroupCvTypeGet) init(AdGroupCvTypeGet.class);
        }
      }
    }
    return adGroupCvTypeGet;
  }

  public AdGroupQuerySkipSwitch adGroupQuerySkipSwitch() {
    if (adGroupQuerySkipSwitch == null) {
      synchronized (AdGroupQuerySkipSwitch.class) {
        if (adGroupQuerySkipSwitch == null) {
          adGroupQuerySkipSwitch = (AdGroupQuerySkipSwitch) init(AdGroupQuerySkipSwitch.class);
        }
      }
    }
    return adGroupQuerySkipSwitch;
  }

  public AdAdvertisementAddCustomizeAdCreative adAdvertisementAddCustomizeAdCreative() {
    if (adAdvertisementAddCustomizeAdCreative == null) {
      synchronized (AdAdvertisementAddCustomizeAdCreative.class) {
        if (adAdvertisementAddCustomizeAdCreative == null) {
          adAdvertisementAddCustomizeAdCreative = (AdAdvertisementAddCustomizeAdCreative)
                  init(AdAdvertisementAddCustomizeAdCreative.class);
        }
      }
    }
    return adAdvertisementAddCustomizeAdCreative;
  }

  public AdAdvertisementEditCustomizeAdCreative adAdvertisementEditCustomizeAdCreative() {
    if (adAdvertisementEditCustomizeAdCreative == null) {
      synchronized (AdAdvertisementEditCustomizeAdCreative.class) {
        if (adAdvertisementEditCustomizeAdCreative == null) {
          adAdvertisementEditCustomizeAdCreative = (AdAdvertisementEditCustomizeAdCreative)
                  init(AdAdvertisementEditCustomizeAdCreative.class);
        }
      }
    }
    return adAdvertisementEditCustomizeAdCreative;
  }

  public AdAdvertisementAdd adAdvertisementAdd() {
    if (adAdvertisementAdd == null) {
      synchronized (AdAdvertisementAdd.class) {
        if (adAdvertisementAdd == null) {
          adAdvertisementAdd = (AdAdvertisementAdd) init(AdAdvertisementAdd.class);
        }
      }
    }
    return adAdvertisementAdd;
  }

  public AdAdvertisementEditById adAdvertisementEditById() {
    if (adAdvertisementEditById == null) {
      synchronized (AdAdvertisementEditById.class) {
        if (adAdvertisementEditById == null) {
          adAdvertisementEditById = (AdAdvertisementEditById) init(AdAdvertisementEditById.class);
        }
      }
    }
    return adAdvertisementEditById;
  }

  public AdAdvertisementPageInfo adAdvertisementPageInfo() {
    if (adAdvertisementPageInfo == null) {
      synchronized (AdAdvertisementPageInfo.class) {
        if (adAdvertisementPageInfo == null) {
          adAdvertisementPageInfo = (AdAdvertisementPageInfo) init(AdAdvertisementPageInfo.class);
        }
      }
    }
    return adAdvertisementPageInfo;
  }

  public AdAdvertisementPageInfoByLastId adAdvertisementPageInfoByLastId() {
    if (adAdvertisementPageInfoByLastId == null) {
      synchronized (AdAdvertisementPageInfoByLastId.class) {
        if (adAdvertisementPageInfoByLastId == null) {
          adAdvertisementPageInfoByLastId = (AdAdvertisementPageInfoByLastId)
                  init(AdAdvertisementPageInfoByLastId.class);
        }
      }
    }
    return adAdvertisementPageInfoByLastId;
  }

  public AdAdvertisementDel adAdvertisementDel() {
    if (adAdvertisementDel == null) {
      synchronized (AdAdvertisementDel.class) {
        if (adAdvertisementDel == null) {
          adAdvertisementDel = (AdAdvertisementDel) init(AdAdvertisementDel.class);
        }
      }
    }
    return adAdvertisementDel;
  }

  public AdAdvertisementEditName adAdvertisementEditName() {
    if (adAdvertisementEditName == null) {
      synchronized (AdAdvertisementEditName.class) {
        if (adAdvertisementEditName == null) {
          adAdvertisementEditName = (AdAdvertisementEditName) init(AdAdvertisementEditName.class);
        }
      }
    }
    return adAdvertisementEditName;
  }

  public AdAdvertisementPauseToggle adAdvertisementPauseToggle() {
    if (adAdvertisementPauseToggle == null) {
      synchronized (AdAdvertisementPauseToggle.class) {
        if (adAdvertisementPauseToggle == null) {
          adAdvertisementPauseToggle = (AdAdvertisementPauseToggle) init(AdAdvertisementPauseToggle.class);
        }
      }
    }
    return adAdvertisementPauseToggle;
  }

  public AdAdvertisementBatchDel adAdvertisementBatchDel() {
    if (adAdvertisementBatchDel == null) {
      synchronized (AdAdvertisementBatchDel.class) {
        if (adAdvertisementBatchDel == null) {
          adAdvertisementBatchDel = (AdAdvertisementBatchDel) init(AdAdvertisementBatchDel.class);
        }
      }
    }
    return adAdvertisementBatchDel;
  }

  public AdCreativePageInfo adCreativePageInfo() {
    if (adCreativePageInfo == null) {
      synchronized (AdCreativePageInfo.class) {
        if (adCreativePageInfo == null) {
          adCreativePageInfo = (AdCreativePageInfo) init(AdCreativePageInfo.class);
        }
      }
    }
    return adCreativePageInfo;
  }

  public AdCreativePageInfoByLastId adCreativePageInfoByLastId() {
    if (adCreativePageInfoByLastId == null) {
      synchronized (AdCreativePageInfoByLastId.class) {
        if (adCreativePageInfoByLastId == null) {
          adCreativePageInfoByLastId = (AdCreativePageInfoByLastId) init(AdCreativePageInfoByLastId.class);
        }
      }
    }
    return adCreativePageInfoByLastId;
  }

  public AdCreativeDel adCreativeDel() {
    if (adCreativeDel == null) {
      synchronized (AdCreativeDel.class) {
        if (adCreativeDel == null) {
          adCreativeDel = (AdCreativeDel) init(AdCreativeDel.class);
        }
      }
    }
    return adCreativeDel;
  }

  public AdCreativePauseToggle adCreativePauseToggle() {
    if (adCreativePauseToggle == null) {
      synchronized (AdCreativePauseToggle.class) {
        if (adCreativePauseToggle == null) {
          adCreativePauseToggle = (AdCreativePauseToggle) init(AdCreativePauseToggle.class);
        }
      }
    }
    return adCreativePauseToggle;
  }

  public AdCreativeQueryAuditState adCreativeQueryAuditState() {
    if (adCreativeQueryAuditState == null) {
      synchronized (AdCreativeQueryAuditState.class) {
        if (adCreativeQueryAuditState == null) {
          adCreativeQueryAuditState = (AdCreativeQueryAuditState) init(AdCreativeQueryAuditState.class);
        }
      }
    }
    return adCreativeQueryAuditState;
  }

  public AdDmpTagGetNewBaseTags adDmpTagGetNewBaseTags() {
    if (adDmpTagGetNewBaseTags == null) {
      synchronized (AdDmpTagGetNewBaseTags.class) {
        if (adDmpTagGetNewBaseTags == null) {
          adDmpTagGetNewBaseTags = (AdDmpTagGetNewBaseTags) init(AdDmpTagGetNewBaseTags.class);
        }
      }
    }
    return adDmpTagGetNewBaseTags;
  }

  public AdDmpTagGetCrowds adDmpTagGetCrowds() {
    if (adDmpTagGetCrowds == null) {
      synchronized (AdDmpTagGetCrowds.class) {
        if (adDmpTagGetCrowds == null) {
          adDmpTagGetCrowds = (AdDmpTagGetCrowds) init(AdDmpTagGetCrowds.class);
        }
      }
    }
    return adDmpTagGetCrowds;
  }

  public PurposewordList purposewordList() {
    if (purposewordList == null) {
      synchronized (PurposewordList.class) {
        if (purposewordList == null) {
          purposewordList = (PurposewordList) init(PurposewordList.class);
        }
      }
    }
    return purposewordList;
  }

  public PurposewordCategory purposewordCategory() {
    if (purposewordCategory == null) {
      synchronized (PurposewordCategory.class) {
        if (purposewordCategory == null) {
          purposewordCategory = (PurposewordCategory) init(PurposewordCategory.class);
        }
      }
    }
    return purposewordCategory;
  }

  public AdDmpTagGetAdvertiserTags adDmpTagGetAdvertiserTags() {
    if (adDmpTagGetAdvertiserTags == null) {
      synchronized (AdDmpTagGetAdvertiserTags.class) {
        if (adDmpTagGetAdvertiserTags == null) {
          adDmpTagGetAdvertiserTags = (AdDmpTagGetAdvertiserTags) init(AdDmpTagGetAdvertiserTags.class);
        }
      }
    }
    return adDmpTagGetAdvertiserTags;
  }

  public AdSugKeywordEditPrice adSugKeywordEditPrice() {
    if (adSugKeywordEditPrice == null) {
      synchronized (AdSugKeywordEditPrice.class) {
        if (adSugKeywordEditPrice == null) {
          adSugKeywordEditPrice = (AdSugKeywordEditPrice) init(AdSugKeywordEditPrice.class);
        }
      }
    }
    return adSugKeywordEditPrice;
  }

  public AdSugKeywordEditSiteUrl adSugKeywordEditSiteUrl() {
    if (adSugKeywordEditSiteUrl == null) {
      synchronized (AdSugKeywordEditSiteUrl.class) {
        if (adSugKeywordEditSiteUrl == null) {
          adSugKeywordEditSiteUrl = (AdSugKeywordEditSiteUrl) init(AdSugKeywordEditSiteUrl.class);
        }
      }
    }
    return adSugKeywordEditSiteUrl;
  }

  public AdSugKeywordEditMatchType adSugKeywordEditMatchType() {
    if (adSugKeywordEditMatchType == null) {
      synchronized (AdSugKeywordEditMatchType.class) {
        if (adSugKeywordEditMatchType == null) {
          adSugKeywordEditMatchType = (AdSugKeywordEditMatchType) init(AdSugKeywordEditMatchType.class);
        }
      }
    }
    return adSugKeywordEditMatchType;
  }

  public AdSugKeywordEditPauseState adSugKeywordEditPauseState() {
    if (adSugKeywordEditPauseState == null) {
      synchronized (AdSugKeywordEditPauseState.class) {
        if (adSugKeywordEditPauseState == null) {
          adSugKeywordEditPauseState = (AdSugKeywordEditPauseState) init(AdSugKeywordEditPauseState.class);
        }
      }
    }
    return adSugKeywordEditPauseState;
  }

  public AdSugKeywordDel adSugKeywordDel() {
    if (adSugKeywordDel == null) {
      synchronized (AdSugKeywordDel.class) {
        if (adSugKeywordDel == null) {
          adSugKeywordDel = (AdSugKeywordDel) init(AdSugKeywordDel.class);
        }
      }
    }
    return adSugKeywordDel;
  }

  public AdSugRecommendQuery adSugRecommendQuery() {
    if (adSugRecommendQuery == null) {
      synchronized (AdSugRecommendQuery.class) {
        if (adSugRecommendQuery == null) {
          adSugRecommendQuery = (AdSugRecommendQuery) init(AdSugRecommendQuery.class);
        }
      }
    }
    return adSugRecommendQuery;
  }

  @ApiRequestMapping(value = "/ad/campaign/add", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignAdd extends VivoApiRequest<AdCampaignAddRequest, VivoResponse<AdCampaignAddResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignAddRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/campaign/del", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignDel extends VivoApiRequest<AdCampaignDelRequest, VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignDelRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/campaign/editById", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignEditById extends VivoApiRequest<AdCampaignEditByIdRequest,
          VivoResponse<AdCampaignEditByIdResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignEditByIdRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/campaign/editName", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignEditName extends VivoApiRequest<AdCampaignEditNameRequest,
          VivoResponse<AdCampaignEditNameResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignEditNameRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/campaign/editDailyBudget", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignEditDailyBudget extends VivoApiRequest<AdCampaignEditDailyBudgetRequest,
          VivoResponse<AdCampaignEditDailyBudgetResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignEditDailyBudgetRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/campaign/pageInfo", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignPageInfo extends VivoApiRequest<AdCampaignPageInfoRequest,
          VivoResponse<AdCampaignPageInfoResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignPageInfoRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/campaign/pageInfoByLastId", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignPageInfoByLastId extends VivoApiRequest<AdCampaignPageInfoByLastIdRequest,
          VivoResponse<AdCampaignPageInfoByLastIdResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignPageInfoByLastIdRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/campaign/pause/toggle", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignPauseToggle extends VivoApiRequest<AdCampaignPauseToggleRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignPauseToggleRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/campaign/batchDel", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdCampaignBatchDel extends VivoApiRequest<AdCampaignBatchDelRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCampaignBatchDelRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/add", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupAdd extends VivoApiRequest<AdGroupAddRequest, VivoResponse<Long>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupAddRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/editById", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupEditById extends VivoApiRequest<AdGroupEditByIdRequest, VivoResponse<Long>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupEditByIdRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/pageInfo", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupPageInfo extends VivoApiRequest<AdGroupPageInfoRequest,
          VivoResponse<AdGroupPageInfoResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupPageInfoRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/pageInfoByLastId", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupPageInfoByLastId extends VivoApiRequest<AdGroupPageInfoByLastIdRequest,
          VivoResponse<AdGroupPageInfoByLastIdResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupPageInfoByLastIdRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/batchDel", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupBatchDel extends VivoApiRequest<AdGroupBatchDelRequest, VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupBatchDelRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/batchEditDailyBudget", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupBatchEditDailyBudget extends VivoApiRequest<AdGroupBatchEditDailyBudgetRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupBatchEditDailyBudgetRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/batchEditDate", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupBatchEditDate extends VivoApiRequest<AdGroupBatchEditDateRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupBatchEditDateRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/batchEditTime", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupBatchEditTime extends VivoApiRequest<AdGroupBatchEditTimeRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupBatchEditTimeRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/batchEditPrice", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupBatchEditPrice extends VivoApiRequest<AdGroupBatchEditPriceRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupBatchEditPriceRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/pause/toggle", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupPauseToggle extends VivoApiRequest<AdGroupPauseToggleRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupPauseToggleRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/editName", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupEditName extends VivoApiRequest<AdGroupEditNameRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupEditNameRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/cvType/get", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupCvTypeGet extends VivoApiRequest<AdGroupCvTypeGetRequest,
          VivoResponse<AdGroupCvTypeGetResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupCvTypeGetRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/group/querySkipSwitch", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdGroupQuerySkipSwitch extends VivoApiRequest<AdGroupQuerySkipSwitchRequest,
          VivoResponse<AdGroupQuerySkipSwitchResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdGroupQuerySkipSwitchRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/add/customize/adCreative",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementAddCustomizeAdCreative extends
          VivoApiRequest<AdAdvertisementAddCustomizeAdCreativeRequest,
                  VivoResponse<AdAdvertisementAddCustomizeAdCreativeResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementAddCustomizeAdCreativeRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/edit/customize/adCreative",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementEditCustomizeAdCreative extends
          VivoApiRequest<AdAdvertisementEditCustomizeAdCreativeRequest,
                  VivoResponse<AdAdvertisementEditCustomizeAdCreativeResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementEditCustomizeAdCreativeRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/add",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementAdd extends VivoApiRequest<AdAdvertisementAddRequest,
          VivoResponse<AdAdvertisementAddResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementAddRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/editById",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementEditById extends VivoApiRequest<AdAdvertisementEditByIdRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementEditByIdRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/pageInfo",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementPageInfo extends VivoApiRequest<AdAdvertisementPageInfoRequest,
          VivoResponse<AdAdvertisementPageInfoResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementPageInfoRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/pageInfoByLastId",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementPageInfoByLastId extends VivoApiRequest<AdAdvertisementPageInfoByLastIdRequest,
          VivoResponse<AdAdvertisementPageInfoByLastIdResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementPageInfoByLastIdRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/del",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementDel extends VivoApiRequest<AdAdvertisementDelRequest, VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementDelRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/editName",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementEditName extends VivoApiRequest<AdAdvertisementEditNameRequest, VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementEditNameRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/pause/toggle",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementPauseToggle extends VivoApiRequest<AdAdvertisementPauseToggleRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementPauseToggleRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/advertisement/batchDel",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdAdvertisementBatchDel extends VivoApiRequest<AdAdvertisementBatchDelRequest, VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdAdvertisementBatchDelRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/creative/pageInfo",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdCreativePageInfo extends VivoApiRequest<AdCreativePageInfoRequest, VivoResponse<AdCreativePageInfoResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCreativePageInfoRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/creative/pageInfoByLastId",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdCreativePageInfoByLastId extends VivoApiRequest<AdCreativePageInfoByLastIdRequest,
          VivoResponse<AdCreativePageInfoByLastIdResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCreativePageInfoByLastIdRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/creative/del",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdCreativeDel extends VivoApiRequest<AdCreativeDelRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCreativeDelRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/creative/pause/toggle",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdCreativePauseToggle extends VivoApiRequest<AdCreativePauseToggleRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCreativePauseToggleRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/creative/query/audit/state",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdCreativeQueryAuditState extends VivoApiRequest<AdCreativeQueryAuditStateRequest,
          VivoResponse<AdCreativeQueryAuditStateResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdCreativeQueryAuditStateRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/dmpTag/getNewBaseTags", method = RequestConstants.GET, usePostBody =
          false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdDmpTagGetNewBaseTags extends VivoApiRequest<AdDmpTagGetNewBaseTagsRequest,
          VivoResponse<AdDmpTagGetNewBaseTagsResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdDmpTagGetNewBaseTagsRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      Integer adType = request.getAdType();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair("adType", adType));
      }
      Integer mediaType = request.getMediaType();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair("mediaType", mediaType));
      }
      Integer campaignType = request.getCampaignType();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair("campaignType", campaignType));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/dmpTag/getCrowds",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdDmpTagGetCrowds extends VivoApiRequest<AdDmpTagGetCrowdsRequest,
          VivoResponse<List<AdDmpTagGetCrowdsResponseData>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdDmpTagGetCrowdsRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/purposeword/list",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class PurposewordList extends VivoApiRequest<PurposewordListRequest,
          VivoResponse<PurposewordListResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                PurposewordListRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/purposeword/category",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class PurposewordCategory extends VivoApiRequest<PurposewordCategoryRequest,
          VivoResponse<PurposewordCategoryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                PurposewordCategoryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/dmpTag/getAdvertiserTags", method = RequestConstants.GET, usePostBody =
          false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class AdDmpTagGetAdvertiserTags extends VivoApiRequest<AdDmpTagGetAdvertiserTagsRequest,
          VivoResponse<AdDmpTagGetAdvertiserTagsResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdDmpTagGetAdvertiserTagsRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/sug/keyword/editPrice",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdSugKeywordEditPrice extends VivoApiRequest<AdSugKeywordEditPriceRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdSugKeywordEditPriceRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/sug/keyword/editSiteUrl",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdSugKeywordEditSiteUrl extends VivoApiRequest<AdSugKeywordEditSiteUrlRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdSugKeywordEditSiteUrlRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/sug/keyword/editMatchType",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdSugKeywordEditMatchType extends VivoApiRequest<AdSugKeywordEditMatchTypeRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdSugKeywordEditMatchTypeRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/sug/keyword/editPauseState",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdSugKeywordEditPauseState extends VivoApiRequest<AdSugKeywordEditPauseStateRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdSugKeywordEditPauseStateRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/sug/keyword/del",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdSugKeywordDel extends VivoApiRequest<AdSugKeywordDelRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdSugKeywordDelRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/sug/recommend/query",
          method = RequestConstants.POST, contentTypes = {RequestConstants.CONTENT_TYPE_JSON})
  public class AdSugRecommendQuery extends VivoApiRequest<AdSugRecommendQueryRequest,
          VivoResponse<AdSugRecommendQueryResponse>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdSugRecommendQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }
}
