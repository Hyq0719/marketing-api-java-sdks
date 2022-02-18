package com.hyq0719.mktapi.oceanengine.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.dmp.*;

import java.io.File;
import java.util.List;
import java.util.Map;

public class DmpAudienceApi extends AbstractOceanApi {
  private volatile DmpDataSourceFileUpload dmpDataSourceFileUpload;
  private volatile DmpDataSourceCreate dmpDataSourceCreate;
  private volatile DmpDataSourceUpdate dmpDataSourceUpdate;
  private volatile DmpDataSourceRead dmpDataSourceRead;
  private volatile DmpCustomAudienceSelect dmpCustomAudienceSelect;
  private volatile DmpCustomAudienceRead dmpCustomAudienceRead;
  private volatile DmpCustomAudiencePublish dmpCustomAudiencePublish;
  private volatile DmpCustomAudiencePushV2 dmpCustomAudiencePushV2;
  private volatile DmpCustomAudienceDelete dmpCustomAudienceDelete;

  public DmpAudienceApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public DmpDataSourceFileUpload dmpDataSourceFileUpload() {
    if (dmpDataSourceFileUpload == null) {
      synchronized (DmpDataSourceFileUpload.class) {
        if (dmpDataSourceFileUpload == null) {
          dmpDataSourceFileUpload = (DmpDataSourceFileUpload) init(DmpDataSourceFileUpload.class);
        }
      }
    }
    return dmpDataSourceFileUpload;
  }

  public DmpDataSourceCreate dmpDataSourceCreate() {
    if (dmpDataSourceCreate == null) {
      synchronized (DmpDataSourceCreate.class) {
        if (dmpDataSourceCreate == null) {
          dmpDataSourceCreate = (DmpDataSourceCreate) init(DmpDataSourceCreate.class);
        }
      }
    }
    return dmpDataSourceCreate;
  }

  public DmpDataSourceUpdate dmpDataSourceUpdate() {
    if (dmpDataSourceUpdate == null) {
      synchronized (DmpDataSourceUpdate.class) {
        if (dmpDataSourceUpdate == null) {
          dmpDataSourceUpdate = (DmpDataSourceUpdate) init(DmpDataSourceUpdate.class);
        }
      }
    }
    return dmpDataSourceUpdate;
  }

  public DmpDataSourceRead dmpDataSourceRead() {
    if (dmpDataSourceRead == null) {
      synchronized (DmpDataSourceRead.class) {
        if (dmpDataSourceRead == null) {
          dmpDataSourceRead = (DmpDataSourceRead) init(DmpDataSourceRead.class);
        }
      }
    }
    return dmpDataSourceRead;
  }

  public DmpCustomAudienceSelect dmpCustomAudienceSelect() {
    if (dmpCustomAudienceSelect == null) {
      synchronized (DmpCustomAudienceSelect.class) {
        if (dmpCustomAudienceSelect == null) {
          dmpCustomAudienceSelect = (DmpCustomAudienceSelect) init(DmpCustomAudienceSelect.class);
        }
      }
    }
    return dmpCustomAudienceSelect;
  }

  public DmpCustomAudienceRead dmpCustomAudienceRead() {
    if (dmpCustomAudienceRead == null) {
      synchronized (DmpCustomAudienceRead.class) {
        if (dmpCustomAudienceRead == null) {
          dmpCustomAudienceRead = (DmpCustomAudienceRead) init(DmpCustomAudienceRead.class);
        }
      }
    }
    return dmpCustomAudienceRead;
  }

  public DmpCustomAudiencePublish dmpCustomAudiencePublish() {
    if (dmpCustomAudiencePublish == null) {
      synchronized (DmpCustomAudiencePublish.class) {
        if (dmpCustomAudiencePublish == null) {
          dmpCustomAudiencePublish = (DmpCustomAudiencePublish) init(DmpCustomAudiencePublish.class);
        }
      }
    }
    return dmpCustomAudiencePublish;
  }

  public DmpCustomAudiencePushV2 dmpCustomAudiencePushV2() {
    if (dmpCustomAudiencePushV2 == null) {
      synchronized (DmpCustomAudiencePushV2.class) {
        if (dmpCustomAudiencePushV2 == null) {
          dmpCustomAudiencePushV2 = (DmpCustomAudiencePushV2) init(DmpCustomAudiencePushV2.class);
        }
      }
    }
    return dmpCustomAudiencePushV2;
  }

