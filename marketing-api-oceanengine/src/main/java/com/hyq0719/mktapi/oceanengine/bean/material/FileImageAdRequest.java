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
public class FileImageAdRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 图片上传方式默认值：UPLOAD_BY_FILE允许值：UPLOAD_BY_FILE、UPLOAD_BY_URL
   */
  @SerializedName("upload_type")
  private String uploadType = null;

  /**
   * 图片的md5值(用于服务端校验)upload_type为UPLOAD_BY_FILE必填
   */
  @SerializedName("image_signature")
  private String imageSignature = null;

  /**
   * 图片文件upload_type为UPLOAD_BY_FILE必填格式: jpg、jpeg、png、bmp、gif, 大小1.5M内
   */
  @SerializedName("image_file")
  private File imageFile = null;

  /**
   * 图片url地址，如http://xxx.xxxupload_type为UPLOAD_BY_URL必填
   */
  @SerializedName("image_url")
  private String imageUrl = null;

  /**
   * 素材的文件名，可自定义素材名，不传则默认取文件名，最长255个字符注：若同一素材已进行上传，重新上传不会改名
   */
  @SerializedName("filename")
  private String filename = null;


  public FileImageAdRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FileImageAdRequest uploadType(String uploadType) {
    this.uploadType = uploadType;
    return this;
  }

  public FileImageAdRequest imageSignature(String imageSignature) {
    this.imageSignature = imageSignature;
    return this;
  }

  public FileImageAdRequest imageFile(File imageFile) {
    this.imageFile = imageFile;
    return this;
  }

  public FileImageAdRequest imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public FileImageAdRequest filename(String filename) {
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
