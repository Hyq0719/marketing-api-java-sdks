package com.hyq0719.mktapi.common.token;

import cn.hutool.cron.CronUtil;
import cn.hutool.cron.task.Task;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

@Slf4j
public class ITokenCronService implements CronService {

  private ExternalTokenService externalTokenService;

  private volatile ITokenLocalCache iTokenLocalCache;

  private String cron;

  public ITokenCronService(ExternalTokenService externalTokenService, ITokenLocalCache iTokenLocalCache,
                           String cron) {
    this.externalTokenService = externalTokenService;
    this.iTokenLocalCache = iTokenLocalCache;
    this.cron = cron;
  }

  @Override
  public void run() {
    CronUtil.schedule(cron, (Task) () -> {
      try {
        trigger();
      } catch (Exception e) {
        e.printStackTrace();
      }
    });
  }

  @Override
  public void trigger() {
    log.info("externalTokenService obj:{}", externalTokenService);
    List<IToken> iTokens = externalTokenService.refreshAllToken();
    log.info("iTokens is {}", iTokens);
    if (CollectionUtils.isEmpty(iTokens)) {
      log.info("iTokens is Empty");
      return;
    }
    iTokens.forEach(x -> {
      log.info("iTokens item:{}", x);
      if (Objects.nonNull(x)) {
        iTokenLocalCache.put(x.getTokenKey(), x);
      }
    });
  }
}

