/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.dmp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 18:56:45
 */
@Data
public class DmpDataSourceCreateRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 数据源名称, 限30个字符内
   */
  @SerializedName("data_source_name")
  private String dataSourceName = null;

  /**
   * 数据源描述, 限256个字符内
   */
  @SerializedName("description")
  private String description = null;

  /**
   * 数据格式, 枚举值:"0"：ProtocolBuffer
   */
  @SerializedName("data_format")
  private Long dataFormat = null;

  /**
   * 数据存储类型, 枚举值:"0"：API
   */
  @SerializedName("file_storage_type")
  private String fileStorageType = null;

  /**
   * 通过【数据源文件上传】接口得到的文件路径，注意：一次上传最多1000个
   */
  @SerializedName("file_paths")
  private List<String> filePaths = null;

  /**
   * 投放数据源类型，枚举值如下: "UID"：用户ID, "DID"：设备ID ,默认值： "UID" 人群类型仅IMEI、IDFA、IMEI-MD5、IDFA-MD5、OAID、OAID_MD5支持DI...
   */
  @SerializedName("data_source_type")
  private String dataSourceType = null;

  public DmpDataSourceCreateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public DmpDataSourceCreateRequest dataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
    return this;
  }

  public DmpDataSourceCreateRequest description(String description) {
    this.description = description;
    return this;
  }

  public DmpDataSourceCreateRequest dataFormat(Long dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }

  public DmpDataSourceCreateRequest fileStorageType(String fileStorageType) {
    this.fileStorageType = fileStorageType;
    return this;
  }

  public DmpDataSourceCreateRequest filePaths(List<String> filePaths) {
    this.filePaths = filePaths;
    return this;
  }

  public DmpDataSourceCreateRequest dataSourceType(String dataSourceType) {
    this.dataSourceType = dataSourceType;
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
