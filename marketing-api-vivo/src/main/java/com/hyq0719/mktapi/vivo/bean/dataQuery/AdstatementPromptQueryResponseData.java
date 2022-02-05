/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataQuery;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 18:38:37
 */
@Data
public class AdstatementPromptQueryResponseData {

  /**
   * 分页坐标
   */
  @SerializedName("lastId")
  private String lastId = null;

  /**
   * 分页大小
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 列表
   */
  @SerializedName("items")
  private List<AdstatementPromptQueryItemsStruct> items = null;

  public AdstatementPromptQueryResponseData lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdstatementPromptQueryResponseData pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public AdstatementPromptQueryResponseData items(List<AdstatementPromptQueryItemsStruct> items) {
    this.items = items;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}