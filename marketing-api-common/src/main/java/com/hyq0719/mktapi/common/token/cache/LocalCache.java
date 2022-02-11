package com.hyq0719.mktapi.common.token.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalCache<K, V> {

  /**
   * 存放token，保证线程安全
   */
  private Map<K, V> cache = new ConcurrentHashMap<>();

  /**
   * 存token
   * @param key token key
   * @param value token值
   */
  public void put(K key, V value) {
    cache.put(key, value);
  }

  /**
   * 取token
   * @param key token key
   * @return token值
   */
  public V get(K key) {
    return cache.get(key);
  }
}
