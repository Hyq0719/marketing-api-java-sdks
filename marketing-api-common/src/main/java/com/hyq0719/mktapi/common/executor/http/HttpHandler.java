package com.hyq0719.mktapi.common.executor.http;

import com.hyq0719.mktapi.common.ApiResponse;
import com.hyq0719.mktapi.common.exception.ApiException;
import com.hyq0719.mktapi.common.executor.parameter.RequestParam;
import com.hyq0719.mktapi.common.util.JSON;

import java.lang.reflect.Type;

/**
 * 网络请求处理器
 *
 * @author hyq0719
 */
public interface HttpHandler {

  /**
   * 执行网络请求
   *
   * @param param      请求参数
   * @param returnType 请求返回Type
   * @param <T>        请求返回类型
   * @return ApiResponse
   * @throws ApiException
   */
  <T> ApiResponse<T> execute(RequestParam param, Type returnType) throws ApiException;

  /**
   * 构造请求url
   *
   * @param param 请求参数
   * @return 请求url
   */
  String buildUrl(RequestParam param);

  /**
   * 获取JSON序列化工具
   *
   * @return JSON序列化工具
   */
  JSON getJSON();
}
