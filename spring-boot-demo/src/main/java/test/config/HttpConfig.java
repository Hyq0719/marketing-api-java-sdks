package test.config;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class HttpConfig {
  @Bean(name = "okHttpClient")
  public OkHttpClient okHttpClient() {
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
    builder.connectTimeout(20, TimeUnit.SECONDS);
    builder.readTimeout(20, TimeUnit.SECONDS);
    builder.writeTimeout(20, TimeUnit.SECONDS);
    builder.connectionPool(new ConnectionPool(12, 8, TimeUnit.MINUTES));
    return builder.build();
  }

  @Bean
  public RequestConfig requestConfig() {
    return RequestConfig.custom()
      .setSocketTimeout(20000)
      .setConnectTimeout(20000)
      .setConnectionRequestTimeout(20000)
      .build();
  }

  @Bean(name = "CloseableHttpClient")
  public CloseableHttpClient closeableHttpClient() {
    PoolingHttpClientConnectionManager clientConnectionManager = new PoolingHttpClientConnectionManager();
    clientConnectionManager.setMaxTotal(12);
    clientConnectionManager.setDefaultMaxPerRoute(10);//每个主机最大连接数
    return HttpClients.custom().setConnectionManager(clientConnectionManager).build();
  }

}
