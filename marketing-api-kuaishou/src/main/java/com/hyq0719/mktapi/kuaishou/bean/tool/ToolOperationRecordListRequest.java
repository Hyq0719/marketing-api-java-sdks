package com.hyq0719.mktapi.kuaishou.bean.tool;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.Data;

@Data
public class ToolOperationRecordListRequest implements TokenKey {
  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("operation_type")
  private Integer operationType = null;

  @SerializedName("role_type")
  private Integer roleType = null;

  @SerializedName("operation_target")
  private Integer operationTarget = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("page_size")
  private Integer pageSize = null;

  @SerializedName("start_date")
  private String startDate = null;


  public ToolOperationRecordListRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public ToolOperationRecordListRequest operationType(Integer operationType) {
    this.operationType = operationType;
    return this;
  }

  public ToolOperationRecordListRequest roleType(Integer roleType) {
    this.roleType = roleType;
    return this;
  }

  public ToolOperationRecordListRequest operationTarget(Integer operationTarget) {
    this.operationTarget = operationTarget;
    return this;
  }

  public ToolOperationRecordListRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public ToolOperationRecordListRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public ToolOperationRecordListRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public ToolOperationRecordListRequest startDate(String startDate) {
    this.startDate = startDate;
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
