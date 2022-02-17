package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CreativeUpdateStatusRequest implements TokenKey {
  @SerializedName("creative_ids")
  private List<Long> creativeIds = null;

  @SerializedName("put_status")
  private Integer putStatus = null;

  @SerializedName("creative_id")
  private Long creativeId = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;


  public CreativeUpdateStatusRequest creativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
    return this;
  }

  public CreativeUpdateStatusRequest putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  public CreativeUpdateStatusRequest creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public CreativeUpdateStatusRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
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
