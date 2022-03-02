package com.hyq0719.mktapi.oceanengine.api;

import com.hyq0719.mktapi.common.ApiClient;
import com.hyq0719.mktapi.common.RetryStrategy;
import com.hyq0719.mktapi.common.annotation.ApiRequestMapping;
import com.hyq0719.mktapi.common.constant.RequestConstants;
import com.hyq0719.mktapi.common.executor.parameter.Pair;
import com.hyq0719.mktapi.common.util.JsonUtil;
import com.hyq0719.mktapi.oceanengine.OceanApiRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanRequest;
import com.hyq0719.mktapi.oceanengine.bean.common.OceanResponse;
import com.hyq0719.mktapi.oceanengine.bean.common.PageResponseData;
import com.hyq0719.mktapi.oceanengine.bean.material.*;

import java.io.File;
import java.util.List;
import java.util.Map;

public class MaterialApi extends AbstractOceanApi {
  private volatile FileImageAdvertiser fileImageAdvertiser;
  private volatile FileImageAd fileImageAd;
  private volatile FileVideoAd fileVideoAd;
  private volatile FileImageGet fileImageGet;
  private volatile FileVideoGet fileVideoGet;
  private volatile ToolsVideoCoverSuggest toolsVideoCoverSuggest;
  private volatile FileImageAdGet fileImageAdGet;
  private volatile FileVideoAdGet fileVideoAdGet;
  private volatile FileMaterialBind fileMaterialBind;
  private volatile FileVideoDelete fileVideoDelete;
  private volatile FileVideoUpdate fileVideoUpdate;

  public MaterialApi(ApiClient apiClient,
                     RetryStrategy retryStrategy) {
    super(apiClient, retryStrategy);
  }

  public FileImageAdvertiser fileImageAdvertiser() {
    if (fileImageAdvertiser == null) {
      synchronized (FileImageAdvertiser.class) {
        if (fileImageAdvertiser == null) {
          fileImageAdvertiser = (FileImageAdvertiser) init(FileImageAdvertiser.class);
        }
      }
    }
    return fileImageAdvertiser;
  }

  public FileImageAd fileImageAd() {
    if (fileImageAd == null) {
      synchronized (FileImageAd.class) {
        if (fileImageAd == null) {
          fileImageAd = (FileImageAd) init(FileImageAd.class);
        }
      }
    }
    return fileImageAd;
  }

  public FileVideoAd fileVideoAd() {
    if (fileVideoAd == null) {
      synchronized (FileVideoAd.class) {
        if (fileVideoAd == null) {
          fileVideoAd = (FileVideoAd) init(FileVideoAd.class);
        }
      }
    }
    return fileVideoAd;
  }

  public FileImageGet fileImageGet() {
    if (fileImageGet == null) {
      synchronized (FileImageGet.class) {
        if (fileImageGet == null) {
          fileImageGet = (FileImageGet) init(FileImageGet.class);
        }
      }
    }
    return fileImageGet;
  }

  public FileVideoGet fileVideoGet() {
    if (fileVideoGet == null) {
      synchronized (FileVideoGet.class) {
        if (fileVideoGet == null) {
          fileVideoGet = (FileVideoGet) init(FileVideoGet.class);
        }
      }
    }
    return fileVideoGet;
  }

  public ToolsVideoCoverSuggest toolsVideoCoverSuggest() {
    if (toolsVideoCoverSuggest == null) {
      synchronized (ToolsVideoCoverSuggest.class) {
        if (toolsVideoCoverSuggest == null) {
          toolsVideoCoverSuggest = (ToolsVideoCoverSuggest) init(ToolsVideoCoverSuggest.class);
        }
      }
    }
    return toolsVideoCoverSuggest;
  }

  public FileImageAdGet fileImageAdGet() {
    if (fileImageAdGet == null) {
      synchronized (FileImageAdGet.class) {
        if (fileImageAdGet == null) {
          fileImageAdGet = (FileImageAdGet) init(FileImageAdGet.class);
        }
      }
    }
    return fileImageAdGet;
  }

  public FileVideoAdGet fileVideoAdGet() {
    if (fileVideoAdGet == null) {
      synchronized (FileVideoAdGet.class) {
        if (fileVideoAdGet == null) {
          fileVideoAdGet = (FileVideoAdGet) init(FileVideoAdGet.class);
        }
      }
    }
    return fileVideoAdGet;
  }

