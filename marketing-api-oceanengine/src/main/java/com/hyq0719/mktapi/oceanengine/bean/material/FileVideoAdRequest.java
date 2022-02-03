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

import java.io.File;

@Data
public class FileVideoAdRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 视频的md5值(用于服务端校验)
   */
  @SerializedName("video_signature")
  private String videoSignature = null;

  /**
   * 视频文件 允许格式：mp4、mpeg、3gp、avi（10s超时限制）
   */
  @SerializedName("video_file")
  private File videoFile = null;

  /**
   * 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名
   */
  @SerializedName("filename")
  private String filename = null;


  public FileVideoAdRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FileVideoAdRequest videoSignature(String videoSignature) {
    this.videoSignature = videoSignature;
    return this;
  }

  public FileVideoAdRequest videoFile(File videoFile) {
    this.videoFile = videoFile;
    return this;
  }

  public FileVideoAdRequest filename(String filename) {
    this.filename = filename;
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
