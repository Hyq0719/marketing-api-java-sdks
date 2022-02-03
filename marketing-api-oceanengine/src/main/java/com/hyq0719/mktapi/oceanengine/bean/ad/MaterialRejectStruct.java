package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class MaterialRejectStruct {
  @SerializedName("title")
  private String title = null;

  @SerializedName("image_id")
  private List<Long> imageId = null;

  @SerializedName("video_id")
  private String videoId = null;

  @SerializedName("reject_reason")
  private String rejectReason = null;

  public MaterialRejectStruct title(String title) {
    this.title = title;
    return this;
  }

  public MaterialRejectStruct imageId(List<Long> imageId) {
    this.imageId = imageId;
    return this;
  }

  public MaterialRejectStruct videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  public MaterialRejectStruct rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
