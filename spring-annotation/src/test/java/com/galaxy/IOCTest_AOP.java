package com.galaxy;

import com.galaxy.aop.MathCaculator;
import com.galaxy.bean.Person;
import com.galaxy.config.MainConfigOfAop;
import com.galaxy.config.MainConfigOfPropertyValue;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/23 23:28
 */
public class IOCTest_AOP {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAop.class);
        MathCaculator mathCaculator = applicationContext.getBean(MathCaculator.class);
        int i = mathCaculator.div(1, 1);
        System.out.println(i);
    }

}
