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
public class FileMaterialBindResponseData {
  /**
   * 推送失败列表
   */
  @SerializedName("fail_list")
  private List<FailListStruct> failList = null;


  public FileMaterialBindResponseData failList(List<FailListStruct> failList) {
    this.failList = failList;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
