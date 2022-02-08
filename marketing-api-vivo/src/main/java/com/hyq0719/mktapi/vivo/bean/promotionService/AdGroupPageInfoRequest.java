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
 * @date 2022-02-08 11:34:09
 */
@Data
public class AdGroupPageInfoRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 详见 【附录-广告组收拢状态】
   */
  @SerializedName("adGroupStatus")
  private Integer adGroupStatus = null;

  /**
   * 广告计划id
   */
  @SerializedName("campaignId")
  private Long campaignId = null;

  /**
   * 广告组名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 广告组id列表
   */
  @SerializedName("adGroupIdList")
  private List adGroupIdList = null;

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

  public AdGroupPageInfoRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdGroupPageInfoRequest adGroupStatus(Integer adGroupStatus) {
    this.adGroupStatus = adGroupStatus;
    return this;
  }

  public AdGroupPageInfoRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdGroupPageInfoRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdGroupPageInfoRequest adGroupIdList(List adGroupIdList) {
    this.adGroupIdList = adGroupIdList;
    return this;
  }

  public AdGroupPageInfoRequest pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  public AdGroupPageInfoRequest pageSize(Integer pageSize) {
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