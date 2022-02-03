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
public class ToolsVideoCoverSuggestListStruct {
  /**
   * 图片ID
   */
  @SerializedName("id")
  private String id = null;

  /**
   * 图片宽度
   */
  @SerializedName("width")
  private Long width = null;

  /**
   * 图片高度
   */
  @SerializedName("height")
  private Long height = null;

  /**
   * 图片预览地址
   */
  @SerializedName("url")
  private String url = null;


  public ToolsVideoCoverSuggestListStruct id(String id) {
    this.id = id;
    return this;
  }

  public ToolsVideoCoverSuggestListStruct width(Long width) {
    this.width = width;
    return this;
  }

  public ToolsVideoCoverSuggestListStruct height(Long height) {
    this.height = height;
    return this;
  }

  public ToolsVideoCoverSuggestListStruct url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
