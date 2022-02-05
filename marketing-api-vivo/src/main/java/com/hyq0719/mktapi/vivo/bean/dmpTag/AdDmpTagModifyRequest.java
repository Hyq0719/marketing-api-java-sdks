/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dmpTag;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;
import com.google.gson.Gson;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 22:56:40
 */
@Data
public class AdDmpTagModifyRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 目标人群包id
   */
  @SerializedName("crowdId")
  private Long crowdId = null;

  /**
   * 人群包标识类型：IMEI,IMEIMD5,MOBILE,MOBILEMD5,MAC,MACMD5,OAID,OAIDMD5 【附录-人群管理 标识类型】
   */
  @SerializedName("matchType")
  private String matchType = null;

  /**
   * 文件ID，多个文件片上传时，文件ID使用逗号分隔，最多允许传入10个。使用多文件片上传时，每个文件片需要可单独使用
   */
  @SerializedName("fileIds")
  private String fileIds = null;

  /**
   * 更新方式：2-重置 ，以指定文件中的号码覆盖原人群包；3-新增，在原人群包中插入指定人群文件中的号码；4-删除，从原人群包中删除指定人群文件中的号码；【附录-人群管理 更新方式】
   */
  @SerializedName("updateMode")
  private Integer updateMode = null;

  public AdDmpTagModifyRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdDmpTagModifyRequest crowdId (Long crowdId) {
    this.crowdId = crowdId;
    return this;
  }

  public AdDmpTagModifyRequest matchType (String matchType) {
    this.matchType = matchType;
    return this;
  }

  public AdDmpTagModifyRequest fileIds (String fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public AdDmpTagModifyRequest updateMode (Integer updateMode) {
    this.updateMode = updateMode;
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