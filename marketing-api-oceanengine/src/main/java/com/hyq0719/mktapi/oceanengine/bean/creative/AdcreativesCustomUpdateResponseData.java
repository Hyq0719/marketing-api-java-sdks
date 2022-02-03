package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdcreativesCustomUpdateResponseData {
  @SerializedName("creative_ids")
  private List<Long> creativeIds = null;
  @SerializedName("errors")
  private List<ErrorStruct> errors = null;


  public AdcreativesCustomUpdateResponseData creativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
    return this;
  }

  public AdcreativesCustomUpdateResponseData errors(List<ErrorStruct> errors) {
    this.errors = errors;
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
