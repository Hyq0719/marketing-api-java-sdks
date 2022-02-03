/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.material;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class FileImageGetFilteringStruct {
  /**
   * 图片ids，可以根据图片ids（创意中使用的图片key，存在一张图片对应多个image_ids的情况）进行过滤数量限制：<=100注意：image_ids、material_ids、signature...
   */
  @SerializedName("image_ids")
  private List<String> imageIds = null;

  /**
   * 素材id列表，可以根据material_ids（素材报表使用的id，一个素材唯一对应一个素材id）进行过滤数量限制：<=100注意：image_ids、material_ids、signatures只...
   */
  @SerializedName("material_ids")
  private List<Long> materialIds = null;

  /**
   * md5值列表，可以根据素材的md5进行过滤数量限制：<=100注意：image_ids、material_ids、signatures只能选择一个进行过滤
   */
  @SerializedName("signatures")
  private List<String> signatures = null;

  /**
   * 图片宽度
   */
  @SerializedName("width")
  private Long width = null;

  /**
   * 图片高度
   */
  @SerializedName("height")
  private Long height = null;

  /**
   * 图片宽高比，eg: [1.7, 2.5]，输入1.7则搜索满足宽高比介于1.65-1.75之间的图片，即精度上下浮动0.05
   */
  @SerializedName("ratio")
  private List<Float> ratio = null;

  /**
   * 根据图片上传时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd
   */
  @SerializedName("start_time")
  private String startTime = null;

  /**
   * 根据图片上传时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd
   */
  @SerializedName("end_time")
  private String endTime = null;


  public FileImageGetFilteringStruct imageIds(List<String> imageIds) {
    this.imageIds = imageIds;
    return this;
  }

  public FileImageGetFilteringStruct materialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
    return this;
  }

  public FileImageGetFilteringStruct signatures(List<String> signatures) {
    this.signatures = signatures;
    return this;
  }

  public FileImageGetFilteringStruct width(Long width) {
    this.width = width;
    return this;
  }

  public FileImageGetFilteringStruct height(Long height) {
    this.height = height;
    return this;
  }

  public FileImageGetFilteringStruct ratio(List<Float> ratio) {
    this.ratio = ratio;
    return this;
  }

  public FileImageGetFilteringStruct startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  public FileImageGetFilteringStruct endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
