package sizhe.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import sizhe.chen.swagger.cofing.SwaggerConfig;

/**
 * @ClassName : DemoApplication
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-16 21:01
 */
@SpringBootApplication
@Import(SwaggerConfig.class)
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
