package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdCreateRequest implements TokenKey {
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


  public AdCreateRequest career(List<String> career) {
    this.career = career;
    return this;
  }

  public AdCreateRequest smartBidType(String smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  public AdCreateRequest filterOwnAwemeFans(Long filterOwnAwemeFans) {
    this.filterOwnAwemeFans = filterOwnAwemeFans;
    return this;
  }

  public AdCreateRequest openUrl(String openUrl) {
    this.openUrl = openUrl;
    return this;
  }

  public AdCreateRequest deviceType(List<String> deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  public AdCreateRequest actionScene(List<String> actionScene) {
    this.actionScene = actionScene;
    return this;
  }

  public AdCreateRequest trackUrlSendType(String trackUrlSendType) {
    this.trackUrlSendType = trackUrlSendType;
    return this;
  }

  public AdCreateRequest sceneInventory(String sceneInventory) {
    this.sceneInventory = sceneInventory;
    return this;
  }

  public AdCreateRequest unionVideoType(String unionVideoType) {
    this.unionVideoType = unionVideoType;
    return this;
  }

  public AdCreateRequest awemeFanBehaviors(List<String> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public AdCreateRequest deepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
    return this;
  }

  public AdCreateRequest activateType(List<String> activateType) {
    this.activateType = activateType;
    return this;
  }

  public AdCreateRequest hideIfExists(Long hideIfExists) {
    this.hideIfExists = hideIfExists;
    return this;
  }

  public AdCreateRequest deepCpabid(Float deepCpabid) {
    this.deepCpabid = deepCpabid;
    return this;
  }

  public AdCreateRequest launchPrice(List<Long> launchPrice) {
    this.launchPrice = launchPrice;
    return this;
  }

  public AdCreateRequest roiGoal(Float roiGoal) {
    this.roiGoal = roiGoal;
    return this;
  }

  public AdCreateRequest inventoryCatalog(String inventoryCatalog) {
    this.inventoryCatalog = inventoryCatalog;
    return this;
  }

  public AdCreateRequest interestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
    return this;
  }

  public AdCreateRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdCreateRequest actionDays(Long actionDays) {
    this.actionDays = actionDays;
    return this;
  }

  public AdCreateRequest awemeFanCategories(List<Long> awemeFanCategories) {
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public AdCreateRequest lubanRoiGoal(Float lubanRoiGoal) {
    this.lubanRoiGoal = lubanRoiGoal;
    return this;
  }

  public AdCreateRequest budget(Float budget) {
    this.budget = budget;
    return this;
  }

  public AdCreateRequest videoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

  public AdCreateRequest ac(List<String> ac) {
    this.ac = ac;
    return this;
  }

  public AdCreateRequest androidOsv(String androidOsv) {
    this.androidOsv = androidOsv;
    return this;
  }

  public AdCreateRequest deliveryRange(String deliveryRange) {
    this.deliveryRange = deliveryRange;
    return this;
  }

  public AdCreateRequest convertedTimeDuration(String convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

  public AdCreateRequest actionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
    return this;
  }

  public AdCreateRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public AdCreateRequest superiorPopularityType(String superiorPopularityType) {
    this.superiorPopularityType = superiorPopularityType;
    return this;
  }

  public AdCreateRequest adjustCpa(Long adjustCpa) {
    this.adjustCpa = adjustCpa;
    return this;
  }

  public AdCreateRequest deepExternalAction(String deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
    return this;
  }

  public AdCreateRequest district(String district) {
    this.district = district;
    return this;
  }

  public AdCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdCreateRequest iosOsv(String iosOsv) {
    this.iosOsv = iosOsv;
    return this;
  }

  public AdCreateRequest inventoryType(List<String> inventoryType) {
    this.inventoryType = inventoryType;
    return this;
  }

  public AdCreateRequest autoExtendEnabled(Long autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

  public AdCreateRequest awemeFanTimeScope(String awemeFanTimeScope) {
    this.awemeFanTimeScope = awemeFanTimeScope;
    return this;
  }

  public AdCreateRequest autoExtendTargets(List<String> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public AdCreateRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

  public AdCreateRequest externalAction(String externalAction) {
    this.externalAction = externalAction;
    return this;
  }

  public AdCreateRequest city(List<Long> city) {
    this.city = city;
    return this;
  }

  public AdCreateRequest videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public AdCreateRequest platform(List<String> platform) {
    this.platform = platform;
    return this;
  }

  public AdCreateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdCreateRequest videoPlayTrackUrl(List<String> videoPlayTrackUrl) {
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

  public AdCreateRequest excludeFlowPackage(List<Long> excludeFlowPackage) {
    this.excludeFlowPackage = excludeFlowPackage;
    return this;
  }

  public AdCreateRequest businessIds(List<Long> businessIds) {
    this.businessIds = businessIds;
    return this;
  }

  public AdCreateRequest smartInventory(String smartInventory) {
    this.smartInventory = smartInventory;
    return this;
  }

  public AdCreateRequest retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public AdCreateRequest awemeFanAccounts(List<Long> awemeFanAccounts) {
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public AdCreateRequest interestWords(List<Long> interestWords) {
    this.interestWords = interestWords;
    return this;
  }

  public AdCreateRequest hideIfConverted(String hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
    return this;
  }

  public AdCreateRequest actionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public AdCreateRequest articleCategory(List<String> articleCategory) {
    this.articleCategory = articleCategory;
    return this;
  }

  public AdCreateRequest scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  public AdCreateRequest flowControlMode(String flowControlMode) {
    this.flowControlMode = flowControlMode;
    return this;
  }

  public AdCreateRequest actionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
    return this;
  }

  public AdCreateRequest audiencePackageId(Long audiencePackageId) {
    this.audiencePackageId = audiencePackageId;
    return this;
  }

  public AdCreateRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public AdCreateRequest flowPackage(List<Long> flowPackage) {
    this.flowPackage = flowPackage;
    return this;
  }

  public AdCreateRequest convertId(Long convertId) {
    this.convertId = convertId;
    return this;
  }

  public AdCreateRequest locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

  public AdCreateRequest carrier(List<String> carrier) {
    this.carrier = carrier;
    return this;
  }

  public AdCreateRequest externalActions(List<String> externalActions) {
    this.externalActions = externalActions;
    return this;
  }

  public AdCreateRequest retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public AdCreateRequest scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public AdCreateRequest deviceBrand(List<String> deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  public AdCreateRequest filterAwemeFansCount(Long filterAwemeFansCount) {
    this.filterAwemeFansCount = filterAwemeFansCount;
    return this;
  }

  public AdCreateRequest cpaBid(Float cpaBid) {
    this.cpaBid = cpaBid;
    return this;
  }

  public AdCreateRequest budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

  public AdCreateRequest interestActionMode(String interestActionMode) {
    this.interestActionMode = interestActionMode;
    return this;
  }

  public AdCreateRequest bid(Float bid) {
    this.bid = bid;
    return this;
  }

  public AdCreateRequest operation(String operation) {
    this.operation = operation;
    return this;
  }

  public AdCreateRequest age(List<String> age) {
    this.age = age;
    return this;
  }

  public AdCreateRequest pricing(String pricing) {
    this.pricing = pricing;
    return this;
  }

  public AdCreateRequest trackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
    return this;
  }

  public AdCreateRequest feedDeliverySearch(String feedDeliverySearch) {
    this.feedDeliverySearch = feedDeliverySearch;
    return this;
  }

  public AdCreateRequest geolocation(GeolocationStruct geolocationStruct) {
    this.geolocation = geolocationStruct;
    return this;
  }

  public AdCreateRequest filterAwemeAbnormalActive(Long filterAwemeAbnormalActive) {
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

