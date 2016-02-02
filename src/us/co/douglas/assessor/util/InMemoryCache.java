package us.co.douglas.assessor.util;

/**
 * Created by mdronamr on 12/29/15.
 */

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.LRUMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;

public class InMemoryCache<K, T> {
    private static Log log = LogFactory.getLog(InMemoryCache.class);
    private static LRUMap cacheMap;

    public static LRUMap getCacheMap() {
        if (cacheMap == null){
            synchronized(InMemoryCache.class){
                if(cacheMap == null){
                    log.info("Creating cacheMap...");
                    cacheMap = new LRUMap();
                }
            }
        }
        return cacheMap ;
    }

    public InMemoryCache() {
        log.info("InMemoryCache...");
        cacheMap = new LRUMap();
    }

    public void put(K key, T value) {
        synchronized (cacheMap) {
            log.info("Putting in cache...");
            cacheMap.put(key, value);
        }
    }

    public T get(K key) {
        synchronized (cacheMap) {
            return (T) cacheMap.get(key);
        }
    }
}
