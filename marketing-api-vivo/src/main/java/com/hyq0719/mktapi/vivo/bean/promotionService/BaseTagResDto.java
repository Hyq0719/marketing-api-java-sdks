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

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:38:52
 */
@Data
public class BaseTagResDto {

  /**
   * 标签编号id
   */
  @SerializedName("tagId")
  private Long tagId = null;

  /**
   * 标签名称
   */
  @SerializedName("tagName")
  private String tagName = null;

  /**
   * 父级标签id
   */
  @SerializedName("parentId")
  private Integer parentId = null;

  /**
   * 标签类型：1-标签，2-分类，3-目录，只有1类型可用于投放定向
   */
  @SerializedName("tagType")
  private Integer tagType = null;

  /**
   * 标签描述
   */
  @SerializedName("tagDescription")
  private String tagDescription = null;

  /**
   * 删除标志：删除:1, 未删除:0
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 启用标志: 1-已启用  0-已禁用
   */
  @SerializedName("isValid")
  private Integer isValid = null;

  /**
   * 子标签
   */
  @SerializedName("childBaseTag")
  private List<BaseTagResDto> childBaseTag = null;

  public BaseTagResDto tagId(Long tagId) {
    this.tagId = tagId;
    return this;
  }

  public BaseTagResDto tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

  public BaseTagResDto parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  public BaseTagResDto tagType(Integer tagType) {
    this.tagType = tagType;
    return this;
  }

  public BaseTagResDto tagDescription(String tagDescription) {
    this.tagDescription = tagDescription;
    return this;
  }

  public BaseTagResDto deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public BaseTagResDto isValid(Integer isValid) {
    this.isValid = isValid;
    return this;
  }

  public BaseTagResDto childBaseTag(List<BaseTagResDto> childBaseTag) {
    this.childBaseTag = childBaseTag;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}