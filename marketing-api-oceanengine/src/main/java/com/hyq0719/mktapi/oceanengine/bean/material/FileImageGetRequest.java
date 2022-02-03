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

@Data
public class FileImageGetRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 图片过滤条件
   */
  @SerializedName("filtering")
  private FileImageGetFilteringStruct fileImageGetFiltering = null;

  /**
   * 页码，默认值1
   */
  @SerializedName("page")
  private Long page = null;

  /**
   * 页面大小，默认值20
   */
  @SerializedName("page_size")
  private Long pageSize = null;


  public FileImageGetRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FileImageGetRequest fileImageGetFiltering(FileImageGetFilteringStruct fileImageGetFiltering) {
    this.fileImageGetFiltering = fileImageGetFiltering;
    return this;
  }

  public FileImageGetRequest page(Long page) {
    this.page = page;
    return this;
  }

  public FileImageGetRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
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
