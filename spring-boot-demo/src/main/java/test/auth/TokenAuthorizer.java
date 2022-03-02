package test.auth;

import test.auth.bean.AuthToken;
import test.auth.bean.Result;

import java.util.Map;

/**
 * @author hyq0719
 * @date 2022/3/1 2:43 下午
 */
public interface TokenAuthorizer {
  /**
   * @return 广告渠道
   */
  String channel();

  /**
   * 解析新增授权参数
   *
   * @param params 新增授权参数
   * @return 授权码
   */
  Result<String> parseAuthCode(Map<String, String> params);

  /**
   * 新增授权广告主
   *
   * @param advertiserId 广告主账号
   * @param authCode     授权码
   * @return 授权token
   */
  Result<AuthToken> authorize(String advertiserId, String authCode);

  /**
   * 刷新授权token
   *
   * @param authToken 授权token
   * @return 刷新后的授权token
   */
  Result<AuthToken> refresh(AuthToken authToken);

  /**
   * 是否开启调试模式，调试模式只模拟刷新授权token
   */
  boolean isDebugMode();
}
