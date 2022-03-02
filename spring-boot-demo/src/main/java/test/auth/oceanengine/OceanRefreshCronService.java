package test.auth.oceanengine;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.params.SetParams;
import test.auth.RefreshCronService;
import test.auth.bean.AuthToken;
import test.auth.bean.Result;
import test.auth.repo.RedisTokenRepo;
import test.constant.ChannelConstants;
import test.util.RedisClient;
import test.util.RedisKeys;
import test.util.Util;

import java.util.List;

/**
 * @author hyq0719
 * @date 2022/3/2 4:28 下午
 */
@Slf4j
public class OceanRefreshCronService implements RefreshCronService {
  private final OceanAuthorizer oceanAuthorizer;
  private final OceanProperties oceanProperties;
  private final RedisTokenRepo repo;
  private final RedisClient redis;

  public OceanRefreshCronService(OceanAuthorizer oceanAuthorizer, OceanProperties oceanProperties, RedisTokenRepo repo, RedisClient redis) {
    this.oceanAuthorizer = oceanAuthorizer;
    this.oceanProperties = oceanProperties;
    this.repo = repo;
    this.redis = redis;
  }

  @Override
  public void trigger() {
    try {
      // 尝试加锁，锁超时为 15 分钟
      String locked = redis.execute(jedis -> jedis.set(RedisKeys.refreshLock(channel()), Util.getLocalIp(),
        new SetParams().nx().ex(15 * 60)));
      // 加锁失败直接返回
      if (!"OK".equalsIgnoreCase(locked)) {
        log.info("channel: {} autoRefresh acquire lock fail, skip refresh", channel());
        return;
      }
      log.info("channel: {} start autoRefresh token", channel());
      List<AuthToken> authTokens = repo.findByChannel(channel());
      for (AuthToken authToken : authTokens) {
        Result<AuthToken> result = oceanAuthorizer.refresh(authToken);
        if (result.successful()) {
          repo.saveOrUpdate(result.data());
        }
      }
      log.info("channel: {} autoRefresh token finish", channel());
    } catch (Exception e) {
      log.error("channel: {} autoRefresh token unknown error", channel(), e);
    } finally {
      // 释放锁
      redis.execute(jedis -> jedis.del(RedisKeys.refreshLock(channel())));
    }
  }

  @Override
  public String cron() {
    return oceanProperties.getCron();
  }

  @Override
  public String channel() {
    return ChannelConstants.OCEAN_ENGINE;
  }
}
