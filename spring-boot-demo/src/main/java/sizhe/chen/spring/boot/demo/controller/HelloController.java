package sizhe.chen.spring.boot.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-16 21:24
 */
@Api
@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return  "hello world";
    }
}
