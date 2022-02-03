package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PlayableMaterialStruct {
  @SerializedName("playable_info")
  private PlayableInfoStruct playableInfo = null;

  public PlayableMaterialStruct playableInfo(PlayableInfoStruct playableInfo) {
    this.playableInfo = playableInfo;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
