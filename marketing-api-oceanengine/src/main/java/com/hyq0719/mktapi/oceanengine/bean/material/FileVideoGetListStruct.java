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

import java.util.List;

@Data
public class FileVideoGetListStruct {
  /**
   * 视频ID
   */
  @SerializedName("id")
  private String id = null;

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
   * 视频地址，仅限同主体进行素材预览查看，若非同主体会返回“素材所属主体与开发者主体不一致无法获取URL”链接仅做预览使用，预览链接有效期为1小时
   */
  @SerializedName("url")
  private String url = null;

  /**
   * 视频格式
   */
  @SerializedName("format")
  private String format = null;

  /**
   * 视频md5值
   */
  @SerializedName("signature")
  private String signature = null;

  /**
   * 视频首帧截图，仅限同主体进行素材预览查看，若非同主体会返回“素材所属主体与开发者主体不一致无法获取URL”
   */
  @SerializedName("poster_url")
  private String posterUrl = null;

  /**
   * 码率，单位bps
   */
  @SerializedName("bit_rate")
  private Long bitRate = null;

  /**
   * 视频时长
   */
  @SerializedName("duration")
  private Double duration = null;

  /**
   * 素材id，即多合一报表中的素材id，一个素材唯一对应一个素材id
   */
  @SerializedName("material_id")
  private Long materialId = null;

  /**
   * 素材来源，详见【附录-素材来源】
   */
  @SerializedName("source")
  private String source = null;

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

  /**
   * 视频标签
   */
  @SerializedName("labels")
  private List<String> labels = null;


  public FileVideoGetListStruct id(String id) {
    this.id = id;
    return this;
  }

  public FileVideoGetListStruct size(Long size) {
    this.size = size;
    return this;
  }

  public FileVideoGetListStruct width(Long width) {
    this.width = width;
    return this;
  }

  public FileVideoGetListStruct height(Long height) {
    this.height = height;
    return this;
  }

  public FileVideoGetListStruct url(String url) {
    this.url = url;
    return this;
  }

  public FileVideoGetListStruct format(String format) {
    this.format = format;
    return this;
  }

  public FileVideoGetListStruct signature(String signature) {
    this.signature = signature;
    return this;
  }

  public FileVideoGetListStruct posterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
    return this;
  }

  public FileVideoGetListStruct bitRate(Long bitRate) {
    this.bitRate = bitRate;
    return this;
  }

  public FileVideoGetListStruct duration(Double duration) {
    this.duration = duration;
    return this;
  }

  public FileVideoGetListStruct materialId(Long materialId) {
    this.materialId = materialId;
    return this;
  }

  public FileVideoGetListStruct source(String source) {
    this.source = source;
    return this;
  }

  public FileVideoGetListStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public FileVideoGetListStruct filename(String filename) {
    this.filename = filename;
    return this;
  }

  public FileVideoGetListStruct labels(List<String> labels) {
    this.labels = labels;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
