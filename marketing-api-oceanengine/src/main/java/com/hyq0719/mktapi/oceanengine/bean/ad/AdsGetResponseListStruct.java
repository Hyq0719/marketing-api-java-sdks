package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdsGetResponseListStruct {
  @SerializedName("storepro_pack_id")
  private Long storeproPackId = null;

  @SerializedName("app_type")
  private String appType = null;

  @SerializedName("open_url")
  private String openUrl = null;

  @SerializedName("dpa_open_url_type")
  private String dpaOpenUrlType = null;

  @SerializedName("dpa_province")
  private Long dpaProvince = null;

  @SerializedName("track_url_send_type")
  private String trackUrlSendType = null;

  @SerializedName("asset_id")
  private Long assetId = null;

  @SerializedName("app_thumbnails")
  private List<String> appThumbnails = null;

  @SerializedName("dpa_city")
  private Long dpaCity = null;

  @SerializedName("ad_modify_time")
  private String adModifyTime = null;

  @SerializedName("dpa_external_urls")
  private List<String> dpaExternalUrls = null;

  @SerializedName("product_platform_id")
  private Long productPlatformId = null;

  @SerializedName("scene_inventory")
  private String sceneInventory = null;

  @SerializedName("union_video_type")
  private String unionVideoType = null;

  @SerializedName("external_url")
  private String externalUrl = null;

  @SerializedName("hide_if_exists")
  private Long hideIfExists = null;

  @SerializedName("product_id")
  private String productId = null;

  @SerializedName("inventory_catalog")
  private String inventoryCatalog = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  @SerializedName("download_mode")
  private String downloadMode = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("video_play_done_track_url")
  private List<String> videoPlayDoneTrackUrl = null;

  @SerializedName("dpa_external_url_field")
  private String dpaExternalUrlField = null;

  @SerializedName("promotion_type")
  private String promotionType = null;

  @SerializedName("audience")
  private AudienceStruct audience = null;

  @SerializedName("advertiser_store_ids")
  private List<Long> advertiserStoreIds = null;

  @SerializedName("package")
  private String adPackage = null;

  @SerializedName("delivery_range")
  private String deliveryRange = null;

  @SerializedName("dpa_adtype")
  private String dpaAdtype = null;

  @SerializedName("storepro_unit")
  private String storeproUnit = null;

  @SerializedName("aweme_account")
  private String awemeAccount = null;

  @SerializedName("converted_time_duration")
  private String convertedTimeDuration = null;

  @SerializedName("store_type")
  private String storeType = null;

  @SerializedName("ad_create_time")
  private String adCreateTime = null;

  @SerializedName("dpa_categories")
  private List<Long> dpaCategories = null;

  @SerializedName("dpa_open_url_field")
  private String dpaOpenUrlField = null;

  @SerializedName("params_type")
  private String paramsType = null;

  @SerializedName("dpa_product_target")
  private List<DpaProductTargetStruct> dpaProductTarget = null;

  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("dpa_open_urls")
  private List<String> dpaOpenUrls = null;

  @SerializedName("deep_external_action")
  private String deepExternalAction = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("inventory_type")
  private List<String> inventoryType = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("dpa_local_audience")
  private Long dpaLocalAudience = null;

  @SerializedName("dpa_lbs")
  private Long dpaLbs = null;

  @SerializedName("subscribe_url")
  private String subscribeUrl = null;

  @SerializedName("form_index")
  private Long formIndex = null;

  @SerializedName("external_action")
  private String externalAction = null;

  @SerializedName("modify_time")
  private String modifyTime = null;

  @SerializedName("video_play_effective_track_url")
  private List<String> videoPlayEffectiveTrackUrl = null;

  @SerializedName("advanced_creative_type")
  private String advancedCreativeType = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("video_play_track_url")
  private List<String> videoPlayTrackUrl = null;

  @SerializedName("smart_inventory")
  private String smartInventory = null;

  @SerializedName("game_package_desc")
  private String gamePackageDesc = null;

  @SerializedName("app_introduction")
  private String appIntroduction = null;

  @SerializedName("dpa_products")
  private List<Long> dpaProducts = null;

  @SerializedName("intelligent_flow_switch")
  private String intelligentFlowSwitch = null;

  @SerializedName("hide_if_converted")
  private String hideIfConverted = null;

  @SerializedName("action_track_url")
  private List<String> actionTrackUrl = null;

  @SerializedName("open_url_params")
  private String openUrlParams = null;

  @SerializedName("quick_app_url")
  private String quickAppUrl = null;

  @SerializedName("form_id")
  private Long formId = null;

  @SerializedName("audience_package_id")
  private Long audiencePackageId = null;

  @SerializedName("category_type")
  private String categoryType = null;

  @SerializedName("convert_id")
  private Long convertId = null;

  @SerializedName("game_package_thumbnail_ids")
  private List<String> gamePackageThumbnailIds = null;

  @SerializedName("opt_status")
  private String optStatus = null;

  @SerializedName("external_url_params")
  private String externalUrlParams = null;

  @SerializedName("external_actions")
  private List<String> externalActions = null;

  @SerializedName("game_package_batch_id")
  private Long gamePackageBatchId = null;

  @SerializedName("download_type")
  private String downloadType = null;

  @SerializedName("app_desc")
  private String appDesc = null;

  @SerializedName("track_url")
  private List<String> trackUrl = null;

  @SerializedName("feed_delivery_search")
  private String feedDeliverySearch = null;

  @SerializedName("pricing")
  private String pricing;

  @SerializedName("cpa_bid")
  private Float cpaBid;

  @SerializedName("deep_bid_type")
  private String deepBidType;

  @SerializedName("deep_cpabid")
  private Float deepCpabid;

  @SerializedName("flow_control_mode")
  private String flowControlMode;

  @SerializedName("budget")
  private Float budget;

  @SerializedName("start_time")
  private String startTime;

  @SerializedName("end_time")
  private String endTime;

  @SerializedName("smart_bid_type")
  private String smartBidType;

  @SerializedName("adjust_cpa")
  private Long adjustCpa;

  @SerializedName("product")
  private String product;

  public AdsGetResponseListStruct storeproPackId(Long storeproPackId) {
    this.storeproPackId = storeproPackId;
    return this;
  }

  public AdsGetResponseListStruct appType(String appType) {
    this.appType = appType;
    return this;
  }

  public AdsGetResponseListStruct openUrl(String openUrl) {
    this.openUrl = openUrl;
    return this;
  }

  public AdsGetResponseListStruct dpaOpenUrlType(String dpaOpenUrlType) {
    this.dpaOpenUrlType = dpaOpenUrlType;
    return this;
  }

  public AdsGetResponseListStruct dpaProvince(Long dpaProvince) {
    this.dpaProvince = dpaProvince;
    return this;
  }

  public AdsGetResponseListStruct trackUrlSendType(String trackUrlSendType) {
    this.trackUrlSendType = trackUrlSendType;
    return this;
  }

  public AdsGetResponseListStruct assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

  public AdsGetResponseListStruct appThumbnails(List<String> appThumbnails) {
    this.appThumbnails = appThumbnails;
    return this;
  }

  public AdsGetResponseListStruct dpaCity(Long dpaCity) {
    this.dpaCity = dpaCity;
    return this;
  }

  public AdsGetResponseListStruct adModifyTime(String adModifyTime) {
    this.adModifyTime = adModifyTime;
    return this;
  }

  public AdsGetResponseListStruct dpaExternalUrls(List<String> dpaExternalUrls) {
    this.dpaExternalUrls = dpaExternalUrls;
    return this;
  }

  public AdsGetResponseListStruct productPlatformId(Long productPlatformId) {
    this.productPlatformId = productPlatformId;
    return this;
  }

  public AdsGetResponseListStruct sceneInventory(String sceneInventory) {
    this.sceneInventory = sceneInventory;
    return this;
  }

  public AdsGetResponseListStruct unionVideoType(String unionVideoType) {
    this.unionVideoType = unionVideoType;
    return this;
  }

  public AdsGetResponseListStruct externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  public AdsGetResponseListStruct hideIfExists(Long hideIfExists) {
    this.hideIfExists = hideIfExists;
    return this;
  }

  public AdsGetResponseListStruct productId(String productId) {
    this.productId = productId;
    return this;
  }

  public AdsGetResponseListStruct inventoryCatalog(String inventoryCatalog) {
    this.inventoryCatalog = inventoryCatalog;
    return this;
  }

  public AdsGetResponseListStruct downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  public AdsGetResponseListStruct downloadMode(String downloadMode) {
    this.downloadMode = downloadMode;
    return this;
  }

  public AdsGetResponseListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdsGetResponseListStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdsGetResponseListStruct videoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

  public AdsGetResponseListStruct dpaExternalUrlField(String dpaExternalUrlField) {
    this.dpaExternalUrlField = dpaExternalUrlField;
    return this;
  }

  public AdsGetResponseListStruct promotionType(String promotionType) {
    this.promotionType = promotionType;
    return this;
  }

  public AdsGetResponseListStruct audience(AudienceStruct audienceStruct) {
    this.audience = audienceStruct;
    return this;
  }

  public AdsGetResponseListStruct advertiserStoreIds(List<Long> advertiserStoreIds) {
    this.advertiserStoreIds = advertiserStoreIds;
    return this;
  }

  public AdsGetResponseListStruct adPackage(String adPackage) {
    this.adPackage = adPackage;
    return this;
  }

  public AdsGetResponseListStruct deliveryRange(String deliveryRange) {
    this.deliveryRange = deliveryRange;
    return this;
  }

  public AdsGetResponseListStruct dpaAdtype(String dpaAdtype) {
    this.dpaAdtype = dpaAdtype;
    return this;
  }

  public AdsGetResponseListStruct storeproUnit(String storeproUnit) {
    this.storeproUnit = storeproUnit;
    return this;
  }

  public AdsGetResponseListStruct awemeAccount(String awemeAccount) {
    this.awemeAccount = awemeAccount;
    return this;
  }

  public AdsGetResponseListStruct convertedTimeDuration(String convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

  public AdsGetResponseListStruct storeType(String storeType) {
    this.storeType = storeType;
    return this;
  }

  public AdsGetResponseListStruct adCreateTime(String adCreateTime) {
    this.adCreateTime = adCreateTime;
    return this;
  }

  public AdsGetResponseListStruct dpaCategories(List<Long> dpaCategories) {
    this.dpaCategories = dpaCategories;
    return this;
  }

  public AdsGetResponseListStruct dpaOpenUrlField(String dpaOpenUrlField) {
    this.dpaOpenUrlField = dpaOpenUrlField;
    return this;
  }

  public AdsGetResponseListStruct paramsType(String paramsType) {
    this.paramsType = paramsType;
    return this;
  }

  public AdsGetResponseListStruct dpaProductTarget(List<DpaProductTargetStruct> dpaProductTargetStruct) {
    this.dpaProductTarget = dpaProductTargetStruct;
    return this;
  }

  public AdsGetResponseListStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdsGetResponseListStruct dpaOpenUrls(List<String> dpaOpenUrls) {
    this.dpaOpenUrls = dpaOpenUrls;
    return this;
  }

  public AdsGetResponseListStruct deepExternalAction(String deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
    return this;
  }

  public AdsGetResponseListStruct name(String name) {
    this.name = name;
    return this;
  }

  public AdsGetResponseListStruct inventoryType(List<String> inventoryType) {
    this.inventoryType = inventoryType;
    return this;
  }

  public AdsGetResponseListStruct status(String status) {
    this.status = status;
    return this;
  }

  public AdsGetResponseListStruct dpaLocalAudience(Long dpaLocalAudience) {
    this.dpaLocalAudience = dpaLocalAudience;
    return this;
  }

  public AdsGetResponseListStruct dpaLbs(Long dpaLbs) {
    this.dpaLbs = dpaLbs;
    return this;
  }

  public AdsGetResponseListStruct subscribeUrl(String subscribeUrl) {
    this.subscribeUrl = subscribeUrl;
    return this;
  }

  public AdsGetResponseListStruct formIndex(Long formIndex) {
    this.formIndex = formIndex;
    return this;
  }

  public AdsGetResponseListStruct externalAction(String externalAction) {
    this.externalAction = externalAction;
    return this;
  }

  public AdsGetResponseListStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  public AdsGetResponseListStruct videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public AdsGetResponseListStruct advancedCreativeType(String advancedCreativeType) {
    this.advancedCreativeType = advancedCreativeType;
    return this;
  }

  public AdsGetResponseListStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdsGetResponseListStruct videoPlayTrackUrl(List<String> videoPlayTrackUrl) {
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

  public AdsGetResponseListStruct smartInventory(String smartInventory) {
    this.smartInventory = smartInventory;
    return this;
  }

  public AdsGetResponseListStruct gamePackageDesc(String gamePackageDesc) {
    this.gamePackageDesc = gamePackageDesc;
    return this;
  }

  public AdsGetResponseListStruct appIntroduction(String appIntroduction) {
    this.appIntroduction = appIntroduction;
    return this;
  }

  public AdsGetResponseListStruct dpaProducts(List<Long> dpaProducts) {
    this.dpaProducts = dpaProducts;
    return this;
  }

  public AdsGetResponseListStruct intelligentFlowSwitch(String intelligentFlowSwitch) {
    this.intelligentFlowSwitch = intelligentFlowSwitch;
    return this;
  }

  public AdsGetResponseListStruct hideIfConverted(String hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
    return this;
  }

  public AdsGetResponseListStruct actionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public AdsGetResponseListStruct openUrlParams(String openUrlParams) {
    this.openUrlParams = openUrlParams;
    return this;
  }

  public AdsGetResponseListStruct quickAppUrl(String quickAppUrl) {
    this.quickAppUrl = quickAppUrl;
    return this;
  }

  public AdsGetResponseListStruct formId(Long formId) {
    this.formId = formId;
    return this;
  }

  public AdsGetResponseListStruct audiencePackageId(Long audiencePackageId) {
    this.audiencePackageId = audiencePackageId;
    return this;
  }

  public AdsGetResponseListStruct categoryType(String categoryType) {
    this.categoryType = categoryType;
    return this;
  }

  public AdsGetResponseListStruct convertId(Long convertId) {
    this.convertId = convertId;
    return this;
  }

  public AdsGetResponseListStruct gamePackageThumbnailIds(List<String> gamePackageThumbnailIds) {
    this.gamePackageThumbnailIds = gamePackageThumbnailIds;
    return this;
  }

  public AdsGetResponseListStruct optStatus(String optStatus) {
    this.optStatus = optStatus;
    return this;
  }

  public AdsGetResponseListStruct externalUrlParams(String externalUrlParams) {
    this.externalUrlParams = externalUrlParams;
    return this;
  }

  public AdsGetResponseListStruct externalActions(List<String> externalActions) {
    this.externalActions = externalActions;
    return this;
  }

  public AdsGetResponseListStruct gamePackageBatchId(Long gamePackageBatchId) {
    this.gamePackageBatchId = gamePackageBatchId;
    return this;
  }

  public AdsGetResponseListStruct downloadType(String downloadType) {
    this.downloadType = downloadType;
    return this;
  }

  public AdsGetResponseListStruct appDesc(String appDesc) {
    this.appDesc = appDesc;
    return this;
  }

  public AdsGetResponseListStruct trackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
    return this;
  }

  public AdsGetResponseListStruct feedDeliverySearch(String feedDeliverySearch) {
    this.feedDeliverySearch = feedDeliverySearch;
    return this;
  }

  public AdsGetResponseListStruct pricing(String pricing) {
    this.pricing = pricing;
    return this;
  }

  public AdsGetResponseListStruct cpaBid(Float cpaBid) {
    this.cpaBid = cpaBid;
    return this;
  }

  public AdsGetResponseListStruct deepBidType(String deepBidType) {
    this.deepBidType = deepBidType;
    return this;
  }

  public AdsGetResponseListStruct deepCpabid(Float deepCpabid) {
    this.deepCpabid = deepCpabid;
    return this;
  }

  public AdsGetResponseListStruct budget(Float budget) {
    this.budget = budget;
    return this;
  }

  public AdsGetResponseListStruct flowControlMode(String flowControlMode) {
    this.flowControlMode = flowControlMode;
    return this;
  }

  public AdsGetResponseListStruct startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public AdsGetResponseListStruct endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public AdsGetResponseListStruct smartBidType(String smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  public AdsGetResponseListStruct adjustCpa(Long adjustCpa) {
    this.adjustCpa = adjustCpa;
    return this;
  }

  public AdsGetResponseListStruct product(String product) {
    this.product = product;
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
