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
public class FileImageAdGetRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 图片ids，长度限制1~100
   */
  @SerializedName("image_ids")
  private List<String> imageIds = null;


  public FileImageAdGetRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FileImageAdGetRequest imageIds(List<String> imageIds) {
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
