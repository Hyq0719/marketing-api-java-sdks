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

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:14:10
 */
@Data
public class AdCreativePageInfoRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 广告名称
   */
  @SerializedName("advertisementName")
  private String advertisementName = null;

  /**
   * 广告id列表
   */
  @SerializedName("advertisementIds")
  private List<String> advertisementIds = null;

  /**
   * 创意id列表
   */
  @SerializedName("creativeIdList")
  private List<String> creativeIdList = null;

  /**
   * 起始页，不填时默认查询第一页
   */
  @SerializedName("pageIndex")
  private Integer pageIndex = null;

  /**
   * 页大小，不填默认size=10
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  public AdCreativePageInfoRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdCreativePageInfoRequest advertisementName(String advertisementName) {
    this.advertisementName = advertisementName;
    return this;
  }

  public AdCreativePageInfoRequest advertisementIds(List advertisementIds) {
    this.advertisementIds = advertisementIds;
    return this;
  }

  public AdCreativePageInfoRequest creativeIdList(List creativeIdList) {
    this.creativeIdList = creativeIdList;
    return this;
  }

  public AdCreativePageInfoRequest pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  public AdCreativePageInfoRequest pageSize(Integer pageSize) {
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