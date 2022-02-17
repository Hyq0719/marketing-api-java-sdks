package test.token;

import com.hyq0719.mktapi.common.token.IToken;
import lombok.Data;

@Data
public class KshTokenImpl implements IToken {
  private String advertiserId;
  private String accessToken;

  public KshTokenImpl(String advertiserId, String accessToken) {
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
