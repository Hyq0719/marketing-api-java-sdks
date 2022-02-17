package test.token;

import com.hyq0719.mktapi.common.token.IToken;
import lombok.Data;

@Data
public class TencentTokenImpl implements IToken {

  private String accessToken;
  private String accountId;

  public TencentTokenImpl(String accessToken, String accountId) {
    this.accessToken = accessToken;
    this.accountId = accountId;
  }

  @Override
  public String getTokenKey() {
    return accountId;
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
