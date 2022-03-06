package test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.auth.oceanengine.OceanAuthorizer;
import test.auth.oceanengine.OceanProperties;
import test.auth.oceanengine.OceanRefreshCronService;
import test.auth.repo.RedisTokenRepo;
import test.auth.tencent.TencentAuthorizer;
import test.auth.tencent.TencentProperties;
import test.auth.tencent.TencentRefreshCronService;
import test.auth.vivo.VivoAuthorizer;
import test.auth.vivo.VivoProperties;
import test.auth.vivo.VivoRefreshCronService;
import test.util.RedisClient;

/**
 * @author hyq0719
 * @date 2022/3/1 4:23 下午
 */
@Configuration
public class RefreshTokenConfiguration {
  @Bean
  public VivoRefreshCronService vivoRefreshCronService(VivoAuthorizer vivoAuthorizer, VivoProperties vivoProperties, RedisTokenRepo repo, RedisClient redis) {
    VivoRefreshCronService refreshCronService = new VivoRefreshCronService(vivoAuthorizer, vivoProperties, repo, redis);
    refreshCronService.run();
    return refreshCronService;
  }

  @Bean
  public OceanRefreshCronService oceanRefreshCronService(OceanAuthorizer oceanAuthorizer, OceanProperties oceanProperties, RedisTokenRepo repo, RedisClient redis) {
    OceanRefreshCronService refreshCronService = new OceanRefreshCronService(oceanAuthorizer, oceanProperties, repo, redis);
    refreshCronService.run();
    return refreshCronService;
  }

  @Bean
  public TencentRefreshCronService tencentRefreshCronService(TencentAuthorizer tencentAuthorizer, TencentProperties tencentProperties, RedisTokenRepo repo, RedisClient redis) {
    TencentRefreshCronService refreshCronService = new TencentRefreshCronService(tencentAuthorizer, tencentProperties, repo, redis);
    refreshCronService.run();
    return refreshCronService;
  }
}
