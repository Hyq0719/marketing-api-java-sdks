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
 * @date 2022-02-08 14:39:37
 */
@Data
public class ProgramAdSearchWordDtosStruct {

  /**
   * id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 广告id
   */
  @SerializedName("adId")
  private Long adId = null;

  /**
   * 创意包ID
   */
  @SerializedName("programPkgId")
  private Long programPkgId = null;

  /**
   * 包名
   */
  @SerializedName("appPackage")
  private String appPackage = null;

  /**
   * 应用ID
   */
  @SerializedName("appId")
  private Long appId = null;

  /**
   * 0:待审核  1:有效  2:无效
   */
  @SerializedName("state")
  private Integer state = null;

  /**
   * 创建时间 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("createTime")
  private String createTime = null;

  /**
   * 审核时间 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("auditTime")
  private String auditTime = null;

  /**
   * 审核人
   */
  @SerializedName("auditor")
  private String auditor = null;

  /**
   * 关键词
   */
  @SerializedName("word")
  private String word = null;

  /**
   * 0:应用 1:单机 2:网游
   */
  @SerializedName("appType")
  private Integer appType = null;

  /**
   * 出价
   */
  @SerializedName("price")
  private Long price = null;

  /**
   * 来源 1:用户添加 2:优质词 3:热门词 4:竞品词 5:拓展词
   */
  @SerializedName("source")
  private Integer source = null;

  /**
   * 更新时间 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("updateTime")
  private String updateTime = null;

  public ProgramAdSearchWordDtosStruct id(Long id) {
    this.id = id;
    return this;
  }

  public ProgramAdSearchWordDtosStruct adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public ProgramAdSearchWordDtosStruct programPkgId(Long programPkgId) {
    this.programPkgId = programPkgId;
    return this;
  }

  public ProgramAdSearchWordDtosStruct appPackage(String appPackage) {
    this.appPackage = appPackage;
    return this;
  }

  public ProgramAdSearchWordDtosStruct appId(Long appId) {
    this.appId = appId;
    return this;
  }

  public ProgramAdSearchWordDtosStruct state(Integer state) {
    this.state = state;
    return this;
  }

  public ProgramAdSearchWordDtosStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public ProgramAdSearchWordDtosStruct auditTime(String auditTime) {
    this.auditTime = auditTime;
    return this;
  }

  public ProgramAdSearchWordDtosStruct auditor(String auditor) {
    this.auditor = auditor;
    return this;
  }

  public ProgramAdSearchWordDtosStruct word(String word) {
    this.word = word;
    return this;
  }

  public ProgramAdSearchWordDtosStruct appType(Integer appType) {
    this.appType = appType;
    return this;
  }

  public ProgramAdSearchWordDtosStruct price(Long price) {
    this.price = price;
    return this;
  }

  public ProgramAdSearchWordDtosStruct source(Integer source) {
    this.source = source;
    return this;
  }

  public ProgramAdSearchWordDtosStruct updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}