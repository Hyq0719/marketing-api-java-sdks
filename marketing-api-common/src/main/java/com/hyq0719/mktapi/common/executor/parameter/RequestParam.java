package com.hyq0719.mktapi.common.executor.parameter;

import com.google.gson.Gson;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.File;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
public class RequestParam {
  private String path;
  private String scheme;
  private String host;
  private String version;
  private BaseUrl baseUrl;
  private String method;
  private List<Pair> queryParams;
  private List<Pair> collectionQueryParams;
  private Boolean usePostBody;
  private Object postBody;
  private Map<String, String> headerParams;
  private Map<String, Object> formParams;
  private String[] authNames;
  private String accessToken;
  private Map<String, Object> multipartTextMap;
  private Map<String, File> multipartFileMap;

  public RequestParam() {
    method = RequestConstants.GET;
    usePostBody = false;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
