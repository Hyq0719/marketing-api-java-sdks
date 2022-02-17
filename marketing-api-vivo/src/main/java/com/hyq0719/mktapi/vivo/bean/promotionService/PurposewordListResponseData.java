/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:54:28
 */
@Data
public class PurposewordListResponseData {

  /**
   * 分页信息
   */
  @SerializedName("pageInfo")
  private PageInfoStruct pageInfo = null;

  /**
   * 对象数据
   */
  @SerializedName("list")
  private List<PurposewordListListStruct> list = null;

  public PurposewordListResponseData pageInfo(PageInfoStruct pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  public PurposewordListResponseData list(List<PurposewordListListStruct> list) {
    this.list = list;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}