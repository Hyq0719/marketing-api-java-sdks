package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdsAddRequest implements TokenKey {
  @SerializedName("career")
  private List<String> career = null;

  @SerializedName("smart_bid_type")
  private String smartBidType = null;

  @SerializedName("filter_own_aweme_fans")
  private Long filterOwnAwemeFans = null;

  @SerializedName("open_url")
  private String openUrl = null;

  @SerializedName("device_type")
  private List<String> deviceType = null;

  @SerializedName("action_scene")
  private List<String> actionScene = null;

  @SerializedName("track_url_send_type")
  private String trackUrlSendType = null;

  @SerializedName("scene_inventory")
  private String sceneInventory = null;

  @SerializedName("union_video_type")
  private String unionVideoType = null;

  @SerializedName("aweme_fan_behaviors")
  private List<String> awemeFanBehaviors = null;

  @SerializedName("deep_bid_type")
  private String deepBidType = null;

  @SerializedName("activate_type")
  private List<String> activateType = null;

  @SerializedName("hide_if_exists")
  private Long hideIfExists = null;

  @SerializedName("deep_cpabid")
  private Float deepCpabid = null;

  @SerializedName("launch_price")
  private List<Long> launchPrice = null;

  @SerializedName("roi_goal")
  private Float roiGoal = null;

  @SerializedName("inventory_catalog")
  private String inventoryCatalog = null;

  @SerializedName("interest_categories")
  private List<Long> interestCategories = null;

  @SerializedName("campaign_id")
  private String campaignId = null;

  @SerializedName("action_days")
  private Long actionDays = null;

  @SerializedName("aweme_fan_categories")
  private List<Long> awemeFanCategories = null;

  @SerializedName("luban_roi_goal")
  private Float lubanRoiGoal = null;

  @SerializedName("budget")
  private Float budget = null;

  @SerializedName("video_play_done_track_url")
  private List<String> videoPlayDoneTrackUrl = null;

  @SerializedName("ac")
  private List<String> ac = null;

  @SerializedName("android_osv")
  private String androidOsv = null;

  @SerializedName("delivery_range")
  private String deliveryRange = null;

  @SerializedName("converted_time_duration")
  private String convertedTimeDuration = null;

  @SerializedName("action_categories")
  private List<Long> actionCategories = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("superior_popularity_type")
  private String superiorPopularityType = null;

  @SerializedName("adjust_cpa")
  private Long adjustCpa = null;

  @SerializedName("deep_external_action")
  private String deepExternalAction = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ios_osv")
  private String iosOsv = null;

  @SerializedName("inventory_type")
  private List<String> inventoryType = null;

  @SerializedName("auto_extend_enabled")
  private Long autoExtendEnabled = null;

  @SerializedName("aweme_fan_time_scope")
  private String awemeFanTimeScope = null;

  @SerializedName("auto_extend_targets")
  private List<String> autoExtendTargets = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("external_action")
  private String externalAction = null;

  @SerializedName("city")
  private List<Long> city = null;

  @SerializedName("video_play_effective_track_url")
  private List<String> videoPlayEffectiveTrackUrl = null;

  @SerializedName("platform")
  private List<String> platform = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("video_play_track_url")
  private List<String> videoPlayTrackUrl = null;

  @SerializedName("exclude_flow_package")
  private List<Long> excludeFlowPackage = null;

  @SerializedName("business_ids")
  private List<Long> businessIds = null;

  @SerializedName("smart_inventory")
  private String smartInventory = null;

  @SerializedName("retargeting_tags_exclude")
  private List<Long> retargetingTagsExclude = null;

  @SerializedName("aweme_fan_accounts")
  private List<Long> awemeFanAccounts = null;

  @SerializedName("interest_words")
  private List<Long> interestWords = null;

  @SerializedName("hide_if_converted")
  private String hideIfConverted = null;

  @SerializedName("action_track_url")
  private List<String> actionTrackUrl = null;

  @SerializedName("article_category")
  private List<String> articleCategory = null;

  @SerializedName("schedule_type")
  private String scheduleType = null;

  @SerializedName("flow_control_mode")
  private String flowControlMode = null;

  @SerializedName("action_words")
  private List<Long> actionWords = null;

  @SerializedName("audience_package_id")
  private Long audiencePackageId = null;

  @SerializedName("end_time")
  private String endTime = null;

  @SerializedName("flow_package")
  private List<Long> flowPackage = null;

  @SerializedName("convert_id")
  private Long convertId = null;

  @SerializedName("location_type")
  private String locationType = null;

  @SerializedName("carrier")
  private List<String> carrier = null;

  @SerializedName("external_actions")
  private List<String> externalActions = null;

  @SerializedName("retargeting_tags_include")
  private List<Long> retargetingTagsInclude = null;

  @SerializedName("schedule_time")
  private String scheduleTime = null;

  @SerializedName("device_brand")
  private List<String> deviceBrand = null;

  @SerializedName("filter_aweme_fans_count")
  private Long filterAwemeFansCount = null;

  @SerializedName("cpa_bid")
  private Float cpaBid = null;

  @SerializedName("budget_mode")
  private String budgetMode = null;

  @SerializedName("interest_action_mode")
  private String interestActionMode = null;

  @SerializedName("bid")
  private Float bid = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("age")
  private List<String> age = null;

  @SerializedName("pricing")
  private String pricing = null;

  @SerializedName("track_url")
  private List<String> trackUrl = null;

  @SerializedName("feed_delivery_search")
  private String feedDeliverySearch = null;

  @SerializedName("geolocation")
  private GeolocationStruct geolocation = null;

  @SerializedName("filter_aweme_abnormal_active")
  private Long filterAwemeAbnormalActive = null;


  public AdsAddRequest career(List<String> career) {
    this.career = career;
    return this;
  }

  public AdsAddRequest smartBidType(String smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  public AdsAddRequest filterOwnAwemeFans(Long filterOwnAwemeFans) {
    this.filterOwnAwemeFans = filterOwnAwemeFans;
    return this;
  }

  public AdsAddRequest openUrl(String openUrl) {
    this.openUrl = openUrl;
    return this;
  }

  public AdsAddRequest deviceType(List<String> deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  public AdsAddRequest actionScene(List<String> actionScene) {
    this.actionScene = actionScene;
    return this;
  }

  public AdsAddRequest trackUrlSendType(String trackUrlSendType) {
    this.trackUrlSendType = trackUrlSendType;
    return this;
  }

  public AdsAddRequest sceneInventory(String sceneInventory) {
    this.sceneInventory = sceneInventory;
    return this;
  }

  public AdsAddRequest unionVideoType(String unionVideoType) {
    this.unionVideoType = unionVideoType;
    return this;
  }

  public AdsAddRequest awemeFanBehaviors(List<String> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public AdsAddRequest deepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
    return this;
  }

  public AdsAddRequest activateType(List<String> activateType) {
    this.activateType = activateType;
    return this;
  }

  public AdsAddRequest hideIfExists(Long hideIfExists) {
    this.hideIfExists = hideIfExists;
    return this;
  }

  public AdsAddRequest deepCpabid(Float deepCpabid) {
    this.deepCpabid = deepCpabid;
    return this;
  }

  public AdsAddRequest launchPrice(List<Long> launchPrice) {
    this.launchPrice = launchPrice;
    return this;
  }

  public AdsAddRequest roiGoal(Float roiGoal) {
    this.roiGoal = roiGoal;
    return this;
  }

  public AdsAddRequest inventoryCatalog(String inventoryCatalog) {
    this.inventoryCatalog = inventoryCatalog;
    return this;
  }

  public AdsAddRequest interestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
    return this;
  }

  public AdsAddRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdsAddRequest actionDays(Long actionDays) {
    this.actionDays = actionDays;
    return this;
  }

  public AdsAddRequest awemeFanCategories(List<Long> awemeFanCategories) {
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public AdsAddRequest lubanRoiGoal(Float lubanRoiGoal) {
    this.lubanRoiGoal = lubanRoiGoal;
    return this;
  }

  public AdsAddRequest budget(Float budget) {
    this.budget = budget;
    return this;
  }

  public AdsAddRequest videoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

  public AdsAddRequest ac(List<String> ac) {
    this.ac = ac;
    return this;
  }

  public AdsAddRequest androidOsv(String androidOsv) {
    this.androidOsv = androidOsv;
    return this;
  }

  public AdsAddRequest deliveryRange(String deliveryRange) {
    this.deliveryRange = deliveryRange;
    return this;
  }

  public AdsAddRequest convertedTimeDuration(String convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

  public AdsAddRequest actionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
    return this;
  }

  public AdsAddRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public AdsAddRequest superiorPopularityType(String superiorPopularityType) {
    this.superiorPopularityType = superiorPopularityType;
    return this;
  }

  public AdsAddRequest adjustCpa(Long adjustCpa) {
    this.adjustCpa = adjustCpa;
    return this;
  }

  public AdsAddRequest deepExternalAction(String deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
    return this;
  }

  public AdsAddRequest district(String district) {
    this.district = district;
    return this;
  }

  public AdsAddRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdsAddRequest iosOsv(String iosOsv) {
    this.iosOsv = iosOsv;
    return this;
  }

  public AdsAddRequest inventoryType(List<String> inventoryType) {
    this.inventoryType = inventoryType;
    return this;
  }

  public AdsAddRequest autoExtendEnabled(Long autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

  public AdsAddRequest awemeFanTimeScope(String awemeFanTimeScope) {
    this.awemeFanTimeScope = awemeFanTimeScope;
    return this;
  }

  public AdsAddRequest autoExtendTargets(List<String> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public AdsAddRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

  public AdsAddRequest externalAction(String externalAction) {
    this.externalAction = externalAction;
    return this;
  }

  public AdsAddRequest city(List<Long> city) {
    this.city = city;
    return this;
  }

  public AdsAddRequest videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public AdsAddRequest platform(List<String> platform) {
    this.platform = platform;
    return this;
  }

  public AdsAddRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdsAddRequest videoPlayTrackUrl(List<String> videoPlayTrackUrl) {
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

  public AdsAddRequest excludeFlowPackage(List<Long> excludeFlowPackage) {
    this.excludeFlowPackage = excludeFlowPackage;
    return this;
  }

  public AdsAddRequest businessIds(List<Long> businessIds) {
    this.businessIds = businessIds;
    return this;
  }

  public AdsAddRequest smartInventory(String smartInventory) {
    this.smartInventory = smartInventory;
    return this;
  }

  public AdsAddRequest retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public AdsAddRequest awemeFanAccounts(List<Long> awemeFanAccounts) {
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public AdsAddRequest interestWords(List<Long> interestWords) {
    this.interestWords = interestWords;
    return this;
  }

  public AdsAddRequest hideIfConverted(String hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
    return this;
  }

  public AdsAddRequest actionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public AdsAddRequest articleCategory(List<String> articleCategory) {
    this.articleCategory = articleCategory;
    return this;
  }

  public AdsAddRequest scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  public AdsAddRequest flowControlMode(String flowControlMode) {
    this.flowControlMode = flowControlMode;
    return this;
  }

  public AdsAddRequest actionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
    return this;
  }

  public AdsAddRequest audiencePackageId(Long audiencePackageId) {
    this.audiencePackageId = audiencePackageId;
    return this;
  }

  public AdsAddRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public AdsAddRequest flowPackage(List<Long> flowPackage) {
    this.flowPackage = flowPackage;
    return this;
  }

  public AdsAddRequest convertId(Long convertId) {
    this.convertId = convertId;
    return this;
  }

  public AdsAddRequest locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

  public AdsAddRequest carrier(List<String> carrier) {
    this.carrier = carrier;
    return this;
  }

  public AdsAddRequest externalActions(List<String> externalActions) {
    this.externalActions = externalActions;
    return this;
  }

  public AdsAddRequest retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public AdsAddRequest scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public AdsAddRequest deviceBrand(List<String> deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  public AdsAddRequest filterAwemeFansCount(Long filterAwemeFansCount) {
    this.filterAwemeFansCount = filterAwemeFansCount;
    return this;
  }

  public AdsAddRequest cpaBid(Float cpaBid) {
    this.cpaBid = cpaBid;
    return this;
  }

  public AdsAddRequest budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

  public AdsAddRequest interestActionMode(String interestActionMode) {
    this.interestActionMode = interestActionMode;
    return this;
  }

  public AdsAddRequest bid(Float bid) {
    this.bid = bid;
    return this;
  }

  public AdsAddRequest operation(String operation) {
    this.operation = operation;
    return this;
  }

  public AdsAddRequest age(List<String> age) {
    this.age = age;
    return this;
  }

  public AdsAddRequest pricing(String pricing) {
    this.pricing = pricing;
    return this;
  }

  public AdsAddRequest trackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
    return this;
  }

  public AdsAddRequest feedDeliverySearch(String feedDeliverySearch) {
    this.feedDeliverySearch = feedDeliverySearch;
    return this;
  }

  public AdsAddRequest geolocation(GeolocationStruct geolocationStruct) {
    this.geolocation = geolocationStruct;
    return this;
  }

  public AdsAddRequest filterAwemeAbnormalActive(Long filterAwemeAbnormalActive) {
    this.filterAwemeAbnormalActive = filterAwemeAbnormalActive;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}

