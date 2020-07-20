package sizhe.chen.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import sizhe.chen.swagger.cofing.SwaggerConfig;

/**
 * @ClassName : MybatisApplication
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-19 20:18
 */
@SpringBootApplication
@MapperScan("sizhe.chen.spring.mybatis.mapper")
@Import(SwaggerConfig.class)
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class,args);
    }
}
