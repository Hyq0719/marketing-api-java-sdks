package com.hyq0719.mktapi.oceanengine.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

@Data
public class AdvertiserFundDailyStatRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("page")
  private Long page = null;

  @SerializedName("page_size")
  private Long pageSize = null;

  public AdvertiserFundDailyStatRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdvertiserFundDailyStatRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public AdvertiserFundDailyStatRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public AdvertiserFundDailyStatRequest page(Long page) {
    this.page = page;
    return this;
  }

  public AdvertiserFundDailyStatRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
