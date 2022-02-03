/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.dmp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 23:21:33
 */
@Data
public class DmpCustomAudienceDeleteResponseData {
  /**
   * 人群包id
   */
  @SerializedName("custom_audience_id")
  private Long customAudienceId = null;

  public DmpCustomAudienceDeleteResponseData customAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
