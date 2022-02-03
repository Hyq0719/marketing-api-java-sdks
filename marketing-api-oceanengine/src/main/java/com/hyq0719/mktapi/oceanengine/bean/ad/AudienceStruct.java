package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AudienceStruct {
  @SerializedName("auto_extend_enabled")
  private Long autoExtendEnabled = null;

  @SerializedName("interest_tags")
  private List<Long> interestTags = null;

  @SerializedName("aweme_fan_time_scope")
  private String awemeFanTimeScope = null;

  @SerializedName("auto_extend_targets")
  private List<String> autoExtendTargets = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("city")
  private List<Long> city = null;

  @SerializedName("filter_own_aweme_fans")
  private Long filterOwnAwemeFans = null;

  @SerializedName("app_behavior_target")
  private String appBehaviorTarget = null;

  @SerializedName("ad_tag")
  private List<Long> adTag = null;

  @SerializedName("device_type")
  private List<String> deviceType = null;

  @SerializedName("platform")
  private List<String> platform = null;

  @SerializedName("exclude_flow_package")
  private List<Long> excludeFlowPackage = null;

  @SerializedName("business_ids")
  private List<Long> businessIds = null;

  @SerializedName("aweme_fan_behaviors")
  private List<String> awemeFanBehaviors = null;

  @SerializedName("activate_type")
  private List<String> activateType = null;

  @SerializedName("launch_price")
  private List<Long> launchPrice = null;

  @SerializedName("action")
  private ActionStruct actionStruct = null;

  @SerializedName("retargeting_tags_exclude")
  private List<Long> retargetingTagsExclude = null;

  @SerializedName("aweme_fan_accounts")
  private List<Long> awemeFanAccounts = null;

  @SerializedName("interest_categories")
  private List<Long> interestCategories = null;

  @SerializedName("interest_words")
  private List<Long> interestWords = null;

  @SerializedName("aweme_fan_categories")
  private List<Long> awemeFanCategories = null;

  @SerializedName("aweme_fans_numbers")
  private List<Long> awemeFansNumbers = null;

  @SerializedName("article_category")
  private List<String> articleCategory = null;

  @SerializedName("ac")
  private List<String> ac = null;

  @SerializedName("android_osv")
  private String androidOsv = null;

  @SerializedName("app_ids")
  private List<Long> appIds = null;

  @SerializedName("flow_package")
  private List<Long> flowPackage = null;

  @SerializedName("location_type")
  private String locationType = null;

  @SerializedName("carrier")
  private List<String> carrier = null;

  @SerializedName("retargeting_tags_include")
  private List<Long> retargetingTagsInclude = null;

  @SerializedName("superior_popularity_type")
  private String superiorPopularityType = null;

  @SerializedName("device_brand")
  private List<String> deviceBrand = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("filter_aweme_fans_count")
  private Long filterAwemeFansCount = null;

  @SerializedName("ios_osv")
  private String iosOsv = null;

  @SerializedName("app_category")
  private List<Long> appCategory = null;

  @SerializedName("interest_action_mode")
  private String interestActionMode = null;

  @SerializedName("age")
  private List<String> age = null;

  @SerializedName("geolocation")
  private List<GeolocationStruct> geolocationStruct = null;

  @SerializedName("filter_aweme_abnormal_active")
  private Long filterAwemeAbnormalActive = null;


  public AudienceStruct autoExtendEnabled(Long autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

  public AudienceStruct interestTags(List<Long> interestTags) {
    this.interestTags = interestTags;
    return this;
  }

  public AudienceStruct awemeFanTimeScope(String awemeFanTimeScope) {
    this.awemeFanTimeScope = awemeFanTimeScope;
    return this;
  }

  public AudienceStruct autoExtendTargets(List<String> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public AudienceStruct gender(String gender) {
    this.gender = gender;
    return this;
  }

  public AudienceStruct city(List<Long> city) {
    this.city = city;
    return this;
  }

  public AudienceStruct filterOwnAwemeFans(Long filterOwnAwemeFans) {
    this.filterOwnAwemeFans = filterOwnAwemeFans;
    return this;
  }

  public AudienceStruct appBehaviorTarget(String appBehaviorTarget) {
    this.appBehaviorTarget = appBehaviorTarget;
    return this;
  }

  public AudienceStruct adTag(List<Long> adTag) {
    this.adTag = adTag;
    return this;
  }

  public AudienceStruct deviceType(List<String> deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  public AudienceStruct platform(List<String> platform) {
    this.platform = platform;
    return this;
  }

  public AudienceStruct excludeFlowPackage(List<Long> excludeFlowPackage) {
    this.excludeFlowPackage = excludeFlowPackage;
    return this;
  }

  public AudienceStruct businessIds(List<Long> businessIds) {
    this.businessIds = businessIds;
    return this;
  }

  public AudienceStruct awemeFanBehaviors(List<String> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public AudienceStruct activateType(List<String> activateType) {
    this.activateType = activateType;
    return this;
  }

  public AudienceStruct launchPrice(List<Long> launchPrice) {
    this.launchPrice = launchPrice;
    return this;
  }

  public AudienceStruct action(ActionStruct actionStruct) {
    this.actionStruct = actionStruct;
    return this;
  }

  public AudienceStruct retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public AudienceStruct awemeFanAccounts(List<Long> awemeFanAccounts) {
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public AudienceStruct interestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
    return this;
  }

  public AudienceStruct interestWords(List<Long> interestWords) {
    this.interestWords = interestWords;
    return this;
  }

  public AudienceStruct awemeFanCategories(List<Long> awemeFanCategories) {
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public AudienceStruct awemeFansNumbers(List<Long> awemeFansNumbers) {
    this.awemeFansNumbers = awemeFansNumbers;
    return this;
  }

  public AudienceStruct articleCategory(List<String> articleCategory) {
    this.articleCategory = articleCategory;
    return this;
  }

  public AudienceStruct ac(List<String> ac) {
    this.ac = ac;
    return this;
  }

  public AudienceStruct androidOsv(String androidOsv) {
    this.androidOsv = androidOsv;
    return this;
  }

  public AudienceStruct appIds(List<Long> appIds) {
    this.appIds = appIds;
    return this;
  }

  public AudienceStruct flowPackage(List<Long> flowPackage) {
    this.flowPackage = flowPackage;
    return this;
  }

  public AudienceStruct locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

  public AudienceStruct carrier(List<String> carrier) {
    this.carrier = carrier;
    return this;
  }

  public AudienceStruct retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public AudienceStruct superiorPopularityType(String superiorPopularityType) {
    this.superiorPopularityType = superiorPopularityType;
    return this;
  }

  public AudienceStruct deviceBrand(List<String> deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  public AudienceStruct district(String district) {
    this.district = district;
    return this;
  }

  public AudienceStruct filterAwemeFansCount(Long filterAwemeFansCount) {
    this.filterAwemeFansCount = filterAwemeFansCount;
    return this;
  }

  public AudienceStruct iosOsv(String iosOsv) {
    this.iosOsv = iosOsv;
    return this;
  }

  public AudienceStruct appCategory(List<Long> appCategory) {
    this.appCategory = appCategory;
    return this;
  }

  public AudienceStruct interestActionMode(String interestActionMode) {
    this.interestActionMode = interestActionMode;
    return this;
  }

  public AudienceStruct age(List<String> age) {
    this.age = age;
    return this;
  }

  public AudienceStruct geolocation(List<GeolocationStruct> geolocationStruct) {
    this.geolocationStruct = geolocationStruct;
    return this;
  }

  public AudienceStruct filterAwemeAbnormalActive(Long filterAwemeAbnormalActive) {
    this.filterAwemeAbnormalActive = filterAwemeAbnormalActive;
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
