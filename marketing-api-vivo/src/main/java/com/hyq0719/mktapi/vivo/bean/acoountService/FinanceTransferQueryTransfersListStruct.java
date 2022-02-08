/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import java.math.BigDecimal;;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import com.google.gson.Gson;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 00:23:45
 */
@Data
public class FinanceTransferQueryTransfersListStruct {

  /**
   * 金额类型-1：现金；2：虚拟金；3：商店虚拟金；4：信息流虚拟金；5：联盟虚拟金
   */
  @SerializedName("amountType")
  private Integer amountType = null;

  /**
   * 账户id
   */
  @SerializedName("accountId")
  private Long accountId = null;

  /**
   * 公司名
   */
  @SerializedName("companyName")
  private String companyName = null;

  /**
   * 账户名
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 转账金额
   */
  @SerializedName("transferAmount")
  private BigDecimal transferAmount = null;

  /**
   * 转账类型-直接返回类型名无需对应
   */
  @SerializedName("transferType")
  private String transferType = null;

  /**
   * 转账时间-毫秒级时间戳
   */
  @SerializedName("applyTime")
  private String applyTime = null;

  /**
   * 状态-1：转账中；2：成功；3：失败
   */
  @SerializedName("status")
  private Integer status = null;

  /**
   * 媒体类型-1：CPD；2：信息流；3：营销平台
   */
  @SerializedName("mediaType")
  private Integer mediaType = null;

  public FinanceTransferQueryTransfersListStruct amountType (Integer amountType) {
    this.amountType = amountType;
    return this;
  }

  public FinanceTransferQueryTransfersListStruct accountId (Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public FinanceTransferQueryTransfersListStruct companyName (String companyName) {
    this.companyName = companyName;
    return this;
  }

  public FinanceTransferQueryTransfersListStruct name (String name) {
    this.name = name;
    return this;
  }

  public FinanceTransferQueryTransfersListStruct transferAmount (BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

  public FinanceTransferQueryTransfersListStruct transferType (String transferType) {
    this.transferType = transferType;
    return this;
  }

  public FinanceTransferQueryTransfersListStruct applyTime (String applyTime) {
    this.applyTime = applyTime;
    return this;
  }

  public FinanceTransferQueryTransfersListStruct status (Integer status) {
    this.status = status;
    return this;
  }

  public FinanceTransferQueryTransfersListStruct mediaType (Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}