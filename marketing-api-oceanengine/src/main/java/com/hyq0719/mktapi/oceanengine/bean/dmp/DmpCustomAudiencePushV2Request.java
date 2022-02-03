/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.dmp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 22:51:32
 */
@Data
public class DmpCustomAudiencePushV2Request implements TokenKey {
  /**
   * 人群包所属广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 人群包ID
   */
  @SerializedName("custom_audience_id")
  private Long customAudienceId = null;

  /**
   * 推送广告主ID列表，最多推送100个广告主
   */
  @SerializedName("target_advertiser_ids")
  private List<Long> targetAdvertiserIds = null;

  public DmpCustomAudiencePushV2Request advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public DmpCustomAudiencePushV2Request customAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
    return this;
  }

  public DmpCustomAudiencePushV2Request targetAdvertiserIds(List<Long> targetAdvertiserIds) {
    this.targetAdvertiserIds = targetAdvertiserIds;
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
