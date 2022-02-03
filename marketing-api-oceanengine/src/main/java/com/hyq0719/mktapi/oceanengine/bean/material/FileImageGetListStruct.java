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
public class FileImageGetListStruct {
  /**
   * 图片ID
   */
  @SerializedName("id")
  private String id = null;

  /**
   * 素材id，即多合一报表中的素材id，一个素材唯一对应一个素材id
   */
  @SerializedName("material_id")
  private Long materialId = null;

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
   * 图片预览地址，仅限同主体进行素材预览查看，若非同主体会返回“素材所属主体与开发者主体不一致无法获取URL”链接仅做预览使用，预览链接有效期为1小时
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
   * 素材的上传时间，格式："yyyy-mm-dd HH:MM:SS"
   */
  @SerializedName("create_time")
  private String createTime = null;

  /**
   * 素材的文件名
   */
  @SerializedName("filename")
  private String filename = null;


  public FileImageGetListStruct id(String id) {
    this.id = id;
    return this;
  }

  public FileImageGetListStruct materialId(Long materialId) {
    this.materialId = materialId;
    return this;
  }

  public FileImageGetListStruct size(Long size) {
    this.size = size;
    return this;
  }

  public FileImageGetListStruct width(Long width) {
    this.width = width;
    return this;
  }

  public FileImageGetListStruct height(Long height) {
    this.height = height;
    return this;
  }

  public FileImageGetListStruct url(String url) {
    this.url = url;
    return this;
  }

  public FileImageGetListStruct format(String format) {
    this.format = format;
    return this;
  }

  public FileImageGetListStruct signature(String signature) {
    this.signature = signature;
    return this;
  }

  public FileImageGetListStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public FileImageGetListStruct filename(String filename) {
    this.filename = filename;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
