package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorStruct {
  @SerializedName("ad_id")
  private List<Long> adIds = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  public List<Long> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }

  public ErrorStruct adIds(List<Long> code) {
    this.adIds = code;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ErrorStruct errorMessage(String message) {
    this.errorMessage = message;
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
