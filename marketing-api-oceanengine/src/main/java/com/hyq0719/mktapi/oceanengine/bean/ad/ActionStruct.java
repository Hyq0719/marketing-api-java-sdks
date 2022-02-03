package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ActionStruct {
  @SerializedName("action_categories")
  private List<Long> actionCategories = null;

  @SerializedName("action_words")
  private List<Long> actionWords = null;

  @SerializedName("action_scene")
  private List<String> actionScene = null;

  @SerializedName("action_days")
  private Long actionDays = null;


  public ActionStruct actionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
    return this;
  }

  public ActionStruct actionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
    return this;
  }

  public ActionStruct actionScene(List<String> actionScene) {
    this.actionScene = actionScene;
    return this;
  }

  public ActionStruct actionDays(Long actionDays) {
    this.actionDays = actionDays;
    return this;
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
