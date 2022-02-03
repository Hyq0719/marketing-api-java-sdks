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
public class ChangeLogsStruct {
  /**
   * 本次更新进行的操作，枚举值："0"：新建，"1"：添加，"2"：删除，"3"：重置
   */
  @SerializedName("action")
  private Long action = null;

  /**
   * 使用数据源文件上传文件后返回的文件路径参数
   */
  @SerializedName("file_paths")
  private List<String> filePaths = null;

  /**
   * 本次更新的状态，枚举值："0"：新建，"1"：处理中，"2"：生效，"3"：失败
   */
  @SerializedName("status")
  private Long status = null;

  /**
   * 本次更新创建时间
   */
  @SerializedName("create_time")
  private String createTime = null;

  /**
   * 本次更新完成时间
   */
  @SerializedName("modify_time")
  private String modifyTime = null;

  /**
   * 更新日志id
   */
  @SerializedName("change_log_id")
  private Long changeLogId = null;

  /**
   * 更新信息
   */
  @SerializedName("message")
  private String message = null;

  /**
   * 数据源本次更新发布完成时间记录
   */
  @SerializedName("published_time")
  private String publishedTime = null;

  public ChangeLogsStruct action(Long action) {
    this.action = action;
    return this;
  }

  public ChangeLogsStruct filePaths(List<String> filePaths) {
    this.filePaths = filePaths;
    return this;
  }

  public ChangeLogsStruct status(Long status) {
    this.status = status;
    return this;
  }

  public ChangeLogsStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public ChangeLogsStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  public ChangeLogsStruct changeLogId(Long changeLogId) {
    this.changeLogId = changeLogId;
    return this;
  }

  public ChangeLogsStruct message(String message) {
    this.message = message;
    return this;
  }

  public ChangeLogsStruct publishedTime(String publishedTime) {
    this.publishedTime = publishedTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
