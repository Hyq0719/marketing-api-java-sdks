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

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:54:28
 */
@Data
public class PurposewordListListStruct {

  /**
   * 词包编号ID
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 词包名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 词包类型：0-意图词包；1-意图类目包
   */
  @SerializedName("type")
  private Integer type = null;

  /**
   * 人群ID
   */
  @SerializedName("crowdId")
  private Long crowdId = null;

  /**
   * 意图词个数
   */
  @SerializedName("wordNumber")
  private Long wordNumber = null;

  /**
   * 覆盖度中文描述
   */
  @SerializedName("crowdQuantityName")
  private String crowdQuantityName = null;

  /**
   * 用户行为类型：1-搜索；2-点击；3-全网；4-综合，详见【附录-用户行为类型】
   */
  @SerializedName("actionType")
  private Integer actionType = null;

  /**
   * 词包人群计算状态中文描述
   */
  @SerializedName("crowdStatusName")
  private String crowdStatusName = null;

  /**
   * 群过期时间
   */
  @SerializedName("crowdExpireTime")
  private String crowdExpireTime = null;

  /**
   * 备注：人群包未生效原因
   */
  @SerializedName("remark")
  private String remark = null;

  /**
   * 关联广告组个数
   */
  @SerializedName("groupNumber")
  private Integer groupNumber = null;

  /**
   * 删除标识：0-未删除；1-已删除，详见【附录-删除标识】
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 创建时间
   */
  @SerializedName("createTime")
  private String createTime = null;

  /**
   * 修改时间
   */
  @SerializedName("modifyTime")
  private String modifyTime = null;

  public PurposewordListListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public PurposewordListListStruct name(String name) {
    this.name = name;
    return this;
  }

  public PurposewordListListStruct type(Integer type) {
    this.type = type;
    return this;
  }

  public PurposewordListListStruct crowdId(Long crowdId) {
    this.crowdId = crowdId;
    return this;
  }

  public PurposewordListListStruct wordNumber(Long wordNumber) {
    this.wordNumber = wordNumber;
    return this;
  }

  public PurposewordListListStruct crowdQuantityName(String crowdQuantityName) {
    this.crowdQuantityName = crowdQuantityName;
    return this;
  }

  public PurposewordListListStruct actionType(Integer actionType) {
    this.actionType = actionType;
    return this;
  }

  public PurposewordListListStruct crowdStatusName(String crowdStatusName) {
    this.crowdStatusName = crowdStatusName;
    return this;
  }

  public PurposewordListListStruct crowdExpireTime(String crowdExpireTime) {
    this.crowdExpireTime = crowdExpireTime;
    return this;
  }

  public PurposewordListListStruct remark(String remark) {
    this.remark = remark;
    return this;
  }

  public PurposewordListListStruct groupNumber(Integer groupNumber) {
    this.groupNumber = groupNumber;
    return this;
  }

  public PurposewordListListStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public PurposewordListListStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public PurposewordListListStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}