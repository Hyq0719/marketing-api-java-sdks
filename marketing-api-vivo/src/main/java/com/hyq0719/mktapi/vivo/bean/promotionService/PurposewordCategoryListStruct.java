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
 * @date 2022-02-17 14:57:44
 */
@Data
public class PurposewordCategoryListStruct {

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

  public PurposewordCategoryListStruct id(Long id) {
    this.id = id;
    return this;
  }

  public PurposewordCategoryListStruct name(String name) {
    this.name = name;
    return this;
  }

  public PurposewordCategoryListStruct type(Integer type) {
    this.type = type;
    return this;
  }

  public PurposewordCategoryListStruct crowdId(Long crowdId) {
    this.crowdId = crowdId;
    return this;
  }

  public PurposewordCategoryListStruct wordNumber(Long wordNumber) {
    this.wordNumber = wordNumber;
    return this;
  }

  public PurposewordCategoryListStruct crowdQuantityName(String crowdQuantityName) {
    this.crowdQuantityName = crowdQuantityName;
    return this;
  }

  public PurposewordCategoryListStruct actionType(Integer actionType) {
    this.actionType = actionType;
    return this;
  }

  public PurposewordCategoryListStruct crowdStatusName(String crowdStatusName) {
    this.crowdStatusName = crowdStatusName;
    return this;
  }

  public PurposewordCategoryListStruct crowdExpireTime(String crowdExpireTime) {
    this.crowdExpireTime = crowdExpireTime;
    return this;
  }

  public PurposewordCategoryListStruct remark(String remark) {
    this.remark = remark;
    return this;
  }

  public PurposewordCategoryListStruct groupNumber(Integer groupNumber) {
    this.groupNumber = groupNumber;
    return this;
  }

  public PurposewordCategoryListStruct deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public PurposewordCategoryListStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public PurposewordCategoryListStruct modifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}