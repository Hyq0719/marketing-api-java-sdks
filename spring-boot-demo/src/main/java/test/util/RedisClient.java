package test.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.params.ScanParams;
import redis.clients.jedis.resps.ScanResult;
import test.AppProperties;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author hyq0719
 * @date 2022/2/24 3:40 下午
 */
@Slf4j
public class RedisClient implements Closeable {
  private final JedisPool pool;

  public RedisClient(AppProperties.RedisClientProperties redisProps) {
    JedisPoolConfig poolConfig = new JedisPoolConfig();
    poolConfig.setMaxTotal(redisProps.getPoolMaxSize());
    poolConfig.setMaxIdle(redisProps.getPoolMaxIdle());
    poolConfig.setMaxWaitMillis(redisProps.getPoolMaxWaitMs());
    this.pool = new JedisPool(poolConfig, redisProps.getHost(), redisProps.getPort(), redisProps.getConnectTimeoutMs(),
      redisProps.getPassword(), redisProps.getDb());
  }

  public static Map<String, Map<String, String>> parseInfo(String infoString) {
    if (StringUtils.isEmpty(infoString)) {
      return Collections.emptyMap();
    }

    Map<String, Map<String, String>> infoData = new LinkedHashMap<>();
    Map<String, String> sectionData = null;

    try (BufferedReader reader = new BufferedReader(new StringReader(infoString))) {
      String line = null;
      while ((line = reader.readLine()) != null) {
        line = line.trim();
        if (StringUtils.isEmpty(line)) {
          continue;
        }

        // 解析 Section
        if (line.charAt(0) == '#') {
          String sectionName = line.split(" ", 2)[1];
          sectionData = new LinkedHashMap<>();
          infoData.put(sectionName, sectionData);
          continue;
        }

        // 解析 Section 下的普通数据
        String[] fields = line.split(":", 2);
        if (fields.length != 2) {
          sectionData.put(line, "parse fail");
        } else {
          sectionData.put(fields[0], fields[1]);
        }
      }

    } catch (IOException e) {
      // 对于 StringReader 不会出现 IOException
      throw new RuntimeException(e);
    }

    return infoData;
  }

  /**
   * 执行pipeline且不需要返回值
   *
   * @param action
   */
  public void pipeNoReturn(Consumer<Pipeline> action) {
    try (Jedis jedis = pool.getResource()) {
      Pipeline pipe = jedis.pipelined();
      action.accept(pipe);
      pipe.sync();
    }
  }

  /**
   * 执行pipeline且需要返回值
   *
   * @param action
   * @return
   */
  public List<Object> pipeWithReturn(Consumer<Pipeline> action) {
    try (Jedis jedis = pool.getResource()) {
      Pipeline pipe = jedis.pipelined();
      action.accept(pipe);
      return pipe.syncAndReturnAll();
    }
  }

  /**
   * 获取简单格式化后的 info 数据
   *
   * @return
   */
  public Map<String, Map<String, String>> info() {
    String rawData = execute(Jedis::info);
    return parseInfo(rawData);
  }

  /**
   * 获取指定 section 的简单格式化后的 info 数据
   *
   * @param sectionName
   * @return
   */
  public Map<String, Map<String, String>> info(String sectionName) {
    String rawData = execute(jedis -> jedis.info(sectionName));
    return parseInfo(rawData);
  }

  /**
   * 根据pattern执行删除操作
   *
   * @param pattern
   * @return
   */
  public int clean(String pattern) {
    return clean(pattern, 2000);
  }

  /**
   * 根据pattern执行删除操作
   *
   * @param pattern
   * @param batch
   * @return
   */
  public int clean(String pattern, int batch) {
    return scan(pattern, batch, (keys) -> {
      String[] deletedKeys = keys.toArray(new String[0]);
      execute((jedis) -> jedis.del(deletedKeys));
    });
  }

  /**
   * 根据pattern迭代遍历所有key
   *
   * @param pattern
   * @param batch
   * @param action
   * @return
   */
  public int scan(String pattern, int batch, Consumer<List<String>> action) {
    ScanParams params = new ScanParams();
    params.count(batch);
    params.match(pattern);

    int totalSize = 0;
    ScanResult<String> result = execute((jedis) -> jedis.scan(ScanParams.SCAN_POINTER_START, params));
    while (true) {
      List<String> keys = result.getResult();
      totalSize += keys.size();

      action.accept(keys);

      String cursor = result.getCursor();
      if (ScanParams.SCAN_POINTER_START.equals(cursor)) {
        break;
      }

      result = execute((jedis) -> jedis.scan(cursor, params));
    }
    return totalSize;
  }

  /**
   * 执行一次操作
   *
   * @param action
   * @param <T>
   * @return
   */
  public <T> T execute(Function<Jedis, T> action) {
    try (Jedis jedis = pool.getResource()) {
      return action.apply(jedis);
    }
  }

  @Override
  public void close() throws IOException {
    try {
      if (pool != null) {
        pool.close();
      }
    } catch (Exception e) {
      log.error("close redis pool: error", e);
    }
  }
}
