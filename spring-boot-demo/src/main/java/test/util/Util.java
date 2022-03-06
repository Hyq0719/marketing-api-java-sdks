package test.util;

import test.auth.bean.AuthToken;
import test.auth.bean.Result;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author hyq0719
 * @date 2022/3/2 3:23 下午
 */
public class Util {
  /**
   * @return 本地IP
   */
  public static String getLocalIp() {
    try {
      return InetAddress.getLocalHost().getHostAddress();
    } catch (UnknownHostException e) {
      e.printStackTrace();
      return "127.0.0.1";
    }
  }

  /**
   * 新增授权测试
   *
   * @param advertiserId 广告主账号
   * @param authCode     授权码
   * @param channel      广告渠道
   * @return 授权token
   */
  public static Result<AuthToken> authorizeForTest(String advertiserId, String authCode, String channel) {
    AuthToken authToken = new AuthToken();
    authToken.setChannel(channel);
    authToken.setAdvertiserId(advertiserId);
    String s = String.valueOf(System.currentTimeMillis());
    authToken.setAccessToken(s);
    authToken.setRefreshToken(s);
    authToken.setCreateTime(System.currentTimeMillis());
    authToken.setRefreshTime(System.currentTimeMillis() + 100000);
    return Result.ofSuccessful(authToken);
  }

  /**
   * 刷新授权测试
   *
   * @param authToken 授权token
   * @return 刷新后的授权token
   */
  public static Result<AuthToken> refreshForTest(AuthToken authToken) {
    String s = String.valueOf(System.currentTimeMillis());
    AuthToken newAuthToken = authToken.newToken("access " + s, "refresh " + s);
    return Result.ofSuccessful(newAuthToken);
  }
}
