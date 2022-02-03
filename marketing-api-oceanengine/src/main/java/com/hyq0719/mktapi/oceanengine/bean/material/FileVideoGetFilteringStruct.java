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
public class FileVideoGetFilteringStruct {
  /**
   * 视频宽度
   */
  @SerializedName("width")
  private Long width = null;

  /**
   * 视频高度
   */
  @SerializedName("height")
  private Long height = null;

  /**
   * 视频宽高比，示例: [1.7, 2.5]输入1.7则搜索满足宽高比介于1.65-1.75之间的视频，即精度上下浮动0.05
   */
  @SerializedName("ratio")
  private List<Float> ratio = null;

  /**
   * 视频ids，示例: ["86adb23eaa21229fc04ef932b5089bb8"]数量限制：<=100注意：video_ids、material_ids、signatures只能选择一个进行...
   */
  @SerializedName("video_ids")
  private List<String> videoIds = null;

  /**
   * 素材id列表，可以根据material_ids（素材报表使用的id，一个素材唯一对应一个素材id）进行过滤数量限制：<=100注意：video_ids、material_ids、signatures只...
   */
  @SerializedName("material_ids")
  private List<Long> materialIds = null;

  /**
   * md5值列表，可以根据素材的md5进行过滤数量限制：<=100注意：video_ids、material_ids、signatures只能选择一个进行过滤
   */
  @SerializedName("signatures")
  private List<String> signatures = null;

  /**
   * 根据视频上传时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd
   */
  @SerializedName("start_time")
  private String startTime = null;

  /**
   * 根据视频上传时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd
   */
  @SerializedName("end_time")
  private String endTime = null;


  public FileVideoGetFilteringStruct width(Long width) {
    this.width = width;
    return this;
  }

  public FileVideoGetFilteringStruct height(Long height) {
    this.height = height;
    return this;
  }

  public FileVideoGetFilteringStruct ratio(List<Float> ratio) {
    this.ratio = ratio;
    return this;
  }

  public FileVideoGetFilteringStruct videoIds(List<String> videoIds) {
    this.videoIds = videoIds;
    return this;
  }

  public FileVideoGetFilteringStruct materialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
    return this;
  }

  public FileVideoGetFilteringStruct signatures(List<String> signatures) {
    this.signatures = signatures;
    return this;
  }

  public FileVideoGetFilteringStruct startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public FileVideoGetFilteringStruct endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
