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
 * @date 2022-02-03 19:38:00
 */
@Data
public class DmpCustomAudienceSelectResponseData {
  /**
   * 人群包列表数据
   */
  @SerializedName("custom_audience_list")
  private List<CustomAudienceListStruct> customAudienceList = null;

  /**
   * 偏移,类似于SQL中offset(起始为0,翻页时new_offset=old_offset+limit）
   */
  @SerializedName("offset")
  private Long offset = null;

  /**
   * 总的人群包数量
   */
  @SerializedName("total_num")
  private Long totalNum = null;

  public DmpCustomAudienceSelectResponseData customAudienceList(List<CustomAudienceListStruct> customAudienceList) {
    this.customAudienceList = customAudienceList;
    return this;
  }

  public DmpCustomAudienceSelectResponseData offset(Long offset) {
    this.offset = offset;
    return this;
  }

  public DmpCustomAudienceSelectResponseData totalNum(Long totalNum) {
    this.totalNum = totalNum;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
