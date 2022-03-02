package test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import test.util.RedisClient;


@Slf4j
@SpringBootApplication(scanBasePackages = {"test"})
public class MarketingApiTestApp {

  public static void main(String[] args) {
    SpringApplication.run(MarketingApiTestApp.class, args);
  }

  @Bean(destroyMethod = "close")
  public RedisClient redisClient(AppProperties appProp) {
    AppProperties.RedisClientProperties redisProp = appProp.getRedisClient();
    RedisClient redisClient = new RedisClient(redisProp);
    log.info("Connected to redis {}", redisProp);
    return redisClient;
  }
}
