/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.dataAccess;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-04 23:08:03
 */
@Data
public class DataListStruct {

  /**
   * 用户标识类型,  枚举值IMEI/IMEI_MD5/OAID/OAID_MD5/OTHER, 当数据源类型为APP时,该字段必传。 【附录-行为数据上传 用户标识类型】
   */
  @SerializedName("userIdType")
  private String userIdType = null;

  /**
   * 标识的值，如IMEI号等, 当数据源类型为APP时,该字段必传。 IMEI：15-17位，明文  IMEI_MD5 ：32位，加密  OAID：64位，明文 OAID_MD5：32位   加密 OTH...
   */
  @SerializedName("userId")
  private String userId = null;

  /**
   * 事件类型, 枚举值 自定义激活：ACTIVATION  自定义注册：REGISTER  自定义付费：PAY  表单提交：SUBMIT  网页购买：WEBPAY  自定义次留：RETENTION_1  ...
   */
  @SerializedName("cvType")
  private String cvType = null;

  /**
   * 事件发生的系统时间戳，精确到毫秒，13位 注意点：自定义次留时间戳需发生在自定义激活时间戳的第二个自然日及之后
   */
  @SerializedName("cvTime")
  private Long cvTime = null;

  /**
   * 事件参数;事件附加参数,如付费金额等
   */
  @SerializedName("cvParam")
  private String cvParam = null;

  /**
   * 自定义事件参数，cvType传OTHER必填，自定义事件参数由开发者自己定义，如转化类型等。
   */
  @SerializedName("cvCustom")
  private String cvCustom = null;

  /**
   * APP广告主：vivo回传点击数据时,透传给广告主的RequestID,使用点击归因的广告主需要回传。需对接vivo点击监测或第三方监测工具（取requestId字段）  网址类广告主：客户端跳转落地...
   */
  @SerializedName("requestId")
  private String requestId = null;

  /**
   * APP广告主：vivo回传点击数据时,透传给广告主的creativeId,使用点击归因的广告主需要回传。需对接vivo点击监测第三方监测工具（取creativeId字段）。  网址类广告主：客户端跳转...
   */
  @SerializedName("creativeId")
  private String creativeId = null;

  /**
   * 下载来源，分包参数归因必传字段。 广告主从分包服务获取到的下载信息,对接了分包参数下载来源接口的广告主可以使用,传入完整的加密信息即可
   */
  @SerializedName("dlrSrc")
  private String dlrSrc = null;

  public DataListStruct userIdType(String userIdType) {
    this.userIdType = userIdType;
    return this;
  }

  public DataListStruct userId(String userId) {
    this.userId = userId;
    return this;
  }

  public DataListStruct cvType(String cvType) {
    this.cvType = cvType;
    return this;
  }

  public DataListStruct cvTime(Long cvTime) {
    this.cvTime = cvTime;
    return this;
  }

  public DataListStruct cvParam(String cvParam) {
    this.cvParam = cvParam;
    return this;
  }

  public DataListStruct cvCustom(String cvCustom) {
    this.cvCustom = cvCustom;
    return this;
  }

  public DataListStruct requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public DataListStruct creativeId(String creativeId) {
    this.creativeId = creativeId;
    return this;
  }

  public DataListStruct dlrSrc(String dlrSrc) {
    this.dlrSrc = dlrSrc;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}