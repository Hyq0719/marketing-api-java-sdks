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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 00:39:35
 */
@Data
public class UserInfoResponseData {
  /**
   * 用户id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 邮箱（已经脱敏处理）
   */
  @SerializedName("email")
  private String email = null;

  /**
   * 用户名
   */
  @SerializedName("display_name")
  private String displayName = null;

  public UserInfoResponseData id(Long id) {
    this.id = id;
    return this;
  }

  public UserInfoResponseData email(String email) {
    this.email = email;
    return this;
  }

  public UserInfoResponseData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
