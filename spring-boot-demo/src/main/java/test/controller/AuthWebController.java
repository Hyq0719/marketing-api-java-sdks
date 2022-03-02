package test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import test.AppProperties;
import test.auth.bean.AuthToken;
import test.auth.bean.Result;
import test.auth.service.AuthService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author hyq0719
 * @date 2022/3/1 4:29 下午
 */
@Slf4j
@RestController
@RequestMapping("auth")
@Api(tags = "---统一认证授权---")
public class AuthWebController {
  @Resource
  private AuthService authService;
  @Resource
  private AppProperties appProperties;

  public boolean isSupportChannel(String channel) {
    return appProperties.getChannels().contains(channel);
  }

  /**
   * 获取广告主token
   *
   * @param channel      广告渠道（腾讯广告、巨量引擎等）
   * @param advertiserId 广告主id
   * @return
   */
  @ApiOperation("获取广告主token")
  @GetMapping("/getToken/{channel}/{advertiserId}")
  public AuthToken getToken(@PathVariable("channel") String channel, @PathVariable("advertiserId") String advertiserId) {
    if (!isSupportChannel(channel)) {
      return null;
    }
    return authService.getToken(channel, advertiserId);
  }

  /**
   * 批量获取渠道广告主账号
   *
   * @param channel 广告渠道（腾讯广告、巨量引擎等）
   * @return
   */
  @ApiOperation("批量获取渠道广告主账号")
  @GetMapping("/getTokenByChannel/{channel}")
  public List<AuthToken> getTokenByChannel(@PathVariable("channel") String channel) {
    if (!isSupportChannel(channel)) {
      return new ArrayList<>();
    }
    return authService.getTokenByChannel(channel);
  }

  /**
   * 通过 OAuth2 的 code 添加广告主账号
   *
   * @param channel      广告渠道（腾讯广告、巨量引擎等）
   * @param advertiserId 广告主id
   * @param params       请求参数
   * @return
   */
  @ApiOperation("添加广告主账号")
  @PostMapping("/addAdvertiser/{channel}/{advertiserId}")
  public Object findTokenByChannel(@PathVariable("channel") String channel, @PathVariable("advertiserId") String advertiserId,
                                   @RequestBody Map<String, String> params) {
    log.info("receive add advertiser request. channel: {} product: {} params: {}", channel, advertiserId, params);

    if (!isSupportChannel(channel)) {
      return "unsupported channel: " + channel;
    }
    Result<AuthToken> result = authService.create(channel, advertiserId, params);
    return result.successful() ? "Success" : "Fail";
  }

  /**
   * 手动刷新渠道授权
   *
   * @param channel 广告渠道（腾讯广告、巨量引擎等）
   * @return
   */
  @ApiOperation("手动刷新授权")
  @GetMapping("/refreshAuthToken/{channel}")
  public Object refreshAuthToken(@PathVariable("channel") String channel) {
    log.info("receive refresh auth token request. channel: {}", channel);

    if (!isSupportChannel(channel)) {
      return "unsupported channel: " + channel;
    }
    return authService.refreshForChannel(channel);
  }
}
