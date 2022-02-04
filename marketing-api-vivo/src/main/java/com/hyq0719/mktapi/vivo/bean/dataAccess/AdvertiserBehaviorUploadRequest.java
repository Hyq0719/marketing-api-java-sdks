/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataAccess;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.vivo.bean.TokenKey;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 23:08:03
 */
@Data
public class AdvertiserBehaviorUploadRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 数据源类型，枚举值：APP/Web/offline(不区分大小写) 【附录-行为数据上传 数据源类型】
   */
  @SerializedName("srcType")
  private String srcType = null;

  /**
   * 应用包名,  当数据源类型为APP时,该字段必传
   */
  @SerializedName("pkgName")
  private String pkgName = null;

  /**
   * 页面url,  当数据源类型为Web时,该字段必传
   */
  @SerializedName("pageUrl")
  private String pageUrl = null;

  /**
   * 数据源id,   营销平台转化管理工具中新建，每个产品在每个账号下仅可新建一个
   */
  @SerializedName("srcId")
  private String srcId = null;

  /**
   * 明细数据列表,长度限制1-100
   */
  @SerializedName("dataList")
  private List<DataListStruct> dataList = null;

  public AdvertiserBehaviorUploadRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdvertiserBehaviorUploadRequest srcType(String srcType) {
    this.srcType = srcType;
    return this;
  }

  public AdvertiserBehaviorUploadRequest pkgName(String pkgName) {
    this.pkgName = pkgName;
    return this;
  }

  public AdvertiserBehaviorUploadRequest pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  public AdvertiserBehaviorUploadRequest srcId(String srcId) {
    this.srcId = srcId;
    return this;
  }

  public AdvertiserBehaviorUploadRequest dataList(List<DataListStruct> dataList) {
    this.dataList = dataList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}