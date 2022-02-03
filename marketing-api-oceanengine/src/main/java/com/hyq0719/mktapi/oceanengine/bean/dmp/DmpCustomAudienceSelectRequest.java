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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 19:38:00
 */
@Data
public class DmpCustomAudienceSelectRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 查询类型,枚举值："0"：该广告主创建的人群包和被推送给该广告主的人群包，"1"：状态为可投放的人群包
   */
  @SerializedName("select_type")
  private Integer selectType = null;

  /**
   * 偏移,类似于SQL中offset(起始为0,翻页时new_offset=old_offset+limit），默认值：0，取值范围:≥ 0
   */
  @SerializedName("offset")
  private Long offset = null;

  /**
   * 返回数据量，默认值：100，取值范围：1-100
   */
  @SerializedName("limit")
  private Long limit = null;

  public DmpCustomAudienceSelectRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public DmpCustomAudienceSelectRequest selectType(Integer selectType) {
    this.selectType = selectType;
    return this;
  }

  public DmpCustomAudienceSelectRequest offset(Long offset) {
    this.offset = offset;
    return this;
  }

  public DmpCustomAudienceSelectRequest limit(Long limit) {
    this.limit = limit;
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
