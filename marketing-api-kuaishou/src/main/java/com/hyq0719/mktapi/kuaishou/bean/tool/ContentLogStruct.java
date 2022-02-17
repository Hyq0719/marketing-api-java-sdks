package com.hyq0719.mktapi.kuaishou.bean.tool;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ContentLogStruct {
  @SerializedName("original_data")
  private String originalData = null;

  @SerializedName("update_data")
  private String updateData = null;

  @SerializedName("field_name")
  private String fieldName = null;


  public ContentLogStruct originalData(String originalData) {
    this.originalData = originalData;
    return this;
  }

  public ContentLogStruct updateData(String updateData) {
    this.updateData = updateData;
    return this;
  }

  public ContentLogStruct fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
