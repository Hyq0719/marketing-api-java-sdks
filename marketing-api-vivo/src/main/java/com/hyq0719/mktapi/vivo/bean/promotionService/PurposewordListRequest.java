/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:54:28
 */
@Data
public class PurposewordListRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 起始页，不填是时默认查询第一页
   */
  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  /**
   * 页大小，不填默认size=10
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  public PurposewordListRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public PurposewordListRequest pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  public PurposewordListRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}