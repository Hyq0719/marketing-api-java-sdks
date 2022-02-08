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
 * @date 2022-02-08 13:57:27
 */
@Data
public class AdAdvertisementAddRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 广告组id
   */
  @SerializedName("groupId")
  private Long groupId = null;

  /**
   * 广告名称，200个字符以内
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 广告出价模式，0：普通出价 1：跟随出价
   */
  @SerializedName("bidType")
  private Integer bidType = null;

  /**
   * 被跟随出价的app包名
   */
  @SerializedName("followAppPackageName")
  private String followAppPackageName = null;

  /**
   * 跟随出价的最高出价
   */
  @SerializedName("bidMaxPrice")
  private Long bidMaxPrice = null;

  /**
   * 点击监控地址， 以https开头
   */
  @SerializedName("clickMonitorUrl")
  private String clickMonitorUrl = null;

  /**
   * 展现形式，详见 【附录-广告创意展现形式】
   */
  @SerializedName("placeType")
  private Integer placeType = null;

  /**
   * 选词模式 1-搜索题词，2-优选词包，placeType=21时为必填，其他情况传空即可
   */
  @SerializedName("wordChoiceModel")
  private Integer wordChoiceModel = null;

  /**
   * 流量优选开关，0：关闭，1：开启
   */
  @SerializedName("generalSwitch")
  private Integer generalSwitch = null;

  /**
   * 创意参数对象，以下为字段说明
   */
  @SerializedName("creativeList")
  private List<CreativeListStruct> creativeList = null;

  public AdAdvertisementAddRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdAdvertisementAddRequest groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  public AdAdvertisementAddRequest name(String name) {
    this.name = name;
    return this;
  }

  public AdAdvertisementAddRequest bidType(Integer bidType) {
    this.bidType = bidType;
    return this;
  }

  public AdAdvertisementAddRequest followAppPackageName(String followAppPackageName) {
    this.followAppPackageName = followAppPackageName;
    return this;
  }

  public AdAdvertisementAddRequest bidMaxPrice(Long bidMaxPrice) {
    this.bidMaxPrice = bidMaxPrice;
    return this;
  }

  public AdAdvertisementAddRequest clickMonitorUrl(String clickMonitorUrl) {
    this.clickMonitorUrl = clickMonitorUrl;
    return this;
  }

  public AdAdvertisementAddRequest placeType(Integer placeType) {
    this.placeType = placeType;
    return this;
  }

  public AdAdvertisementAddRequest wordChoiceModel(Integer wordChoiceModel) {
    this.wordChoiceModel = wordChoiceModel;
    return this;
  }

  public AdAdvertisementAddRequest generalSwitch(Integer generalSwitch) {
    this.generalSwitch = generalSwitch;
    return this;
  }

  public AdAdvertisementAddRequest creativeList(List<CreativeListStruct> creativeList) {
    this.creativeList = creativeList;
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