  public DmpCustomAudienceDelete dmpCustomAudienceDelete() {
    if (dmpCustomAudienceDelete == null) {
      synchronized (DmpCustomAudienceDelete.class) {
        if (dmpCustomAudienceDelete == null) {
          dmpCustomAudienceDelete = (DmpCustomAudienceDelete) init(DmpCustomAudienceDelete.class);
        }
      }
    }
    return dmpCustomAudienceDelete;
  }

  @ApiRequestMapping(value = "/dmp/data_source/file/upload/", method = RequestConstants.POST, contentTypes = {
    RequestConstants.CONTENT_TYPE_MULTIPART_FORM_DATA})
  public class DmpDataSourceFileUpload extends OceanApiRequest<DmpDataSourceFileUploadRequest,
    OceanResponse<DmpDataSourceFileUploadResponseData>> {
    @Override
    public void setFormParam(Map<String, Object> formParamMap, DmpDataSourceFileUploadRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        formParamMap.put(ADVERTISER_ID, advertiserId);
      }
      String fileSignature = request.getFileSignature();
      if (fileSignature != null) {
        formParamMap.put("image_signature", fileSignature);
      }
      File file = request.getFile();
      if (file != null) {
        formParamMap.put("image_file", file);
      }
    }
  }

  @ApiRequestMapping(value = "/dmp/data_source/create/", method = RequestConstants.POST)
  public class DmpDataSourceCreate extends OceanApiRequest<DmpDataSourceCreateRequest,
    OceanResponse<DmpDataSourceCreateResponseData>> {
  }

  @ApiRequestMapping(value = "/dmp/data_source/update/", method = RequestConstants.POST)
  public class DmpDataSourceUpdate extends OceanApiRequest<DmpDataSourceUpdateRequest,
    OceanResponse<Object>> {
  }

  @ApiRequestMapping(value = "/dmp/data_source/read/", method = RequestConstants.GET, usePostBody =
    false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class DmpDataSourceRead extends OceanApiRequest<DmpDataSourceReadRequest,
    OceanResponse<DmpDataSourceReadResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                DmpDataSourceReadRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      List<String> dataSourceIdList = request.getDataSourceIdList();
      if (dataSourceIdList != null) {
        localVarCollectionQueryParams.addAll(parameterToPairs("multi",
          "data_source_id_list", dataSourceIdList));
      }
    }
  }

  @ApiRequestMapping(value = "/dmp/custom_audience/select/", method = RequestConstants.GET, usePostBody =
    false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class DmpCustomAudienceSelect extends OceanApiRequest<DmpCustomAudienceSelectRequest,
    OceanResponse<DmpCustomAudienceSelectResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                DmpCustomAudienceSelectRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      Integer selectType = request.getSelectType();
      if (selectType != null) {
        localVarQueryParams.addAll(parameterToPair("select_type", selectType));
      }
      Long offset = request.getOffset();
      if (offset != null) {
        localVarQueryParams.addAll(parameterToPair("offset", offset));
      }
      Long limit = request.getLimit();
      if (limit != null) {
        localVarQueryParams.addAll(parameterToPair("limit", limit));
      }
    }
  }

  @ApiRequestMapping(value = "/dmp/custom_audience/read/", method = RequestConstants.GET, usePostBody =
    false, contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class DmpCustomAudienceRead extends OceanApiRequest<DmpCustomAudienceReadRequest,
    OceanResponse<DmpCustomAudienceReadResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                DmpCustomAudienceReadRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      List<Long> customAudienceIds = request.getCustomAudienceIds();
      if (customAudienceIds != null) {
        localVarCollectionQueryParams.addAll(parameterToPairs("multi",
          "custom_audience_ids", customAudienceIds));
      }
    }
  }

  @ApiRequestMapping(value = "/dmp/custom_audience/publish/", method = RequestConstants.POST)
  public class DmpCustomAudiencePublish extends OceanApiRequest<DmpCustomAudiencePublishRequest,
    OceanResponse<Object>> {
  }

  @ApiRequestMapping(value = "/dmp/custom_audience/push_v2/", method = RequestConstants.POST)
  public class DmpCustomAudiencePushV2 extends OceanApiRequest<DmpCustomAudiencePushV2Request,
    OceanResponse<Object>> {
  }

  @ApiRequestMapping(value = "/dmp/custom_audience/delete/", method = RequestConstants.POST)
  public class DmpCustomAudienceDelete extends OceanApiRequest<DmpCustomAudienceDeleteRequest,
    OceanResponse<DmpCustomAudienceDeleteResponseData>> {
  }
}
