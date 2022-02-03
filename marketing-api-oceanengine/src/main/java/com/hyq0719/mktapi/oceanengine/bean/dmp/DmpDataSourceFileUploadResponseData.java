/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.dmp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 18:22:47
 */
@Data
public class DmpDataSourceFileUploadResponseData {
  /**
   * 文件路径，包含作为文件唯一标识的字符串(14天后文件路径过期)
   */
  @SerializedName("file_path")
  private String filePath = null;

  public DmpDataSourceFileUploadResponseData filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
