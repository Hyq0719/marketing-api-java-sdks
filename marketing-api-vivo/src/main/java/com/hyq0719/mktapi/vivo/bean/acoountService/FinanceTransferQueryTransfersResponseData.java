/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import java.util.List;
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
public class FinanceTransferQueryTransfersResponseData {

  /**
   * 对象数据
   */
  @SerializedName("list")
  private List<FinanceTransferQueryTransfersListStruct> list = null;

  /**
   * 分页信息
   */
  @SerializedName("pageInfo")
  private PageInfoStruct pageInfo = null;

  public FinanceTransferQueryTransfersResponseData list (List<FinanceTransferQueryTransfersListStruct> list) {
    this.list = list;
    return this;
  }

  public FinanceTransferQueryTransfersResponseData pageInfo (PageInfoStruct pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}