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
public class FileImageAdvertiserResponseData {
  /**
   * 图片ID
   */
  @SerializedName("id")
  private String id = null;

  /**
   * 图片大小
   */
  @SerializedName("size")
  private Long size = null;

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

  /**
   * 图片格式
   */
  @SerializedName("format")
  private String format = null;

  /**
   * 图片md5
   */
  @SerializedName("signature")
  private String signature = null;


  public FileImageAdvertiserResponseData id(String id) {
    this.id = id;
    return this;
  }

  public FileImageAdvertiserResponseData size(Long size) {
    this.size = size;
    return this;
  }

  public FileImageAdvertiserResponseData width(Long width) {
    this.width = width;
    return this;
  }

  public FileImageAdvertiserResponseData height(Long height) {
    this.height = height;
    return this;
  }

  public FileImageAdvertiserResponseData url(String url) {
    this.url = url;
    return this;
  }

  public FileImageAdvertiserResponseData format(String format) {
    this.format = format;
    return this;
  }

  public FileImageAdvertiserResponseData signature(String signature) {
    this.signature = signature;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
