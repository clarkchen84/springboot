package sizhe.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sizhe.chen.lock.RedisLock;

/**
 * @ClassName : RedisLockController
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-20 22:25
 */
@RestController
@RequestMapping("redis-lock")
public class RedisLockController {
    private final long TIME_OUT = 50 * 1000;

    private final String REDIS_LOCK = "REDIS_LOCK";
    @Autowired
    private RedisLock redisLock;

    @GetMapping("/lock")
    public void lock() {

        // 加锁
        long currentTime = System.currentTimeMillis();
        boolean isLock = redisLock.lock(REDIS_LOCK, String.valueOf(currentTime + TIME_OUT));
        if (!isLock) {
            throw new RuntimeException("资源已被抢占，换个姿势再试试吧！");
        }

        // do something

        // 解锁
        redisLock.unLock(REDIS_LOCK);
    }
}
