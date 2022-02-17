package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CreativeCreatePreviewRequest implements TokenKey {
  @SerializedName("user_ids")
  private List<String> userIds = null;

  @SerializedName("phones")
  private List<String> phones = null;

  @SerializedName("unit_type")
  private Integer unitType = null;

  @SerializedName("unit_id")
  private Long unitId = null;

  @SerializedName("creative_id")
  private Long creativeId = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;


  public CreativeCreatePreviewRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public CreativeCreatePreviewRequest phones(List<String> phones) {
    this.phones = phones;
    return this;
  }

  public CreativeCreatePreviewRequest unitType(Integer unitType) {
    this.unitType = unitType;
    return this;
  }

  public CreativeCreatePreviewRequest unitId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  public CreativeCreatePreviewRequest creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public CreativeCreatePreviewRequest advertiserId(Long advertiserId) {
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
