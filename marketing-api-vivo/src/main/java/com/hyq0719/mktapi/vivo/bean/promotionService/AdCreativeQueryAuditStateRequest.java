/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:30:21
 */
@Data
public class AdCreativeQueryAuditStateRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 创意编号id,一次查询最多支持100个创意id
   */
  @SerializedName("idList")
  private List<String> idList = null;

  public AdCreativeQueryAuditStateRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdCreativeQueryAuditStateRequest idList(List<String> idList) {
    this.idList = idList;
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