package sizhe.chen.spring.boot.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import sizhe.chen.spring.boot.demo.interceptor.LogInterceptor;

/**
 * @ClassName : MvcCofing
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-18 21:43
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LogInterceptor interceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
