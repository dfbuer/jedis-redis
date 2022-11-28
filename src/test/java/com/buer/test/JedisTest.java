package com.buer.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {

    @Test
    public void JedisTest(){

        //获取连接
        Jedis jedis = new Jedis("localhost",6379);

        //执行操作
        jedis.set("name","zukedegou");

        //关闭连接
        jedis.close();
    }
}
