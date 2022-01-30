package com.hyq0719.mktapi.common.token.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalCache<K, V> {

  private Map<K, V> cache = new ConcurrentHashMap<>();

  public void put(K key, V value) {
    cache.put(key, value);
  }

  public V get(K key) {
    return cache.get(key);
  }
}
