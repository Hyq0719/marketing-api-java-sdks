package test.auth.oceanengine;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author hyq0719
 * @date 2022/2/25 3:49 下午
 */
@Component
@Data
@ConfigurationProperties("mktapi.auth.ocean")
public class OceanProperties {
  private String cron;
  @NestedConfigurationProperty
  private Map<String, OceanOAuth2Config> configs;

  @Data
  public static class OceanOAuth2Config {
    private String clientId;
    private String secret;
  }
}
