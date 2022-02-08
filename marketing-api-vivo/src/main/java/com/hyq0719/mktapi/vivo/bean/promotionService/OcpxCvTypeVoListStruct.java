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
 * @date 2022-02-08 13:25:33
 */
@Data
public class OcpxCvTypeVoListStruct {

  /**
   * 转换目标配置表id
   */
  @SerializedName("configId")
  private Integer configId = null;

  /**
   * 智能拓量转化互斥配置
   */
  @SerializedName("intelligentExtensionMutex")
  private String intelligentExtensionMutex = null;

  /**
   * 过滤已转换配置对象
   */
  @SerializedName("filterConfigVo")
  private FilterConfigVoStruct filterConfigVo = null;

  /**
   * cvType实体对象
   */
  @SerializedName("cvTypeDetail")
  private CvTypeDetailStruct cvTypeDetail = null;

  /**
   * 深度优化目标实体对象
   */
  @SerializedName("ocpxSecondCvTypeVoList")
  private List<OcpxSecondCvTypeVoListStruct> ocpxSecondCvTypeVoList = null;

  /**
   * 过渡目标目标实体对象
   */
  @SerializedName("ocpxTransitionVoList")
  private List<OcpxTransitionVoListStruct> ocpxTransitionVoList = null;

  public OcpxCvTypeVoListStruct configId(Integer configId) {
    this.configId = configId;
    return this;
  }

  public OcpxCvTypeVoListStruct intelligentExtensionMutex(String intelligentExtensionMutex) {
    this.intelligentExtensionMutex = intelligentExtensionMutex;
    return this;
  }

  public OcpxCvTypeVoListStruct filterConfigVo(FilterConfigVoStruct filterConfigVo) {
    this.filterConfigVo = filterConfigVo;
    return this;
  }

  public OcpxCvTypeVoListStruct cvTypeDetail(CvTypeDetailStruct cvTypeDetail) {
    this.cvTypeDetail = cvTypeDetail;
    return this;
  }

  public OcpxCvTypeVoListStruct ocpxSecondCvTypeVoList(List<OcpxSecondCvTypeVoListStruct> ocpxSecondCvTypeVoList) {
    this.ocpxSecondCvTypeVoList = ocpxSecondCvTypeVoList;
    return this;
  }

  public OcpxCvTypeVoListStruct ocpxTransitionVoList(List<OcpxTransitionVoListStruct> ocpxTransitionVoList) {
    this.ocpxTransitionVoList = ocpxTransitionVoList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}