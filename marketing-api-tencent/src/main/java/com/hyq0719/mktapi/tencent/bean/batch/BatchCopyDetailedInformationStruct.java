package com.hyq0719.mktapi.tencent.bean.batch;

import com.google.gson.annotations.SerializedName;

public class BatchCopyDetailedInformationStruct {

  @SerializedName("error_address")
  private String errorAddress = null;

  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("message_cn")
  private String messageCn = null;

  @SerializedName("error_msg")
  private String errorMsg = null;

  public BatchCopyDetailedInformationStruct errorAddress(String errorAddress) {
    this.errorAddress = errorAddress;
    return this;
  }

  public BatchCopyDetailedInformationStruct code(Long code) {
    this.code = code;
    return this;
  }

  public BatchCopyDetailedInformationStruct message(String message) {
    this.message = message;
    return this;
  }

  public BatchCopyDetailedInformationStruct errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  public String getErrorAddress() {
    return errorAddress;
  }

  public void setErrorAddress(String errorAddress) {
    this.errorAddress = errorAddress;
  }

  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessageCn() {
    return messageCn;
  }

  public void setMessageCn(String messageCn) {
    this.messageCn = messageCn;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public BatchCopyDetailedInformationStruct messageCn(String messageCn) {
    this.messageCn = messageCn;
    return this;
  }
}
