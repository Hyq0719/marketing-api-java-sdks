package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdvCardListStruct {
  @SerializedName("adv_card_id")
  private Long advCardId = null;

  @SerializedName("card_type")
  private Integer cardType = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("sub_title")
  private String subTitle = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("sale_price")
  private Integer salePrice = null;

  public AdvCardListStruct title(String title) {
    this.title = title;
    return this;
  }

  public AdvCardListStruct subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  public AdvCardListStruct cardType(Integer cardType) {
    this.cardType = cardType;
    return this;
  }

  public AdvCardListStruct price(Integer price) {
    this.price = price;
    return this;
  }

  public AdvCardListStruct salePrice(Integer salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  public AdvCardListStruct url(String url) {
    this.url = url;
    return this;
  }

  public AdvCardListStruct advCardId(Long advCardId) {
    this.advCardId = advCardId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
