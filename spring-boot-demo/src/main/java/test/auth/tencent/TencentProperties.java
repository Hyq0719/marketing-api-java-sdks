package test.auth.tencent;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author hyq0719
 * @date 2022/3/6 10:18 下午
 */
@Component
@Data
@ConfigurationProperties("mktapi.auth.tencent")
public class TencentProperties {
  private String cron;
  @NestedConfigurationProperty
  private Map<String, TencentOAuth2Config> configs;

  @Data
  public static class TencentOAuth2Config {
    private String clientId;
    private String secret;
    private String callbackUrl;
  }
}
