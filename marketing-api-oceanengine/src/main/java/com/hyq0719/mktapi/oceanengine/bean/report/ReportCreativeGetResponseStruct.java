package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ReportCreativeGetResponseStruct {
  @SerializedName("landing_type")
  private String landingType = null;

  @SerializedName("play_75_feed_break")
  private Long play75FeedBreak = null;

  @SerializedName("advanced_creative_coupon_addition")
  private Long advancedCreativeCouponAddition = null;

  @SerializedName("convert")
  private Long convert = null;

  @SerializedName("in_app_cart")
  private Long inAppCart = null;

  @SerializedName("creative_id")
  private String creativeId = null;

  @SerializedName("attribution_convert_cost")
  private Float attributionConvertCost = null;

  @SerializedName("poi_address_click")
  private Long poiAddressClick = null;

  @SerializedName("play_25_feed_break")
  private Long play25FeedBreak = null;

  @SerializedName("consult_effective")
  private Long consultEffective = null;

  @SerializedName("click_website")
  private Long clickWebsite = null;

  @SerializedName("first_order_count")
  private Long firstOrderCount = null;

  @SerializedName("message_action")
  private Long messageAction = null;

  @SerializedName("location_click")
  private Long locationClick = null;

  @SerializedName("play_over_rate")
  private Float playOverRate = null;

  @SerializedName("advanced_creative_form_submit")
  private Long advancedCreativeFormSubmit = null;

  @SerializedName("shopping")
  private Long shopping = null;

  @SerializedName("ctr")
  private Float ctr = null;

  @SerializedName("qq")
  private Long qq = null;

  @SerializedName("luban_live_slidecart_click_cnt")
  private Long lubanLiveSlidecartClickCnt = null;

  @SerializedName("ac")
  private String ac = null;

  @SerializedName("luban_live_gift_amount")
  private Float lubanLiveGiftAmount = null;

  @SerializedName("wechat_first_pay_count")
  private Long wechatFirstPayCount = null;

  @SerializedName("active_cost")
  private Float activeCost = null;

  @SerializedName("active")
  private Long active = null;

  @SerializedName("poi_collect")
  private Long poiCollect = null;

  @SerializedName("click")
  private Long click = null;

  @SerializedName("active_rate")
  private Float activeRate = null;

  @SerializedName("advanced_creative_phone_click")
  private Long advancedCreativePhoneClick = null;

  @SerializedName("province_name")
  private String provinceName = null;

  @SerializedName("download_start")
  private Long downloadStart = null;

  @SerializedName("home_visited")
  private Long homeVisited = null;

  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("luban_live_gift_cnt")
  private Long lubanLiveGiftCnt = null;

  @SerializedName("phone")
  private Long phone = null;

  @SerializedName("luban_live_share_cnt")
  private Long lubanLiveShareCnt = null;

  @SerializedName("phone_effective")
  private Long phoneEffective = null;

  @SerializedName("attribution_game_pay_7d_cost")
  private Float attributionGamePay7dCost = null;

  @SerializedName("ies_challenge_click")
  private Long iesChallengeClick = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("luban_order_cnt")
  private Long lubanOrderCnt = null;

  @SerializedName("active_register_cost")
  private Float activeRegisterCost = null;

  @SerializedName("attribution_next_day_open_rate")
  private Float attributionNextDayOpenRate = null;

  @SerializedName("attribution_next_day_open_cnt")
  private Long attributionNextDayOpenCnt = null;

  @SerializedName("click_install")
  private Long clickInstall = null;

  @SerializedName("loan_credit_rate")
  private Float loanCreditRate = null;

  @SerializedName("play_duration_sum")
  private Long playDurationSum = null;

  @SerializedName("submit_certification_count")
  private Long submitCertificationCount = null;

  @SerializedName("live_watch_one_minute_count")
  private Long liveWatchOneMinuteCount = null;

  @SerializedName("commute_first_pay_count")
  private Long commuteFirstPayCount = null;

  @SerializedName("play_100_feed_break")
  private Long play100FeedBreak = null;

  @SerializedName("loan_credit_cost")
  private Float loanCreditCost = null;

  @SerializedName("convert_rate")
  private Float convertRate = null;

  @SerializedName("consult")
  private Long consult = null;

  @SerializedName("share")
  private Long share = null;

  @SerializedName("install_finish_rate")
  private Float installFinishRate = null;

  @SerializedName("pay_count")
  private Long payCount = null;

  @SerializedName("redirect")
  private Long redirect = null;

  @SerializedName("phone_connect")
  private Long phoneConnect = null;

  @SerializedName("coupon")
  private Long coupon = null;

  @SerializedName("luban_order_stat_amount")
  private Float lubanOrderStatAmount = null;

  @SerializedName("attribution_wechat_first_pay_30d_rate")
  private Float attributionWechatFirstPay30dRate = null;

  @SerializedName("ad_name")
  private String adName = null;

  @SerializedName("coupon_single_page")
  private Long couponSinglePage = null;

  @SerializedName("luban_live_enter_cnt")
  private Long lubanLiveEnterCnt = null;

  @SerializedName("install_finish")
  private Long installFinish = null;

  @SerializedName("lottery")
  private Long lottery = null;

  @SerializedName("in_app_detail_uv")
  private Long inAppDetailUv = null;

  @SerializedName("attribution_wechat_first_pay_30d_cost")
  private Float attributionWechatFirstPay30dCost = null;

  @SerializedName("game_pay_count")
  private Long gamePayCount = null;

  @SerializedName("attribution_wechat_first_pay_30d_count")
  private Long attributionWechatFirstPay30dCount = null;

  @SerializedName("valid_play_rate")
  private Float validPlayRate = null;

  @SerializedName("average_play_time_per_play")
  private Float averagePlayTimePerPlay = null;

  @SerializedName("convert_cost")
  private Float convertCost = null;

  @SerializedName("install_finish_cost")
  private Float installFinishCost = null;

  @SerializedName("luban_live_click_product_cnt")
  private Long lubanLiveClickProductCnt = null;

  @SerializedName("click_landing_page")
  private Long clickLandingPage = null;

  @SerializedName("register")
  private Long register = null;

  @SerializedName("deep_convert_cost")
  private Float deepConvertCost = null;

  @SerializedName("valid_play_cost")
  private Float validPlayCost = null;

  @SerializedName("luban_live_follow_cnt")
  private Long lubanLiveFollowCnt = null;

  @SerializedName("deep_convert_rate")
  private Float deepConvertRate = null;

  @SerializedName("active_pay_cost")
  private Float activePayCost = null;

  @SerializedName("attribution_wechat_login_30d_cost")
  private Float attributionWechatLogin30dCost = null;

  @SerializedName("view")
  private Long view = null;

  @SerializedName("download")
  private Long download = null;

  @SerializedName("click_shopwindow")
  private Long clickShopwindow = null;

  @SerializedName("approval_count")
  private Long approvalCount = null;

  @SerializedName("attribution_deep_convert")
  private Float attributionDeepConvert = null;

  @SerializedName("phone_confirm")
  private Long phoneConfirm = null;

  @SerializedName("ies_music_click")
  private Long iesMusicClick = null;

  @SerializedName("wifi_play")
  private Long wifiPlay = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("stat_datetime")
  private String statDatetime = null;

  @SerializedName("wifi_play_rate")
  private Float wifiPlayRate = null;

  @SerializedName("attribution_game_pay_7d_count")
  private Long attributionGamePay7dCount = null;

  @SerializedName("attribution_active_pay_7d_per_count")
  private Long attributionActivePay7dPerCount = null;

  @SerializedName("luban_live_pay_order_count")
  private Long lubanLivePayOrderCount = null;

  @SerializedName("like")
  private Long like = null;

  @SerializedName("play_50_feed_break")
  private Long play50FeedBreak = null;

  @SerializedName("active_pay_rate")
  private Float activePayRate = null;

  @SerializedName("luban_live_pay_order_stat_cost")
  private Float lubanLivePayOrderStatCost = null;

  @SerializedName("card_show")
  private Long cardShow = null;

  @SerializedName("wechat_pay_amount")
  private Float wechatPayAmount = null;

  @SerializedName("game_addiction_cost")
  private Float gameAddictionCost = null;

  @SerializedName("game_addiction")
  private Long gameAddiction = null;

  @SerializedName("wechat_first_pay_cost")
  private Float wechatFirstPayCost = null;

  @SerializedName("attribution_wechat_pay_30d_amount")
  private Float attributionWechatPay30dAmount = null;

  @SerializedName("live_fans_club_join_cnt")
  private Long liveFansClubJoinCnt = null;

  @SerializedName("deep_convert")
  private Long deepConvert = null;

  @SerializedName("pre_loan_credit")
  private Long preLoanCredit = null;

  @SerializedName("redirect_to_shop")
  private Long redirectToShop = null;

  @SerializedName("creative_material_mode")
  private String creativeMaterialMode = null;

  @SerializedName("attribution_deep_convert_cost")
  private Float attributionDeepConvertCost = null;

  @SerializedName("wechat_first_pay_rate")
  private Float wechatFirstPayRate = null;

  @SerializedName("pre_loan_credit_cost")
  private Float preLoanCreditCost = null;

  @SerializedName("in_app_pay")
  private Long inAppPay = null;

  @SerializedName("game_addiction_rate")
  private Float gameAddictionRate = null;

  @SerializedName("luban_live_comment_cnt")
  private Long lubanLiveCommentCnt = null;

  @SerializedName("active_register_rate")
  private Float activeRegisterRate = null;

  @SerializedName("total_play")
  private Long totalPlay = null;

  @SerializedName("wechat_login_count")
  private Long wechatLoginCount = null;

  @SerializedName("avg_click_cost")
  private Float avgClickCost = null;

  @SerializedName("attribution_convert")
  private Float attributionConvert = null;

  @SerializedName("download_finish_cost")
  private Float downloadFinishCost = null;

  @SerializedName("show")
  private Long show = null;

  @SerializedName("attribution_next_day_open_cost")
  private Float attributionNextDayOpenCost = null;

  @SerializedName("loan_completion_rate")
  private Float loanCompletionRate = null;

  @SerializedName("map_search")
  private Long mapSearch = null;

  @SerializedName("inventory")
  private String inventory = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("button")
  private Long button = null;

  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("city_name")
  private String cityName = null;

  @SerializedName("click_download")
  private Long clickDownload = null;

  @SerializedName("loan_completion_cost")
  private Float loanCompletionCost = null;

  @SerializedName("advanced_creative_counsel_click")
  private Long advancedCreativeCounselClick = null;

  @SerializedName("luban_order_roi")
  private Float lubanOrderRoi = null;

  @SerializedName("download_finish_rate")
  private Float downloadFinishRate = null;

  @SerializedName("loan_completion")
  private Long loanCompletion = null;

  @SerializedName("game_pay_cost")
  private Long gamePayCost = null;

  @SerializedName("wechat_login_cost")
  private Float wechatLoginCost = null;

  @SerializedName("vote")
  private Long vote = null;

  @SerializedName("valid_play")
  private Long validPlay = null;

  @SerializedName("attribution_wechat_pay_30d_roi")
  private Float attributionWechatPay30dRoi = null;

  @SerializedName("advanced_creative_form_click")
  private Long advancedCreativeFormClick = null;

  @SerializedName("cost")
  private Float cost = null;

  @SerializedName("download_start_rate")
  private Float downloadStartRate = null;

  @SerializedName("first_rental_order_count")
  private Long firstRentalOrderCount = null;

  @SerializedName("download_finish")
  private Long downloadFinish = null;

  @SerializedName("wechat")
  private Long wechat = null;

  @SerializedName("in_app_order")
  private Long inAppOrder = null;

  @SerializedName("download_start_cost")
  private Float downloadStartCost = null;

  @SerializedName("message")
  private Long message = null;

  @SerializedName("follow")
  private Long follow = null;

  @SerializedName("avg_show_cost")
  private Float avgShowCost = null;

  @SerializedName("loan_credit")
  private Long loanCredit = null;

  @SerializedName("click_call_dy")
  private Long clickCallDy = null;

  @SerializedName("form")
  private Long form = null;

  @SerializedName("image_mode")
  private String imageMode = null;

  @SerializedName("comment")
  private Long comment = null;

  @SerializedName("pricing")
  private String pricing = null;

  @SerializedName("age")
  private String age = null;

  @SerializedName("in_app_uv")
  private Long inAppUv = null;

  @SerializedName("attribution_wechat_login_30d_count")
  private Long attributionWechatLogin30dCount = null;


  public ReportCreativeGetResponseStruct landingType(String landingType) {
    this.landingType = landingType;
    return this;
  }

  public ReportCreativeGetResponseStruct play75FeedBreak(Long play75FeedBreak) {
    this.play75FeedBreak = play75FeedBreak;
    return this;
  }

  public ReportCreativeGetResponseStruct advancedCreativeCouponAddition(Long advancedCreativeCouponAddition) {
    this.advancedCreativeCouponAddition = advancedCreativeCouponAddition;
    return this;
  }

  public ReportCreativeGetResponseStruct convert(Long convert) {
    this.convert = convert;
    return this;
  }

  public ReportCreativeGetResponseStruct inAppCart(Long inAppCart) {
    this.inAppCart = inAppCart;
    return this;
  }

  public ReportCreativeGetResponseStruct creativeId(String creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionConvertCost(Float attributionConvertCost) {
    this.attributionConvertCost = attributionConvertCost;
    return this;
  }

  public ReportCreativeGetResponseStruct poiAddressClick(Long poiAddressClick) {
    this.poiAddressClick = poiAddressClick;
    return this;
  }

  public ReportCreativeGetResponseStruct play25FeedBreak(Long play25FeedBreak) {
    this.play25FeedBreak = play25FeedBreak;
    return this;
  }

  public ReportCreativeGetResponseStruct consultEffective(Long consultEffective) {
    this.consultEffective = consultEffective;
    return this;
  }

  public ReportCreativeGetResponseStruct clickWebsite(Long clickWebsite) {
    this.clickWebsite = clickWebsite;
    return this;
  }

  public ReportCreativeGetResponseStruct firstOrderCount(Long firstOrderCount) {
    this.firstOrderCount = firstOrderCount;
    return this;
  }

  public ReportCreativeGetResponseStruct messageAction(Long messageAction) {
    this.messageAction = messageAction;
    return this;
  }

  public ReportCreativeGetResponseStruct locationClick(Long locationClick) {
    this.locationClick = locationClick;
    return this;
  }

  public ReportCreativeGetResponseStruct playOverRate(Float playOverRate) {
    this.playOverRate = playOverRate;
    return this;
  }

  public ReportCreativeGetResponseStruct advancedCreativeFormSubmit(Long advancedCreativeFormSubmit) {
    this.advancedCreativeFormSubmit = advancedCreativeFormSubmit;
    return this;
  }

  public ReportCreativeGetResponseStruct shopping(Long shopping) {
    this.shopping = shopping;
    return this;
  }

  public ReportCreativeGetResponseStruct ctr(Float ctr) {
    this.ctr = ctr;
    return this;
  }

  public ReportCreativeGetResponseStruct qq(Long qq) {
    this.qq = qq;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLiveSlidecartClickCnt(Long lubanLiveSlidecartClickCnt) {
    this.lubanLiveSlidecartClickCnt = lubanLiveSlidecartClickCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct ac(String ac) {
    this.ac = ac;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLiveGiftAmount(Float lubanLiveGiftAmount) {
    this.lubanLiveGiftAmount = lubanLiveGiftAmount;
    return this;
  }

  public ReportCreativeGetResponseStruct wechatFirstPayCount(Long wechatFirstPayCount) {
    this.wechatFirstPayCount = wechatFirstPayCount;
    return this;
  }

  public ReportCreativeGetResponseStruct activeCost(Float activeCost) {
    this.activeCost = activeCost;
    return this;
  }

  public ReportCreativeGetResponseStruct active(Long active) {
    this.active = active;
    return this;
  }

  public ReportCreativeGetResponseStruct poiCollect(Long poiCollect) {
    this.poiCollect = poiCollect;
    return this;
  }

  public ReportCreativeGetResponseStruct click(Long click) {
    this.click = click;
    return this;
  }

  public ReportCreativeGetResponseStruct activeRate(Float activeRate) {
    this.activeRate = activeRate;
    return this;
  }

  public ReportCreativeGetResponseStruct advancedCreativePhoneClick(Long advancedCreativePhoneClick) {
    this.advancedCreativePhoneClick = advancedCreativePhoneClick;
    return this;
  }

  public ReportCreativeGetResponseStruct provinceName(String provinceName) {
    this.provinceName = provinceName;
    return this;
  }

  public ReportCreativeGetResponseStruct downloadStart(Long downloadStart) {
    this.downloadStart = downloadStart;
    return this;
  }

  public ReportCreativeGetResponseStruct homeVisited(Long homeVisited) {
    this.homeVisited = homeVisited;
    return this;
  }

  public ReportCreativeGetResponseStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLiveGiftCnt(Long lubanLiveGiftCnt) {
    this.lubanLiveGiftCnt = lubanLiveGiftCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct phone(Long phone) {
    this.phone = phone;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLiveShareCnt(Long lubanLiveShareCnt) {
    this.lubanLiveShareCnt = lubanLiveShareCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct phoneEffective(Long phoneEffective) {
    this.phoneEffective = phoneEffective;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionGamePay7dCost(Float attributionGamePay7dCost) {
    this.attributionGamePay7dCost = attributionGamePay7dCost;
    return this;
  }

  public ReportCreativeGetResponseStruct iesChallengeClick(Long iesChallengeClick) {
    this.iesChallengeClick = iesChallengeClick;
    return this;
  }

  public ReportCreativeGetResponseStruct gender(String gender) {
    this.gender = gender;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanOrderCnt(Long lubanOrderCnt) {
    this.lubanOrderCnt = lubanOrderCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct activeRegisterCost(Float activeRegisterCost) {
    this.activeRegisterCost = activeRegisterCost;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionNextDayOpenRate(Float attributionNextDayOpenRate) {
    this.attributionNextDayOpenRate = attributionNextDayOpenRate;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionNextDayOpenCnt(Long attributionNextDayOpenCnt) {
    this.attributionNextDayOpenCnt = attributionNextDayOpenCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct clickInstall(Long clickInstall) {
    this.clickInstall = clickInstall;
    return this;
  }

  public ReportCreativeGetResponseStruct loanCreditRate(Float loanCreditRate) {
    this.loanCreditRate = loanCreditRate;
    return this;
  }

  public ReportCreativeGetResponseStruct playDurationSum(Long playDurationSum) {
    this.playDurationSum = playDurationSum;
    return this;
  }

  public ReportCreativeGetResponseStruct submitCertificationCount(Long submitCertificationCount) {
    this.submitCertificationCount = submitCertificationCount;
    return this;
  }

  public ReportCreativeGetResponseStruct liveWatchOneMinuteCount(Long liveWatchOneMinuteCount) {
    this.liveWatchOneMinuteCount = liveWatchOneMinuteCount;
    return this;
  }

  public ReportCreativeGetResponseStruct commuteFirstPayCount(Long commuteFirstPayCount) {
    this.commuteFirstPayCount = commuteFirstPayCount;
    return this;
  }

  public ReportCreativeGetResponseStruct play100FeedBreak(Long play100FeedBreak) {
    this.play100FeedBreak = play100FeedBreak;
    return this;
  }

  public ReportCreativeGetResponseStruct loanCreditCost(Float loanCreditCost) {
    this.loanCreditCost = loanCreditCost;
    return this;
  }

  public ReportCreativeGetResponseStruct convertRate(Float convertRate) {
    this.convertRate = convertRate;
    return this;
  }

  public ReportCreativeGetResponseStruct consult(Long consult) {
    this.consult = consult;
    return this;
  }

  public ReportCreativeGetResponseStruct share(Long share) {
    this.share = share;
    return this;
  }

  public ReportCreativeGetResponseStruct installFinishRate(Float installFinishRate) {
    this.installFinishRate = installFinishRate;
    return this;
  }

  public ReportCreativeGetResponseStruct payCount(Long payCount) {
    this.payCount = payCount;
    return this;
  }

  public ReportCreativeGetResponseStruct redirect(Long redirect) {
    this.redirect = redirect;
    return this;
  }

  public ReportCreativeGetResponseStruct phoneConnect(Long phoneConnect) {
    this.phoneConnect = phoneConnect;
    return this;
  }

  public ReportCreativeGetResponseStruct coupon(Long coupon) {
    this.coupon = coupon;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanOrderStatAmount(Float lubanOrderStatAmount) {
    this.lubanOrderStatAmount = lubanOrderStatAmount;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionWechatFirstPay30dRate(Float attributionWechatFirstPay30dRate) {
    this.attributionWechatFirstPay30dRate = attributionWechatFirstPay30dRate;
    return this;
  }

  public ReportCreativeGetResponseStruct adName(String adName) {
    this.adName = adName;
    return this;
  }

  public ReportCreativeGetResponseStruct couponSinglePage(Long couponSinglePage) {
    this.couponSinglePage = couponSinglePage;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLiveEnterCnt(Long lubanLiveEnterCnt) {
    this.lubanLiveEnterCnt = lubanLiveEnterCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct installFinish(Long installFinish) {
    this.installFinish = installFinish;
    return this;
  }

  public ReportCreativeGetResponseStruct lottery(Long lottery) {
    this.lottery = lottery;
    return this;
  }

  public ReportCreativeGetResponseStruct inAppDetailUv(Long inAppDetailUv) {
    this.inAppDetailUv = inAppDetailUv;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionWechatFirstPay30dCost(Float attributionWechatFirstPay30dCost) {
    this.attributionWechatFirstPay30dCost = attributionWechatFirstPay30dCost;
    return this;
  }

  public ReportCreativeGetResponseStruct gamePayCount(Long gamePayCount) {
    this.gamePayCount = gamePayCount;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionWechatFirstPay30dCount(Long attributionWechatFirstPay30dCount) {
    this.attributionWechatFirstPay30dCount = attributionWechatFirstPay30dCount;
    return this;
  }

  public ReportCreativeGetResponseStruct validPlayRate(Float validPlayRate) {
    this.validPlayRate = validPlayRate;
    return this;
  }

  public ReportCreativeGetResponseStruct averagePlayTimePerPlay(Float averagePlayTimePerPlay) {
    this.averagePlayTimePerPlay = averagePlayTimePerPlay;
    return this;
  }

  public ReportCreativeGetResponseStruct convertCost(Float convertCost) {
    this.convertCost = convertCost;
    return this;
  }

  public ReportCreativeGetResponseStruct installFinishCost(Float installFinishCost) {
    this.installFinishCost = installFinishCost;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLiveClickProductCnt(Long lubanLiveClickProductCnt) {
    this.lubanLiveClickProductCnt = lubanLiveClickProductCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct clickLandingPage(Long clickLandingPage) {
    this.clickLandingPage = clickLandingPage;
    return this;
  }

  public ReportCreativeGetResponseStruct register(Long register) {
    this.register = register;
    return this;
  }

  public ReportCreativeGetResponseStruct deepConvertCost(Float deepConvertCost) {
    this.deepConvertCost = deepConvertCost;
    return this;
  }

  public ReportCreativeGetResponseStruct validPlayCost(Float validPlayCost) {
    this.validPlayCost = validPlayCost;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLiveFollowCnt(Long lubanLiveFollowCnt) {
    this.lubanLiveFollowCnt = lubanLiveFollowCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct deepConvertRate(Float deepConvertRate) {
    this.deepConvertRate = deepConvertRate;
    return this;
  }

  public ReportCreativeGetResponseStruct activePayCost(Float activePayCost) {
    this.activePayCost = activePayCost;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionWechatLogin30dCost(Float attributionWechatLogin30dCost) {
    this.attributionWechatLogin30dCost = attributionWechatLogin30dCost;
    return this;
  }

  public ReportCreativeGetResponseStruct view(Long view) {
    this.view = view;
    return this;
  }

  public ReportCreativeGetResponseStruct download(Long download) {
    this.download = download;
    return this;
  }

  public ReportCreativeGetResponseStruct clickShopwindow(Long clickShopwindow) {
    this.clickShopwindow = clickShopwindow;
    return this;
  }

  public ReportCreativeGetResponseStruct approvalCount(Long approvalCount) {
    this.approvalCount = approvalCount;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionDeepConvert(Float attributionDeepConvert) {
    this.attributionDeepConvert = attributionDeepConvert;
    return this;
  }

  public ReportCreativeGetResponseStruct phoneConfirm(Long phoneConfirm) {
    this.phoneConfirm = phoneConfirm;
    return this;
  }

  public ReportCreativeGetResponseStruct iesMusicClick(Long iesMusicClick) {
    this.iesMusicClick = iesMusicClick;
    return this;
  }

  public ReportCreativeGetResponseStruct wifiPlay(Long wifiPlay) {
    this.wifiPlay = wifiPlay;
    return this;
  }

  public ReportCreativeGetResponseStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public ReportCreativeGetResponseStruct statDatetime(String statDatetime) {
    this.statDatetime = statDatetime;
    return this;
  }

  public ReportCreativeGetResponseStruct wifiPlayRate(Float wifiPlayRate) {
    this.wifiPlayRate = wifiPlayRate;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionGamePay7dCount(Long attributionGamePay7dCount) {
    this.attributionGamePay7dCount = attributionGamePay7dCount;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionActivePay7dPerCount(Long attributionActivePay7dPerCount) {
    this.attributionActivePay7dPerCount = attributionActivePay7dPerCount;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLivePayOrderCount(Long lubanLivePayOrderCount) {
    this.lubanLivePayOrderCount = lubanLivePayOrderCount;
    return this;
  }

  public ReportCreativeGetResponseStruct like(Long like) {
    this.like = like;
    return this;
  }

  public ReportCreativeGetResponseStruct play50FeedBreak(Long play50FeedBreak) {
    this.play50FeedBreak = play50FeedBreak;
    return this;
  }

  public ReportCreativeGetResponseStruct activePayRate(Float activePayRate) {
    this.activePayRate = activePayRate;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLivePayOrderStatCost(Float lubanLivePayOrderStatCost) {
    this.lubanLivePayOrderStatCost = lubanLivePayOrderStatCost;
    return this;
  }

  public ReportCreativeGetResponseStruct cardShow(Long cardShow) {
    this.cardShow = cardShow;
    return this;
  }

  public ReportCreativeGetResponseStruct wechatPayAmount(Float wechatPayAmount) {
    this.wechatPayAmount = wechatPayAmount;
    return this;
  }

  public ReportCreativeGetResponseStruct gameAddictionCost(Float gameAddictionCost) {
    this.gameAddictionCost = gameAddictionCost;
    return this;
  }

  public ReportCreativeGetResponseStruct gameAddiction(Long gameAddiction) {
    this.gameAddiction = gameAddiction;
    return this;
  }

  public ReportCreativeGetResponseStruct wechatFirstPayCost(Float wechatFirstPayCost) {
    this.wechatFirstPayCost = wechatFirstPayCost;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionWechatPay30dAmount(Float attributionWechatPay30dAmount) {
    this.attributionWechatPay30dAmount = attributionWechatPay30dAmount;
    return this;
  }

  public ReportCreativeGetResponseStruct liveFansClubJoinCnt(Long liveFansClubJoinCnt) {
    this.liveFansClubJoinCnt = liveFansClubJoinCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct deepConvert(Long deepConvert) {
    this.deepConvert = deepConvert;
    return this;
  }

  public ReportCreativeGetResponseStruct preLoanCredit(Long preLoanCredit) {
    this.preLoanCredit = preLoanCredit;
    return this;
  }

  public ReportCreativeGetResponseStruct redirectToShop(Long redirectToShop) {
    this.redirectToShop = redirectToShop;
    return this;
  }

  public ReportCreativeGetResponseStruct creativeMaterialMode(String creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionDeepConvertCost(Float attributionDeepConvertCost) {
    this.attributionDeepConvertCost = attributionDeepConvertCost;
    return this;
  }

  public ReportCreativeGetResponseStruct wechatFirstPayRate(Float wechatFirstPayRate) {
    this.wechatFirstPayRate = wechatFirstPayRate;
    return this;
  }

  public ReportCreativeGetResponseStruct preLoanCreditCost(Float preLoanCreditCost) {
    this.preLoanCreditCost = preLoanCreditCost;
    return this;
  }

  public ReportCreativeGetResponseStruct inAppPay(Long inAppPay) {
    this.inAppPay = inAppPay;
    return this;
  }

  public ReportCreativeGetResponseStruct gameAddictionRate(Float gameAddictionRate) {
    this.gameAddictionRate = gameAddictionRate;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanLiveCommentCnt(Long lubanLiveCommentCnt) {
    this.lubanLiveCommentCnt = lubanLiveCommentCnt;
    return this;
  }

  public ReportCreativeGetResponseStruct activeRegisterRate(Float activeRegisterRate) {
    this.activeRegisterRate = activeRegisterRate;
    return this;
  }

  public ReportCreativeGetResponseStruct totalPlay(Long totalPlay) {
    this.totalPlay = totalPlay;
    return this;
  }

  public ReportCreativeGetResponseStruct wechatLoginCount(Long wechatLoginCount) {
    this.wechatLoginCount = wechatLoginCount;
    return this;
  }

  public ReportCreativeGetResponseStruct avgClickCost(Float avgClickCost) {
    this.avgClickCost = avgClickCost;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionConvert(Float attributionConvert) {
    this.attributionConvert = attributionConvert;
    return this;
  }

  public ReportCreativeGetResponseStruct downloadFinishCost(Float downloadFinishCost) {
    this.downloadFinishCost = downloadFinishCost;
    return this;
  }

  public ReportCreativeGetResponseStruct show(Long show) {
    this.show = show;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionNextDayOpenCost(Float attributionNextDayOpenCost) {
    this.attributionNextDayOpenCost = attributionNextDayOpenCost;
    return this;
  }

  public ReportCreativeGetResponseStruct loanCompletionRate(Float loanCompletionRate) {
    this.loanCompletionRate = loanCompletionRate;
    return this;
  }

  public ReportCreativeGetResponseStruct mapSearch(Long mapSearch) {
    this.mapSearch = mapSearch;
    return this;
  }

  public ReportCreativeGetResponseStruct inventory(String inventory) {
    this.inventory = inventory;
    return this;
  }

  public ReportCreativeGetResponseStruct platform(String platform) {
    this.platform = platform;
    return this;
  }

  public ReportCreativeGetResponseStruct button(Long button) {
    this.button = button;
    return this;
  }

  public ReportCreativeGetResponseStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public ReportCreativeGetResponseStruct cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  public ReportCreativeGetResponseStruct clickDownload(Long clickDownload) {
    this.clickDownload = clickDownload;
    return this;
  }

  public ReportCreativeGetResponseStruct loanCompletionCost(Float loanCompletionCost) {
    this.loanCompletionCost = loanCompletionCost;
    return this;
  }

  public ReportCreativeGetResponseStruct advancedCreativeCounselClick(Long advancedCreativeCounselClick) {
    this.advancedCreativeCounselClick = advancedCreativeCounselClick;
    return this;
  }

  public ReportCreativeGetResponseStruct lubanOrderRoi(Float lubanOrderRoi) {
    this.lubanOrderRoi = lubanOrderRoi;
    return this;
  }

  public ReportCreativeGetResponseStruct downloadFinishRate(Float downloadFinishRate) {
    this.downloadFinishRate = downloadFinishRate;
    return this;
  }

  public ReportCreativeGetResponseStruct loanCompletion(Long loanCompletion) {
    this.loanCompletion = loanCompletion;
    return this;
  }

  public ReportCreativeGetResponseStruct gamePayCost(Long gamePayCost) {
    this.gamePayCost = gamePayCost;
    return this;
  }

  public ReportCreativeGetResponseStruct wechatLoginCost(Float wechatLoginCost) {
    this.wechatLoginCost = wechatLoginCost;
    return this;
  }

  public ReportCreativeGetResponseStruct vote(Long vote) {
    this.vote = vote;
    return this;
  }

  public ReportCreativeGetResponseStruct validPlay(Long validPlay) {
    this.validPlay = validPlay;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionWechatPay30dRoi(Float attributionWechatPay30dRoi) {
    this.attributionWechatPay30dRoi = attributionWechatPay30dRoi;
    return this;
  }

  public ReportCreativeGetResponseStruct advancedCreativeFormClick(Long advancedCreativeFormClick) {
    this.advancedCreativeFormClick = advancedCreativeFormClick;
    return this;
  }

  public ReportCreativeGetResponseStruct cost(Float cost) {
    this.cost = cost;
    return this;
  }

  public ReportCreativeGetResponseStruct downloadStartRate(Float downloadStartRate) {
    this.downloadStartRate = downloadStartRate;
    return this;
  }

  public ReportCreativeGetResponseStruct firstRentalOrderCount(Long firstRentalOrderCount) {
    this.firstRentalOrderCount = firstRentalOrderCount;
    return this;
  }

  public ReportCreativeGetResponseStruct downloadFinish(Long downloadFinish) {
    this.downloadFinish = downloadFinish;
    return this;
  }

  public ReportCreativeGetResponseStruct wechat(Long wechat) {
    this.wechat = wechat;
    return this;
  }

  public ReportCreativeGetResponseStruct inAppOrder(Long inAppOrder) {
    this.inAppOrder = inAppOrder;
    return this;
  }

  public ReportCreativeGetResponseStruct downloadStartCost(Float downloadStartCost) {
    this.downloadStartCost = downloadStartCost;
    return this;
  }

  public ReportCreativeGetResponseStruct message(Long message) {
    this.message = message;
    return this;
  }

  public ReportCreativeGetResponseStruct follow(Long follow) {
    this.follow = follow;
    return this;
  }

  public ReportCreativeGetResponseStruct avgShowCost(Float avgShowCost) {
    this.avgShowCost = avgShowCost;
    return this;
  }

  public ReportCreativeGetResponseStruct loanCredit(Long loanCredit) {
    this.loanCredit = loanCredit;
    return this;
  }

  public ReportCreativeGetResponseStruct clickCallDy(Long clickCallDy) {
    this.clickCallDy = clickCallDy;
    return this;
  }

  public ReportCreativeGetResponseStruct form(Long form) {
    this.form = form;
    return this;
  }

  public ReportCreativeGetResponseStruct imageMode(String imageMode) {
    this.imageMode = imageMode;
    return this;
  }

  public ReportCreativeGetResponseStruct comment(Long comment) {
    this.comment = comment;
    return this;
  }

  public ReportCreativeGetResponseStruct pricing(String pricing) {
    this.pricing = pricing;
    return this;
  }

  public ReportCreativeGetResponseStruct age(String age) {
    this.age = age;
    return this;
  }

  public ReportCreativeGetResponseStruct inAppUv(Long inAppUv) {
    this.inAppUv = inAppUv;
    return this;
  }

  public ReportCreativeGetResponseStruct attributionWechatLogin30dCount(Long attributionWechatLogin30dCount) {
    this.attributionWechatLogin30dCount = attributionWechatLogin30dCount;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
