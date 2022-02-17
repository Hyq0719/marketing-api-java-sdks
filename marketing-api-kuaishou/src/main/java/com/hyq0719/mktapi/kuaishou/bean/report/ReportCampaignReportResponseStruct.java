package com.hyq0719.mktapi.kuaishou.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ReportCampaignReportResponseStruct {
  @SerializedName("event_pay_first_day")
  private Long eventPayFirstDay = null;

  @SerializedName("event_new_user_pay_ratio")
  private Double eventNewUserPayRatio = null;

  @SerializedName("bclick")
  private Long bclick = null;

  @SerializedName("event_register_cost")
  private Double eventRegisterCost = null;

  @SerializedName("event_get_through")
  private Long eventGetThrough = null;

  @SerializedName("event_new_user_credit_grant_app")
  private Long eventNewUserCreditGrantApp = null;

  @SerializedName("event_button_click_ratio")
  private Double eventButtonClickRatio = null;

  @SerializedName("event_credit_grant_app_cost")
  private Double eventCreditGrantAppCost = null;

  @SerializedName("event_order_paid")
  private Long eventOrderPaid = null;

  @SerializedName("stat_hour")
  private Integer statHour = null;

  @SerializedName("event_new_user_jinjian_page_cost")
  private Double eventNewUserJinjianPageCost = null;

  @SerializedName("event_pay_first_day_roi")
  private Double eventPayFirstDayRoi = null;

  @SerializedName("event_pay_roi")
  private Double eventPayRoi = null;

  @SerializedName("event_goods_view_cost")
  private Double eventGoodsViewCost = null;

  @SerializedName("photo_click")
  private Long photoClick = null;

  @SerializedName("event_next_day_stay_cost")
  private Double eventNextDayStayCost = null;

  @SerializedName("block")
  private Long block = null;

  @SerializedName("event_order_paid_purchase_amount")
  private Double eventOrderPaidPurchaseAmount = null;

  @SerializedName("event_credit_grant_landing_page")
  private Long eventCreditGrantLandingPage = null;

  @SerializedName("event_new_user_credit_grant_page_cost")
  private Double eventNewUserCreditGrantPageCost = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("event_valid_clues")
  private Long eventValidClues = null;

  @SerializedName("like")
  private Long like = null;

  @SerializedName("event_order_paid_roi")
  private Double eventOrderPaidRoi = null;

  @SerializedName("event_add_wechat_cost")
  private Double eventAddWechatCost = null;

  @SerializedName("event_next_day_stay_ratio")
  private Double eventNextDayStayRatio = null;

  @SerializedName("event_register_ratio")
  private Double eventRegisterRatio = null;

  @SerializedName("event_valid_clues_cost")
  private Double eventValidCluesCost = null;

  @SerializedName("event_order_amount_roi")
  private Long eventOrderAmountRoi = null;

  @SerializedName("event_button_click")
  private Long eventButtonClick = null;

  @SerializedName("merchant_reco_fans_cost")
  private Double merchantRecoFansCost = null;

  @SerializedName("download_completed")
  private Long downloadCompleted = null;

  @SerializedName("event_jin_jian_app_cost")
  private Double eventJinJianAppCost = null;

  @SerializedName("play_3s_ratio")
  private Double play3sRatio = null;

  @SerializedName("form_action_ratio")
  private Double formActionRatio = null;

  @SerializedName("play_5s_ratio")
  private Double play5sRatio = null;

  @SerializedName("activation")
  private Long activation = null;

  @SerializedName("ad_product_cnt")
  private Long adProductCnt = null;

  @SerializedName("event_new_user_jinjian_page")
  private Long eventNewUserJinjianPage = null;

  @SerializedName("form_cost")
  private Double formCost = null;

  @SerializedName("event_next_day_stay")
  private Long eventNextDayStay = null;

  @SerializedName("event_get_through_ratio")
  private Double eventGetThroughRatio = null;

  @SerializedName("submit")
  private Long submit = null;

  @SerializedName("show")
  private Long show = null;

  @SerializedName("event_credit_grant_app_ratio")
  private Double eventCreditGrantAppRatio = null;

  @SerializedName("event_jin_jian_app")
  private Long eventJinJianApp = null;

  @SerializedName("event_pay_purchase_amount")
  private Double eventPayPurchaseAmount = null;

  @SerializedName("campaign_name")
  private String campaignName = null;

  @SerializedName("negative")
  private Long negative = null;

  @SerializedName("form_count")
  private Long formCount = null;

  @SerializedName("event_add_wechat")
  private Long eventAddWechat = null;

  @SerializedName("event_button_click_cost")
  private Double eventButtonClickCost = null;

  @SerializedName("photo_click_ratio")
  private Double photoClickRatio = null;

  @SerializedName("event_new_user_pay_cost")
  private Double eventNewUserPayCost = null;

  @SerializedName("share")
  private Long share = null;

  @SerializedName("event_new_user_jinjian_app_cost")
  private Double eventNewUserJinjianAppCost = null;

  @SerializedName("event_new_user_credit_grant_page")
  private Long eventNewUserCreditGrantPage = null;

  @SerializedName("impression_1k_cost")
  private Double impression1kCost = null;

  @SerializedName("photo_click_cost")
  private Double photoClickCost = null;

  @SerializedName("event_get_through_cost")
  private Double eventGetThroughCost = null;

  @SerializedName("event_goods_view")
  private Long eventGoodsView = null;

  @SerializedName("event_new_user_jinjian_page_roi")
  private Double eventNewUserJinjianPageRoi = null;

  @SerializedName("event_register")
  private Long eventRegister = null;

  @SerializedName("event_new_user_jinjian_app")
  private Long eventNewUserJinjianApp = null;

  @SerializedName("download_started")
  private Long downloadStarted = null;

  @SerializedName("event_new_user_credit_grant_page_roi")
  private Double eventNewUserCreditGrantPageRoi = null;

  @SerializedName("charge")
  private Double charge = null;

  @SerializedName("event_jin_jian_landing_page_cost")
  private Double eventJinJianLandingPageCost = null;

  @SerializedName("cancel_follow")
  private Long cancelFollow = null;

  @SerializedName("play_end_ratio")
  private Double playEndRatio = null;

  @SerializedName("stat_date")
  private String statDate = null;

  @SerializedName("event_pay")
  private Long eventPay = null;

  @SerializedName("event_new_user_jinjian_app_roi")
  private Double eventNewUserJinjianAppRoi = null;

  @SerializedName("event_new_user_credit_grant_app_roi")
  private Double eventNewUserCreditGrantAppRoi = null;

  @SerializedName("action_cost")
  private Double actionCost = null;

  @SerializedName("event_new_user_credit_grant_app_cost")
  private Double eventNewUserCreditGrantAppCost = null;

  @SerializedName("event_credit_grant_landing_page_cost")
  private Double eventCreditGrantLandingPageCost = null;

  @SerializedName("aclick")
  private Long aclick = null;

  @SerializedName("follow")
  private Long follow = null;

  @SerializedName("event_credit_grant_app")
  private Long eventCreditGrantApp = null;

  @SerializedName("event_new_user_pay")
  private Long eventNewUserPay = null;

  @SerializedName("event_jin_jian_landing_page")
  private Long eventJinJianLandingPage = null;

  @SerializedName("action_ratio")
  private Double actionRatio = null;

  @SerializedName("report")
  private Long report = null;

  @SerializedName("event_pay_purchase_amount_first_day")
  private Double eventPayPurchaseAmountFirstDay = null;

  @SerializedName("comment")
  private Long comment = null;

  @SerializedName("event_order_paid_cost")
  private Double eventOrderPaidCost = null;

  @SerializedName("merchant_reco_fans")
  private Long merchantRecoFans = null;

  @SerializedName("event_add_wechat_ratio")
  private Double eventAddWechatRatio = null;


  public ReportCampaignReportResponseStruct eventPayFirstDay(Long eventPayFirstDay) {
    this.eventPayFirstDay = eventPayFirstDay;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserPayRatio(Double eventNewUserPayRatio) {
    this.eventNewUserPayRatio = eventNewUserPayRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct bclick(Long bclick) {
    this.bclick = bclick;
    return this;
  }

  public ReportCampaignReportResponseStruct eventRegisterCost(Double eventRegisterCost) {
    this.eventRegisterCost = eventRegisterCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventGetThrough(Long eventGetThrough) {
    this.eventGetThrough = eventGetThrough;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserCreditGrantApp(Long eventNewUserCreditGrantApp) {
    this.eventNewUserCreditGrantApp = eventNewUserCreditGrantApp;
    return this;
  }

  public ReportCampaignReportResponseStruct eventButtonClickRatio(Double eventButtonClickRatio) {
    this.eventButtonClickRatio = eventButtonClickRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct eventCreditGrantAppCost(Double eventCreditGrantAppCost) {
    this.eventCreditGrantAppCost = eventCreditGrantAppCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventOrderPaid(Long eventOrderPaid) {
    this.eventOrderPaid = eventOrderPaid;
    return this;
  }

  public ReportCampaignReportResponseStruct statHour(Integer statHour) {
    this.statHour = statHour;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserJinjianPageCost(Double eventNewUserJinjianPageCost) {
    this.eventNewUserJinjianPageCost = eventNewUserJinjianPageCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventPayFirstDayRoi(Double eventPayFirstDayRoi) {
    this.eventPayFirstDayRoi = eventPayFirstDayRoi;
    return this;
  }

  public ReportCampaignReportResponseStruct eventPayRoi(Double eventPayRoi) {
    this.eventPayRoi = eventPayRoi;
    return this;
  }

  public ReportCampaignReportResponseStruct eventGoodsViewCost(Double eventGoodsViewCost) {
    this.eventGoodsViewCost = eventGoodsViewCost;
    return this;
  }

  public ReportCampaignReportResponseStruct photoClick(Long photoClick) {
    this.photoClick = photoClick;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNextDayStayCost(Double eventNextDayStayCost) {
    this.eventNextDayStayCost = eventNextDayStayCost;
    return this;
  }

  public ReportCampaignReportResponseStruct block(Long block) {
    this.block = block;
    return this;
  }

  public ReportCampaignReportResponseStruct eventOrderPaidPurchaseAmount(Double eventOrderPaidPurchaseAmount) {
    this.eventOrderPaidPurchaseAmount = eventOrderPaidPurchaseAmount;
    return this;
  }

  public ReportCampaignReportResponseStruct eventCreditGrantLandingPage(Long eventCreditGrantLandingPage) {
    this.eventCreditGrantLandingPage = eventCreditGrantLandingPage;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserCreditGrantPageCost(Double eventNewUserCreditGrantPageCost) {
    this.eventNewUserCreditGrantPageCost = eventNewUserCreditGrantPageCost;
    return this;
  }

  public ReportCampaignReportResponseStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public ReportCampaignReportResponseStruct eventValidClues(Long eventValidClues) {
    this.eventValidClues = eventValidClues;
    return this;
  }

  public ReportCampaignReportResponseStruct like(Long like) {
    this.like = like;
    return this;
  }

  public ReportCampaignReportResponseStruct eventOrderPaidRoi(Double eventOrderPaidRoi) {
    this.eventOrderPaidRoi = eventOrderPaidRoi;
    return this;
  }

  public ReportCampaignReportResponseStruct eventAddWechatCost(Double eventAddWechatCost) {
    this.eventAddWechatCost = eventAddWechatCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNextDayStayRatio(Double eventNextDayStayRatio) {
    this.eventNextDayStayRatio = eventNextDayStayRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct eventRegisterRatio(Double eventRegisterRatio) {
    this.eventRegisterRatio = eventRegisterRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct eventValidCluesCost(Double eventValidCluesCost) {
    this.eventValidCluesCost = eventValidCluesCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventOrderAmountRoi(Long eventOrderAmountRoi) {
    this.eventOrderAmountRoi = eventOrderAmountRoi;
    return this;
  }

  public ReportCampaignReportResponseStruct eventButtonClick(Long eventButtonClick) {
    this.eventButtonClick = eventButtonClick;
    return this;
  }

  public ReportCampaignReportResponseStruct merchantRecoFansCost(Double merchantRecoFansCost) {
    this.merchantRecoFansCost = merchantRecoFansCost;
    return this;
  }

  public ReportCampaignReportResponseStruct downloadCompleted(Long downloadCompleted) {
    this.downloadCompleted = downloadCompleted;
    return this;
  }

  public ReportCampaignReportResponseStruct eventJinJianAppCost(Double eventJinJianAppCost) {
    this.eventJinJianAppCost = eventJinJianAppCost;
    return this;
  }

  public ReportCampaignReportResponseStruct play3sRatio(Double play3sRatio) {
    this.play3sRatio = play3sRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct formActionRatio(Double formActionRatio) {
    this.formActionRatio = formActionRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct play5sRatio(Double play5sRatio) {
    this.play5sRatio = play5sRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct activation(Long activation) {
    this.activation = activation;
    return this;
  }

  public ReportCampaignReportResponseStruct adProductCnt(Long adProductCnt) {
    this.adProductCnt = adProductCnt;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserJinjianPage(Long eventNewUserJinjianPage) {
    this.eventNewUserJinjianPage = eventNewUserJinjianPage;
    return this;
  }

  public ReportCampaignReportResponseStruct formCost(Double formCost) {
    this.formCost = formCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNextDayStay(Long eventNextDayStay) {
    this.eventNextDayStay = eventNextDayStay;
    return this;
  }

  public ReportCampaignReportResponseStruct eventGetThroughRatio(Double eventGetThroughRatio) {
    this.eventGetThroughRatio = eventGetThroughRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct submit(Long submit) {
    this.submit = submit;
    return this;
  }

  public ReportCampaignReportResponseStruct show(Long show) {
    this.show = show;
    return this;
  }

  public ReportCampaignReportResponseStruct eventCreditGrantAppRatio(Double eventCreditGrantAppRatio) {
    this.eventCreditGrantAppRatio = eventCreditGrantAppRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct eventJinJianApp(Long eventJinJianApp) {
    this.eventJinJianApp = eventJinJianApp;
    return this;
  }

  public ReportCampaignReportResponseStruct eventPayPurchaseAmount(Double eventPayPurchaseAmount) {
    this.eventPayPurchaseAmount = eventPayPurchaseAmount;
    return this;
  }

  public ReportCampaignReportResponseStruct campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public ReportCampaignReportResponseStruct negative(Long negative) {
    this.negative = negative;
    return this;
  }

  public ReportCampaignReportResponseStruct formCount(Long formCount) {
    this.formCount = formCount;
    return this;
  }

  public ReportCampaignReportResponseStruct eventAddWechat(Long eventAddWechat) {
    this.eventAddWechat = eventAddWechat;
    return this;
  }

  public ReportCampaignReportResponseStruct eventButtonClickCost(Double eventButtonClickCost) {
    this.eventButtonClickCost = eventButtonClickCost;
    return this;
  }

  public ReportCampaignReportResponseStruct photoClickRatio(Double photoClickRatio) {
    this.photoClickRatio = photoClickRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserPayCost(Double eventNewUserPayCost) {
    this.eventNewUserPayCost = eventNewUserPayCost;
    return this;
  }

  public ReportCampaignReportResponseStruct share(Long share) {
    this.share = share;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserJinjianAppCost(Double eventNewUserJinjianAppCost) {
    this.eventNewUserJinjianAppCost = eventNewUserJinjianAppCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserCreditGrantPage(Long eventNewUserCreditGrantPage) {
    this.eventNewUserCreditGrantPage = eventNewUserCreditGrantPage;
    return this;
  }

  public ReportCampaignReportResponseStruct impression1kCost(Double impression1kCost) {
    this.impression1kCost = impression1kCost;
    return this;
  }

  public ReportCampaignReportResponseStruct photoClickCost(Double photoClickCost) {
    this.photoClickCost = photoClickCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventGetThroughCost(Double eventGetThroughCost) {
    this.eventGetThroughCost = eventGetThroughCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventGoodsView(Long eventGoodsView) {
    this.eventGoodsView = eventGoodsView;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserJinjianPageRoi(Double eventNewUserJinjianPageRoi) {
    this.eventNewUserJinjianPageRoi = eventNewUserJinjianPageRoi;
    return this;
  }

  public ReportCampaignReportResponseStruct eventRegister(Long eventRegister) {
    this.eventRegister = eventRegister;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserJinjianApp(Long eventNewUserJinjianApp) {
    this.eventNewUserJinjianApp = eventNewUserJinjianApp;
    return this;
  }

  public ReportCampaignReportResponseStruct downloadStarted(Long downloadStarted) {
    this.downloadStarted = downloadStarted;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserCreditGrantPageRoi(Double eventNewUserCreditGrantPageRoi) {
    this.eventNewUserCreditGrantPageRoi = eventNewUserCreditGrantPageRoi;
    return this;
  }

  public ReportCampaignReportResponseStruct charge(Double charge) {
    this.charge = charge;
    return this;
  }

  public ReportCampaignReportResponseStruct eventJinJianLandingPageCost(Double eventJinJianLandingPageCost) {
    this.eventJinJianLandingPageCost = eventJinJianLandingPageCost;
    return this;
  }

  public ReportCampaignReportResponseStruct cancelFollow(Long cancelFollow) {
    this.cancelFollow = cancelFollow;
    return this;
  }

  public ReportCampaignReportResponseStruct playEndRatio(Double playEndRatio) {
    this.playEndRatio = playEndRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct statDate(String statDate) {
    this.statDate = statDate;
    return this;
  }

  public ReportCampaignReportResponseStruct eventPay(Long eventPay) {
    this.eventPay = eventPay;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserJinjianAppRoi(Double eventNewUserJinjianAppRoi) {
    this.eventNewUserJinjianAppRoi = eventNewUserJinjianAppRoi;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserCreditGrantAppRoi(Double eventNewUserCreditGrantAppRoi) {
    this.eventNewUserCreditGrantAppRoi = eventNewUserCreditGrantAppRoi;
    return this;
  }

  public ReportCampaignReportResponseStruct actionCost(Double actionCost) {
    this.actionCost = actionCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserCreditGrantAppCost(Double eventNewUserCreditGrantAppCost) {
    this.eventNewUserCreditGrantAppCost = eventNewUserCreditGrantAppCost;
    return this;
  }

  public ReportCampaignReportResponseStruct eventCreditGrantLandingPageCost(Double eventCreditGrantLandingPageCost) {
    this.eventCreditGrantLandingPageCost = eventCreditGrantLandingPageCost;
    return this;
  }

  public ReportCampaignReportResponseStruct aclick(Long aclick) {
    this.aclick = aclick;
    return this;
  }

  public ReportCampaignReportResponseStruct follow(Long follow) {
    this.follow = follow;
    return this;
  }

  public ReportCampaignReportResponseStruct eventCreditGrantApp(Long eventCreditGrantApp) {
    this.eventCreditGrantApp = eventCreditGrantApp;
    return this;
  }

  public ReportCampaignReportResponseStruct eventNewUserPay(Long eventNewUserPay) {
    this.eventNewUserPay = eventNewUserPay;
    return this;
  }

  public ReportCampaignReportResponseStruct eventJinJianLandingPage(Long eventJinJianLandingPage) {
    this.eventJinJianLandingPage = eventJinJianLandingPage;
    return this;
  }

  public ReportCampaignReportResponseStruct actionRatio(Double actionRatio) {
    this.actionRatio = actionRatio;
    return this;
  }

  public ReportCampaignReportResponseStruct report(Long report) {
    this.report = report;
    return this;
  }

  public ReportCampaignReportResponseStruct eventPayPurchaseAmountFirstDay(Double eventPayPurchaseAmountFirstDay) {
    this.eventPayPurchaseAmountFirstDay = eventPayPurchaseAmountFirstDay;
    return this;
  }

  public ReportCampaignReportResponseStruct comment(Long comment) {
    this.comment = comment;
    return this;
  }

  public ReportCampaignReportResponseStruct eventOrderPaidCost(Double eventOrderPaidCost) {
    this.eventOrderPaidCost = eventOrderPaidCost;
    return this;
  }

  public ReportCampaignReportResponseStruct merchantRecoFans(Long merchantRecoFans) {
    this.merchantRecoFans = merchantRecoFans;
    return this;
  }

  public ReportCampaignReportResponseStruct eventAddWechatRatio(Double eventAddWechatRatio) {
    this.eventAddWechatRatio = eventAddWechatRatio;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
