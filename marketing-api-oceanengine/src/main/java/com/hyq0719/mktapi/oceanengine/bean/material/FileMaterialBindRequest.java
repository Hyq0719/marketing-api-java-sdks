/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.material;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class FileMaterialBindRequest implements TokenKey {
  /**
   * 素材归属广告主
   */
  @SerializedName("advertiser_id")
  private Integer advertiserId = null;

  /**
   * 待推送的广告主，数量限制：<=50
   */
  @SerializedName("target_advertiser_ids")
  private List<Integer> targetAdvertiserIds = null;

  /**
   * 视频ID，数量限制：<=50注意：跟image_ids必须二选一、组织共享视频不可推送
   */
  @SerializedName("video_ids")
  private List<String> videoIds = null;

  /**
   * 图片ID，数量限制：<=50注意：跟video_ids必须二选一
   */
  @SerializedName("image_ids")
  private List<String> imageIds = null;


  public FileMaterialBindRequest advertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FileMaterialBindRequest targetAdvertiserIds(List<Integer> targetAdvertiserIds) {
    this.targetAdvertiserIds = targetAdvertiserIds;
    return this;
  }

  public FileMaterialBindRequest videoIds(List<String> videoIds) {
    this.videoIds = videoIds;
    return this;
  }

  public FileMaterialBindRequest imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
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
