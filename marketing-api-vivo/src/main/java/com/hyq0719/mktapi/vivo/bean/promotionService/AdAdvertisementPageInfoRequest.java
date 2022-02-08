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
 * @date 2022-02-08 14:39:37
 */
@Data
public class AdAdvertisementPageInfoRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 详见 【附录-广告收拢状态】
   */
  @SerializedName("advertisementStatus")
  private Integer advertisementStatus = null;

  /**
   * 广告计划ID
   */
  @SerializedName("campaignId")
  private Long campaignId = null;

  /**
   * 所属广告组ID
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 广告名称
   */
  @SerializedName("adName")
  private String adName = null;

  /**
   * 广告ID列表
   */
  @SerializedName("adIdList")
  private List<Long> adIdList = null;

  /**
   * 创意ID
   */
  @SerializedName("creativeId")
  private Long creativeId = null;

  /**
   * 广告生成类型 0:自定义广告 1:程序化广告 默认0
   */
  @SerializedName("genType")
  private Integer genType = null;

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

  public AdAdvertisementPageInfoRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdAdvertisementPageInfoRequest advertisementStatus(Integer advertisementStatus) {
    this.advertisementStatus = advertisementStatus;
    return this;
  }

  public AdAdvertisementPageInfoRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdAdvertisementPageInfoRequest groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdAdvertisementPageInfoRequest adName(String adName) {
    this.adName = adName;
    return this;
  }

  public AdAdvertisementPageInfoRequest adIdList(List<Long> adIdList) {
    this.adIdList = adIdList;
    return this;
  }

  public AdAdvertisementPageInfoRequest creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public AdAdvertisementPageInfoRequest genType(Integer genType) {
    this.genType = genType;
    return this;
  }

  public AdAdvertisementPageInfoRequest pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  public AdAdvertisementPageInfoRequest pageSize(Integer pageSize) {
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