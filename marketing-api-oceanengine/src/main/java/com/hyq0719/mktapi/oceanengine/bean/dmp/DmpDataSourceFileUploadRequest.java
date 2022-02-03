/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.dmp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.io.File;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 18:22:47
 */
@Data
public class DmpDataSourceFileUploadRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 文件
   */
  @SerializedName("file")
  private File file = null;

  /**
   * 文件MD5
   */
  @SerializedName("file_signature")
  private String fileSignature = null;

  public DmpDataSourceFileUploadRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public DmpDataSourceFileUploadRequest file(File file) {
    this.file = file;
    return this;
  }

  public DmpDataSourceFileUploadRequest fileSignature(String fileSignature) {
    this.fileSignature = fileSignature;
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
