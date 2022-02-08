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

import java.util.Set;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 10:51:27
 */
@Data
public class InstallBehaviorStruct {

  /**
   * 时间范围：-1标识历史永久，7、30、180、365标识具体天数
   */
  @SerializedName("period")
  private Integer period = null;

  /**
   * 应用行为：1-启动，2-未启动，3-安装
   */
  @SerializedName("behavior")
  private Integer behavior = null;

  /**
   * 应用分类id，与游戏分类一起最多可选200个
   */
  @SerializedName("appCategoryCode")
  private Set appCategoryCode = null;

  /**
   * 游戏分类id，与应用分类一起最多可选200个
   */
  @SerializedName("gameCategoryCode")
  private Set gameCategoryCode = null;

  public InstallBehaviorStruct period(Integer period) {
    this.period = period;
    return this;
  }

  public InstallBehaviorStruct behavior(Integer behavior) {
    this.behavior = behavior;
    return this;
  }

  public InstallBehaviorStruct appCategoryCode(Set appCategoryCode) {
    this.appCategoryCode = appCategoryCode;
    return this;
  }

  public InstallBehaviorStruct gameCategoryCode(Set gameCategoryCode) {
    this.gameCategoryCode = gameCategoryCode;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}