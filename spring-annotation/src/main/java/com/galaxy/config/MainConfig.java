package com.galaxy.config;

import com.galaxy.bean.Person;
import org.apache.catalina.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/23 23:19
 */
@Configuration
@ComponentScan(value = "com.galaxy",includeFilters = {
       // @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})},
        useDefaultFilters = false)
public class MainConfig {
    @Bean
    public Person person(){
        return new Person("Hance",19);
    }
}
