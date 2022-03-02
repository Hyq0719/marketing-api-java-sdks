package test.token.bean;

import com.hyq0719.mktapi.common.token.IToken;
import lombok.Data;

@Data
public class KshToken implements IToken {
  private String advertiserId;
  private String accessToken;

  public KshToken(String advertiserId, String accessToken) {
    this.advertiserId = advertiserId;
    this.accessToken = accessToken;
  }

  @Override
  public String getTokenKey() {
    return advertiserId;
  }

  @Override
  public String getToken() {
    return accessToken;
  }

  @Override
  public Object getConfig() {
    return null;
  }
}
