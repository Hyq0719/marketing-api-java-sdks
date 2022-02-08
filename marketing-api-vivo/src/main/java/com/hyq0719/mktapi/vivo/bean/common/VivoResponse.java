package com.hyq0719.mktapi.vivo.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.CodeKey;
import lombok.Data;

@Data
public class VivoResponse<T> implements CodeKey {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("data")
  private T data = null;

  @SerializedName("requestId")
  private String requestId = null;

  public VivoResponse<T> code(Long code) {
    this.code = code;
    return this;
  }

  public VivoResponse<T> message(String message) {
    this.message = message;
    return this;
  }

  public VivoResponse<T> data(T data) {
    this.data = data;
    return this;
  }

  public VivoResponse<T> requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public Long getCodeKey() {
    return code;
  }

  @Override
  public String getMsg() {
    return message;
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
