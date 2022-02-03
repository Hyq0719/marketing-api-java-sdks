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
public class FileImageAdResponseData {
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

  /**
   * 素材id，即多合一报表中的素材id，一个素材唯一对应一个素材id
   */
  @SerializedName("material_id")
  private Long materialId = null;


  public FileImageAdResponseData id(String id) {
    this.id = id;
    return this;
  }

  public FileImageAdResponseData size(Long size) {
    this.size = size;
    return this;
  }

  public FileImageAdResponseData width(Long width) {
    this.width = width;
    return this;
  }

  public FileImageAdResponseData height(Long height) {
    this.height = height;
    return this;
  }

  public FileImageAdResponseData url(String url) {
    this.url = url;
    return this;
  }

  public FileImageAdResponseData format(String format) {
    this.format = format;
    return this;
  }

  public FileImageAdResponseData signature(String signature) {
    this.signature = signature;
    return this;
  }

  public FileImageAdResponseData materialId(Long materialId) {
    this.materialId = materialId;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
