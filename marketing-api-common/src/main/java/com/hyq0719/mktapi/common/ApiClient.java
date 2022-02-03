package com.hyq0719.mktapi.common;

import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.common.executor.http.HttpHandler;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import com.hyq0719.mktapi.common.token.ExternalTokenService;
import com.hyq0719.mktapi.common.token.IToken;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;
import com.hyq0719.mktapi.common.util.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.threeten.bp.format.DateTimeFormatter;

import java.lang.reflect.Type;
import java.text.DateFormat;

@Slf4j
public abstract class ApiClient {

  // token缓存
  private volatile ITokenLocalCache iTokenLocalCache;
  // 外部token获取service
  private ExternalTokenService externalTokenService;

  private HttpHandler httpHandler;
  private JSON json;

  protected ApiClient(ITokenLocalCache iTokenLocalCache, HttpHandler httpHandler,
                      ExternalTokenService externalTokenService) {
    this.httpHandler = httpHandler;
    this.iTokenLocalCache = iTokenLocalCache;
    this.externalTokenService = externalTokenService;
    json = httpHandler.getJSON();
  }

  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.json.setDateFormat(dateFormat);
    return this;
  }

  public ApiClient setSqlDateFormat(DateFormat dateFormat) {
    this.json.setSqlDateFormat(dateFormat);
    return this;
  }

  public ApiClient setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
    this.json.setOffsetDateTimeFormat(dateFormat);
    return this;
  }

  public ApiClient setLocalDateFormat(DateTimeFormatter dateFormat) {
    this.json.setLocalDateFormat(dateFormat);
    return this;
  }

  public ApiClient setLenientOnJson(boolean lenientOnJson) {
    this.json.setLenientOnJson(lenientOnJson);
    return this;
  }

  public JSON getJSON() {
    return httpHandler.getJSON();
  }

  public <T> ApiResponse<T> execute(RequestParam param, Type returnType) throws ApiException {
    try {
      return httpHandler.execute(param, returnType);
    } catch (Exception e) {
      throw new ApiException(e);
    }
  }

  public String getToken(String accountId) {
    //账号id判空
    if (StringUtils.isEmpty(accountId)) {
      return "";
    }
    IToken iToken = iTokenLocalCache.get(accountId);
    if (iToken != null) {
      return iToken.getToken();
    }
    return refreshSingleToken(accountId);
  }

  /**
   * 更新单个账号token信息
   *
   * @param tokenKey
   */
  public String refreshSingleToken(String tokenKey) {
    IToken iToken = externalTokenService.refreshToken(tokenKey);
    iTokenLocalCache.put(tokenKey, iToken);
    return iToken.getToken();
  }
}
