package test.auth.bean;

import com.google.gson.Gson;
import lombok.Data;

/**
 * @author hyq0719
 * @date 2022/2/25 10:26 上午
 */
@Data
public class AuthToken {
  /**
   * 渠道（腾讯广告）
   */
  private String channel;
  /**
   * 广告主ID
   */
  private String advertiserId;
  /**
   * 授权token
   */
  private String accessToken;
  /**
   * 刷新token
   */
  private String refreshToken;
  /**
   * 创建时间
   */
  private long createTime;
  /**
   * 刷新时间
   */
  private long refreshTime;

  public String key() {
    return channel + ":" + advertiserId;
  }

  public AuthToken newToken(String accessToken, String refreshToken) {
    AuthToken newToken = new AuthToken();
    newToken.setChannel(this.channel);
    newToken.setAdvertiserId(this.advertiserId);
    newToken.setAccessToken(accessToken);
    newToken.setRefreshToken(refreshToken);
    newToken.setCreateTime(this.createTime);
    newToken.setRefreshTime(System.currentTimeMillis());
    return newToken;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
