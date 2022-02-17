package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdUnitCreateRequest implements TokenKey {
  @SerializedName("consult_id")
  private Long consultId = null;

  @SerializedName("roi_ratio")
  private Double roiRatio = null;

  @SerializedName("asset_mining")
  private Boolean assetMining = null;

  @SerializedName("site_type")
  private Integer siteType = null;

  @SerializedName("merchandise_id")
  private Long merchandiseId = null;

  @SerializedName("schema_uri")
  private String schemaUri = null;

  @SerializedName("bid_type")
  private Integer bidType = null;

  @SerializedName("put_status")
  private Integer putStatus = null;

  @SerializedName("unit_type")
  private Integer unitType = null;

  @SerializedName("smart_cover")
  private Boolean smartCover = null;

  @SerializedName("speed")
  private Integer speed = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("app_store")
  private List<String> appStore = null;

  @SerializedName("deep_conversion_type")
  private Integer deepConversionType = null;

  @SerializedName("merchant_item_put_type")
  private Integer merchantItemPutType = null;

  @SerializedName("deep_conversion_bid")
  private Long deepConversionBid = null;

  @SerializedName("app_id")
  private Long appId = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("fiction_id")
  private Long fictionId = null;

  @SerializedName("ocpx_action_type")
  private Integer ocpxActionType = null;

  @SerializedName("day_budget")
  private Long dayBudget = null;

  @SerializedName("use_app_market")
  private Integer useAppMarket = null;

  @SerializedName("gift_data")
  private GiftDataStruct giftData = null;

  @SerializedName("video_landing_page")
  private Boolean videoLandingPage = null;

  @SerializedName("item_id")
  private Long itemId = null;

  @SerializedName("url_type")
  private Integer urlType = null;

  @SerializedName("web_uri_type")
  private Integer webUriType = null;

  @SerializedName("scene_id")
  private List<Integer> sceneId = null;

  @SerializedName("end_time")
  private String endTime = null;

  @SerializedName("begin_time")
  private String beginTime = null;

  @SerializedName("auto_target")
  private Boolean autoTarget = null;

  @SerializedName("card_type")
  private Integer cardType = null;

  @SerializedName("convert_id")
  private Integer convertId = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("show_mode")
  private Integer showMode = null;

  @SerializedName("target")
  private TargetStruct target = null;

  @SerializedName("unit_name")
  private String unitName = null;

  @SerializedName("schedule_time")
  private String scheduleTime = null;

  @SerializedName("smart_bid")
  private Integer smartBid = null;

  @SerializedName("adv_card_list")
  private List<Long> advCardList = null;

  @SerializedName("cpa_bid")
  private Long cpaBid = null;

  @SerializedName("intention_target")
  private Boolean intentionTarget = null;

  @SerializedName("template_id")
  private Long templateId = null;

  @SerializedName("auto_create_photo")
  private Boolean autoCreatePhoto = null;

  @SerializedName("bid")
  private Long bid = null;

  @SerializedName("adv_card_option")
  private Integer advCardOption = null;

  @SerializedName("merchandise_type")
  private Integer merchandiseType = null;

  @SerializedName("day_budget_schedule")
  private List<Long> dayBudgetSchedule = null;


  public AdUnitCreateRequest consultId(Long consultId) {
    this.consultId = consultId;
    return this;
  }

  public AdUnitCreateRequest roiRatio(Double roiRatio) {
    this.roiRatio = roiRatio;
    return this;
  }

  public AdUnitCreateRequest assetMining(Boolean assetMining) {
    this.assetMining = assetMining;
    return this;
  }

  public AdUnitCreateRequest siteType(Integer siteType) {
    this.siteType = siteType;
    return this;
  }

  public AdUnitCreateRequest merchandiseId(Long merchandiseId) {
    this.merchandiseId = merchandiseId;
    return this;
  }

  public AdUnitCreateRequest schemaUri(String schemaUri) {
    this.schemaUri = schemaUri;
    return this;
  }

  public AdUnitCreateRequest bidType(Integer bidType) {
    this.bidType = bidType;
    return this;
  }

  public AdUnitCreateRequest putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public AdUnitCreateRequest unitType(Integer unitType) {
    this.unitType = unitType;
    return this;
  }

  public AdUnitCreateRequest smartCover(Boolean smartCover) {
    this.smartCover = smartCover;
    return this;
  }

  public AdUnitCreateRequest speed(Integer speed) {
    this.speed = speed;
    return this;
  }

  public AdUnitCreateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdUnitCreateRequest appStore(List<String> appStore) {
    this.appStore = appStore;
    return this;
  }

  public AdUnitCreateRequest deepConversionType(Integer deepConversionType) {
    this.deepConversionType = deepConversionType;
    return this;
  }

  public AdUnitCreateRequest merchantItemPutType(Integer merchantItemPutType) {
    this.merchantItemPutType = merchantItemPutType;
    return this;
  }

  public AdUnitCreateRequest deepConversionBid(Long deepConversionBid) {
    this.deepConversionBid = deepConversionBid;
    return this;
  }

  public AdUnitCreateRequest appId(Long appId) {
    this.appId = appId;
    return this;
  }

  public AdUnitCreateRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdUnitCreateRequest fictionId(Long fictionId) {
    this.fictionId = fictionId;
    return this;
  }

  public AdUnitCreateRequest ocpxActionType(Integer ocpxActionType) {
    this.ocpxActionType = ocpxActionType;
    return this;
  }

  public AdUnitCreateRequest dayBudget(Long dayBudget) {
    this.dayBudget = dayBudget;
    return this;
  }

  public AdUnitCreateRequest useAppMarket(Integer useAppMarket) {
    this.useAppMarket = useAppMarket;
    return this;
  }

  public AdUnitCreateRequest giftData(GiftDataStruct giftData) {
    this.giftData = giftData;
    return this;
  }

  public AdUnitCreateRequest videoLandingPage(Boolean videoLandingPage) {
    this.videoLandingPage = videoLandingPage;
    return this;
  }

  public AdUnitCreateRequest itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

  public AdUnitCreateRequest urlType(Integer urlType) {
    this.urlType = urlType;
    return this;
  }

  public AdUnitCreateRequest webUriType(Integer webUriType) {
    this.webUriType = webUriType;
    return this;
  }

  public AdUnitCreateRequest sceneId(List<Integer> sceneId) {
    this.sceneId = sceneId;
    return this;
  }

  public AdUnitCreateRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public AdUnitCreateRequest beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

  public AdUnitCreateRequest autoTarget(Boolean autoTarget) {
    this.autoTarget = autoTarget;
    return this;
  }

  public AdUnitCreateRequest cardType(Integer cardType) {
    this.cardType = cardType;
    return this;
  }

  public AdUnitCreateRequest convertId(Integer convertId) {
    this.convertId = convertId;
    return this;
  }

  public AdUnitCreateRequest url(String url) {
    this.url = url;
    return this;
  }

  public AdUnitCreateRequest showMode(Integer showMode) {
    this.showMode = showMode;
    return this;
  }

  public AdUnitCreateRequest target(TargetStruct target) {
    this.target = target;
    return this;
  }

  public AdUnitCreateRequest unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  public AdUnitCreateRequest scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public AdUnitCreateRequest smartBid(Integer smartBid) {
    this.smartBid = smartBid;
    return this;
  }

  public AdUnitCreateRequest advCardList(List<Long> advCardList) {
    this.advCardList = advCardList;
    return this;
  }

  public AdUnitCreateRequest cpaBid(Long cpaBid) {
    this.cpaBid = cpaBid;
    return this;
  }

  public AdUnitCreateRequest intentionTarget(Boolean intentionTarget) {
    this.intentionTarget = intentionTarget;
    return this;
  }

  public AdUnitCreateRequest templateId(Long templateId) {
    this.templateId = templateId;
    return this;
  }

  public AdUnitCreateRequest autoCreatePhoto(Boolean autoCreatePhoto) {
    this.autoCreatePhoto = autoCreatePhoto;
    return this;
  }

  public AdUnitCreateRequest bid(Long bid) {
    this.bid = bid;
    return this;
  }

  public AdUnitCreateRequest advCardOption(Integer advCardOption) {
    this.advCardOption = advCardOption;
    return this;
  }

  public AdUnitCreateRequest merchandiseType(Integer merchandiseType) {
    this.merchandiseType = merchandiseType;
    return this;
  }

  public AdUnitCreateRequest dayBudgetSchedule(List<Long> dayBudgetSchedule) {
    this.dayBudgetSchedule = dayBudgetSchedule;
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
