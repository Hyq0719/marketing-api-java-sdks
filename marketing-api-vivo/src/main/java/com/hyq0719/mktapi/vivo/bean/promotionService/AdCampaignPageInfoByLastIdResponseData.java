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
 * @date 2022-02-08 10:32:18
 */
@Data
public class AdCampaignPageInfoByLastIdResponseData {

  /**
   * 该批次的最大ID
   */
  @SerializedName("lastId")
  private Long lastId = null;

  /**
   * 分页大小
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 数据列表
   */
  @SerializedName("data")
  private List<AdCampaignPageInfoByLastIdResponseDataStruct> data = null;

  public AdCampaignPageInfoByLastIdResponseData lastId(Long lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseData pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public AdCampaignPageInfoByLastIdResponseData data(List<AdCampaignPageInfoByLastIdResponseDataStruct> data) {
    this.data = data;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}