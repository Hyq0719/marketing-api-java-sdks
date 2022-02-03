package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class TextAbstractInfoStruct {
  @SerializedName("abstract_text")
  private String abstractText = null;

  @SerializedName("bidword_list")
  private List<BidWordListStruct> bidWordList = null;

  @SerializedName("word_list")
  private List<WordListStruct> wordList = null;

  public TextAbstractInfoStruct abstractText(String abstractText) {
    this.abstractText = abstractText;
    return this;
  }

  public TextAbstractInfoStruct bidWordList(List<BidWordListStruct> bidWordList) {
    this.bidWordList = bidWordList;
    return this;
  }

  public TextAbstractInfoStruct wordList(List<WordListStruct> wordList) {
    this.wordList = wordList;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
