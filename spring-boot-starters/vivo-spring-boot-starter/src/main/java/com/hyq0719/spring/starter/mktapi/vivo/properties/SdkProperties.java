package com.hyq0719.spring.starter.mktapi.vivo.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("mktapi.sdk")
public class SdkProperties {
  private NetConfig net; // net配置
  private ChannelConfig vivo; // vivo商业开放平台

  @Data
  public static class NetConfig {
    private Integer connectTimeout = 20;
    private Integer readTimeout = 20;
    private Integer writeTimeout = 20;
    private ConnectionPool connectionPool;
  }

  @Data
  public static class ConnectionPool {
    private Integer maxIdleConnections = 12;
    private Integer keepAliveDuration = 8;
  }

  @Data
  public static class ChannelConfig {
    private Boolean enableRetry = true;
    private Integer retryCount = 3;
    private String cron;
  }


}
