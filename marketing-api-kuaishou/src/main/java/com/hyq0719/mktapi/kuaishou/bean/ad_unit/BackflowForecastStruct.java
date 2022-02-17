package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class BackflowForecastStruct {
  @SerializedName("backflow_cv_lower")
  private Long backflowCvLower;

  @SerializedName("backflow_cv_upper")
  private Long backflowCvUpper;

  @SerializedName("backflow_timestamp")
  private Long backflowTimestamp;
}
