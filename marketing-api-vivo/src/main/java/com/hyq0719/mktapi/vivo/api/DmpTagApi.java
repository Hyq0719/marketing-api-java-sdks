package com.hyq0719.mktapi.vivo.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.vivo.VivoApiRequest;
import com.hyq0719.mktapi.vivo.bean.common.VivoResponse;
import com.hyq0719.mktapi.vivo.bean.dmpTag.*;

import java.io.File;
import java.util.List;
import java.util.Map;

public class DmpTagApi extends AbstractVivoApi {
  private volatile AdDmpTagUpload adDmpTagUpload;
  private volatile AdDmpTagCreate adDmpTagCreate;
  private volatile AdDmpTagQuery adDmpTagQuery;
  private volatile AdDmpTagModify adDmpTagModify;

  public DmpTagApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public AdDmpTagUpload adDmpTagUpload() {
    if (adDmpTagUpload == null) {
      synchronized (AdDmpTagUpload.class) {
        if (adDmpTagUpload == null) {
          adDmpTagUpload = (AdDmpTagUpload) init(AdDmpTagUpload.class);
        }
      }
    }
    return adDmpTagUpload;
  }

  public AdDmpTagCreate adDmpTagCreate() {
    if (adDmpTagCreate == null) {
      synchronized (AdDmpTagCreate.class) {
        if (adDmpTagCreate == null) {
          adDmpTagCreate = (AdDmpTagCreate) init(AdDmpTagCreate.class);
        }
      }
    }
    return adDmpTagCreate;
  }

  public AdDmpTagQuery adDmpTagQuery() {
    if (adDmpTagQuery == null) {
      synchronized (AdDmpTagQuery.class) {
        if (adDmpTagQuery == null) {
          adDmpTagQuery = (AdDmpTagQuery) init(AdDmpTagQuery.class);
        }
      }
    }
    return adDmpTagQuery;
  }

  public AdDmpTagModify adDmpTagModify() {
    if (adDmpTagModify == null) {
      synchronized (AdDmpTagModify.class) {
        if (adDmpTagModify == null) {
          adDmpTagModify = (AdDmpTagModify) init(AdDmpTagModify.class);
        }
      }
    }
    return adDmpTagModify;
  }

  @ApiRequestMapping(value = "/dmp/data_source/file/upload/", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_MULTIPART_FORM_DATA})
  public class AdDmpTagUpload extends VivoApiRequest<AdDmpTagUploadRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdDmpTagUploadRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }

    @Override
    public void setMultipartParam(Map<String, Object> textMap, Map<String, File> fileMap,
                                  AdDmpTagUploadRequest request) {
      String md5 = request.getMd5();
      if (md5 != null) {
        textMap.put("md5", md5);
      }
      File file = request.getFile();
      if (file != null) {
        fileMap.put("file", file);
      }
    }
  }

  @ApiRequestMapping(value = "/ad/dmpTag/create", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdDmpTagCreate extends VivoApiRequest<AdDmpTagCreateRequest,
          VivoResponse<AdDmpTagCreateResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdDmpTagCreateRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/dmpTag/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdDmpTagQuery extends VivoApiRequest<AdDmpTagQueryRequest,
          VivoResponse<AdDmpTagQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdDmpTagQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/ad/dmpTag/modify", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdDmpTagModify extends VivoApiRequest<AdDmpTagModifyRequest,
          VivoResponse<AdDmpTagModifyResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdDmpTagModifyRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }
}
