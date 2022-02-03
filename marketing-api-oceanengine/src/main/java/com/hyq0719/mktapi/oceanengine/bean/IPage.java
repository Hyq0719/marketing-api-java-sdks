package com.hyq0719.mktapi.oceanengine.bean;

public interface IPage extends TokenKey {
  void exchangeCurrentPage(Integer page);

  Integer currentPageSize();
}
