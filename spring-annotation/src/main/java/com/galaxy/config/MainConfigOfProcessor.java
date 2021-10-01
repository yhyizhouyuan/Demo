package com.galaxy.config;

import com.galaxy.bean.*;
import org.springframework.boot.autoconfigure.cache.CacheType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/26 10:58
 */
@Configuration
public class MainConfigOfProcessor {
    @Bean(initMethod = "initMethod")
    //@Lazy(value = false)
    //@Bean
    public MyJavaBean myJavaBean(){
        return new MyJavaBean("原始：描述测试一下","原始：这里是备注信息");
    }

    @Bean
    public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }
    @Bean
    public Cat cat(){
        return new Cat("tom");
    }
    @Bean
    public MyProcessor myProcessor(){
        return new MyProcessor();
    }
}
