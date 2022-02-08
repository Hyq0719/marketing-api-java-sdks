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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 13:41:42
 */
@Data
public class AdSugKeyWordDtosStruct {

  /**
   * 广告id
   */
  @SerializedName("adId")
  private Integer adId = null;

  /**
   * 广告组id
   */
  @SerializedName("groupId")
  private Integer groupId = null;

  /**
   * 计划id
   */
  @SerializedName("campaignId")
  private Integer campaignId = null;

  /**
   * 竞价词
   */
  @SerializedName("bidWord")
  private String bidWord = null;

  /**
   * 出价，单位毫分，1元=100000毫分，0表示不出价，>0表示出价具体值
   */
  @SerializedName("price")
  private Long price = null;

  /**
   * 匹配方式：0-精准匹配；1-短语匹配；2-宽泛匹配
   */
  @SerializedName("matchType")
  private Integer matchType = null;

  /**
   * 站点url
   */
  @SerializedName("siteUrl")
  private String siteUrl = null;

  /**
   * 站点编码
   */
  @SerializedName("siteCode")
  private String siteCode = null;

  /**
   * 站点类型，3-悟空
   */
  @SerializedName("siteType")
  private Integer siteType = null;

  /**
   * 来源：1-用户添加；2-专属词；3-热门词；4-竞品词；api方式只支持：1-用户添加
   */
  @SerializedName("source")
  private Integer source = null;

  /**
   * 启停状态  0-开启；1-暂停；
   */
  @SerializedName("pauseState")
  private Integer pauseState = null;

  public AdSugKeyWordDtosStruct adId(Integer adId) {
    this.adId = adId;
    return this;
  }

  public AdSugKeyWordDtosStruct groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdSugKeyWordDtosStruct campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public AdSugKeyWordDtosStruct bidWord(String bidWord) {
    this.bidWord = bidWord;
    return this;
  }

  public AdSugKeyWordDtosStruct price(Long price) {
    this.price = price;
    return this;
  }

  public AdSugKeyWordDtosStruct matchType(Integer matchType) {
    this.matchType = matchType;
    return this;
  }

  public AdSugKeyWordDtosStruct siteUrl(String siteUrl) {
    this.siteUrl = siteUrl;
    return this;
  }

  public AdSugKeyWordDtosStruct siteCode(String siteCode) {
    this.siteCode = siteCode;
    return this;
  }

  public AdSugKeyWordDtosStruct siteType(Integer siteType) {
    this.siteType = siteType;
    return this;
  }

  public AdSugKeyWordDtosStruct source(Integer source) {
    this.source = source;
    return this;
  }

  public AdSugKeyWordDtosStruct pauseState(Integer pauseState) {
    this.pauseState = pauseState;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}