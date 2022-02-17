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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:30:21
 */
@Data
public class AdCreativeQueryAuditStateListStruct {

  /**
   * 创意编号id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 审核状态：1-待审核；2-审核通过； 3-审核不通过
   */
  @SerializedName("state")
  private Integer state = null;

  /**
   * 审核不通过原因
   */
  @SerializedName("errorMsg")
  private String errorMsg = null;

  public AdCreativeQueryAuditStateListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdCreativeQueryAuditStateListStruct state(Integer state) {
    this.state = state;
    return this;
  }

  public AdCreativeQueryAuditStateListStruct errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}