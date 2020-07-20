package sizhe.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-20 21:29
 */
@RestController
@RequestMapping(("/hello"))
public class HelloController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("")
    public String hello(){
        // 向 Redis 中添加一个 key 为 hello，Value 为 world 的记录
        stringRedisTemplate.opsForValue().set("hello","world");

        // 获取 Redis 中 key 为 hello 的值
        return stringRedisTemplate.opsForValue().get("hello");
    }
}
