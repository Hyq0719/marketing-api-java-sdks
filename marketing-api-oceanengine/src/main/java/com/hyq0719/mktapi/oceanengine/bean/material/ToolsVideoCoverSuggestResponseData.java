/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.material;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ToolsVideoCoverSuggestResponseData {
  /**
   * 封面生成的状态枚举值：RUNNING（生成中）、SUCCESS（成功）、FAILED（失败）注意：视频封面不是实时生成，需要根据status字段判断封面生成的状态，大概需要6，7s中生成，所以当sta...
   */
  @SerializedName("status")
  private String status = null;

  /**
   * 视频封面列表
   */
  @SerializedName("list")
  private List<ToolsVideoCoverSuggestListStruct> list = null;


  public ToolsVideoCoverSuggestResponseData status(String status) {
    this.status = status;
    return this;
  }

  public ToolsVideoCoverSuggestResponseData list(List<ToolsVideoCoverSuggestListStruct> list) {
    this.list = list;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
