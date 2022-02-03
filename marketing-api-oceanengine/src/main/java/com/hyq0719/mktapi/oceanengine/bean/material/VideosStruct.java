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

@Data
public class VideosStruct {
  /**
   * 视频id
   */
  @SerializedName("video_id")
  private String videoId = null;

  /**
   * 更新状态 SUCCESS 成功 FAILURE 失败（原因：操作视频非当前广告主所有或操作的视频不存在）
   */
  @SerializedName("status_code")
  private String statusCode = null;


  public VideosStruct videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  public VideosStruct statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
