package com.hyq0719.mktapi.oceanengine.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdvertiserFundGetStruct {
  @SerializedName("return_goods_cost")
  private Long returnGoodsCost = null;

  @SerializedName("balance")
  private Float balance = null;

  @SerializedName("valid_cash")
  private Float validCash = null;

  @SerializedName("return_goods_abs")
  private Float returnGoodsAbs = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("valid_return_goods_abs")
  private Float validReturnGoodsAbs = null;

  @SerializedName("valid_balance")
  private Float validBalance = null;

  @SerializedName("grant")
  private Float grant = null;

  @SerializedName("cash")
  private Float cash = null;

  @SerializedName("valid_grant")
  private Float validGrant = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;


  public AdvertiserFundGetStruct returnGoodsCost(Long returnGoodsCost) {
    this.returnGoodsCost = returnGoodsCost;
    return this;
  }

  public AdvertiserFundGetStruct balance(Float balance) {
    this.balance = balance;
    return this;
  }

  public AdvertiserFundGetStruct validCash(Float validCash) {
    this.validCash = validCash;
    return this;
  }

  public AdvertiserFundGetStruct returnGoodsAbs(Float returnGoodsAbs) {
    this.returnGoodsAbs = returnGoodsAbs;
    return this;
  }

  public AdvertiserFundGetStruct name(String name) {
    this.name = name;
    return this;
  }

  public AdvertiserFundGetStruct validReturnGoodsAbs(Float validReturnGoodsAbs) {
    this.validReturnGoodsAbs = validReturnGoodsAbs;
    return this;
  }

  public AdvertiserFundGetStruct validBalance(Float validBalance) {
    this.validBalance = validBalance;
    return this;
  }

  public AdvertiserFundGetStruct grant(Float grant) {
    this.grant = grant;
    return this;
  }

  public AdvertiserFundGetStruct cash(Float cash) {
    this.cash = cash;
    return this;
  }

  public AdvertiserFundGetStruct validGrant(Float validGrant) {
    this.validGrant = validGrant;
    return this;
  }

  public AdvertiserFundGetStruct email(String email) {
    this.email = email;
    return this;
  }

  public AdvertiserFundGetStruct advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
