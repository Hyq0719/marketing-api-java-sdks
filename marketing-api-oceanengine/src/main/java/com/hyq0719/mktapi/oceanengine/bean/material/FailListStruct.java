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
public class FailListStruct {
  /**
   * 推送失败的视频id
   */
  @SerializedName("video_id")
  private String videoId = null;

  /**
   * 推送失败的图片id
   */
  @SerializedName("image_id")
  private String imageId = null;

  /**
   * 目标推送广告主id
   */
  @SerializedName("target_advertiser_id")
  private Long targetAdvertiserId = null;

  /**
   * 推送失败原因 枚举值：VIDEO_BINDING_EXISTED（视频已存在）、IMAGE_BINDING_EXISTED（图片已存在）
   */
  @SerializedName("fail_reason")
  private String failReason = null;


  public FailListStruct videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  public FailListStruct imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  public FailListStruct targetAdvertiserId(Long targetAdvertiserId) {
    this.targetAdvertiserId = targetAdvertiserId;
    return this;
  }

  public FailListStruct failReason(String failReason) {
    this.failReason = failReason;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
