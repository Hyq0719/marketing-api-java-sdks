package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class IntelliExtendStruct {
  @SerializedName("no_area_break")
  private Integer noAreaBreak = null;

  @SerializedName("no_age_break")
  private Integer noAgeBreak = null;

  @SerializedName("is_open")
  private Integer isOpen = null;

  @SerializedName("no_gender_break")
  private Integer noGenderBreak = null;


  public IntelliExtendStruct noAreaBreak(Integer noAreaBreak) {
    this.noAreaBreak = noAreaBreak;
    return this;
  }

  public IntelliExtendStruct noAgeBreak(Integer noAgeBreak) {
    this.noAgeBreak = noAgeBreak;
    return this;
  }

  public IntelliExtendStruct isOpen(Integer isOpen) {
    this.isOpen = isOpen;
    return this;
  }

  public IntelliExtendStruct noGenderBreak(Integer noGenderBreak) {
    this.noGenderBreak = noGenderBreak;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
