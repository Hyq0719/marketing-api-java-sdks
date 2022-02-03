/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.dmp;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-03 19:17:28
 */
@Data
public class DmpDataSourceReadDataListStruct {
  /**
   * 数据源名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 数据源ID
   */
  @SerializedName("data_source_id")
  private String dataSourceId = null;

  /**
   * 数据源描述
   */
  @SerializedName("description")
  private String description = null;

  /**
   * 数据源初次创建状态，枚举值："0"：已创建，"1"：解析中暂不可用，"2"：完成
   */
  @SerializedName("status")
  private Long status = null;

  /**
   * 人群包覆盖人群数目，基于"upload_num"：上传数据源包含的人群数目与uid对应后，再与头条系产品MAU交集后的数量（存在一个设备号/手机号对应多个uid的情况） 实际数量可能多于/少于"upl...
   */
  @SerializedName("cover_num")
  private Long coverNum = null;

  /**
   * 上传数据源包含的人群数目
   */
  @SerializedName("upload_num")
  private Long uploadNum = null;

  /**
   * 数据源创建时间
   */
  @SerializedName("create_time")
  private String createTime = null;

  /**
   * 数据源修改时间
   */
  @SerializedName("modify_time")
  private String modifyTime = null;

  /**
   * 数据源最近一次更新对应的日志id，若未完成更新，返回“-1”
   */
  @SerializedName("lastest_published_change_log_id")
  private Long lastestPublishedChangeLogId = null;

  /**
   * 数据源最近一次发布完成时间
   */
  @SerializedName("lastest_published_time")
  private String lastestPublishedTime = null;

  /**
   * 数据源类型，枚举值："UID"：用户ID，"DID" ：设备ID
   */
  @SerializedName("data_source_type")
  private String dataSourceType = null;

  /**
   * 每一次更新，会记录一次日志id
   */
  @SerializedName("change_logs")
  private List<ChangeLogsStruct> changeLogs = null;

  /**
   * 数据源对应的人群包，如果还未生成将不会返回
   */
  @SerializedName("default_audience")
  private DefaultAudienceStruct defaultAudience = null;

  public DmpDataSourceReadDataListStruct name(String name) {
    this.name = name;
    return this;
  }

  public DmpDataSourceReadDataListStruct dataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  public DmpDataSourceReadDataListStruct description(String description) {
    this.description = description;
    return this;
  }

  public DmpDataSourceReadDataListStruct status(Long status) {
    this.status = status;
    return this;
  }

  public DmpDataSourceReadDataListStruct coverNum(Long coverNum) {
    this.coverNum = coverNum;
    return this;
  }

  public DmpDataSourceReadDataListStruct uploadNum(Long uploadNum) {
    this.uploadNum = uploadNum;
    return this;
  }

  public DmpDataSourceReadDataListStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public DmpDataSourceReadDataListStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  public DmpDataSourceReadDataListStruct lastestPublishedChangeLogId(Long lastestPublishedChangeLogId) {
    this.lastestPublishedChangeLogId = lastestPublishedChangeLogId;
    return this;
  }

  public DmpDataSourceReadDataListStruct lastestPublishedTime(String lastestPublishedTime) {
    this.lastestPublishedTime = lastestPublishedTime;
    return this;
  }

  public DmpDataSourceReadDataListStruct dataSourceType(String dataSourceType) {
    this.dataSourceType = dataSourceType;
    return this;
  }

  public DmpDataSourceReadDataListStruct changeLogs(List<ChangeLogsStruct> changeLogs) {
    this.changeLogs = changeLogs;
    return this;
  }

  public DmpDataSourceReadDataListStruct defaultAudience(DefaultAudienceStruct defaultAudience) {
    this.defaultAudience = defaultAudience;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
