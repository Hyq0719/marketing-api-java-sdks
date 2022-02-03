package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class GeolocationStruct {
  @SerializedName("province")
  private String province = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("street_number")
  private String streetNumber = null;

  @SerializedName("radius")
  private Long radius = null;

  @SerializedName("long")
  private Float geoLong = null;

  @SerializedName("lat")
  private Float lat = null;


  public GeolocationStruct province(String province) {
    this.province = province;
    return this;
  }

  public GeolocationStruct city(String city) {
    this.city = city;
    return this;
  }

  public GeolocationStruct street(String street) {
    this.street = street;
    return this;
  }

  public GeolocationStruct district(String district) {
    this.district = district;
    return this;
  }

  public GeolocationStruct name(String name) {
    this.name = name;
    return this;
  }

  public GeolocationStruct streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  public GeolocationStruct radius(Long radius) {
    this.radius = radius;
    return this;
  }

  public GeolocationStruct geoLong(Float geoLong) {
    this.geoLong = geoLong;
    return this;
  }

  public GeolocationStruct lat(Float lat) {
    this.lat = lat;
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
