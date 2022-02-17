/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 12:50:51
 */
@Data
public class ReportAdvertiserGetFilteringStruct {
  /**
   * 投放模式筛选。 允许值: STANDARD:标准投放。 ADLAB_FREE:管家&省心投放
   */
  @SerializedName("delivery_mode")
  private List<String> deliveryMode = null;

  /**
   * 获取的数据平台版本 允许值: V1:原版。 V2:新版。 ALL:原版+新版（默认值）
   */
  @SerializedName("platform_version")
  private String platformVersion = null;

  public ReportAdvertiserGetFilteringStruct deliveryMode (List<String> deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  public ReportAdvertiserGetFilteringStruct platformVersion (String platformVersion) {
    this.platformVersion = platformVersion;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
