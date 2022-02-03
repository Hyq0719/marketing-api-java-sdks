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
public class FileVideoDeleteResponseData {
  /**
   * 操作失败的video_id列表，不在此列表内的素材表示删除成功
   */
  @SerializedName("fail_video_ids")
  private List<String> failVideoIds = null;


  public FileVideoDeleteResponseData failVideoIds(List<String> failVideoIds) {
    this.failVideoIds = failVideoIds;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
