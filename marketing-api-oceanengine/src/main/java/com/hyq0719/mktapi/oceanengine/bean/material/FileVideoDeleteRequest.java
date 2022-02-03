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
public class FileVideoDeleteRequest implements TokenKey {
  /**
   * 素材归属的广告主
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 待删除的video_id列表，长度范围：1 ~ 100
   */
  @SerializedName("video_ids")
  private List<String> videoIds = null;


  public FileVideoDeleteRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FileVideoDeleteRequest videoIds(List<String> videoIds) {
    this.videoIds = videoIds;
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
