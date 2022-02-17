package com.hyq0719.mktapi.tencent.bean.adgroups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.tencent.bean.common.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回结构
 */
@Data
public class AdgroupsGetListStruct {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("optimization_goal")
  private String optimizationGoal = null;

  @SerializedName("billing_event")
  private String billingEvent = null;

  @SerializedName("bid_amount")
  private Long bidAmount = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("promoted_object_type")
  private String promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("mini_game_program_id")
  private String miniGameProgramId = null;

  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("targeting")
  private ReadTargetingSettingForAdgroup targeting = null;

  @SerializedName("targeting_translation")
  private String targetingTranslation = null;

  @SerializedName("is_include_unsupported_targeting")
  private Boolean isIncludeUnsupportedTargeting = null;

  @SerializedName("scene_spec")
  private SceneTargeting sceneSpec = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("first_day_begin_time")
  private String firstDayBeginTime = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("time_series")
  private String timeSeries = null;

  @SerializedName("configured_status")
  private String configuredStatus = null;

  @SerializedName("customized_category")
  private String customizedCategory = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("ad_count")
  private Long adCount = null;

  @SerializedName("dynamic_ad_spec")
  private DynamicAdSpec dynamicAdSpec = null;

  @SerializedName("user_action_sets")
  private List<UserActionSetStruct> userActionSets = null;

  @SerializedName("additional_user_action_sets")
  private List<UserActionSetStruct> additionalUserActionSets = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("is_rewarded_video_ad")
  private Boolean isRewardedVideoAd = null;

  @SerializedName("cost_guarantee_message")
  private String costGuaranteeMessage = null;

  @SerializedName("cost_guarantee_status")
  private String costGuaranteeStatus = null;

  @SerializedName("bid_strategy")
  private String bidStrategy = null;

  @SerializedName("cold_start_audience")
  private List<Long> coldStartAudience = null;

  @SerializedName("auto_audience")
  private Boolean autoAudience = null;

  @SerializedName("expand_enabled")
  private Boolean expandEnabled = null;

  @SerializedName("expand_targeting")
  private List<String> expandTargeting = null;

  @SerializedName("deep_conversion_spec")
  private DeepConversionSpec deepConversionSpec = null;

  @SerializedName("deep_optimization_action_type")
  private String deepOptimizationActionType = null;

  @SerializedName("poi_list")
  private List<String> poiList = null;

  @SerializedName("conversion_id")
  private Long conversionId = null;

  @SerializedName("deep_conversion_behavior_bid")
  private Long deepConversionBehaviorBid = null;

  @SerializedName("deep_conversion_worth_rate")
  private Double deepConversionWorthRate = null;

  @SerializedName("android_channel_package_audit_message")
  private String androidChannelPackageAuditMessage = null;

  @SerializedName("system_status")
  private String systemStatus = null;

  @SerializedName("bid_mode")
  private String bidMode = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("bid_adjustment")
  private BidAdjustment bidAdjustment = null;

  @SerializedName("auto_acquisition_enabled")
  private Boolean autoAcquisitionEnabled = null;

  @SerializedName("auto_acquisition_budget")
  private Long autoAcquisitionBudget = null;

  @SerializedName("creative_display_type")
  private String creativeDisplayType = null;

  @SerializedName("auto_derived_creative_enabled")
  private Boolean autoDerivedCreativeEnabled = null;

  @SerializedName("smart_bid_type")
  private String smartBidType = null;

  @SerializedName("smart_cost_cap")
  private Long smartCostCap = null;

