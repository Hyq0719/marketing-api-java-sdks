package test.util;

/**
 * @author hyq0719
 * @date 2022/3/1 2:58 下午
 */
public class RedisKeys {
  /**
   * AuthToken使用hash存储，格式为：
   * {
   * auth.token:${channel} : {
   * advertiserId1 : json(AuthToken1},
   * advertiserId2 : json(AuthToken2}
   * }
   * }
   *
   * @param channel 广告渠道
   * @return json(AuthToken }
   */
  public static String authToken(String channel) {
    return "auth.token:" + channel;
  }

  public static String refreshLock(String channel) {
    return "auth.refresh.lock:" + channel;
  }
}
