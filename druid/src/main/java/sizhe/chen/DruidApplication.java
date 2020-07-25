package sizhe.chen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName : DruidApplication
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-22 21:49
 */
@SpringBootApplication
@MapperScan("sizhe.chen.druid.mapper")
public class DruidApplication {
    public static void main(String[] args) {
        SpringApplication.run(DruidApplication.class,args);
    }
}
