package com.galaxy;

import com.galaxy.bean.Blue;
import com.galaxy.bean.Person;
import com.galaxy.config.MainConfig;
import com.galaxy.config.MainConfig2;
import com.galaxy.config.MainConfigOfPropertyValue;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/23 23:28
 */
public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);
    public void printBean(AnnotationConfigApplicationContext context) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test01() {
        printBean(context);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }



}
