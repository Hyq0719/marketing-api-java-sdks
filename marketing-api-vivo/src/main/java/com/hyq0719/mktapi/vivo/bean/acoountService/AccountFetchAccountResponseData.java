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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 22:57:50
 */
@Data
public class AccountFetchAccountResponseData {

  /**
   * 账号标识:所属广告主，来自商业化账户
   */
  @SerializedName("uuid")
  private String uuid = null;

  /**
   * 名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 日限额，不限额填写-1;有限额时填写具体限额，单位为毫分，1元=100000毫分;
   */
  @SerializedName("dailyBudget")
  private Long dailyBudget = null;

  /**
   * 最小日限额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("minDailyBudget")
  private Long minDailyBudget = null;

  /**
   * 最大日限额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("maxDailyBudget")
  private Long maxDailyBudget = null;

  /**
   * 日预算每次修改最小幅度，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("minDailyBudgetThreshold")
  private Long minDailyBudgetThreshold = null;

  /**
   * 现金余额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("balance")
  private Long balance = null;

  /**
   * 商店虚拟金余额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("disAppstoreBalance")
  private Long disAppstoreBalance = null;

  /**
   * 联盟虚拟金余额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("disLeagueBalance")
  private Long disLeagueBalance = null;

  /**
   * 非商店虚拟金余额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("disFeedBalance")
  private Long disFeedBalance = null;

  /**
   * 通用虚拟金余额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("disGeneralBalance")
  private Short disGeneralBalance = null;

  /**
   * 今日已消耗金额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("dailyExpend")
  private Long dailyExpend = null;

  /**
   * 账户日限额每日修改次数上限
   */
  @SerializedName("dailyBudgetChangeLimit")
  private Integer dailyBudgetChangeLimit = null;

  public AccountFetchAccountResponseData uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public AccountFetchAccountResponseData name(String name) {
    this.name = name;
    return this;
  }

  public AccountFetchAccountResponseData dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AccountFetchAccountResponseData minDailyBudget(Long minDailyBudget) {
    this.minDailyBudget = minDailyBudget;
    return this;
  }

  public AccountFetchAccountResponseData maxDailyBudget(Long maxDailyBudget) {
    this.maxDailyBudget = maxDailyBudget;
    return this;
  }

  public AccountFetchAccountResponseData minDailyBudgetThreshold(Long minDailyBudgetThreshold) {
    this.minDailyBudgetThreshold = minDailyBudgetThreshold;
    return this;
  }

  public AccountFetchAccountResponseData balance(Long balance) {
    this.balance = balance;
    return this;
  }

  public AccountFetchAccountResponseData disAppstoreBalance(Long disAppstoreBalance) {
    this.disAppstoreBalance = disAppstoreBalance;
    return this;
  }

  public AccountFetchAccountResponseData disFeedBalance(Long disFeedBalance) {
    this.disFeedBalance = disFeedBalance;
    return this;
  }

  public AccountFetchAccountResponseData disGeneralBalance(Short disGeneralBalance) {
    this.disGeneralBalance = disGeneralBalance;
    return this;
  }

  public AccountFetchAccountResponseData dailyExpend(Long dailyExpend) {
    this.dailyExpend = dailyExpend;
    return this;
  }

  public AccountFetchAccountResponseData disLeagueBalance(Long disLeagueBalance) {
    this.disLeagueBalance = disLeagueBalance;
    return this;
  }

  public AccountFetchAccountResponseData dailyBudgetChangeLimit(Integer dailyBudgetChangeLimit) {
    this.dailyBudgetChangeLimit = dailyBudgetChangeLimit;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}