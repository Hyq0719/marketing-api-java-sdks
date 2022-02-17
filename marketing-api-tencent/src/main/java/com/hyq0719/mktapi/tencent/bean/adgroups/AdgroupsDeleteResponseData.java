package com.hyq0719.mktapi.tencent.bean.adgroups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * AdgroupsDeleteResponseData
 */
@Data
public class AdgroupsDeleteResponseData {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  public AdgroupsDeleteResponseData adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
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
