package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdUnitUpdateRequest implements TokenKey {
  @SerializedName("roi_ratio")
  private Double roiRatio = null;

  @SerializedName("site_type")
  private Integer siteType = null;

  @SerializedName("merchandise_id")
  private Long merchandiseId = null;

  @SerializedName("schema_uri")
  private String schemaUri = null;

  @SerializedName("speed")
  private Integer speed = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("app_store")
  private List<String> appStore = null;

  @SerializedName("emplate_id")
  private Long emplateId = null;

  @SerializedName("deep_conversion_type")
  private Integer deepConversionType = null;

  @SerializedName("merchant_item_put_type")
  private Integer merchantItemPutType = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("app_id")
  private Long appId = null;

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


  public AdUnitUpdateRequest roiRatio(Double roiRatio) {
    this.roiRatio = roiRatio;
    return this;
  }

  public AdUnitUpdateRequest siteType(Integer siteType) {
    this.siteType = siteType;
    return this;
  }

  public AdUnitUpdateRequest merchandiseId(Long merchandiseId) {
    this.merchandiseId = merchandiseId;
    return this;
  }

  public AdUnitUpdateRequest schemaUri(String schemaUri) {
    this.schemaUri = schemaUri;
    return this;
  }

  public AdUnitUpdateRequest speed(Integer speed) {
    this.speed = speed;
    return this;
  }

  public AdUnitUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdUnitUpdateRequest appStore(List<String> appStore) {
    this.appStore = appStore;
    return this;
  }

  public AdUnitUpdateRequest emplateId(Long emplateId) {
    this.emplateId = emplateId;
    return this;
  }

  public AdUnitUpdateRequest deepConversionType(Integer deepConversionType) {
    this.deepConversionType = deepConversionType;
    return this;
  }

  public AdUnitUpdateRequest merchantItemPutType(Integer merchantItemPutType) {
    this.merchantItemPutType = merchantItemPutType;
    return this;
  }

  public AdUnitUpdateRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public AdUnitUpdateRequest appId(Long appId) {
    this.appId = appId;
    return this;
  }

  public AdUnitUpdateRequest dayBudget(Long dayBudget) {
    this.dayBudget = dayBudget;
    return this;
  }

  public AdUnitUpdateRequest useAppMarket(Integer useAppMarket) {
    this.useAppMarket = useAppMarket;
    return this;
  }

  public AdUnitUpdateRequest giftData(GiftDataStruct giftData) {
    this.giftData = giftData;
    return this;
  }

  public AdUnitUpdateRequest videoLandingPage(Boolean videoLandingPage) {
    this.videoLandingPage = videoLandingPage;
    return this;
  }

  public AdUnitUpdateRequest itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

  public AdUnitUpdateRequest urlType(Integer urlType) {
    this.urlType = urlType;
    return this;
  }

  public AdUnitUpdateRequest webUriType(Integer webUriType) {
    this.webUriType = webUriType;
    return this;
  }

  public AdUnitUpdateRequest sceneId(List<Integer> sceneId) {
    this.sceneId = sceneId;
    return this;
  }

  public AdUnitUpdateRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public AdUnitUpdateRequest beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

  public AdUnitUpdateRequest autoTarget(Boolean autoTarget) {
    this.autoTarget = autoTarget;
    return this;
  }

  public AdUnitUpdateRequest cardType(Integer cardType) {
    this.cardType = cardType;
    return this;
  }

  public AdUnitUpdateRequest url(String url) {
    this.url = url;
    return this;
  }

  public AdUnitUpdateRequest showMode(Integer showMode) {
    this.showMode = showMode;
    return this;
  }

  public AdUnitUpdateRequest target(TargetStruct target) {
    this.target = target;
    return this;
  }

  public AdUnitUpdateRequest unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  public AdUnitUpdateRequest scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public AdUnitUpdateRequest smartBid(Integer smartBid) {
    this.smartBid = smartBid;
    return this;
  }

  public AdUnitUpdateRequest advCardList(List<Long> advCardList) {
    this.advCardList = advCardList;
    return this;
  }

  public AdUnitUpdateRequest cpaBid(Long cpaBid) {
    this.cpaBid = cpaBid;
    return this;
  }

  public AdUnitUpdateRequest intentionTarget(Boolean intentionTarget) {
    this.intentionTarget = intentionTarget;
    return this;
  }

  public AdUnitUpdateRequest autoCreatePhoto(Boolean autoCreatePhoto) {
    this.autoCreatePhoto = autoCreatePhoto;
    return this;
  }

  public AdUnitUpdateRequest bid(Long bid) {
    this.bid = bid;
    return this;
  }

  public AdUnitUpdateRequest advCardOption(Integer advCardOption) {
    this.advCardOption = advCardOption;
    return this;
  }

  public AdUnitUpdateRequest merchandiseType(Integer merchandiseType) {
    this.merchandiseType = merchandiseType;
    return this;
  }

  public AdUnitUpdateRequest dayBudgetSchedule(List<Long> dayBudgetSchedule) {
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
