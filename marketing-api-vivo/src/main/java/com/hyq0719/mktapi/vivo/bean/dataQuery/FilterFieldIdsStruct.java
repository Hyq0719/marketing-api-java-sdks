/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataQuery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 18:13:59
 */
@Data
public class FilterFieldIdsStruct {

  /**
   * 计划id
   */
  @SerializedName("campaignIds")
  private List<String> campaignIds = null;

  /**
   * 广告组id
   */
  @SerializedName("groupIds")
  private List<String> groupIds = null;

  /**
   * 广告id
   */
  @SerializedName("advertisementIds")
  private List<String> advertisementIds = null;

  /**
   * 创意id
   */
  @SerializedName("creativeIds")
  private List<String> creativeIds = null;

  public FilterFieldIdsStruct campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public FilterFieldIdsStruct groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public FilterFieldIdsStruct advertisementIds(List<String> advertisementIds) {
    this.advertisementIds = advertisementIds;
    return this;
  }

  public FilterFieldIdsStruct creativeIds(List<String> creativeIds) {
    this.creativeIds = creativeIds;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}