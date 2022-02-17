/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.hyq0719.mktapi.tencent.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * 标签图片
 */
public class AdcreativeLabelledImg {
  @SerializedName("image")
  private String image = null;

  @SerializedName("label")
  private List<AdcreativeLabel> label = null;

  public AdcreativeLabelledImg image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   *
   * @return image
   */
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public AdcreativeLabelledImg label(List<AdcreativeLabel> label) {
    this.label = label;
    return this;
  }

  public AdcreativeLabelledImg addLabelItem(AdcreativeLabel labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<AdcreativeLabel>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   *
   * @return label
   */
  public List<AdcreativeLabel> getLabel() {
    return label;
  }

  public void setLabel(List<AdcreativeLabel> label) {
    this.label = label;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}