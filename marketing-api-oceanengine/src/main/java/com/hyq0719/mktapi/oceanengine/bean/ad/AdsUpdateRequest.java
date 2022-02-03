package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdsUpdateRequest implements TokenKey {
  @SerializedName("career")
  private List<String> career = null;

  @SerializedName("smart_bid_type")
  private String smartBidType = null;

  @SerializedName("filter_own_aweme_fans")
  private Long filterOwnAwemeFans = null;

  @SerializedName("device_type")
  private List<String> deviceType = null;

  @SerializedName("action_scene")
  private List<String> actionScene = null;

  @SerializedName("track_url_send_type")
  private String trackUrlSendType = null;

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

  @SerializedName("district")
  private String district = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ios_osv")
  private String iosOsv = null;

  @SerializedName("auto_extend_enabled")
  private Long autoExtendEnabled = null;

  @SerializedName("aweme_fan_time_scope")
  private String awemeFanTimeScope = null;

  @SerializedName("auto_extend_targets")
  private List<String> autoExtendTargets = null;

  @SerializedName("gender")
  private String gender = null;

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

  @SerializedName("location_type")
  private String locationType = null;

  @SerializedName("carrier")
  private List<String> carrier = null;

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

  @SerializedName("age")
  private List<String> age = null;

  @SerializedName("pricing")
  private String pricing = null;

  @SerializedName("track_url")
  private List<String> trackUrl = null;

  @SerializedName("feed_delivery_search")
  private String feedDeliverySearch = null;

  @SerializedName("geolocation")
  private GeolocationStruct geolocationStruct = null;

  @SerializedName("filter_aweme_abnormal_active")
  private Long filterAwemeAbnormalActive = null;


  public AdsUpdateRequest career(List<String> career) {
    this.career = career;
    return this;
  }

  public AdsUpdateRequest smartBidType(String smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  public AdsUpdateRequest filterOwnAwemeFans(Long filterOwnAwemeFans) {
    this.filterOwnAwemeFans = filterOwnAwemeFans;
    return this;
  }

  public AdsUpdateRequest deviceType(List<String> deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  public AdsUpdateRequest actionScene(List<String> actionScene) {
    this.actionScene = actionScene;
    return this;
  }

  public AdsUpdateRequest trackUrlSendType(String trackUrlSendType) {
    this.trackUrlSendType = trackUrlSendType;
    return this;
  }

  public AdsUpdateRequest awemeFanBehaviors(List<String> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public AdsUpdateRequest deepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
    return this;
  }

  public AdsUpdateRequest activateType(List<String> activateType) {
    this.activateType = activateType;
    return this;
  }

  public AdsUpdateRequest hideIfExists(Long hideIfExists) {
    this.hideIfExists = hideIfExists;
    return this;
  }

  public AdsUpdateRequest deepCpabid(Float deepCpabid) {
    this.deepCpabid = deepCpabid;
    return this;
  }

  public AdsUpdateRequest launchPrice(List<Long> launchPrice) {
    this.launchPrice = launchPrice;
    return this;
  }

  public AdsUpdateRequest roiGoal(Float roiGoal) {
    this.roiGoal = roiGoal;
    return this;
  }

  public AdsUpdateRequest interestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
    return this;
  }

  public AdsUpdateRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdsUpdateRequest actionDays(Long actionDays) {
    this.actionDays = actionDays;
    return this;
  }

  public AdsUpdateRequest awemeFanCategories(List<Long> awemeFanCategories) {
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public AdsUpdateRequest lubanRoiGoal(Float lubanRoiGoal) {
    this.lubanRoiGoal = lubanRoiGoal;
    return this;
  }

  public AdsUpdateRequest budget(Float budget) {
    this.budget = budget;
    return this;
  }

  public AdsUpdateRequest videoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

  public AdsUpdateRequest ac(List<String> ac) {
    this.ac = ac;
    return this;
  }

  public AdsUpdateRequest androidOsv(String androidOsv) {
    this.androidOsv = androidOsv;
    return this;
  }

  public AdsUpdateRequest convertedTimeDuration(String convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

  public AdsUpdateRequest actionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
    return this;
  }

  public AdsUpdateRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public AdsUpdateRequest superiorPopularityType(String superiorPopularityType) {
    this.superiorPopularityType = superiorPopularityType;
    return this;
  }

  public AdsUpdateRequest adjustCpa(Long adjustCpa) {
    this.adjustCpa = adjustCpa;
    return this;
  }

  public AdsUpdateRequest district(String district) {
    this.district = district;
    return this;
  }

  public AdsUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdsUpdateRequest iosOsv(String iosOsv) {
    this.iosOsv = iosOsv;
    return this;
  }

  public AdsUpdateRequest autoExtendEnabled(Long autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

  public AdsUpdateRequest awemeFanTimeScope(String awemeFanTimeScope) {
    this.awemeFanTimeScope = awemeFanTimeScope;
    return this;
  }

  public AdsUpdateRequest autoExtendTargets(List<String> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public AdsUpdateRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

  public AdsUpdateRequest city(List<Long> city) {
    this.city = city;
    return this;
  }

  public AdsUpdateRequest videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public AdsUpdateRequest platform(List<String> platform) {
    this.platform = platform;
    return this;
  }

  public AdsUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdsUpdateRequest videoPlayTrackUrl(List<String> videoPlayTrackUrl) {
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

  public AdsUpdateRequest excludeFlowPackage(List<Long> excludeFlowPackage) {
    this.excludeFlowPackage = excludeFlowPackage;
    return this;
  }

  public AdsUpdateRequest businessIds(List<Long> businessIds) {
    this.businessIds = businessIds;
    return this;
  }

  public AdsUpdateRequest retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public AdsUpdateRequest awemeFanAccounts(List<Long> awemeFanAccounts) {
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public AdsUpdateRequest interestWords(List<Long> interestWords) {
    this.interestWords = interestWords;
    return this;
  }

  public AdsUpdateRequest hideIfConverted(String hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
    return this;
  }

  public AdsUpdateRequest actionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public AdsUpdateRequest articleCategory(List<String> articleCategory) {
    this.articleCategory = articleCategory;
    return this;
  }

  public AdsUpdateRequest scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  public AdsUpdateRequest flowControlMode(String flowControlMode) {
    this.flowControlMode = flowControlMode;
    return this;
  }

  public AdsUpdateRequest actionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
    return this;
  }

  public AdsUpdateRequest audiencePackageId(Long audiencePackageId) {
    this.audiencePackageId = audiencePackageId;
    return this;
  }

  public AdsUpdateRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public AdsUpdateRequest flowPackage(List<Long> flowPackage) {
    this.flowPackage = flowPackage;
    return this;
  }

  public AdsUpdateRequest locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

  public AdsUpdateRequest carrier(List<String> carrier) {
    this.carrier = carrier;
    return this;
  }

  public AdsUpdateRequest retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public AdsUpdateRequest scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public AdsUpdateRequest deviceBrand(List<String> deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  public AdsUpdateRequest filterAwemeFansCount(Long filterAwemeFansCount) {
    this.filterAwemeFansCount = filterAwemeFansCount;
    return this;
  }

  public AdsUpdateRequest cpaBid(Float cpaBid) {
    this.cpaBid = cpaBid;
    return this;
  }

  public AdsUpdateRequest budgetMode(String budgetMode) {
    this.budgetMode = budgetMode;
    return this;
  }

  public AdsUpdateRequest interestActionMode(String interestActionMode) {
    this.interestActionMode = interestActionMode;
    return this;
  }

  public AdsUpdateRequest bid(Float bid) {
    this.bid = bid;
    return this;
  }

  public AdsUpdateRequest age(List<String> age) {
    this.age = age;
    return this;
  }

  public AdsUpdateRequest pricing(String pricing) {
    this.pricing = pricing;
    return this;
  }

  public AdsUpdateRequest trackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
    return this;
  }

  public AdsUpdateRequest feedDeliverySearch(String feedDeliverySearch) {
    this.feedDeliverySearch = feedDeliverySearch;
    return this;
  }

  public AdsUpdateRequest geolocation(GeolocationStruct geolocationStruct) {
    this.geolocationStruct = geolocationStruct;
    return this;
  }

  public AdsUpdateRequest filterAwemeAbnormalActive(Long filterAwemeAbnormalActive) {
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
