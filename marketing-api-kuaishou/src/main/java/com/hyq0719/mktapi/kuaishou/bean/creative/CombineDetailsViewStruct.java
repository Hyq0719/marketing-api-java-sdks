package com.hyq0719.mktapi.kuaishou.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CombineDetailsViewStruct {
  @SerializedName("cover_url")
  private String coverUrl = null;

  @SerializedName("photo_id")
  private Long photoId = null;

  @SerializedName("review_detail")
  private List<String> reviewDetail = null;

  @SerializedName("caption")
  private String caption = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("review_status")
  private Integer reviewStatus = null;

  @SerializedName("put_status")
  private Integer putStatus = null;


  public CombineDetailsViewStruct coverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    return this;
  }

  public CombineDetailsViewStruct photoId(Long photoId) {
    this.photoId = photoId;
    return this;
  }

  public CombineDetailsViewStruct reviewDetail(List<String> reviewDetail) {
    this.reviewDetail = reviewDetail;
    return this;
  }

  public CombineDetailsViewStruct caption(String caption) {
    this.caption = caption;
    return this;
  }

  public CombineDetailsViewStruct id(Long id) {
    this.id = id;
    return this;
  }

  public CombineDetailsViewStruct reviewStatus(Integer reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  public CombineDetailsViewStruct putStatus(Integer putStatus) {
    this.putStatus = putStatus;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
