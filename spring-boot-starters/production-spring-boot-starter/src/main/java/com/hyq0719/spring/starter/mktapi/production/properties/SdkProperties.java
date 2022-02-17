package com.hyq0719.spring.starter.mktapi.production.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("mktapi.sdk")
public class SdkProperties {
  private NetConfig net; // 网络配置
  private ChannelConfig tencent; // 腾讯广告
  private ChannelConfig kuaishou; // 磁力引擎
  private ChannelConfig oceanengine; // 巨量引擎
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
