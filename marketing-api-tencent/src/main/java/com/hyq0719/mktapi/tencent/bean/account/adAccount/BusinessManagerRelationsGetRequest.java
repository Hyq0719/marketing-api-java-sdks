/*
 * Marketing API 腾讯广告
 * Marketing API 腾讯广告
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.tencent.bean.account.adAccount;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.tencent.bean.IPage;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-03-07 10:35:33
 */
@Data
public class BusinessManagerRelationsGetRequest implements IPage {

  /**
   * 搜索页码，默认值：1 最小值 1，最大值 99999
   */
  @SerializedName("page")
  private Integer page = null;

  /**
   * 一页显示的数据条数，默认值：10 最小值 1，最大值 100
   */
  @SerializedName("page_size")
  private Integer pageSize = null;

  /**
   * 广告主类型筛选，不筛选则不传该字段，若只需要直客传 1，若只需要子客则传 2 最小值 1，最大值 2
   */
  @SerializedName("advertiser_type")
  private Integer advertiserType = null;

  public BusinessManagerRelationsGetRequest page(Integer page) {
    this.page = page;
    return this;
  }

  public BusinessManagerRelationsGetRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public BusinessManagerRelationsGetRequest advertiserType(Integer advertiserType) {
    this.advertiserType = advertiserType;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return null;
  }

  @Override
  public void exchangeCurrentPage(Integer page) {
    this.page = page;
  }

  @Override
  public Integer currentPageSize() {
    return Math.toIntExact(pageSize);
  }
}
