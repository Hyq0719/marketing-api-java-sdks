package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeBatchUpdateResponseStruct {
  @SerializedName("update_creative_ids")
  private List<Long> updateCreativeIds = null;

  @SerializedName("add_creative_ids")
  private List<Long> addCreativeIds = null;

  public CreativeBatchUpdateResponseStruct updateCreativeIds(List<Long> updateCreativeIds) {
    this.updateCreativeIds = updateCreativeIds;
    return this;
  }

  public CreativeBatchUpdateResponseStruct addCreativeIds(List<Long> addCreativeIds) {
    this.addCreativeIds = addCreativeIds;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
