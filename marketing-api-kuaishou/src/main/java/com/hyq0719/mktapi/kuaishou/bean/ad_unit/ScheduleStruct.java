package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ScheduleStruct {
  @SerializedName("wed")
  private List<Integer> wed = null;

  @SerializedName("thur")
  private List<Integer> thur = null;

  @SerializedName("sat")
  private List<Integer> sat = null;

  @SerializedName("tues")
  private List<Integer> tues = null;

  @SerializedName("fri")
  private List<Integer> fri = null;

  @SerializedName("mon")
  private List<Integer> mon = null;

  @SerializedName("sun")
  private List<Integer> sun = null;


  public ScheduleStruct wed(List<Integer> wed) {
    this.wed = wed;
    return this;
  }

  public ScheduleStruct thur(List<Integer> thur) {
    this.thur = thur;
    return this;
  }

  public ScheduleStruct sat(List<Integer> sat) {
    this.sat = sat;
    return this;
  }

  public ScheduleStruct tues(List<Integer> tues) {
    this.tues = tues;
    return this;
  }

  public ScheduleStruct fri(List<Integer> fri) {
    this.fri = fri;
    return this;
  }

  public ScheduleStruct mon(List<Integer> mon) {
    this.mon = mon;
    return this;
  }

  public ScheduleStruct sun(List<Integer> sun) {
    this.sun = sun;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
