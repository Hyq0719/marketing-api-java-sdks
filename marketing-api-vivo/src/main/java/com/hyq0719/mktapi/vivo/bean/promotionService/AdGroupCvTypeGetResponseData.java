/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 13:25:33
 */
@Data
public class AdGroupCvTypeGetResponseData {

  /**
   * 对象数据
   */
  @SerializedName("ocpxCvTypeVoList")
  private List<OcpxCvTypeVoListStruct> ocpxCvTypeVoList = null;

  public AdGroupCvTypeGetResponseData ocpxCvTypeVoList(List<OcpxCvTypeVoListStruct> ocpxCvTypeVoList) {
    this.ocpxCvTypeVoList = ocpxCvTypeVoList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}