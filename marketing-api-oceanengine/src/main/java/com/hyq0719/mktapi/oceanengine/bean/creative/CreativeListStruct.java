package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class CreativeListStruct {
  @SerializedName("derive_poster_cid")
  private Long derivePosterCid = null;
  @SerializedName("image_mode")
  private String imageMode = null;
  @SerializedName("third_party_id")
  private String thirdPartyId = null;
  @SerializedName("title_material")
  private TitleMaterialStruct titleMaterial = null;
  @SerializedName("image_materials")
  private List<ImageInfoStruct> imageMaterials = null;
  @SerializedName("video_material")
  private VideoMaterialStruct videoMaterial = null;
  @SerializedName("sub_title_material")
  private SubTitleMaterialStruct subTitleMaterial = null;
  @SerializedName("playable_materials")
  private PlayableMaterialStruct playableMaterial = null;
  @SerializedName("component_materials")
  private List<ComponentMaterialsStruct> componentMaterial = null;
  @SerializedName("abstract_materials")
  private List<AbstractMaterialsStruct> abstractMaterials = null;

  public CreativeListStruct derivativePosterCid(Long derivePosterCid) {
    this.derivePosterCid = derivePosterCid;
    return this;
  }

  public CreativeListStruct imageMode(String imageMode) {
    this.imageMode = imageMode;
    return this;
  }

  public CreativeListStruct thirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

  public CreativeListStruct titleMaterial(TitleMaterialStruct titleMaterial) {
    this.titleMaterial = titleMaterial;
    return this;
  }

  public CreativeListStruct imageMaterials(List<ImageInfoStruct> imageMaterials) {
    this.imageMaterials = imageMaterials;
    return this;
  }

  public CreativeListStruct videoMaterial(VideoMaterialStruct videoMaterial) {
    this.videoMaterial = videoMaterial;
    return this;
  }

  public CreativeListStruct subTitleMaterial(SubTitleMaterialStruct subTitleMaterial) {
    this.subTitleMaterial = subTitleMaterial;
    return this;
  }

  public CreativeListStruct playableMaterial(PlayableMaterialStruct playableMaterial) {
    this.playableMaterial = playableMaterial;
    return this;
  }

  public CreativeListStruct componentMaterial(List<ComponentMaterialsStruct> componentMaterial) {
    this.componentMaterial = componentMaterial;
    return this;
  }

  public CreativeListStruct abstractMaterial(List<AbstractMaterialsStruct> abstractMaterials) {
    this.abstractMaterials = abstractMaterials;
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
