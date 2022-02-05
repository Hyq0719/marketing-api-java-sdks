package com.hyq0719.mktapi.common;

import com.hyq0719.mktapi.common.advice.ApiRequestAdvice;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.common.executor.parameter.ParamHandler;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import com.hyq0719.mktapi.common.util.PairUtil;
import com.hyq0719.mktapi.common.util.StringUtil;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public abstract class ApiRequest<T, R> implements ParamHandler<T> {

  private Type localVarReturnType = getRType();

  public R execute(T t) throws ApiException {
    return execute(t, null, null);
  }

  /**
   * 新增钩子函数用于使用时增强
   *
   * @param t
   * @param apiRequestAdvice
   * @return
   * @throws ApiException
   */
  public R execute(T t, ApiRequestAdvice apiRequestAdvice) throws ApiException {
    return execute(t, apiRequestAdvice, null);
  }

  public R execute(T t, String token) throws ApiException {
    return execute(t, null, token);
  }

  public R execute(T t, ApiRequestAdvice apiRequestAdvice, String token) throws ApiException {
    if (Objects.nonNull(apiRequestAdvice)) {
      apiRequestAdvice.before();
    }
    ApiResponse<R> resp = executeWithHttp(t, token);
    if (Objects.nonNull(apiRequestAdvice)) {
      apiRequestAdvice.after(resp);
    }
    return retry(resp, t, apiRequestAdvice, token);
  }

  public R retry(ApiResponse<R> resp, T t, ApiRequestAdvice apiRequestAdvice, String token)
          throws ApiException {
    return resp.getData();
  }

  public R retryRequest(T t, ApiRequestAdvice apiRequestAdvice, String token) throws ApiException {
    if (Objects.nonNull(apiRequestAdvice)) {
      apiRequestAdvice.before();
    }
    ApiResponse<R> retryResponse = executeWithHttp(t, token);
    if (Objects.nonNull(apiRequestAdvice)) {
      apiRequestAdvice.after(retryResponse);
    }
    return retryResponse.getData();
  }

  @Override
  public RequestParam constructParameters(T t, String token) {
    Object localVarPostBody = null;
    if (Boolean.TRUE.equals(isUsePostBody())) {
      localVarPostBody = t;
    }
    List<Pair> localVarQueryParams = new ArrayList<>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<>();
    setRequestParam(localVarQueryParams, localVarCollectionQueryParams, t);

    Map<String, Object> localVarMultipartTextMap = new HashMap<>();
    Map<String, File> localVarMultipartFileMap = new HashMap<>();
    setMultipartParam(localVarMultipartTextMap, localVarMultipartFileMap, t);

    Map<String, String> localVarHeaderParams = new HashMap<>();
    final String localVarAccept = selectHeaderAccept(getRequestAccept());
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }
    Map<String, Object> localVarFormParams = new HashMap<>();
    final String localVarContentType = selectHeaderContentType(getRequestContentTypes());
    localVarHeaderParams.put("Content-Type", localVarContentType);

    final String localVarToken = StringUtils.isEmpty(token) ? getStringToken(getAccountId(t)) : token;

    return RequestParam.builder()
            .scheme(getBaseUrl().getScheme())
            .host(getHost())
            .path(getLocalVarPath())
            .version(getVersion())
            .method(getMethod())
            .usePostBody(isUsePostBody())
            .postBody(localVarPostBody)
            .queryParams(localVarQueryParams)
            .collectionQueryParams(localVarCollectionQueryParams)
            .headerParams(localVarHeaderParams)
            .formParams(localVarFormParams)
            .multipartTextMap(localVarMultipartTextMap)
            .multipartFileMap(localVarMultipartFileMap)
            .authNames(getLocalVarAuthNames())
            .accessToken(localVarToken)
            .build();
  }

  @Override
  public Boolean isUsePostBody() {
    return Boolean.TRUE;
  }

  @Override
  public String[] getRequestAccept() {
    return RequestConstants.ACCEPT_JSON;
  }

  public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams, T t) {
  }

  public void setMultipartParam(Map<String, Object> multipartTextMap, Map<String, File> multipartFileMap, T t) {
  }

  public void paramValidate(T t) throws ApiException {
  }

  /**
   * Select the Accept header's value from the given accepts array: if JSON exists in the given
   * array, use it; otherwise use all of them (joining into a string)
   *
   * @param accepts The accepts array to select from
   * @return The Accept header to use. If the given array is empty, null will be returned (not to
   * set the Accept header explicitly).
   */
  public String selectHeaderAccept(String[] accepts) {
    if (accepts.length == 0) {
      return null;
    }
    for (String accept : accepts) {
      if (isJsonMime(accept)) {
        return accept;
      }
    }
    return StringUtil.join(accepts, ",");
  }

  /**
   * Select the Content-Type header's value from the given array: if JSON exists in the given array,
   * use it; otherwise use the first one of the array.
   *
   * @param contentTypes The Content-Type array to select from
   * @return The Content-Type header to use. If the given array is empty, or matches "any", JSON
   * will be used.
   */
  public String selectHeaderContentType(String[] contentTypes) {
    if (contentTypes.length == 0 || "*/*".equals(contentTypes[0])) {
      return "application/json";
    }
    for (String contentType : contentTypes) {
      if (isJsonMime(contentType)) {
        return contentType;
      }
    }
    return contentTypes[0];
  }

  /**
   * Check if the given MIME is a JSON MIME. JSON MIME examples: application/json application/json;
   * charset=UTF8 APPLICATION/JSON application/vnd.company+json "* / *" is also default to JSON
   *
   * @param mime MIME (Multipurpose Internet Mail Extensions)
   * @return True if the given MIME is JSON, false otherwise.
   */
  public boolean isJsonMime(String mime) {
    String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
    return mime != null && (mime.matches(jsonMime) || "*/*".equals(mime));
  }

  public List<Pair> parameterToPair(String name, Object value) {
    return PairUtil.parameterToPair(name, value, getApiClient().getJSON());
  }

  public List<Pair> parameterToPairs(String collectionFormat, String name, Collection value) {
    return PairUtil.parameterToPairs(collectionFormat, name, value, getApiClient().getJSON());
  }

  protected abstract ApiClient getApiClient();

  protected abstract void updateParamsForAuth(RequestParam param);

  protected ApiResponse<R> executeWithHttp(T t, String token) throws ApiException {
    RequestParam param = constructParameters(t, token);
    paramValidate(t);
    updateParamsForAuth(param);
    return getApiClient().execute(param, localVarReturnType);
  }

  private Type getRType() {
    return ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
  }
}
