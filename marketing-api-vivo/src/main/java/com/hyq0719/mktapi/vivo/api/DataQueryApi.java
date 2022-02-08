package com.hyq0719.mktapi.vivo.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.vivo.VivoApiRequest;
import com.hyq0719.mktapi.vivo.bean.common.VivoResponse;
import com.hyq0719.mktapi.vivo.bean.dataQuery.*;

import java.util.List;

/**
 * @author hyq0719
 * @description vivo商业开放平台——数据洞察
 */
public class DataQueryApi extends AbstractVivoApi {
  private volatile AdstatementSummaryQuery adstatementSummaryQuery;
  private volatile AdstatementPromptQuery adstatementPromptQuery;
  private volatile AdstatementDownloadImeiQuery adstatementDownloadImeiQuery;
  private volatile AdstatementGameQuery adstatementGameQuery;
  private volatile DeepLinkQuery deepLinkQuery;
  private volatile ChannelInfoQuery channelInfoQuery;
  private volatile AdstatementQuickGameQuery adstatementQuickGameQuery;

  public DataQueryApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public AdstatementSummaryQuery adstatementSummaryQuery() {
    if (adstatementSummaryQuery == null) {
      synchronized (AdstatementSummaryQuery.class) {
        if (adstatementSummaryQuery == null) {
          adstatementSummaryQuery = (AdstatementSummaryQuery) init(AdstatementSummaryQuery.class);
        }
      }
    }
    return adstatementSummaryQuery;
  }

  public AdstatementPromptQuery adstatementPromptQuery() {
    if (adstatementPromptQuery == null) {
      synchronized (AdstatementPromptQuery.class) {
        if (adstatementPromptQuery == null) {
          adstatementPromptQuery = (AdstatementPromptQuery) init(AdstatementPromptQuery.class);
        }
      }
    }
    return adstatementPromptQuery;
  }

  public AdstatementDownloadImeiQuery adstatementDownloadImeiQuery() {
    if (adstatementDownloadImeiQuery == null) {
      synchronized (AdstatementDownloadImeiQuery.class) {
        if (adstatementDownloadImeiQuery == null) {
          adstatementDownloadImeiQuery = (AdstatementDownloadImeiQuery) init(AdstatementDownloadImeiQuery.class);
        }
      }
    }
    return adstatementDownloadImeiQuery;
  }

  public AdstatementGameQuery adstatementGameQuery() {
    if (adstatementGameQuery == null) {
      synchronized (AdstatementGameQuery.class) {
        if (adstatementGameQuery == null) {
          adstatementGameQuery = (AdstatementGameQuery) init(AdstatementGameQuery.class);
        }
      }
    }
    return adstatementGameQuery;
  }

  public DeepLinkQuery deepLinkQuery() {
    if (deepLinkQuery == null) {
      synchronized (DeepLinkQuery.class) {
        if (deepLinkQuery == null) {
          deepLinkQuery = (DeepLinkQuery) init(DeepLinkQuery.class);
        }
      }
    }
    return deepLinkQuery;
  }

  public ChannelInfoQuery channelInfoQuery() {
    if (channelInfoQuery == null) {
      synchronized (ChannelInfoQuery.class) {
        if (channelInfoQuery == null) {
          channelInfoQuery = (ChannelInfoQuery) init(ChannelInfoQuery.class);
        }
      }
    }
    return channelInfoQuery;
  }

  public AdstatementQuickGameQuery adstatementQuickGameQuery() {
    if (adstatementQuickGameQuery == null) {
      synchronized (AdstatementQuickGameQuery.class) {
        if (adstatementQuickGameQuery == null) {
          adstatementQuickGameQuery = (AdstatementQuickGameQuery) init(AdstatementQuickGameQuery.class);
        }
      }
    }
    return adstatementQuickGameQuery;
  }

  @ApiRequestMapping(value = "/adstatement/summary/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdstatementSummaryQuery extends VivoApiRequest<AdstatementSummaryQueryRequest,
          VivoResponse<AdstatementSummaryQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdstatementSummaryQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/adstatement/prompt/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdstatementPromptQuery extends VivoApiRequest<AdstatementPromptQueryRequest,
          VivoResponse<AdstatementPromptQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdstatementPromptQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/adstatement/downloadImei/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdstatementDownloadImeiQuery extends VivoApiRequest<AdstatementDownloadImeiQueryRequest,
          VivoResponse<AdstatementDownloadImeiQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdstatementDownloadImeiQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/adstatement/game/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdstatementGameQuery extends VivoApiRequest<AdstatementGameQueryRequest,
          VivoResponse<AdstatementGameQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdstatementGameQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/deepLink/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class DeepLinkQuery extends VivoApiRequest<DeepLinkQueryRequest,
          VivoResponse<DeepLinkQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                DeepLinkQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/channelInfo/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class ChannelInfoQuery extends VivoApiRequest<ChannelInfoQueryRequest,
          VivoResponse<ChannelInfoQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ChannelInfoQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }

  @ApiRequestMapping(value = "/adstatement/quickGame/query", method = RequestConstants.POST, contentTypes = {
          RequestConstants.CONTENT_TYPE_JSON})
  public class AdstatementQuickGameQuery extends VivoApiRequest<AdstatementQuickGameQueryRequest,
          VivoResponse<AdstatementQuickGameQueryResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                AdstatementQuickGameQueryRequest request) {
      String advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
    }
  }
}
