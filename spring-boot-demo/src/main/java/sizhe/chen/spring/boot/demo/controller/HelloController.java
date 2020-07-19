package sizhe.chen.spring.boot.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-16 21:24
 */
@Api
@Slf4j
@RestController
public class HelloController {
    @ApiOperation(value = "Hello Spring Boot 方法")
    @GetMapping("hello")
    public String hello(@RequestParam(required = false ) @ApiParam("名字") String name){
        if (name == null || "".equals(name)) {
            name = "Spring Boot";
        }
        log.info("hello");
        return "Hello "+name;
    }
}
