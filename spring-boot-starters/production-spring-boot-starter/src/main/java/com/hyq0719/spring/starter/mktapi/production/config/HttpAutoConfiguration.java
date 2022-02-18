package com.hyq0719.spring.starter.mktapi.production.config;

import com.hyq0719.mktapi.common.executor.http.ApacheHttpHandler;
import com.hyq0719.mktapi.common.executor.http.OkhttpHttpHandler;
import com.hyq0719.spring.starter.mktapi.production.properties.SdkProperties;
import com.hyq0719.spring.starter.mktapi.production.properties.SdkProperties.NetConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@EnableConfigurationProperties(SdkProperties.class)
@Data
@Slf4j
public class HttpAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public OkhttpHttpHandler okhttpRequestHandler(@Qualifier("okHttpClient") OkHttpClient httpClients) {
    return new OkhttpHttpHandler(httpClients);
  }

  @Bean
  @ConditionalOnMissingBean
  public ApacheHttpHandler httpClientRequestHandler(CloseableHttpClient closeableHttpClient,
                                                    RequestConfig requestConfig) {
    return new ApacheHttpHandler(closeableHttpClient, requestConfig);
  }

  @Bean
  @ConditionalOnMissingBean
  public OkHttpClient okHttpClient(SdkProperties sdkProperties) {
    validateProperties(sdkProperties);
    log.info("开始构建httpClients");
    Builder builder = new Builder();
    builder.connectTimeout(sdkProperties.getNet().getConnectTimeout(), TimeUnit.SECONDS);
    builder.readTimeout(sdkProperties.getNet().getReadTimeout(), TimeUnit.SECONDS);
    builder.writeTimeout(sdkProperties.getNet().getWriteTimeout(), TimeUnit.SECONDS);
    builder.connectionPool(new ConnectionPool(sdkProperties.getNet().getConnectionPool().getMaxIdleConnections(),
      sdkProperties.getNet().getConnectionPool().getKeepAliveDuration(), TimeUnit.MINUTES));
    log.info("结束构建httpClients");
    return builder.build();
  }

  private void validateProperties(SdkProperties sdkProperties) {
    if (sdkProperties == null) {
      throw new RuntimeException("sdkProperties is null");
    }
    NetConfig net = sdkProperties.getNet();
    if (net == null) {
      throw new RuntimeException("sdkProperties -> NetConfig is null");
    }
    if (net.getConnectionPool() == null) {
      throw new RuntimeException("sdkProperties -> NetConfig -> ConnectionPool is null");
    }
    if (net.getConnectionPool() == null) {
      throw new RuntimeException("sdkProperties -> NetConfig -> ConnectionPool is null");
    }
  }

}
