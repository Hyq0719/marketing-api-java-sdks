/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import com.google.gson.Gson;

import java.math.BigDecimal;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 23:16:47
 */
@Data
public class AccountBalanceQueryResponseData {

  /**
   * 账户等级
   */
  @SerializedName("level")
  private Integer level = null;

  /**
   * 现金余额
   */
  @SerializedName("cashBalance")
  private BigDecimal cashBalance = null;

  /**
   * 所属行业
   */
  @SerializedName("industry")
  private String industry = null;

  /**
   * 虚拟金余额
   */
  @SerializedName("discountBalance")
  private BigDecimal discountBalance = null;

  /**
   * 审核未通过的广告主数量
   */
  @SerializedName("subaccountReject")
  private Integer subaccountReject = null;

  /**
   * uuid
   */
  @SerializedName("uuid")
  private String uuid = null;

  /**
   * 有效广告主的数量
   */
  @SerializedName("subaccountPass")
  private Integer subaccountPass = null;

  /**
   * 审核中的广告主数量
   */
  @SerializedName("subaccountReviewing")
  private Integer subaccountReviewing = null;

  /**
   * 公司名
   */
  @SerializedName("companyName")
  private String companyName = null;

  /**
   * 账户名
   */
  @SerializedName("accountName")
  private String accountName = null;

  public AccountBalanceQueryResponseData level (Integer level) {
    this.level = level;
    return this;
  }

  public AccountBalanceQueryResponseData cashBalance (BigDecimal cashBalance) {
    this.cashBalance = cashBalance;
    return this;
  }

  public AccountBalanceQueryResponseData industry (String industry) {
    this.industry = industry;
    return this;
  }

  public AccountBalanceQueryResponseData discountBalance (BigDecimal discountBalance) {
    this.discountBalance = discountBalance;
    return this;
  }

  public AccountBalanceQueryResponseData subaccountReject (Integer subaccountReject) {
    this.subaccountReject = subaccountReject;
    return this;
  }

  public AccountBalanceQueryResponseData uuid (String uuid) {
    this.uuid = uuid;
    return this;
  }

  public AccountBalanceQueryResponseData subaccountPass (Integer subaccountPass) {
    this.subaccountPass = subaccountPass;
    return this;
  }

  public AccountBalanceQueryResponseData subaccountReviewing (Integer subaccountReviewing) {
    this.subaccountReviewing = subaccountReviewing;
    return this;
  }

  public AccountBalanceQueryResponseData companyName (String companyName) {
    this.companyName = companyName;
    return this;
  }

  public AccountBalanceQueryResponseData accountName (String accountName) {
    this.accountName = accountName;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}