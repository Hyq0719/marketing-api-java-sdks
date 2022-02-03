package com.hyq0719.mktapi.oceanengine.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdvertiserFundDailyStatReponseStruct {
  @SerializedName("date")
  private String date = null;

  @SerializedName("income")
  private Float income = null;

  @SerializedName("return_goods_cost")
  private Float returnGoodsCost = null;

  @SerializedName("cost")
  private Float cost = null;

  @SerializedName("balance")
  private Float balance = null;

  @SerializedName("frozen")
  private Float frozen = null;

  @SerializedName("reward_cost")
  private Float rewardCost = null;

  @SerializedName("transfer_out")
  private Float transferOut = null;

  @SerializedName("transfer_in")
  private Float transferIn = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("cash_cost")
  private Float cashCost = null;


  public AdvertiserFundDailyStatReponseStruct date(String date) {
    this.date = date;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct income(Float income) {
    this.income = income;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct returnGoodsCost(Float returnGoodsCost) {
    this.returnGoodsCost = returnGoodsCost;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct cost(Float cost) {
    this.cost = cost;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct balance(Float balance) {
    this.balance = balance;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct frozen(Float frozen) {
    this.frozen = frozen;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct rewardCost(Float rewardCost) {
    this.rewardCost = rewardCost;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct transferOut(Float transferOut) {
    this.transferOut = transferOut;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct transferIn(Float transferIn) {
    this.transferIn = transferIn;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdvertiserFundDailyStatReponseStruct cashCost(Float cashCost) {
    this.cashCost = cashCost;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
