package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class IncludeCustomActionsStruct {
  @SerializedName("days")
  private Long days = null;
  @SerializedName("code")
  private Long code = null;

  public Long getDays() {
    return days;
  }

  public void setDays(Long days) {
    this.days = days;
  }

  public IncludeCustomActionsStruct days(Long days) {
    this.days = days;
    return this;
  }

  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public IncludeCustomActionsStruct code(Long code) {
    this.code = code;
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