  public AdgroupsGetListStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdgroupsGetListStruct adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public AdgroupsGetListStruct adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  public AdgroupsGetListStruct siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdgroupsGetListStruct addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  public AdgroupsGetListStruct automaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
    return this;
  }

  public AdgroupsGetListStruct optimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  public AdgroupsGetListStruct billingEvent(String billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

  public AdgroupsGetListStruct bidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
    return this;
  }

  public AdgroupsGetListStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdgroupsGetListStruct promotedObjectType(String promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  public AdgroupsGetListStruct promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  public AdgroupsGetListStruct appAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
    return this;
  }

  public AdgroupsGetListStruct miniGameProgramId(String miniGameProgramId) {
    this.miniGameProgramId = miniGameProgramId;
    return this;
  }

  public AdgroupsGetListStruct targetingId(Long targetingId) {
    this.targetingId = targetingId;
    return this;
  }

  public AdgroupsGetListStruct targeting(ReadTargetingSettingForAdgroup targeting) {
    this.targeting = targeting;
    return this;
  }

  public AdgroupsGetListStruct targetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
    return this;
  }

  public AdgroupsGetListStruct isIncludeUnsupportedTargeting(
          Boolean isIncludeUnsupportedTargeting) {
    this.isIncludeUnsupportedTargeting = isIncludeUnsupportedTargeting;
    return this;
  }

  public AdgroupsGetListStruct sceneSpec(SceneTargeting sceneSpec) {
    this.sceneSpec = sceneSpec;
    return this;
  }

  public AdgroupsGetListStruct beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  public AdgroupsGetListStruct firstDayBeginTime(String firstDayBeginTime) {
    this.firstDayBeginTime = firstDayBeginTime;
    return this;
  }

  public AdgroupsGetListStruct endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdgroupsGetListStruct timeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public AdgroupsGetListStruct configuredStatus(String configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  public AdgroupsGetListStruct customizedCategory(String customizedCategory) {
    this.customizedCategory = customizedCategory;
    return this;
  }

  public AdgroupsGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  public AdgroupsGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  public AdgroupsGetListStruct adCount(Long adCount) {
    this.adCount = adCount;
    return this;
  }

  public AdgroupsGetListStruct dynamicAdSpec(DynamicAdSpec dynamicAdSpec) {
    this.dynamicAdSpec = dynamicAdSpec;
    return this;
  }

  public AdgroupsGetListStruct userActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
    return this;
  }

  public AdgroupsGetListStruct addUserActionSetsItem(UserActionSetStruct userActionSetsItem) {
    if (this.userActionSets == null) {
      this.userActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.userActionSets.add(userActionSetsItem);
    return this;
  }

  public AdgroupsGetListStruct additionalUserActionSets(
          List<UserActionSetStruct> additionalUserActionSets) {
    this.additionalUserActionSets = additionalUserActionSets;
    return this;
  }

  public AdgroupsGetListStruct addAdditionalUserActionSetsItem(
          UserActionSetStruct additionalUserActionSetsItem) {
    if (this.additionalUserActionSets == null) {
      this.additionalUserActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.additionalUserActionSets.add(additionalUserActionSetsItem);
    return this;
  }

  public AdgroupsGetListStruct isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  public AdgroupsGetListStruct dynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
    return this;
  }

  public AdgroupsGetListStruct isRewardedVideoAd(Boolean isRewardedVideoAd) {
    this.isRewardedVideoAd = isRewardedVideoAd;
    return this;
  }

  public AdgroupsGetListStruct costGuaranteeMessage(String costGuaranteeMessage) {
    this.costGuaranteeMessage = costGuaranteeMessage;
    return this;
  }

  public AdgroupsGetListStruct costGuaranteeStatus(String costGuaranteeStatus) {
    this.costGuaranteeStatus = costGuaranteeStatus;
    return this;
  }

  public AdgroupsGetListStruct bidStrategy(String bidStrategy) {
    this.bidStrategy = bidStrategy;
    return this;
  }

  public AdgroupsGetListStruct coldStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
    return this;
  }

  public AdgroupsGetListStruct addColdStartAudienceItem(Long coldStartAudienceItem) {
    if (this.coldStartAudience == null) {
      this.coldStartAudience = new ArrayList<Long>();
    }
    this.coldStartAudience.add(coldStartAudienceItem);
    return this;
  }

  public AdgroupsGetListStruct autoAudience(Boolean autoAudience) {
    this.autoAudience = autoAudience;
    return this;
  }

  public AdgroupsGetListStruct expandEnabled(Boolean expandEnabled) {
    this.expandEnabled = expandEnabled;
    return this;
  }

  public AdgroupsGetListStruct expandTargeting(List<String> expandTargeting) {
    this.expandTargeting = expandTargeting;
    return this;
  }

  public AdgroupsGetListStruct addExpandTargetingItem(String expandTargetingItem) {
    if (this.expandTargeting == null) {
      this.expandTargeting = new ArrayList<String>();
    }
    this.expandTargeting.add(expandTargetingItem);
    return this;
  }

  public AdgroupsGetListStruct deepConversionSpec(DeepConversionSpec deepConversionSpec) {
    this.deepConversionSpec = deepConversionSpec;
    return this;
  }

  public AdgroupsGetListStruct deepOptimizationActionType(
          String deepOptimizationActionType) {
    this.deepOptimizationActionType = deepOptimizationActionType;
    return this;
  }

  public AdgroupsGetListStruct poiList(List<String> poiList) {
    this.poiList = poiList;
    return this;
  }

  public AdgroupsGetListStruct addPoiListItem(String poiListItem) {
    if (this.poiList == null) {
      this.poiList = new ArrayList<String>();
    }
    this.poiList.add(poiListItem);
    return this;
  }

  public AdgroupsGetListStruct conversionId(Long conversionId) {
    this.conversionId = conversionId;
    return this;
  }

  public AdgroupsGetListStruct deepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
    return this;
  }

  public AdgroupsGetListStruct deepConversionWorthRate(Double deepConversionWorthRate) {
    this.deepConversionWorthRate = deepConversionWorthRate;
    return this;
  }

  public AdgroupsGetListStruct androidChannelPackageAuditMessage(
          String androidChannelPackageAuditMessage) {
    this.androidChannelPackageAuditMessage = androidChannelPackageAuditMessage;
    return this;
  }

  public AdgroupsGetListStruct systemStatus(String systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  public AdgroupsGetListStruct bidMode(String bidMode) {
    this.bidMode = bidMode;
    return this;
  }

  public AdgroupsGetListStruct status(String status) {
    this.status = status;
    return this;
  }

  public AdgroupsGetListStruct bidAdjustment(BidAdjustment bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
    return this;
  }

  public AdgroupsGetListStruct autoAcquisitionEnabled(Boolean autoAcquisitionEnabled) {
    this.autoAcquisitionEnabled = autoAcquisitionEnabled;
    return this;
  }

  public AdgroupsGetListStruct autoAcquisitionBudget(Long autoAcquisitionBudget) {
    this.autoAcquisitionBudget = autoAcquisitionBudget;
    return this;
  }

  public AdgroupsGetListStruct creativeDisplayType(String creativeDisplayType) {
    this.creativeDisplayType = creativeDisplayType;
    return this;
  }

  public AdgroupsGetListStruct autoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
    this.autoDerivedCreativeEnabled = autoDerivedCreativeEnabled;
    return this;
  }

  public AdgroupsGetListStruct smartBidType(String smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  public AdgroupsGetListStruct smartCostCap(Long smartCostCap) {
    this.smartCostCap = smartCostCap;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
