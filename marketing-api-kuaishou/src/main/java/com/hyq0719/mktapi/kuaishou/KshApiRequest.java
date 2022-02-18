package com.hyq0719.mktapi.kuaishou;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.ApiRequest;
import com.hyq0719.mktapi.common.ApiResponse;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.advice.ApiRequestAdvice;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.AuthConstants;
import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.common.executor.parameter.BaseUrl;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import com.hyq0719.mktapi.kuaishou.bean.CodeKey;
import com.hyq0719.mktapi.kuaishou.bean.TokenKey;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.Objects;

@Slf4j
public class KshApiRequest<T extends TokenKey, R extends CodeKey> extends ApiRequest<T, R> {

  private static final BaseUrl BASE_URL = BaseUrl.builder()
    .scheme("https")
    .host("ad.e.kuaishou.com/rest/openapi")
    .version("v1")
    .build();

  private final String path;

  private final String method;

  private final Boolean usePostBody;

  private final String[] contentTypes;

  private String version;

  private String host;

  private ApiClient apiClient;

  private RetryStrategy retryStrategy;

  public KshApiRequest() {
    ApiRequestMapping annotation = getClass().getAnnotation(ApiRequestMapping.class);
    if (Objects.isNull(annotation)) {
      throw new RuntimeException("must be @BusinessRequestMapping");
    }
    method = annotation.method();
    path = annotation.value();
    version = StringUtils.isEmpty(annotation.version()) ? BASE_URL.getVersion() : annotation.version();
    host = StringUtils.isEmpty(annotation.host()) ? BASE_URL.getHost() : annotation.host();
    usePostBody = annotation.usePostBody();
    contentTypes = annotation.contentTypes();

    log.info("[load ApiRequestMapping] method:{},path:{},version:{},host:{},usePostBody:{},contentTypes:{}", method,
      path, version, host, usePostBody, contentTypes);

    if (StringUtils.isEmpty(method)) {
      throw new RuntimeException("@BusinessRequestMapping -> method is not null");
    }
    if (StringUtils.isEmpty(path)) {
      throw new RuntimeException("@BusinessRequestMapping -> path is not null");
    }
  }

  public void setConfig(ApiClient apiClient, RetryStrategy retryStrategy) {
    this.apiClient = apiClient;
    this.retryStrategy = retryStrategy;
  }

  @Override
  public R retry(ApiResponse<R> resp, T t, ApiRequestAdvice apiRequestAdvice, String token)
    throws ApiException {
    R data = resp.getData();
    if (data.getCodeKey() == 0) {
      return data;
    }
    log.info("Kuaishou result code:{}, message:{}", data.getCodeKey(), data.getMsg());

    if (retryStrategy.isTokenExpired(data.getCodeKey())) {
      refreshToken(t.getTokenKey());
      data = retryRequest(t, apiRequestAdvice, null);
      log.info("Kuaishou after refresh token result code:{}, message:{}", data.getCodeKey(), data.getMsg());
      return data;
    }

    if (!retryStrategy.enable() || !retryStrategy.retryCondition(data.getCodeKey())) {
      return data;
    }

    int count = 0;
    Integer retryCount = retryStrategy.retryCount();
    while (count < retryCount) {
      data = retryRequest(t, apiRequestAdvice, token);
      log.info("Kuaishou retry result retryCount:{},code:{}, message:{}", (count + 1), data.getCodeKey(),
        data.getMsg());
      count++;
      if (!retryStrategy.retryCondition(data.getCodeKey())) {
        return data;
      }
    }
    return data;
  }

  @Override
  public Boolean isUsePostBody() {
    return usePostBody;
  }

  @Override
  public ApiClient getApiClient() {
    return apiClient;
  }

  @Override
  protected void updateParamsForAuth(RequestParam param) {
    Map<String, String> headerParams = param.getHeaderParams();
    for (String authName : param.getAuthNames()) {
      if ("Access-Token".equals(authName)) {
        headerParams.put("Access-Token", param.getAccessToken());
      }
    }
    param.setHeaderParams(headerParams);
  }

  @Override
  public BaseUrl getBaseUrl() {
    return BASE_URL;
  }

  @Override
  public String[] getRequestContentTypes() {
    return contentTypes;
  }

  @Override
  public String[] getLocalVarAuthNames() {
    return AuthConstants.KUAISHOU_AUTH;
  }

  @Override
  public String getMethod() {
    return method;
  }

  @Override
  public String getVersion() {
    return version;
  }

  @Override
  public String getHost() {
    return host;
  }

  @Override
  public String getStringToken(String accountId) {
    return getApiClient().getToken(accountId);
  }

  @Override
  public String getAccountId(T t) {
    return t.getTokenKey();
  }

  @Override
  public String getLocalVarPath() {
    return path;
  }

  private void refreshToken(String tokenKey) {
    log.info("Kuaishou refresh TOKEN start·······");
    apiClient.refreshSingleToken(tokenKey);
    log.info("Kuaishou refresh TOKEN end·······");
  }
}

