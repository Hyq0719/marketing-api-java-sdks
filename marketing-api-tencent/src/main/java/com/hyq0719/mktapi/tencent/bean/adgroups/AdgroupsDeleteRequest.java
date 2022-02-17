package com.hyq0719.mktapi.tencent.bean.adgroups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.tencent.bean.TokenKey;
import lombok.Data;

/**
 * AdgroupsDeleteRequest
 */
@Data
public class AdgroupsDeleteRequest implements TokenKey {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public AdgroupsDeleteRequest adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  public AdgroupsDeleteRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(accountId);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
