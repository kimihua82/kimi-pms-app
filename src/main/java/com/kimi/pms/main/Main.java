package com.kimi.pms.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2016/4/26.
 */
public class Main {

    public static void mgetain(String [] args){
        Jedis jedis = new Jedis("192.168.10.136");
        jedis.set("aa","bb");
        jedis.del("aa");

    }
}
