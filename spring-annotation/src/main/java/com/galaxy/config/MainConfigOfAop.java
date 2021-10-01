package com.galaxy.config;

import com.galaxy.aop.LogAspects;
import com.galaxy.aop.MathCaculator;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/25 16:31
 */
@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAop {
    @Bean
    public MathCaculator mathCaculator(){
        return new MathCaculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
