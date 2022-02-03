package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class TitleMaterialStruct {
  @SerializedName("title")
  private String title = null;

  @SerializedName("word_list")
  private List<WordListStruct> wordList = null;

  @SerializedName("dpa_word_list")
  private List<DpaWordListStruct> dpaWordList = null;

  @SerializedName("bidword_list")
  private List<BidWordListStruct> bidWordList = null;

  public TitleMaterialStruct title(String title) {
    this.title = title;
    return this;
  }

  public TitleMaterialStruct wordList(List<WordListStruct> wordList) {
    this.wordList = wordList;
    return this;
  }

  public TitleMaterialStruct dpaWordList(List<DpaWordListStruct> dpaWordList) {
    this.dpaWordList = dpaWordList;
    return this;
  }

  public TitleMaterialStruct bidWordList(List<BidWordListStruct> bidWordList) {
    this.bidWordList = bidWordList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
