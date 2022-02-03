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
 * @date 2022-02-03 19:05:56
 */
@Data
public class DmpDataSourceUpdateRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 数据源ID
   */
  @SerializedName("data_source_id")
  private String dataSourceId = null;

  /**
   * 更新操作类型, 枚举值："1" ：添加,"2"：删除, "3"：重置
   */
  @SerializedName("operation_type")
  private Long operationType = null;

  /**
   * 数据格式，枚举值："0"：ProtocolBuffer
   */
  @SerializedName("data_format")
  private Long dataFormat = null;

  /**
   * 数据存储类型，枚举值："0"：API
   */
  @SerializedName("file_storage_type")
  private Long fileStorageType = null;

  /**
   * 通过上传接口得到的文件路径，单次更新的file_paths不能超过200个
   */
  @SerializedName("file_paths")
  private List<String> filePaths = null;

  public DmpDataSourceUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public DmpDataSourceUpdateRequest dataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public DmpDataSourceUpdateRequest operationType(Long operationType) {
    this.operationType = operationType;
    return this;
  }

  public DmpDataSourceUpdateRequest dataFormat(Long dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }

  public DmpDataSourceUpdateRequest fileStorageType(Long fileStorageType) {
    this.fileStorageType = fileStorageType;
    return this;
  }

  public DmpDataSourceUpdateRequest filePaths(List<String> filePaths) {
    this.filePaths = filePaths;
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
