package sizhe.chen.lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName : RedisLock1
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-20 22:21
 */
@Component
public class RedisLock {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public boolean lock(String key, String value) {
        return stringRedisTemplate.opsForValue().setIfAbsent(key, value);
    }
    public boolean lockV2(String key, String value,Long timeOut) {
        return stringRedisTemplate.opsForValue().setIfAbsent(key, value, timeOut, TimeUnit.MILLISECONDS);
    }
    public void unLockV2(String key, String value) {
        String oldValue = stringRedisTemplate.opsForValue().get(key);
        if (Objects.nonNull(oldValue) && oldValue.equals(value)) {
            stringRedisTemplate.delete(key);
        }
    }
    public void unLock(String key) {
        stringRedisTemplate.delete(key);
    }
}
