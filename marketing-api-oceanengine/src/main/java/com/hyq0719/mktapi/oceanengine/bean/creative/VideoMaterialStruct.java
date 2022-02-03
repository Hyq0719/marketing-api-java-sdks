package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class VideoMaterialStruct {
  @SerializedName("image_info")
  private ImageInfoStruct imageInfo = null;

  @SerializedName("video_info")
  private VideoInfoStruct videoInfo = null;

  @SerializedName("dpa_video_template_type")
  private String dpaVideoTemplateType = null;

  @SerializedName("dpa_video_task_ids")
  private List<String> dpaVideoTaskIds = null;


  public VideoMaterialStruct imageInfo(ImageInfoStruct imageInfo) {
    this.imageInfo = imageInfo;
    return this;
  }

  public VideoMaterialStruct videoInfo(VideoInfoStruct videoInfo) {
    this.videoInfo = videoInfo;
    return this;
  }

  public VideoMaterialStruct dpaVideoTemplateType(String dpaVideoTemplateType) {
    this.dpaVideoTemplateType = dpaVideoTemplateType;
    return this;
  }

  public VideoMaterialStruct dpaVideoTaskIds(List<String> dpaVideoTaskIds) {
    this.dpaVideoTaskIds = dpaVideoTaskIds;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
