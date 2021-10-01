package com.galaxy.config;

import com.galaxy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/24 16:54
 */
@Configuration
public class MainConfigOfPropertyValue {
    @Bean
    public Person person(){
        return  new Person();
    }
}
