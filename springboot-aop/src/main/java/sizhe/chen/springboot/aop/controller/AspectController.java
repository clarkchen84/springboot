package sizhe.chen.springboot.aop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sizhe.chen.springboot.aop.bean.Result;

/**
 * @ClassName : AspectController
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-24 07:13
 */
@Slf4j
@RestController
@RequestMapping("aop")
public class AspectController {
    @GetMapping
    public Result aspect(String message) {
        log.info("aspect controller");
        return Result.sucess(message);
    }
}
