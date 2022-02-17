package com.hyq0719.mktapi.kuaishou.bean.tool;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ToolOperationRecordListResponseStruct {
  @SerializedName("operation_time")
  private String operationTime = null;

  @SerializedName("operation_type")
  private Integer operationType = null;

  @SerializedName("role_type")
  private Integer roleType = null;

  @SerializedName("object_name")
  private String objectName = null;

  @SerializedName("operation_target")
  private Integer operationTarget = null;

  @SerializedName("object_id")
  private String objectId = null;

  @SerializedName("content_log")
  private List<ContentLogStruct> contentLog = null;


  public ToolOperationRecordListResponseStruct operationTime(String operationTime) {
    this.operationTime = operationTime;
    return this;
  }

  public ToolOperationRecordListResponseStruct operationType(Integer operationType) {
    this.operationType = operationType;
    return this;
  }

  public ToolOperationRecordListResponseStruct roleType(Integer roleType) {
    this.roleType = roleType;
    return this;
  }

  public ToolOperationRecordListResponseStruct objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

  public ToolOperationRecordListResponseStruct operationTarget(Integer operationTarget) {
    this.operationTarget = operationTarget;
    return this;
  }

  public ToolOperationRecordListResponseStruct objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public ToolOperationRecordListResponseStruct contentLog(List<ContentLogStruct> contentLog) {
    this.contentLog = contentLog;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
