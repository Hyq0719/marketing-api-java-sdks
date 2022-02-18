package com.hyq0719.mktapi.tencent.bean.adgroups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.tencent.bean.TokenKey;
import com.hyq0719.mktapi.tencent.bean.common.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * AdgroupsAddRequest
 */
@Data
public class AdgroupsAddRequest implements TokenKey {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("promoted_object_type")
  private String promotedObjectType = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("first_day_begin_time")
  private String firstDayBeginTime = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("billing_event")
  private String billingEvent = null;

  @SerializedName("bid_amount")
  private Long bidAmount = null;

  @SerializedName("optimization_goal")
  private String optimizationGoal = null;

  @SerializedName("time_series")
  private String timeSeries = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("targeting")
  private WriteTargetingSettingForAdgroup targeting = null;

  @SerializedName("scene_spec")
  private SceneTargetingForWrite sceneSpec = null;

  @SerializedName("configured_status")
  private String configuredStatus = null;

  @SerializedName("customized_category")
  private String customizedCategory = null;

  @SerializedName("dynamic_ad_spec")
  private DynamicAdSpec dynamicAdSpec = null;

  @SerializedName("user_action_sets")
  private List<UserActionSetStruct> userActionSets = null;

  @SerializedName("additional_user_action_sets")
  private List<UserActionSetStruct> additionalUserActionSets = null;

  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("is_rewarded_video_ad")
  private Boolean isRewardedVideoAd = null;

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

  @SerializedName("bid_mode")
  private String bidMode = null;

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

  @SerializedName("account_id")
  private Long accountId = null;

  public AdgroupsAddRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdgroupsAddRequest adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  public AdgroupsAddRequest promotedObjectType(String promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  public AdgroupsAddRequest beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  public AdgroupsAddRequest firstDayBeginTime(String firstDayBeginTime) {
    this.firstDayBeginTime = firstDayBeginTime;
    return this;
  }

  public AdgroupsAddRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdgroupsAddRequest billingEvent(String billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

  public AdgroupsAddRequest bidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
    return this;
  }

  public AdgroupsAddRequest optimizationGoal(String optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  public AdgroupsAddRequest timeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public AdgroupsAddRequest automaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
    return this;
  }

  public AdgroupsAddRequest siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdgroupsAddRequest addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  public AdgroupsAddRequest dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdgroupsAddRequest promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  public AdgroupsAddRequest appAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
    return this;
  }


  public AdgroupsAddRequest targetingId(Long targetingId) {
    this.targetingId = targetingId;
    return this;
  }

  public AdgroupsAddRequest targeting(WriteTargetingSettingForAdgroup targeting) {
    this.targeting = targeting;
    return this;
  }

  public AdgroupsAddRequest sceneSpec(SceneTargetingForWrite sceneSpec) {
    this.sceneSpec = sceneSpec;
    return this;
  }

  public AdgroupsAddRequest configuredStatus(String configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  public AdgroupsAddRequest customizedCategory(String customizedCategory) {
    this.customizedCategory = customizedCategory;
    return this;
  }

  public AdgroupsAddRequest dynamicAdSpec(DynamicAdSpec dynamicAdSpec) {
    this.dynamicAdSpec = dynamicAdSpec;
    return this;
  }

  public AdgroupsAddRequest userActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
    return this;
  }

  public AdgroupsAddRequest addUserActionSetsItem(UserActionSetStruct userActionSetsItem) {
    if (this.userActionSets == null) {
      this.userActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.userActionSets.add(userActionSetsItem);
    return this;
  }

  public AdgroupsAddRequest additionalUserActionSets(
    List<UserActionSetStruct> additionalUserActionSets) {
    this.additionalUserActionSets = additionalUserActionSets;
    return this;
  }

  public AdgroupsAddRequest addAdditionalUserActionSetsItem(
    UserActionSetStruct additionalUserActionSetsItem) {
    if (this.additionalUserActionSets == null) {
      this.additionalUserActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.additionalUserActionSets.add(additionalUserActionSetsItem);
    return this;
  }

  public AdgroupsAddRequest dynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
    return this;
  }

  public AdgroupsAddRequest isRewardedVideoAd(Boolean isRewardedVideoAd) {
    this.isRewardedVideoAd = isRewardedVideoAd;
    return this;
  }

  public AdgroupsAddRequest bidStrategy(String bidStrategy) {
    this.bidStrategy = bidStrategy;
    return this;
  }

  public AdgroupsAddRequest coldStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
    return this;
  }

  public AdgroupsAddRequest addColdStartAudienceItem(Long coldStartAudienceItem) {
    if (this.coldStartAudience == null) {
      this.coldStartAudience = new ArrayList<Long>();
    }
    this.coldStartAudience.add(coldStartAudienceItem);
    return this;
  }

  public AdgroupsAddRequest autoAudience(Boolean autoAudience) {
    this.autoAudience = autoAudience;
    return this;
  }

  public AdgroupsAddRequest expandEnabled(Boolean expandEnabled) {
    this.expandEnabled = expandEnabled;
    return this;
  }

  public AdgroupsAddRequest expandTargeting(List<String> expandTargeting) {
    this.expandTargeting = expandTargeting;
    return this;
  }

  public AdgroupsAddRequest addExpandTargetingItem(String expandTargetingItem) {
    if (this.expandTargeting == null) {
      this.expandTargeting = new ArrayList<String>();
    }
    this.expandTargeting.add(expandTargetingItem);
    return this;
  }

  public AdgroupsAddRequest deepConversionSpec(DeepConversionSpec deepConversionSpec) {
    this.deepConversionSpec = deepConversionSpec;
    return this;
  }

  public AdgroupsAddRequest deepOptimizationActionType(
    String deepOptimizationActionType) {
    this.deepOptimizationActionType = deepOptimizationActionType;
    return this;
  }

  public AdgroupsAddRequest poiList(List<String> poiList) {
    this.poiList = poiList;
    return this;
  }

  public AdgroupsAddRequest addPoiListItem(String poiListItem) {
    if (this.poiList == null) {
      this.poiList = new ArrayList<String>();
    }
    this.poiList.add(poiListItem);
    return this;
  }

  public AdgroupsAddRequest conversionId(Long conversionId) {
    this.conversionId = conversionId;
    return this;
  }

  public AdgroupsAddRequest deepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
    return this;
  }

  public AdgroupsAddRequest deepConversionWorthRate(Double deepConversionWorthRate) {
    this.deepConversionWorthRate = deepConversionWorthRate;
    return this;
  }

  public AdgroupsAddRequest bidMode(String bidMode) {
    this.bidMode = bidMode;
    return this;
  }

  public AdgroupsAddRequest bidAdjustment(BidAdjustment bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
    return this;
  }

  public AdgroupsAddRequest autoAcquisitionEnabled(Boolean autoAcquisitionEnabled) {
    this.autoAcquisitionEnabled = autoAcquisitionEnabled;
    return this;
  }

  public AdgroupsAddRequest autoAcquisitionBudget(Long autoAcquisitionBudget) {
    this.autoAcquisitionBudget = autoAcquisitionBudget;
    return this;
  }

  public AdgroupsAddRequest creativeDisplayType(String creativeDisplayType) {
    this.creativeDisplayType = creativeDisplayType;
    return this;
  }

  public AdgroupsAddRequest autoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
    this.autoDerivedCreativeEnabled = autoDerivedCreativeEnabled;
    return this;
  }

  public AdgroupsAddRequest smartBidType(String smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  public AdgroupsAddRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(accountId);
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
