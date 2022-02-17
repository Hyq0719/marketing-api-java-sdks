package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DisplayInfoStruct {
  @SerializedName("action_bar_text")
  private String actionBarText = null;

  @SerializedName("description")
  private String description = null;


  public DisplayInfoStruct actionBarText(String actionBarText) {
    this.actionBarText = actionBarText;
    return this;
  }

  public DisplayInfoStruct description(String description) {
    this.description = description;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
