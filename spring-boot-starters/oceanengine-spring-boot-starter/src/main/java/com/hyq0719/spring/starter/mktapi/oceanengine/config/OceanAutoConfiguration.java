package com.hyq0719.spring.starter.mktapi.oceanengine.config;

import com.hyq0719.mktapi.common.executor.http.OkhttpHttpHandler;
import com.hyq0719.mktapi.common.token.ITokenCronService;
import com.hyq0719.mktapi.common.token.cache.ITokenLocalCache;
import com.hyq0719.mktapi.oceanengine.OceanApiClient;
import com.hyq0719.mktapi.oceanengine.OceanRetryStrategy;
import com.hyq0719.mktapi.oceanengine.service.OceanSdkService;
import com.hyq0719.mktapi.oceanengine.token.OceanExternalTokenService;
import com.hyq0719.spring.starter.mktapi.oceanengine.properties.SdkProperties;
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
public class OceanAutoConfiguration implements CommandLineRunner {

  private ITokenCronService oceanTrigger;

  @Bean
  @ConditionalOnMissingBean
  public OceanSdkService oceanSdkService(OceanApiClient oceanApiClient, OceanRetryStrategy oceanRetryStrategy) {
    log.info("SDK bulid oceanSdkService, oceanApiClient:{},oceanRetryStrategy:{}", oceanApiClient, oceanRetryStrategy);
    return new OceanSdkService(oceanApiClient, oceanRetryStrategy);
  }

  @Bean
  public OceanRetryStrategy oceanRetryStrategy(SdkProperties sdkProperties) {
    OceanRetryStrategy oceanRetryStrategy = new OceanRetryStrategy();
    SdkProperties.ChannelConfig oceanengine = sdkProperties.getOceanengine();
    if (oceanengine == null) {
      throw new RuntimeException("oceanengine properties is null");
    }
    oceanRetryStrategy.setRetryCount(oceanengine.getRetryCount());
    oceanRetryStrategy.setEnable(oceanengine.getEnableRetry());
    return oceanRetryStrategy;
  }

  @Bean
  public ITokenLocalCache oceanCache() {
    return new ITokenLocalCache();
  }

  @Bean
  @ConditionalOnMissingBean
  public OceanApiClient oceanApiClient(OkhttpHttpHandler httpsClient, OceanExternalTokenService oceanExternalTokenService) {
    if (httpsClient == null) {
      throw new RuntimeException("oceanengine RequestHandler is null");
    }
    if (oceanExternalTokenService == null) {
      throw new RuntimeException("OceanExternalTokenService is null");
    }
    return new OceanApiClient(oceanCache(), httpsClient, oceanExternalTokenService);
  }

  @Bean
  public ITokenCronService oceanCronService(OceanExternalTokenService oceanExternalTokenService, SdkProperties sdkProperties) {
    String cron = sdkProperties.getOceanengine().getCron();
    if (StringUtils.isEmpty(cron)) {
      throw new RuntimeException("oceanengine cron is null");
    }
    ITokenCronService simpleCronService = new ITokenCronService(oceanExternalTokenService, oceanCache(),
      sdkProperties.getOceanengine().getCron());
    simpleCronService.run(); // 注册定时器
    oceanTrigger = simpleCronService;
    return simpleCronService;
  }

  @Override
  public void run(String... args) {
    log.info("oceanengine Trigger obj:{}", oceanTrigger);
    try {
      oceanTrigger.trigger();
    } catch (Exception e) {
      e.printStackTrace();
      log.info("oceanengine sdk start run error:{}", e.getMessage());
    }
  }
}
