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
public class FileImageAdvertiserRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 图片上传方式 默认值：UPLOAD_BY_FILE 允许值：UPLOAD_BY_FILE、UPLOAD_BY_URL
   */
  @SerializedName("upload_type")
  private String uploadType = null;

  /**
   * 图片的md5值(用于服务端校验)，upload_type为UPLOAD_BY_FILE必填
   */
  @SerializedName("image_signature")
  private String imageSignature = null;

  /**
   * 图片文件,upload_type为UPLOAD_BY_FILE必填 格式: jpg、jpeg、png、bmp、gif, 大小1.5M内
   */
  @SerializedName("image_file")
  private File imageFile = null;

  /**
   * 图片url地址，如http://xxx.xxx，upload_type为UPLOAD_BY_URL必填
   */
  @SerializedName("image_url")
  private String imageUrl = null;

  /**
   * 调用上传资质 默认值：CG 允许值：CG：广告主资质接口、AD：投放资质接口
   */
  @SerializedName("upload_to")
  private String uploadTo = null;


  public FileImageAdvertiserRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FileImageAdvertiserRequest uploadType(String uploadType) {
    this.uploadType = uploadType;
    return this;
  }

  public FileImageAdvertiserRequest imageSignature(String imageSignature) {
    this.imageSignature = imageSignature;
    return this;
  }

  public FileImageAdvertiserRequest imageFile(File imageFile) {
    this.imageFile = imageFile;
    return this;
  }

  public FileImageAdvertiserRequest imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  public FileImageAdvertiserRequest uploadTo(String uploadTo) {
    this.uploadTo = uploadTo;
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
