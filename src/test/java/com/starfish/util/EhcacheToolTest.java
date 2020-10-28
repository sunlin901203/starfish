package com.starfish.util;

import com.starfish.module.cache.Ehcache;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * EhcacheToolTest
 *
 * @author sunny
 * @version 1.0.0
 * @since 2016-05-19
 */
public class EhcacheToolTest {

    @Test
    public void test() {
        String userCount = Ehcache.get("commonCache", String.class, String.class, "userCount");
        assertEquals(userCount, null);

        //设置用户数量100
        Ehcache.put("commonCache", String.class, String.class, "userCount", "100");

        userCount = Ehcache.get("commonCache", String.class, String.class, "userCount");
        assertEquals("100", userCount);

        // 清除
        Ehcache.clear("commonCache", String.class, String.class);
        userCount = Ehcache.get("commonCache", String.class, String.class, "userCount");
        assertEquals(userCount, null);
    }

}
