package com.hyq0719.mktapi.vivo.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.vivo.VivoApiRequest;
import com.hyq0719.mktapi.vivo.bean.common.VivoResponse;
import com.hyq0719.mktapi.vivo.bean.dataAccess.AdvertiserBehaviorUploadRequest;

import java.util.List;

public class DataAccessApi extends AbstractVivoApi {
  private volatile AdvertiserBehaviorUpload advertiserBehaviorUpload;

  public DataAccessApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public AdvertiserBehaviorUpload advertiserBehaviorUpload() {
    if (advertiserBehaviorUpload == null) {
      synchronized (AdvertiserBehaviorUpload.class) {
        if (advertiserBehaviorUpload == null) {
          advertiserBehaviorUpload = (AdvertiserBehaviorUpload) init(AdvertiserBehaviorUpload.class);
        }
      }
    }
    return advertiserBehaviorUpload;
  }

  @ApiRequestMapping(value = "/advertiser/behavior/upload", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdvertiserBehaviorUpload extends VivoApiRequest<AdvertiserBehaviorUploadRequest,
          VivoResponse<String>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdvertiserBehaviorUploadRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }
}
