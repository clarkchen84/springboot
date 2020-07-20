package sizhe.chen.redis;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @ClassName : RedisConfig
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-20 21:26
 */
@Configuration
public class RedisConfig {
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(redisConnectionFactory);
        return  stringRedisTemplate;
    }
}
