/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import com.google.gson.Gson;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 23:14:22
 */
@Data
public class AccountAdvertiserQueryListStruct {

  /**
   * 账号标识（advertise_id）：所属广告主，来自商业化账户
   */
  @SerializedName("uuid")
  private String uuid = null;

  /**
   * 名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 状态：0-未完善 1-待审核 2-已通过 3-未通过 4-已注销 5-已冻结 6-资料修改待审核
   */
  @SerializedName("status")
  private Short status = null;

  public AccountAdvertiserQueryListStruct uuid (String uuid) {
    this.uuid = uuid;
    return this;
  }

  public AccountAdvertiserQueryListStruct name (String name) {
    this.name = name;
    return this;
  }

  public AccountAdvertiserQueryListStruct status (Short status) {
    this.status = status;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}