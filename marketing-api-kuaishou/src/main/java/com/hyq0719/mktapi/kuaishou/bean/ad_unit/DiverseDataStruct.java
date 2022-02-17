package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DiverseDataStruct {
  @SerializedName("device_os_type")
  private Integer deviceOsType = null;

  @SerializedName("app_name")
  private String appName = null;

  @SerializedName("app_package_name")
  private String appPackageName = null;


  public DiverseDataStruct deviceOsType(Integer deviceOsType) {
    this.deviceOsType = deviceOsType;
    return this;
  }

  public DiverseDataStruct appName(String appName) {
    this.appName = appName;
    return this;
  }

  public DiverseDataStruct appPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
