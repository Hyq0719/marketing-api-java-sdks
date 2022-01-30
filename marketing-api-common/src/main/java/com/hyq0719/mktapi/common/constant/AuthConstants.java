package com.hyq0719.mktapi.common.constant;

public interface AuthConstants {

  /**
   * tencent auth []
   */
  String[] TENCENT_AUTH = new String[]{"accessToken", "nonce", "timestamp"};

  /**
   * ocean engine auth[]
   */
  String[] OCEAN_ENGINE_AUTH = new String[]{"Access-Token"};

  /**
   * kuaishou auth[]
   */
  String[] KUAISHOU_AUTH = new String[]{"Access-Token"};

  /**
   * vivo auth []
   */
  String[] VIVO_AUTH = new String[]{"accessToken", "nonce", "timestamp"};
}
