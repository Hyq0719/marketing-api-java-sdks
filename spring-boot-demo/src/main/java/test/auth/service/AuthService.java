package test.auth.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import test.auth.TokenAuthorizer;
import test.auth.bean.AuthToken;
import test.auth.bean.Result;
import test.auth.repo.RedisTokenRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 认证授权服务
 *
 * @author hyq0719
 * @date 2022/2/24 3:30 下午
 */
@Slf4j
@Service
public class AuthService implements ApplicationContextAware {
  private final RedisTokenRepo repo;
  private final Map<String, TokenAuthorizer> authorizerMap = new HashMap<>();

  public AuthService(RedisTokenRepo repo) {
    this.repo = repo;
  }

  public AuthToken getToken(String channel, String advertiserId) {
    return repo.get(channel, advertiserId);
  }

  public List<AuthToken> getTokenByChannel(String channel) {
    return repo.findByChannel(channel);
  }

  /**
   * 新增授权广告主账号
   *
   * @param channel      广告渠道
   * @param advertiserId 广告主账号
   * @param params       新增授权参数
   * @return 授权结果和token
   */
  public Result<AuthToken> create(String channel, String advertiserId, Map<String, String> params) {
    TokenAuthorizer authorizer = authorizerMap.get(channel);
    if (authorizer == null) {
      log.error("create AuthToken fail, no TokenAuthorizer found. channel: {}", channel);
      return Result.ofFail();
    }

    Result<String> authCode = authorizer.parseAuthCode(params);
    if (!authCode.successful()) {
      return Result.ofFail();
    }

    Result<AuthToken> authToken = authorizer.authorize(advertiserId, authCode.data());
    if (!authToken.successful()) {
      log.error("authorize AuthToken fail: {}", authToken.data());
      return authToken;
    }
    repo.saveOrUpdate(authToken.data());
    log.info("create AuthToken finish. token: {}", authToken.data());
    return authToken;
  }

  /**
   * 刷新渠道授权
   *
   * @param channel 广告渠道
   * @return Map<AuthTok授权token, 是否刷新成功>
   */
  public Map<AuthToken, Boolean> refreshForChannel(String channel) {
    Map<AuthToken, Boolean> refreshTokens = new HashMap<>();
    List<AuthToken> authTokens = repo.findByChannel(channel);

    if (CollectionUtils.isEmpty(authTokens)) {
      log.warn("refreshForChannel : no token found for {}", channel);
      return refreshTokens;
    }
    log.info("refreshForChannel for {}", channel);
    TokenAuthorizer authorizer = authorizerMap.get(channel);
    for (AuthToken authToken : authTokens) {
      Result<AuthToken> tokenResult = authorizer.refresh(authToken);
      if (tokenResult.successful()) {
        repo.saveOrUpdate(tokenResult.data());
      }
      refreshTokens.put(tokenResult.data(), tokenResult.successful());
    }
    return refreshTokens;
  }

  /**
   * 刷新渠道授权
   *
   * @param channel      广告渠道
   * @param advertiserId 广告主账号
   * @return 刷新结果和token
   */
  public Result<AuthToken> refreshForAdvertiser(String channel, String advertiserId) {
    List<AuthToken> authTokens = repo.findByChannel(channel);
    if (StringUtils.isEmpty(advertiserId)) {
      log.warn("refreshForAdvertiser : advertiserId null");
      return Result.ofFail();
    }
    AuthToken target = null;
    for (AuthToken authToken : authTokens) {
      if (advertiserId.equals(authToken.getAdvertiserId())) {
        target = authToken;
      }
    }
    if (Objects.isNull(target)) {
      log.warn("refreshForChannel : no token found for {} : {}", channel, advertiserId);
      return Result.ofFail();
    }
    TokenAuthorizer authorizer = authorizerMap.get(channel);
    Result<AuthToken> tokenResult = authorizer.refresh(target);
    if (tokenResult.successful()) {
      repo.saveOrUpdate(tokenResult.data());
      return tokenResult;
    }
    return Result.ofFail();
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    Map<String, TokenAuthorizer> authorizers = applicationContext.getBeansOfType(TokenAuthorizer.class);
    for (TokenAuthorizer authorizer : authorizers.values()) {
      this.authorizerMap.put(authorizer.channel(), authorizer);
      log.info("TokenAuthorizer registered {} {}", authorizer.channel(), authorizer.getClass().getName());
    }
  }
}
