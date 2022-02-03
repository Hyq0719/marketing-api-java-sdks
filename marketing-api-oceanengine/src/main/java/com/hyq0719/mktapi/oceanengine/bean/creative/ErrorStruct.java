package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class ErrorStruct {
  @SerializedName("code")
  private Long code = null;
  @SerializedName("message")
  private String message = null;

  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public ErrorStruct code(Long code) {
    this.code = code;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorStruct message(String message) {
    this.message = message;
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
