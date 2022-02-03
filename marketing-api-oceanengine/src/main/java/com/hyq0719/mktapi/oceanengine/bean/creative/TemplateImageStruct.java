package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class TemplateImageStruct {
  @SerializedName("template_id")
  private String templateId = null;
  @SerializedName("template_data_list")
  private List<TemplateDataListStruct> templateDataList = null;

  public TemplateImageStruct templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  public TemplateImageStruct templateDataList(List<TemplateDataListStruct> templateDataList) {
    this.templateDataList = templateDataList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
