package com.hyq0719.spring.starter.mktapi.production.config;

import com.hyq0719.mktapi.common.executor.http.OkhttpHttpHandler;
import com.hyq0719.mktapi.common.token.ITokenCronService;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;
import com.hyq0719.mktapi.tencent.TencentApiClient;
import com.hyq0719.mktapi.tencent.TencentRetryStrategy;
import com.hyq0719.mktapi.tencent.service.TencentSdkService;
import com.hyq0719.mktapi.tencent.token.TencentExternalTokenService;
import com.hyq0719.spring.starter.mktapi.production.properties.SdkProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(SdkProperties.class)
@Import(HttpAutoConfiguration.class)
@Data
@Slf4j
public class TencentAutoConfiguration implements CommandLineRunner {

  private ITokenCronService tencentTrigger;

  @Bean
  public TencentSdkService tencentSdkService(TencentApiClient tencentApiClient, TencentRetryStrategy tencentRetryStrategy) {
    log.info("SDK bulid tencentSdkService, tencentApiClient:{}, tencentRetryStrategy:{}", tencentApiClient, tencentRetryStrategy);
    return new TencentSdkService(tencentApiClient, tencentRetryStrategy);
  }

  @Bean
  public TencentRetryStrategy tencentRetryStrategy(SdkProperties sdkProperties) {
    TencentRetryStrategy tencentRetryStrategy = new TencentRetryStrategy();
    SdkProperties.ChannelConfig tencent = sdkProperties.getTencent();
    if (tencent == null) {
      throw new RuntimeException("tencent properties is null");
    }
    tencentRetryStrategy.setRetryCount(tencent.getRetryCount());
    tencentRetryStrategy.setEnable(tencent.getEnableRetry());
    return tencentRetryStrategy;
  }

  @Bean
  public ITokenLocalCache tencentCache() {
    return new ITokenLocalCache();
  }

  @Bean
  @ConditionalOnMissingBean
  public TencentApiClient tencentApiClient(OkhttpHttpHandler httpClient, TencentExternalTokenService tencentExternalTokenService) {
    if (httpClient == null) {
      throw new RuntimeException("tencent RequestHandler is null");
    }
    if (tencentExternalTokenService == null) {
      throw new RuntimeException("TencentExternalTokenService is null");
    }
    return new TencentApiClient(tencentCache(), httpClient, tencentExternalTokenService);
  }

  @Bean
  public ITokenCronService tencentCronService(TencentExternalTokenService tencentExternalTokenService,
                                              SdkProperties sdkProperties) {
    String cron = sdkProperties.getTencent().getCron();
    if (StringUtils.isEmpty(cron)) {
      throw new RuntimeException("tencent cron is null");
    }
    ITokenCronService simpleCronService = new ITokenCronService(tencentExternalTokenService, tencentCache(),
      sdkProperties.getTencent().getCron());
    simpleCronService.run();
    tencentTrigger = simpleCronService;
    return simpleCronService;
  }

  @Override
  public void run(String... args) {
    log.info("tencentTrigger obj:{}", tencentTrigger);
    try {
      tencentTrigger.trigger();
    } catch (Exception e) {
      log.info("load 数据 tencent failure");
      e.printStackTrace();
      log.info("tencent sdk start run error:{}", e.getMessage());
    }
  }
}
