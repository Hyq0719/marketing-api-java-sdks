/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dmpTag;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 22:21:52
 */
@Data
public class AdDmpTagCreateResponseData {

  /**
   * 创建成功时返回人群包id
   */
  @SerializedName("crowdId")
  private Long crowdId = null;

  public AdDmpTagCreateResponseData crowdId(Long crowdId) {
    this.crowdId = crowdId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}