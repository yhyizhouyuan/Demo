package com.galaxy.config;

import com.galaxy.bean.Car;
import com.galaxy.bean.Cat;
import com.galaxy.bean.Dog;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/24 12:23
 */
@Configuration
@ComponentScan("com.galaxy.bean")
public class MainConfigOfLifeCycle {
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }
    @Bean
    public Dog dog (){
        return new Dog();
    }
}
