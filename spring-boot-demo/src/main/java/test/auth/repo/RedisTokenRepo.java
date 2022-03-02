package test.auth.repo;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;
import test.auth.bean.AuthToken;
import test.util.RedisClient;
import test.util.RedisKeys;

import java.util.ArrayList;
import java.util.List;

/**
 * redis存储token
 *
 * @author hyq0719
 * @date 2022/3/1 2:39 下午
 */
@Repository
public class RedisTokenRepo {
  private final RedisClient redis;

  public RedisTokenRepo(RedisClient redis) {
    this.redis = redis;
  }

  /**
   * 存储、更新token
   *
   * @param authToken 授权token
   * @return 是否更新成功
   */
  public boolean saveOrUpdate(AuthToken authToken) {
    Gson gson = new Gson();
    long save = redis.execute(jedis -> jedis.hset(RedisKeys.authToken(authToken.getChannel()), authToken.getAdvertiserId(),
      gson.toJson(authToken)));
    return save == 1L;
  }

  /**
   * 删除token
   *
   * @param channel      广告渠道
   * @param advertiserId 广告主账号
   * @return 是否删除成功
   */
  public boolean delete(String channel, String advertiserId) {
    long delete = redis.execute(jedis -> jedis.hdel(RedisKeys.authToken(channel), advertiserId));
    return delete == 1L;
  }

  public boolean delete(AuthToken authToken) {
    return delete(authToken.getChannel(), authToken.getAdvertiserId());
  }

  /**
   * 获取token
   *
   * @param channel      广告渠道
   * @param advertiserId 广告主账号
   * @return 授权token
   */
  public AuthToken get(String channel, String advertiserId) {
    String data = redis.execute(jedis -> jedis.hget(RedisKeys.authToken(channel), advertiserId));
    if (StringUtils.isEmpty(data)) {
      return null;
    }
    return new Gson().fromJson(data, AuthToken.class);
  }

  /**
   * 按照渠道批量获取token
   *
   * @param channel 广告渠道
   * @return token list
   */
  public List<AuthToken> findByChannel(String channel) {
    List<String> datas = redis.execute(jedis -> jedis.hvals(RedisKeys.authToken(channel)));
    List<AuthToken> tokens = new ArrayList<>(datas.size());
    for (String data : datas) {
      tokens.add(new Gson().fromJson(data, AuthToken.class));
    }
    return tokens;
  }
}
