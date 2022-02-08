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
 * @date 2022-02-08 10:24:12
 */
@Data
public class AdCampaignPageInfoRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 计划名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 计划ID，多个以List集合形式保存
   */
  @SerializedName("ids")
  private List<Long> ids = null;

  /**
   * 推广目标，详见 【附录-推广目标】
   */
  @SerializedName("adType")
  private Integer adType = null;

  /**
   * 投放渠道/媒体类型，详见 【附录-投放渠道/媒体类型】
   */
  @SerializedName("mediaType")
  private Integer mediaType = null;

  /**
   * 计划状态，详见 详见 【附录-广告计划收拢状态】
   */
  @SerializedName("campaignStatus")
  private Integer campaignStatus = null;

  /**
   * 是否使用流量优选：0-否；1-是 计划优选，详见 【附录-优选流量】
   */
  @SerializedName("optimizeFlag")
  private Integer optimizeFlag = null;

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

  public AdCampaignPageInfoRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdCampaignPageInfoRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdCampaignPageInfoRequest ids(List<Long> ids) {
    this.ids = ids;
    return this;
  }

  public AdCampaignPageInfoRequest adType(Integer adType) {
    this.adType = adType;
    return this;
  }

  public AdCampaignPageInfoRequest mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public AdCampaignPageInfoRequest campaignStatus(Integer campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }

  public AdCampaignPageInfoRequest optimizeFlag(Integer optimizeFlag) {
    this.optimizeFlag = optimizeFlag;
    return this;
  }

  public AdCampaignPageInfoRequest pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  public AdCampaignPageInfoRequest pageSize(Integer pageSize) {
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