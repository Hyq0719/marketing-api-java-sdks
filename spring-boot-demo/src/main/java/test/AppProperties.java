package test;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author hyq0719
 * @date 2022/2/24 3:36 下午
 */
@Data
@Component
@ConfigurationProperties("app")
public class AppProperties {
  private boolean debugMode;
  private RedisClientProperties redisClient;
  private Set<String> channels;

  /**
   * RedisClient 配置
   */
  @Data
  public static class RedisClientProperties {
    private String host;
    private int port;
    private String password;
    /**
     * 使用的 DB，默认为 0
     */
    private int db = 0;
    /**
     * 连接超时时间（毫秒）
     */
    private int connectTimeoutMs = 1000;
    /**
     * 连接池最大数量
     */
    private int poolMaxSize = 64;
    /**
     * 连接池最大空闲连接数
     */
    private int poolMaxIdle = 8;
    /**
     * 从连接池获取连接最长等待时间（毫秒）
     */
    private int poolMaxWaitMs = 500;
  }

}
