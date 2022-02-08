/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;

;
;
;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 23:52:23
 */
@Data
public class FinanceFundsQueryFoundsListStruct {

  /**
   * 记录产生时间-毫秒级时间戳
   */
  @SerializedName("date")
  private String date = null;

  /**
   * 对应请求参数type，账号类型
   */
  @SerializedName("accountType")
  private String accountType = null;

  /**
   * 收入金额
   */
  @SerializedName("income")
  private BigDecimal income = null;

  /**
   * 支出金额
   */
  @SerializedName("expense")
  private BigDecimal expense = null;

  /**
   * 余额-在发生收入/支出后的余额
   */
  @SerializedName("balance")
  private BigDecimal balance = null;

  public FinanceFundsQueryFoundsListStruct date (String date) {
    this.date = date;
    return this;
  }

  public FinanceFundsQueryFoundsListStruct accountType (String accountType) {
    this.accountType = accountType;
    return this;
  }

  public FinanceFundsQueryFoundsListStruct income (BigDecimal income) {
    this.income = income;
    return this;
  }

  public FinanceFundsQueryFoundsListStruct expense (BigDecimal expense) {
    this.expense = expense;
    return this;
  }

  public FinanceFundsQueryFoundsListStruct balance (BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}