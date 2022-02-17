package com.hyq0719.mktapi.kuaishou.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ReportAccountReportResponseStruct {
  @SerializedName("event_pay_first_day")
  private Long eventPayFirstDay = null;

  @SerializedName("bclick")
  private Long bclick = null;

  @SerializedName("event_register_cost")
  private Double eventRegisterCost = null;

  @SerializedName("event_get_through")
  private Long eventGetThrough = null;

  @SerializedName("event_credit_grant_app_cost")
  private Double eventCreditGrantAppCost = null;

  @SerializedName("event_order_paid")
  private Long eventOrderPaid = null;

  @SerializedName("stat_hour")
  private Integer statHour = null;

  @SerializedName("event_pay_first_day_roi")
  private Double eventPayFirstDayRoi = null;

  @SerializedName("event_pay_roi")
  private Double eventPayRoi = null;

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

  @SerializedName("event_valid_clues")
  private Long eventValidClues = null;

  @SerializedName("like")
  private Long like = null;

  @SerializedName("event_add_wechat_cost")
  private Double eventAddWechatCost = null;

  @SerializedName("event_next_day_stay_ratio")
  private Double eventNextDayStayRatio = null;

  @SerializedName("event_register_ratio")
  private Double eventRegisterRatio = null;

  @SerializedName("event_valid_clues_cost")
  private Double eventValidCluesCost = null;

  @SerializedName("download_completed")
  private Long downloadCompleted = null;

  @SerializedName("event_jin_jian_app_cost")
  private Double eventJinJianAppCost = null;

  @SerializedName("play_3s_ratio")
  private Double play3sRatio = null;

  @SerializedName("form_action_ratio")
  private Double formActionRatio = null;

  @SerializedName("activation")
  private Long activation = null;

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

  @SerializedName("negative")
  private Long negative = null;

  @SerializedName("form_count")
  private Long formCount = null;

  @SerializedName("event_add_wechat")
  private Long eventAddWechat = null;

  @SerializedName("photo_click_ratio")
  private Double photoClickRatio = null;

  @SerializedName("share")
  private Long share = null;

  @SerializedName("impression_1k_cost")
  private Double impression1kCost = null;

  @SerializedName("photo_click_cost")
  private Double photoClickCost = null;

  @SerializedName("event_get_through_cost")
  private Double eventGetThroughCost = null;

  @SerializedName("event_register")
  private Long eventRegister = null;

  @SerializedName("download_started")
  private Long downloadStarted = null;

  @SerializedName("charge")
  private Double charge = null;

  @SerializedName("event_jin_jian_landing_page_cost")
  private Double eventJinJianLandingPageCost = null;

  @SerializedName("cancel_follow")
  private Long cancelFollow = null;

  @SerializedName("stat_date")
  private String statDate = null;

  @SerializedName("event_pay")
  private Long eventPay = null;

  @SerializedName("action_cost")
  private Double actionCost = null;

  @SerializedName("event_credit_grant_landing_page_cost")
  private Double eventCreditGrantLandingPageCost = null;

  @SerializedName("aclick")
  private Long aclick = null;

  @SerializedName("follow")
  private Long follow = null;

  @SerializedName("event_credit_grant_app")
  private Long eventCreditGrantApp = null;

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

  @SerializedName("event_add_wechat_ratio")
  private Double eventAddWechatRatio = null;


  public ReportAccountReportResponseStruct eventPayFirstDay(Long eventPayFirstDay) {
    this.eventPayFirstDay = eventPayFirstDay;
    return this;
  }

  public ReportAccountReportResponseStruct bclick(Long bclick) {
    this.bclick = bclick;
    return this;
  }

  public ReportAccountReportResponseStruct eventRegisterCost(Double eventRegisterCost) {
    this.eventRegisterCost = eventRegisterCost;
    return this;
  }

  public ReportAccountReportResponseStruct eventGetThrough(Long eventGetThrough) {
    this.eventGetThrough = eventGetThrough;
    return this;
  }

  public ReportAccountReportResponseStruct eventCreditGrantAppCost(Double eventCreditGrantAppCost) {
    this.eventCreditGrantAppCost = eventCreditGrantAppCost;
    return this;
  }

  public ReportAccountReportResponseStruct eventOrderPaid(Long eventOrderPaid) {
    this.eventOrderPaid = eventOrderPaid;
    return this;
  }

  public ReportAccountReportResponseStruct statHour(Integer statHour) {
    this.statHour = statHour;
    return this;
  }

  public ReportAccountReportResponseStruct eventPayFirstDayRoi(Double eventPayFirstDayRoi) {
    this.eventPayFirstDayRoi = eventPayFirstDayRoi;
    return this;
  }

  public ReportAccountReportResponseStruct eventPayRoi(Double eventPayRoi) {
    this.eventPayRoi = eventPayRoi;
    return this;
  }

  public ReportAccountReportResponseStruct photoClick(Long photoClick) {
    this.photoClick = photoClick;
    return this;
  }

  public ReportAccountReportResponseStruct eventNextDayStayCost(Double eventNextDayStayCost) {
    this.eventNextDayStayCost = eventNextDayStayCost;
    return this;
  }

  public ReportAccountReportResponseStruct block(Long block) {
    this.block = block;
    return this;
  }

  public ReportAccountReportResponseStruct eventOrderPaidPurchaseAmount(Double eventOrderPaidPurchaseAmount) {
    this.eventOrderPaidPurchaseAmount = eventOrderPaidPurchaseAmount;
    return this;
  }

  public ReportAccountReportResponseStruct eventCreditGrantLandingPage(Long eventCreditGrantLandingPage) {
    this.eventCreditGrantLandingPage = eventCreditGrantLandingPage;
    return this;
  }

  public ReportAccountReportResponseStruct eventValidClues(Long eventValidClues) {
    this.eventValidClues = eventValidClues;
    return this;
  }

  public ReportAccountReportResponseStruct like(Long like) {
    this.like = like;
    return this;
  }

  public ReportAccountReportResponseStruct eventAddWechatCost(Double eventAddWechatCost) {
    this.eventAddWechatCost = eventAddWechatCost;
    return this;
  }

  public ReportAccountReportResponseStruct eventNextDayStayRatio(Double eventNextDayStayRatio) {
    this.eventNextDayStayRatio = eventNextDayStayRatio;
    return this;
  }

  public ReportAccountReportResponseStruct eventRegisterRatio(Double eventRegisterRatio) {
    this.eventRegisterRatio = eventRegisterRatio;
    return this;
  }

  public ReportAccountReportResponseStruct eventValidCluesCost(Double eventValidCluesCost) {
    this.eventValidCluesCost = eventValidCluesCost;
    return this;
  }

  public ReportAccountReportResponseStruct downloadCompleted(Long downloadCompleted) {
    this.downloadCompleted = downloadCompleted;
    return this;
  }

  public ReportAccountReportResponseStruct eventJinJianAppCost(Double eventJinJianAppCost) {
    this.eventJinJianAppCost = eventJinJianAppCost;
    return this;
  }

  public ReportAccountReportResponseStruct play3sRatio(Double play3sRatio) {
    this.play3sRatio = play3sRatio;
    return this;
  }

  public ReportAccountReportResponseStruct formActionRatio(Double formActionRatio) {
    this.formActionRatio = formActionRatio;
    return this;
  }

  public ReportAccountReportResponseStruct activation(Long activation) {
    this.activation = activation;
    return this;
  }

  public ReportAccountReportResponseStruct formCost(Double formCost) {
    this.formCost = formCost;
    return this;
  }

  public ReportAccountReportResponseStruct eventNextDayStay(Long eventNextDayStay) {
    this.eventNextDayStay = eventNextDayStay;
    return this;
  }

  public ReportAccountReportResponseStruct eventGetThroughRatio(Double eventGetThroughRatio) {
    this.eventGetThroughRatio = eventGetThroughRatio;
    return this;
  }

  public ReportAccountReportResponseStruct submit(Long submit) {
    this.submit = submit;
    return this;
  }

  public ReportAccountReportResponseStruct show(Long show) {
    this.show = show;
    return this;
  }

  public ReportAccountReportResponseStruct eventCreditGrantAppRatio(Double eventCreditGrantAppRatio) {
    this.eventCreditGrantAppRatio = eventCreditGrantAppRatio;
    return this;
  }

  public ReportAccountReportResponseStruct eventJinJianApp(Long eventJinJianApp) {
    this.eventJinJianApp = eventJinJianApp;
    return this;
  }

  public ReportAccountReportResponseStruct eventPayPurchaseAmount(Double eventPayPurchaseAmount) {
    this.eventPayPurchaseAmount = eventPayPurchaseAmount;
    return this;
  }

  public ReportAccountReportResponseStruct negative(Long negative) {
    this.negative = negative;
    return this;
  }

  public ReportAccountReportResponseStruct formCount(Long formCount) {
    this.formCount = formCount;
    return this;
  }

  public ReportAccountReportResponseStruct eventAddWechat(Long eventAddWechat) {
    this.eventAddWechat = eventAddWechat;
    return this;
  }

  public ReportAccountReportResponseStruct photoClickRatio(Double photoClickRatio) {
    this.photoClickRatio = photoClickRatio;
    return this;
  }

  public ReportAccountReportResponseStruct share(Long share) {
    this.share = share;
    return this;
  }

  public ReportAccountReportResponseStruct impression1kCost(Double impression1kCost) {
    this.impression1kCost = impression1kCost;
    return this;
  }

  public ReportAccountReportResponseStruct photoClickCost(Double photoClickCost) {
    this.photoClickCost = photoClickCost;
    return this;
  }

  public ReportAccountReportResponseStruct eventGetThroughCost(Double eventGetThroughCost) {
    this.eventGetThroughCost = eventGetThroughCost;
    return this;
  }

  public ReportAccountReportResponseStruct eventRegister(Long eventRegister) {
    this.eventRegister = eventRegister;
    return this;
  }

  public ReportAccountReportResponseStruct downloadStarted(Long downloadStarted) {
    this.downloadStarted = downloadStarted;
    return this;
  }

  public ReportAccountReportResponseStruct charge(Double charge) {
    this.charge = charge;
    return this;
  }

  public ReportAccountReportResponseStruct eventJinJianLandingPageCost(Double eventJinJianLandingPageCost) {
    this.eventJinJianLandingPageCost = eventJinJianLandingPageCost;
    return this;
  }

  public ReportAccountReportResponseStruct cancelFollow(Long cancelFollow) {
    this.cancelFollow = cancelFollow;
    return this;
  }

  public ReportAccountReportResponseStruct statDate(String statDate) {
    this.statDate = statDate;
    return this;
  }

  public ReportAccountReportResponseStruct eventPay(Long eventPay) {
    this.eventPay = eventPay;
    return this;
  }

  public ReportAccountReportResponseStruct actionCost(Double actionCost) {
    this.actionCost = actionCost;
    return this;
  }

  public ReportAccountReportResponseStruct eventCreditGrantLandingPageCost(Double eventCreditGrantLandingPageCost) {
    this.eventCreditGrantLandingPageCost = eventCreditGrantLandingPageCost;
    return this;
  }

  public ReportAccountReportResponseStruct aclick(Long aclick) {
    this.aclick = aclick;
    return this;
  }

  public ReportAccountReportResponseStruct follow(Long follow) {
    this.follow = follow;
    return this;
  }

  public ReportAccountReportResponseStruct eventCreditGrantApp(Long eventCreditGrantApp) {
    this.eventCreditGrantApp = eventCreditGrantApp;
    return this;
  }

  public ReportAccountReportResponseStruct eventJinJianLandingPage(Long eventJinJianLandingPage) {
    this.eventJinJianLandingPage = eventJinJianLandingPage;
    return this;
  }

  public ReportAccountReportResponseStruct actionRatio(Double actionRatio) {
    this.actionRatio = actionRatio;
    return this;
  }

  public ReportAccountReportResponseStruct report(Long report) {
    this.report = report;
    return this;
  }

  public ReportAccountReportResponseStruct eventPayPurchaseAmountFirstDay(Double eventPayPurchaseAmountFirstDay) {
    this.eventPayPurchaseAmountFirstDay = eventPayPurchaseAmountFirstDay;
    return this;
  }

  public ReportAccountReportResponseStruct comment(Long comment) {
    this.comment = comment;
    return this;
  }

  public ReportAccountReportResponseStruct eventOrderPaidCost(Double eventOrderPaidCost) {
    this.eventOrderPaidCost = eventOrderPaidCost;
    return this;
  }

  public ReportAccountReportResponseStruct eventAddWechatRatio(Double eventAddWechatRatio) {
    this.eventAddWechatRatio = eventAddWechatRatio;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
