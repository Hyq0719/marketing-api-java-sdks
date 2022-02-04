/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dmpTag;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

import java.io.File;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 21:55:15
 */
@Data
public class AdDmpTagUploadRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 人群包文件，txt或者zip文件，一行一个用户标识；单个文件不超过100M
   */
  @SerializedName("file")
  private File file = null;

  /**
   * 文件MD5值
   */
  @SerializedName("md5")
  private String md5 = null;

  public AdDmpTagUploadRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdDmpTagUploadRequest file(File file) {
    this.file = file;
    return this;
  }

  public AdDmpTagUploadRequest md5(String md5) {
    this.md5 = md5;
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