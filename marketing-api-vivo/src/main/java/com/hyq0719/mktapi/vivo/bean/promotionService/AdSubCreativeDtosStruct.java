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
 * @date 2022-02-17 14:14:10
 */
@Data
public class AdSubCreativeDtosStruct {

  /**
   * 子创意id
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 子类型:1-20积分 2-50积分   3-装机必备 4-升版必备
   */
  @SerializedName("subType")
  private String subType = null;

  /**
   * 挂靠关联的创意id
   */
  @SerializedName("masterId")
  private Long masterId = null;

  /**
   * 状态：1-启用；0-关闭；-1-删除
   */
  @SerializedName("state")
  private Integer state = null;

  /**
   * 操作的二代账号uuid
   */
  @SerializedName("opAgentUuid")
  private String opAgentUuid = null;

  /**
   * 创建时间 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("createTime")
  private String createTime = null;

  /**
   * 更新时间 时间戳，精确到毫秒 如：1597120297000
   */
  @SerializedName("updateTime")
  private String updateTime = null;

  public AdSubCreativeDtosStruct id(Long id) {
    this.id = id;
    return this;
  }

  public AdSubCreativeDtosStruct subType(String subType) {
    this.subType = subType;
    return this;
  }

  public AdSubCreativeDtosStruct masterId(Long masterId) {
    this.masterId = masterId;
    return this;
  }

  public AdSubCreativeDtosStruct state(Integer state) {
    this.state = state;
    return this;
  }

  public AdSubCreativeDtosStruct opAgentUuid(String opAgentUuid) {
    this.opAgentUuid = opAgentUuid;
    return this;
  }

  public AdSubCreativeDtosStruct createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public AdSubCreativeDtosStruct updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}