package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdUnitListResponseStruct {
  @SerializedName("asset_mining")
  private Boolean assetMining = null;

  @SerializedName("site_type")
  private Integer siteType = null;

  @SerializedName("schema_uri")
  private String schemaUri = null;

  @SerializedName("bid_type")
  private Integer bidType = null;

  @SerializedName("put_status")
  private Integer putStatus = null;

  @SerializedName("smart_cover")
  private Boolean smartCover = null;

  @SerializedName("app_store")
  private List<String> appStore = null;

  @SerializedName("playable_switch")
  private Integer playableSwitch = null;

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

  @SerializedName("url_type")
  private Integer urlType = null;

  @SerializedName("show_mode")
  private Integer showMode = null;

  @SerializedName("unit_name")
  private String unitName = null;

  @SerializedName("diverse_data")
  private DiverseDataStruct diverseData = null;

  @SerializedName("auto_create_photo")
  private Boolean autoCreatePhoto = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("day_budget_schedule")
  private List<Long> dayBudgetSchedule = null;

  @SerializedName("consult_id")
  private Long consultId = null;

  @SerializedName("roi_ratio")
  private Double roiRatio = null;

  @SerializedName("merchandise_id")
  private Long merchandiseId = null;

  @SerializedName("unit_type")
  private Integer unitType = null;

  @SerializedName("study_status")
  private Integer studyStatus = null;

  @SerializedName("speed")
  private Integer speed = null;

  @SerializedName("update_time")
  private String updateTime = null;

  @SerializedName("deep_conversion_type")
  private Integer deepConversionType = null;

  @SerializedName("merchant_item_put_type")
  private Integer merchantItemPutType = null;

  @SerializedName("deep_conversion_bid")
  private Long deepConversionBid = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("playable_url")
  private String playableUrl = null;

  @SerializedName("playable_file_name")
  private String playableFileName = null;

  @SerializedName("video_landing_page")
  private Boolean videoLandingPage = null;

  @SerializedName("item_id")
  private Long itemId = null;

  @SerializedName("review_detail")
  private String reviewDetail = null;

  @SerializedName("web_uri_type")
  private Integer webUriType = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  @SerializedName("backflow_forecast")
  private BackflowForecastStruct backflowForecast = null;

  @SerializedName("compensate_status")
  private Integer compensateStatus = null;

  @SerializedName("end_time")
  private String endTime = null;

  @SerializedName("scene_id")
  private List<Integer> sceneId = null;

  @SerializedName("begin_time")
  private String beginTime = null;

  @SerializedName("app_icon_url")
  private String appIconUrl = null;

  @SerializedName("auto_target")
  private Boolean autoTarget = null;

  @SerializedName("convert_id")
  private Integer convertId = null;

  @SerializedName("target")
  private TargetStruct target = null;

  @SerializedName("schedule")
  private ScheduleStruct schedule = null;

  @SerializedName("schedule_time")
  private String scheduleTime = null;

  @SerializedName("smart_bid")
  private Integer smartBid = null;

  @SerializedName("adv_card_list")
  private List<AdvCardListStruct> advCardList = null;

  @SerializedName("cpa_bid")
  private Long cpaBid = null;

  @SerializedName("playable_orientation")
  private Integer playableOrientation = null;

  @SerializedName("bid")
  private Long bid = null;

  @SerializedName("adv_card_option")
  private Integer advCardOption = null;

  @SerializedName("merchandise_type")
  private Integer merchandiseType = null;

  @SerializedName("create_channel")
  private Integer createChannel = null;


  public AdUnitListResponseStruct assetMining(Boolean assetMining) {
    this.assetMining = assetMining;
    return this;
  }

  public AdUnitListResponseStruct siteType(Integer siteType) {
    this.siteType = siteType;
    return this;
  }

  public AdUnitListResponseStruct schemaUri(String schemaUri) {
    this.schemaUri = schemaUri;
    return this;
  }

  public AdUnitListResponseStruct bidType(Integer bidType) {
    this.bidType = bidType;
    return this;
  }

  public AdUnitListResponseStruct putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public AdUnitListResponseStruct smartCover(Boolean smartCover) {
    this.smartCover = smartCover;
    return this;
  }

  public AdUnitListResponseStruct appStore(List<String> appStore) {
    this.appStore = appStore;
    return this;
  }

  public AdUnitListResponseStruct playableSwitch(Integer playableSwitch) {
    this.playableSwitch = playableSwitch;
    return this;
  }

  public AdUnitListResponseStruct appId(Long appId) {
    this.appId = appId;
    return this;
  }

  public AdUnitListResponseStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdUnitListResponseStruct fictionId(Long fictionId) {
    this.fictionId = fictionId;
    return this;
  }

  public AdUnitListResponseStruct ocpxActionType(Integer ocpxActionType) {
    this.ocpxActionType = ocpxActionType;
    return this;
  }

  public AdUnitListResponseStruct dayBudget(Long dayBudget) {
    this.dayBudget = dayBudget;
    return this;
  }

  public AdUnitListResponseStruct useAppMarket(Integer useAppMarket) {
    this.useAppMarket = useAppMarket;
    return this;
  }

  public AdUnitListResponseStruct giftData(GiftDataStruct giftData) {
    this.giftData = giftData;
    return this;
  }

  public AdUnitListResponseStruct urlType(Integer urlType) {
    this.urlType = urlType;
    return this;
  }

  public AdUnitListResponseStruct showMode(Integer showMode) {
    this.showMode = showMode;
    return this;
  }

  public AdUnitListResponseStruct unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  public AdUnitListResponseStruct diverseData(DiverseDataStruct diverseData) {
    this.diverseData = diverseData;
    return this;
  }

  public AdUnitListResponseStruct autoCreatePhoto(Boolean autoCreatePhoto) {
    this.autoCreatePhoto = autoCreatePhoto;
    return this;
  }

  public AdUnitListResponseStruct status(Integer status) {
    this.status = status;
    return this;
  }

  public AdUnitListResponseStruct dayBudgetSchedule(List<Long> dayBudgetSchedule) {
    this.dayBudgetSchedule = dayBudgetSchedule;
    return this;
  }

  public AdUnitListResponseStruct consultId(Long consultId) {
    this.consultId = consultId;
    return this;
  }

  public AdUnitListResponseStruct roiRatio(Double roiRatio) {
    this.roiRatio = roiRatio;
    return this;
  }

  public AdUnitListResponseStruct merchandiseId(Long merchandiseId) {
    this.merchandiseId = merchandiseId;
    return this;
  }

  public AdUnitListResponseStruct unitType(Integer unitType) {
    this.unitType = unitType;
    return this;
  }

  public AdUnitListResponseStruct speed(Integer speed) {
    this.speed = speed;
    return this;
  }

  public AdUnitListResponseStruct updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public AdUnitListResponseStruct deepConversionType(Integer deepConversionType) {
    this.deepConversionType = deepConversionType;
    return this;
  }

  public AdUnitListResponseStruct merchantItemPutType(Integer merchantItemPutType) {
    this.merchantItemPutType = merchantItemPutType;
    return this;
  }

  public AdUnitListResponseStruct deepConversionBid(Long deepConversionBid) {
    this.deepConversionBid = deepConversionBid;
    return this;
  }

  public AdUnitListResponseStruct unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public AdUnitListResponseStruct playableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
    return this;
  }

  public AdUnitListResponseStruct playableFileName(String playableFileName) {
    this.playableFileName = playableFileName;
    return this;
  }

  public AdUnitListResponseStruct videoLandingPage(Boolean videoLandingPage) {
    this.videoLandingPage = videoLandingPage;
    return this;
  }

  public AdUnitListResponseStruct itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

  public AdUnitListResponseStruct reviewDetail(String reviewDetail) {
    this.reviewDetail = reviewDetail;
    return this;
  }

  public AdUnitListResponseStruct webUriType(Integer webUriType) {
    this.webUriType = webUriType;
    return this;
  }

  public AdUnitListResponseStruct totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  public AdUnitListResponseStruct backflowForecast(BackflowForecastStruct backflowForecast) {
    this.backflowForecast = backflowForecast;
    return this;
  }

  public AdUnitListResponseStruct compensateStatus(Integer compensateStatus) {
    this.compensateStatus = compensateStatus;
    return this;
  }

  public AdUnitListResponseStruct endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  public AdUnitListResponseStruct sceneId(List<Integer> sceneId) {
    this.sceneId = sceneId;
    return this;
  }

  public AdUnitListResponseStruct beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

  public AdUnitListResponseStruct appIconUrl(String appIconUrl) {
    this.appIconUrl = appIconUrl;
    return this;
  }

  public AdUnitListResponseStruct autoTarget(Boolean autoTarget) {
    this.autoTarget = autoTarget;
    return this;
  }

  public AdUnitListResponseStruct convertId(Integer convertId) {
    this.convertId = convertId;
    return this;
  }

  public AdUnitListResponseStruct target(TargetStruct target) {
    this.target = target;
    return this;
  }

  public AdUnitListResponseStruct schedule(ScheduleStruct schedule) {
    this.schedule = schedule;
    return this;
  }

  public AdUnitListResponseStruct scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  public AdUnitListResponseStruct smartBid(Integer smartBid) {
    this.smartBid = smartBid;
    return this;
  }

  public AdUnitListResponseStruct advCardList(List<AdvCardListStruct> advCardList) {
    this.advCardList = advCardList;
    return this;
  }

  public AdUnitListResponseStruct cpaBid(Long cpaBid) {
    this.cpaBid = cpaBid;
    return this;
  }

  public AdUnitListResponseStruct playableOrientation(Integer playableOrientation) {
    this.playableOrientation = playableOrientation;
    return this;
  }

  public AdUnitListResponseStruct bid(Long bid) {
    this.bid = bid;
    return this;
  }

  public AdUnitListResponseStruct advCardOption(Integer advCardOption) {
    this.advCardOption = advCardOption;
    return this;
  }

  public AdUnitListResponseStruct merchandiseType(Integer merchandiseType) {
    this.merchandiseType = merchandiseType;
    return this;
  }

  public AdUnitListResponseStruct createChannel(Integer createChannel) {
    this.createChannel = createChannel;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
