package test.auth.vivo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author hyq0719
 * @date 2022/2/24 2:19 下午
 */
@Component
@Data
@ConfigurationProperties("mktapi.auth.vivo")
public class VivoProperties {
  private String cron;
  @NestedConfigurationProperty
  private Map<String, VivoOAuth2Config> configs;

  @Data
  public static class VivoOAuth2Config {
    private long clientId;
    private String secret;
  }
}