  public FileMaterialBind fileMaterialBind() {
    if (fileMaterialBind == null) {
      synchronized (FileMaterialBind.class) {
        if (fileMaterialBind == null) {
          fileMaterialBind = (FileMaterialBind) init(FileMaterialBind.class);
        }
      }
    }
    return fileMaterialBind;
  }

  public FileVideoDelete fileVideoDelete() {
    if (fileVideoDelete == null) {
      synchronized (FileVideoDelete.class) {
        if (fileVideoDelete == null) {
          fileVideoDelete = (FileVideoDelete) init(FileVideoUpdate.class);
        }
      }
    }
    return fileVideoDelete;
  }

  public FileVideoUpdate fileVideoUpdate() {
    if (fileVideoUpdate == null) {
      synchronized (FileVideoUpdate.class) {
        if (fileVideoUpdate == null) {
          fileVideoUpdate = (FileVideoUpdate) init(FileVideoUpdate.class);
        }
      }
    }
    return fileVideoUpdate;
  }

  @ApiRequestMapping(value = "/file/image/advertiser/", method = RequestConstants.POST, contentTypes = {
    RequestConstants.CONTENT_TYPE_MULTIPART_FORM_DATA})
  public class FileImageAdvertiser extends OceanApiRequest<FileImageAdvertiserRequest,
    OceanResponse<FileImageAdvertiserResponseData>> {
    @Override
    public void setFormParam(Map<String, Object> formParamMap, FileImageAdvertiserRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        formParamMap.put(ADVERTISER_ID, advertiserId);
      }
      String uploadType = request.getUploadType();
      if (uploadType != null) {
        formParamMap.put("upload_type", uploadType);
      }
      String imageSignature = request.getImageSignature();
      if (imageSignature != null) {
        formParamMap.put("image_signature", imageSignature);
      }
      String imageUrl = request.getImageUrl();
      if (imageUrl != null) {
        formParamMap.put("image_url", imageUrl);
      }
      File imageFile = request.getImageFile();
      if (imageFile != null) {
        formParamMap.put("image_file", imageFile);
      }
    }
  }

  @ApiRequestMapping(value = "/file/image/ad/", method = RequestConstants.POST, contentTypes = {
    RequestConstants.CONTENT_TYPE_MULTIPART_FORM_DATA})
  public class FileImageAd extends OceanApiRequest<FileImageAdRequest, OceanResponse<FileImageAdResponseData>> {
    @Override
    public void setFormParam(Map<String, Object> formParamMap, FileImageAdRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        formParamMap.put(ADVERTISER_ID, advertiserId);
      }
      String uploadType = request.getUploadType();
      if (uploadType != null) {
        formParamMap.put("upload_type", uploadType);
      }
      String imageSignature = request.getImageSignature();
      if (imageSignature != null) {
        formParamMap.put("image_signature", imageSignature);
      }
      String imageUrl = request.getImageUrl();
      if (imageUrl != null) {
        formParamMap.put("image_url", imageUrl);
      }
      File imageFile = request.getImageFile();
      if (imageFile != null) {
        formParamMap.put("image_file", imageFile);
      }
    }
  }

  @ApiRequestMapping(value = "/file/video/ad/", method = RequestConstants.POST, contentTypes = {
    RequestConstants.CONTENT_TYPE_MULTIPART_FORM_DATA})
  public class FileVideoAd extends OceanApiRequest<FileVideoAdRequest, OceanResponse<FileVideoAdResponseData>> {
    @Override
    public void setFormParam(Map<String, Object> formParamMap, FileVideoAdRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        formParamMap.put(ADVERTISER_ID, advertiserId);
      }
      String filename = request.getFilename();
      if (filename != null) {
        formParamMap.put("filename", filename);
      }
      String videoSignature = request.getVideoSignature();
      if (videoSignature != null) {
        formParamMap.put("video_signature", videoSignature);
      }
      File videoFile = request.getVideoFile();
      if (videoFile != null) {
        formParamMap.put("video_file", videoFile);
      }
    }
  }

  @ApiRequestMapping(value = "/file/image/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class FileImageGet extends OceanApiRequest<OceanRequest<FileImageGetFilteringStruct>,
    OceanResponse<PageResponseData<FileImageGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                OceanRequest<FileImageGetFilteringStruct> oceanRequest) {
      Long advertiserId = oceanRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      Long page = oceanRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = oceanRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      FileImageGetFilteringStruct filtering = oceanRequest.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FILTERING, JsonUtil.toJsonString(filtering)));
      }
    }
  }

  @ApiRequestMapping(value = "/file/video/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class FileVideoGet extends OceanApiRequest<OceanRequest<FileVideoGetFilteringStruct>,
    OceanResponse<PageResponseData<FileVideoGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                OceanRequest<FileVideoGetFilteringStruct> oceanRequest) {
      Long advertiserId = oceanRequest.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      Long page = oceanRequest.getPage();
      if (page != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE, page));
      }
      Long pageSize = oceanRequest.getPageSize();
      if (pageSize != null) {
        localVarQueryParams.addAll(parameterToPair(PAGE_SIZE, pageSize));
      }
      FileVideoGetFilteringStruct filtering = oceanRequest.getFiltering();
      if (filtering != null) {
        localVarQueryParams.addAll(parameterToPair(FILTERING, JsonUtil.toJsonString(filtering)));
      }
    }
  }

  @ApiRequestMapping(value = "/tools/video_cover/suggest/", method = RequestConstants.GET, usePostBody =
    false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class ToolsVideoCoverSuggest extends OceanApiRequest<ToolsVideoCoverSuggestRequest,
    OceanResponse<ToolsVideoCoverSuggestResponseData>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                ToolsVideoCoverSuggestRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      String videoId = request.getVideoId();
      if (videoId != null) {
        localVarQueryParams.addAll(parameterToPair("video_id", advertiserId));
      }
    }
  }

  /**
   * 官方文档response有误
   */
  @ApiRequestMapping(value = "/file/image/ad/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class FileImageAdGet extends OceanApiRequest<FileImageAdGetRequest,
    OceanResponse<PageResponseData<FileImageGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                FileImageAdGetRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      List<String> imageIds = request.getImageIds();
      if (imageIds != null) {
        localVarQueryParams.addAll(parameterToPair("image_ids", JsonUtil.toJsonString(imageIds)));
      }
    }
  }

  /**
   * 官方文档response有误
   */
  @ApiRequestMapping(value = "/file/video/ad/get/", method = RequestConstants.GET, usePostBody = false,
    contentTypes = {RequestConstants.CONTENT_TYPE_TEXT_PLAIN})
  public class FileVideoAdGet extends OceanApiRequest<FileVideoAdGetRequest,
    OceanResponse<PageResponseData<FileVideoGetListStruct>>> {
    @Override
    public void setRequestParam(List<Pair> localVarQueryParams, List<Pair> localVarCollectionQueryParams,
                                FileVideoAdGetRequest request) {
      Long advertiserId = request.getAdvertiserId();
      if (advertiserId != null) {
        localVarQueryParams.addAll(parameterToPair(ADVERTISER_ID, advertiserId));
      }
      List<String> videoIds = request.getVideoIds();
      if (videoIds != null) {
        localVarQueryParams.addAll(parameterToPair("video_ids", JsonUtil.toJsonString(videoIds)));
      }
    }
  }

  @ApiRequestMapping(value = "/file/material/bind/", method = RequestConstants.POST, contentTypes = {
    RequestConstants.CONTENT_TYPE_JSON})
  public class FileMaterialBind extends OceanApiRequest<FileMaterialBindRequest,
    OceanResponse<FileMaterialBindResponseData>> {
  }

  @ApiRequestMapping(value = "/file/video/delete/", method = RequestConstants.POST, contentTypes = {
    RequestConstants.CONTENT_TYPE_JSON})
  public class FileVideoDelete extends OceanApiRequest<FileVideoDeleteRequest,
    OceanResponse<FileVideoDeleteResponseData>> {
  }

  @ApiRequestMapping(value = "/file/video/update/", method = RequestConstants.POST, contentTypes = {
    RequestConstants.CONTENT_TYPE_JSON})
  public class FileVideoUpdate extends OceanApiRequest<FileVideoUpdateRequest,
    OceanResponse<FileVideoUpdateResponseData>> {
  }
}
