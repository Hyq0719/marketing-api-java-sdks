package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class BidWordListStruct {
  @SerializedName("default_word")
  private String defaultWord = null;

  public BidWordListStruct defaultWord(String defaultWord) {
    this.defaultWord = defaultWord;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
