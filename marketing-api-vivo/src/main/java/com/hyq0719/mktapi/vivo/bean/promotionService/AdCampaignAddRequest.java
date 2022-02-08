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
 * @date 2022-02-08 09:40:17
 */
@Data
public class AdCampaignAddRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 计划名称（计划名称长度 <= 40 个字符）
   */
  @SerializedName("name")
  private String name = null;

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
   * 计划日限额:不限额填写-1;有限额时填写具体限额，单位为毫分，1元=100000毫分;
   */
  @SerializedName("dailyBudget")
  private Long dailyBudget = null;

  /**
   * 是否使用流量优选：0-否；；默认填充0（否）即可；
   */
  @SerializedName("optimizeFlag")
  private Integer optimizeFlag = null;

  /**
   * 广告类型：0-展示广告；1-搜索广告 需开通白名单才可使用；普通广告默认填充0（展示广告）即可；
   */
  @SerializedName("campaignType")
  private Integer campaignType = null;

  public AdCampaignAddRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdCampaignAddRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdCampaignAddRequest adType(Integer adType) {
    this.adType = adType;
    return this;
  }

  public AdCampaignAddRequest mediaType(Integer mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  public AdCampaignAddRequest dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdCampaignAddRequest optimizeFlag(Integer optimizeFlag) {
    this.optimizeFlag = optimizeFlag;
    return this;
  }

  public AdCampaignAddRequest campaignType(Integer campaignType) {
    this.campaignType = campaignType;
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