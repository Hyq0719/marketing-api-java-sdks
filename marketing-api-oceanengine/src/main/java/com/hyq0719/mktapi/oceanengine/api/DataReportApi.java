package com.hyq0719.mktapi.oceanengine.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.common.util.JsonUtil;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.common.PageResponseData;
import com.hyq0719.mktapi.oceanengine.bean.report.*;

import java.util.List;

public class DataReportApi extends AbstractOceanApi {
  /**
   * 广告数据报表
   */
  private volatile ReportAgentGetV2 reportAgentGetV2;
  private volatile ReportAdvertiserGet reportAdvertiserGet;
  private volatile ReportCampaignGet reportCampaignGet;
  private volatile ReportAdGet reportAdGet;
  private volatile ReportCreativeGet reportCreativeGet;

  public DataReportApi(ApiClient apiClient, RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public ReportAgentGetV2 reportAgentGetV2() {
    if (reportAgentGetV2 == null) {
      synchronized (ReportAgentGetV2.class) {
        if (reportAgentGetV2 == null) {
          reportAgentGetV2 = (ReportAgentGetV2) init(ReportAgentGetV2.class);
        }
      }
    }
    return reportAgentGetV2;
  }

  public ReportAdvertiserGet reportAdvertiserGet() {
    if (reportAdvertiserGet == null) {
      synchronized (ReportAdvertiserGet.class) {
        if (reportAdvertiserGet == null) {
          reportAdvertiserGet = (ReportAdvertiserGet) init(ReportAdvertiserGet.class);
        }
      }
    }
    return reportAdvertiserGet;
  }

  public ReportCampaignGet reportCampaignGet() {
    if (reportCampaignGet == null) {
      synchronized (ReportCampaignGet.class) {
        if (reportCampaignGet == null) {
          reportCampaignGet = (ReportCampaignGet) init(ReportCampaignGet.class);
        }
      }
    }
    return reportCampaignGet;
  }

  public ReportAdGet reportAdGet() {
    if (reportAdGet == null) {
      synchronized (ReportAdGet.class) {
        if (reportAdGet == null) {
          reportAdGet = (ReportAdGet) init(ReportAdGet.class);
        }
      }
    }
    return reportAdGet;
  }

  public ReportCreativeGet reportCreativeGet() {
    if (reportCreativeGet == null) {
      synchronized (ReportCreativeGet.class) {
        if (reportCreativeGet == null) {
          reportCreativeGet = (ReportCreativeGet) init(ReportCreativeGet.class);
        }
      }
    }
    return reportCreativeGet;
  }

  @ApiRequestMapping(value = "/report/agent/get_v2/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class ReportAgentGetV2 extends OceanApiRequest<ReportAgentGetV2Request,
    OceanResponse<PageResponseData<ReportAgentGetV2ListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ReportAgentGetV2Request request) {
      Long agentId = request.getAgentId();
      if (agentId != null) {
        localVarQueryParams.addAll(parameterToPair("agent_id", agentId));
      }
      String startDate = request.getStartDate();
      if (startDate != null) {
        localVarQueryParams.addAll(parameterToPair(START_DATE, startDate));
      }
      String endDate = request.getEndDate();
      if (endDate != null) {
        localVarQueryParams.addAll(parameterToPair(END_DATE, endDate));
      }
      Long page = request.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = request.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      ReportAgentGetV2FilteringStruct filtering = request.getReportAgentGetV2Filtering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(filtering)));
      }
    }
  }

  @ApiRequestMapping(value = "/report/advertiser/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class ReportAdvertiserGet extends OceanApiRequest<ReportRequest<ReportAdvertiserGetFilteringStruct>,
    OceanResponse<PageResponseData<ReportAdvertiserGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ReportRequest<ReportAdvertiserGetFilteringStruct> request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      String startDate = request.getStartDate();
      if (startDate != null) {
        localVarQueryParams.addAll(parameterToPair(START_DATE, startDate));
      }
      String endDate = request.getEndDate();
      if (endDate != null) {
        localVarQueryParams.addAll(parameterToPair(END_DATE, endDate));
      }
      List<String> groupBy = request.getGroupBy();
      if (groupBy != null && !groupBy.isEmpty()) {
        localVarQueryParams.addAll(parameterToPair(GROUP_BY, JsonUtil.toJsonString(groupBy)));
      }
      String timeGranularity = request.getTimeGranularity();
      if (timeGranularity != null) {
        localVarQueryParams.addAll(parameterToPair(TIME_GRANULARITY, timeGranularity));
      }
      Long page = request.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = request.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      List<String> fields = request.getFields();
      if (fields != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(fields)));
      }
      ReportAdvertiserGetFilteringStruct filtering = request.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(filtering)));
      }
    }
  }

  @ApiRequestMapping(value = "/report/campaign/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class ReportCampaignGet extends OceanApiRequest<ReportRequest<ReportCampaignGetFilteringStruct>,
    OceanResponse<PageResponseData<ReportCampaignGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ReportRequest<ReportCampaignGetFilteringStruct> request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      String startDate = request.getStartDate();
      if (startDate != null) {
        localVarQueryParams.addAll(parameterToPair(START_DATE, startDate));
      }
      String endDate = request.getEndDate();
      if (endDate != null) {
        localVarQueryParams.addAll(parameterToPair(END_DATE, endDate));
      }
      List<String> groupBy = request.getGroupBy();
      if (groupBy != null && !groupBy.isEmpty()) {
        localVarQueryParams.addAll(parameterToPair(GROUP_BY, JsonUtil.toJsonString(groupBy)));
      }
      String timeGranularity = request.getTimeGranularity();
      if (timeGranularity != null) {
        localVarQueryParams.addAll(parameterToPair(TIME_GRANULARITY, timeGranularity));
      }
      Long page = request.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = request.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      List<String> fields = request.getFields();
      if (fields != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(fields)));
      }
      ReportCampaignGetFilteringStruct filtering = request.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(filtering)));
      }
    }
  }

  @ApiRequestMapping(value = "/report/ad/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class ReportAdGet extends OceanApiRequest<ReportRequest<ReportAdGetFilteringStruct>,
    OceanResponse<PageResponseData<ReportAdGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ReportRequest<ReportAdGetFilteringStruct> request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      String startDate = request.getStartDate();
      if (startDate != null) {
        localVarQueryParams.addAll(parameterToPair(START_DATE, startDate));
      }
      String endDate = request.getEndDate();
      if (endDate != null) {
        localVarQueryParams.addAll(parameterToPair(END_DATE, endDate));
      }
      List<String> groupBy = request.getGroupBy();
      if (groupBy != null && !groupBy.isEmpty()) {
        localVarQueryParams.addAll(parameterToPair(GROUP_BY, JsonUtil.toJsonString(groupBy)));
      }
      String timeGranularity = request.getTimeGranularity();
      if (timeGranularity != null) {
        localVarQueryParams.addAll(parameterToPair(TIME_GRANULARITY, timeGranularity));
      }
      Long page = request.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = request.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      List<String> fields = request.getFields();
      if (fields != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(fields)));
      }
      ReportAdGetFilteringStruct filtering = request.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(filtering)));
      }
    }
  }

  @ApiRequestMapping(value = "/report/creative/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class ReportCreativeGet extends OceanApiRequest<ReportRequest<ReportCreativeGetFilteringStruct>,
    OceanResponse<PageResponseData<ReportCreativeGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ReportRequest<ReportCreativeGetFilteringStruct> request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      String startDate = request.getStartDate();
      if (startDate != null) {
        localVarQueryParams.addAll(parameterToPair(START_DATE, startDate));
      }
      String endDate = request.getEndDate();
      if (endDate != null) {
        localVarQueryParams.addAll(parameterToPair(END_DATE, endDate));
      }
      List<String> groupBy = request.getGroupBy();
      if (groupBy != null && !groupBy.isEmpty()) {
        localVarQueryParams.addAll(parameterToPair(GROUP_BY, JsonUtil.toJsonString(groupBy)));
      }
      String timeGranularity = request.getTimeGranularity();
      if (timeGranularity != null) {
        localVarQueryParams.addAll(parameterToPair(TIME_GRANULARITY, timeGranularity));
      }
      Long page = request.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = request.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      List<String> fields = request.getFields();
      if (fields != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(fields)));
      }
      ReportCreativeGetFilteringStruct filtering = request.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FIELDS, JsonUtil.toJsonString(filtering)));
      }
    }
  }
}
