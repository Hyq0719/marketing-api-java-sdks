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
public class FileVideoUpdateResponseData {
  /**
   * 视频列表
   */
  @SerializedName("videos")
  private List<VideosStruct> videos = null;


  public FileVideoUpdateResponseData videos(List<VideosStruct> videos) {
    this.videos = videos;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
