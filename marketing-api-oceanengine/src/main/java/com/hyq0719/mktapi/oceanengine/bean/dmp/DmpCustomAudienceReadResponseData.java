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

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 21:33:23
 */
@Data
public class DmpCustomAudienceReadResponseData {
  /**
   * 人群包列表数据
   */
  @SerializedName("custom_audience_list")
  private List<CustomAudienceListStruct> customAudienceList = null;

  public DmpCustomAudienceReadResponseData customAudienceList(List<CustomAudienceListStruct> customAudienceList) {
    this.customAudienceList = customAudienceList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
