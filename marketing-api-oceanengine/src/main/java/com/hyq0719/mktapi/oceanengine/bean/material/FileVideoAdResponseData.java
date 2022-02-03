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
public class FileVideoAdResponseData {
  /**
   * 视频ID
   */
  @SerializedName("video_id")
  private String videoId = null;

  /**
   * 视频大小
   */
  @SerializedName("size")
  private Long size = null;

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
   * 视频地址
   */
  @SerializedName("video_url")
  private String videoUrl = null;

  /**
   * 视频时长
   */
  @SerializedName("duration")
  private Long duration = null;

  /**
   * 素材id，即多合一报表中的素材id，一个素材唯一对应一个素材id
   */
  @SerializedName("material_id")
  private Long materialId = null;


  public FileVideoAdResponseData videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  public FileVideoAdResponseData size(Long size) {
    this.size = size;
    return this;
  }

  public FileVideoAdResponseData width(Long width) {
    this.width = width;
    return this;
  }

  public FileVideoAdResponseData height(Long height) {
    this.height = height;
    return this;
  }

  public FileVideoAdResponseData videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  public FileVideoAdResponseData duration(Long duration) {
    this.duration = duration;
    return this;
  }

  public FileVideoAdResponseData materialId(Long materialId) {
    this.materialId = materialId;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
