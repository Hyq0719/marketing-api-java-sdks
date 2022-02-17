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

/**
 * oCPC/oCPM深度优化内容
 */
public class DeepConversionSpec {
  @SerializedName("deep_conversion_type")
  private String deepConversionType = null;

  @SerializedName("deep_conversion_behavior_spec")
  private DeepConversionBehaviorSpec deepConversionBehaviorSpec = null;

  @SerializedName("deep_conversion_worth_spec")
  private DeepConversionWorthSpec deepConversionWorthSpec = null;

  public DeepConversionSpec deepConversionType(String deepConversionType) {
    this.deepConversionType = deepConversionType;
    return this;
  }

  /**
   * Get deepConversionType
   *
   * @return deepConversionType
   */
  public String getDeepConversionType() {
    return deepConversionType;
  }

  public void setDeepConversionType(String deepConversionType) {
    this.deepConversionType = deepConversionType;
  }

  public DeepConversionSpec deepConversionBehaviorSpec(
          DeepConversionBehaviorSpec deepConversionBehaviorSpec) {
    this.deepConversionBehaviorSpec = deepConversionBehaviorSpec;
    return this;
  }

  /**
   * Get deepConversionBehaviorSpec
   *
   * @return deepConversionBehaviorSpec
   */
  public DeepConversionBehaviorSpec getDeepConversionBehaviorSpec() {
    return deepConversionBehaviorSpec;
  }

  public void setDeepConversionBehaviorSpec(DeepConversionBehaviorSpec deepConversionBehaviorSpec) {
    this.deepConversionBehaviorSpec = deepConversionBehaviorSpec;
  }

  public DeepConversionSpec deepConversionWorthSpec(
          DeepConversionWorthSpec deepConversionWorthSpec) {
    this.deepConversionWorthSpec = deepConversionWorthSpec;
    return this;
  }

  /**
   * Get deepConversionWorthSpec
   *
   * @return deepConversionWorthSpec
   */
  public DeepConversionWorthSpec getDeepConversionWorthSpec() {
    return deepConversionWorthSpec;
  }

  public void setDeepConversionWorthSpec(DeepConversionWorthSpec deepConversionWorthSpec) {
    this.deepConversionWorthSpec = deepConversionWorthSpec;
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