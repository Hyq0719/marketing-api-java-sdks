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
 * @date 2022-02-08 13:57:27
 */
@Data
public class CreativeListStruct {

  /**
   * 创意文案，红包激励的创意文案长度<=12个字符,其他则<=16个字符！
   */
  @SerializedName("adDesc")
  private String adDesc = null;

  /**
   * 出价，单位毫分，1元=100000毫分，转化成元精确到小数点后一位，红包激励类型创意必填字段
   */
  @SerializedName("price")
  private String price = null;

  /**
   * 图片素材，多个用英文逗号隔开
   */
  @SerializedName("imgsCode")
  private String imgsCode = null;

  /**
   * CPD-素材类型(0-无图，1-单图文，2-文字链,3-三图)
   */
  @SerializedName("templateType")
  private Integer templateType = null;

  /**
   * 标题
   */
  @SerializedName("title")
  private String title = null;

  /**
   * 副标题
   */
  @SerializedName("subTitle")
  private String subTitle = null;

  /**
   * 积分类型："1"-20积分; "2"-50积分，不填或填错默认积分类型为"1"-20积分
   */
  @SerializedName("pointType")
  private String pointType = null;

  /**
   * 积分下载状态："1"-启用; "0"-不启用，不填或填错默认积分下载状态为"1"-启用
   */
  @SerializedName("pointState")
  private String pointState = null;

  /**
   * 装机必备启用状态："1"-启用; "0"-不启用，不填或填错默认积分下载状态为"1"-启用
   */
  @SerializedName("hotAppState")
  private String hotAppState = null;

  /**
   * 提词对象列表
   */
  @SerializedName("wordDtoList")
  private List<WordDtoListStruct> wordDtoList = null;

  public CreativeListStruct adDesc(String adDesc) {
    this.adDesc = adDesc;
    return this;
  }

  public CreativeListStruct price(String price) {
    this.price = price;
    return this;
  }

  public CreativeListStruct imgsCode(String imgsCode) {
    this.imgsCode = imgsCode;
    return this;
  }

  public CreativeListStruct templateType(Integer templateType) {
    this.templateType = templateType;
    return this;
  }

  public CreativeListStruct title(String title) {
    this.title = title;
    return this;
  }

  public CreativeListStruct subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  public CreativeListStruct pointType(String pointType) {
    this.pointType = pointType;
    return this;
  }

  public CreativeListStruct pointState(String pointState) {
    this.pointState = pointState;
    return this;
  }

  public CreativeListStruct hotAppState(String hotAppState) {
    this.hotAppState = hotAppState;
    return this;
  }

  public CreativeListStruct wordDtoList(List<WordDtoListStruct> wordDtoList) {
    this.wordDtoList = wordDtoList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}