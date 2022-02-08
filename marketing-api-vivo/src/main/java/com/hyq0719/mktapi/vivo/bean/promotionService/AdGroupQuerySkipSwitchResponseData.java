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
 * @date 2022-02-08 13:36:36
 */
@Data
public class AdGroupQuerySkipSwitchResponseData {

  /**
   * 广告组广告id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 跳过一阶段开关，无值则没有开关选项
   */
  @SerializedName("skipStageSwitch")
  private Boolean skipStageSwitch = null;

  public AdGroupQuerySkipSwitchResponseData id(Long id) {
    this.id = id;
    return this;
  }

  public AdGroupQuerySkipSwitchResponseData skipStageSwitch(Boolean skipStageSwitch) {
    this.skipStageSwitch = skipStageSwitch;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}