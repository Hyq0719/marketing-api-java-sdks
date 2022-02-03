/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.token;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 00:14:16
 */
@Data
public class AdvertiserGetResponseData {
  /**
   * 账号列表
   */
  @SerializedName("list")
  private List<AdvertiserGetListStruct> list = null;

  public AdvertiserGetResponseData list(List<AdvertiserGetListStruct> list) {
    this.list = list;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
