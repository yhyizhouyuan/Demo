package com.galaxy;

import com.galaxy.bean.Blue;
import com.galaxy.bean.ColorFactoryBean;
import com.galaxy.config.MainConfig;
import com.galaxy.config.MainConfig2;
import com.sun.org.apache.xalan.internal.xsltc.dom.CollatorFactoryBase;
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
public class IOCTest {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    @SuppressWarnings("resource")
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    @SuppressWarnings("resource")
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println(name);
//        }
//        Object person = context.getBean("person");
//        Object person2 = context.getBean("person");
//        System.out.println(person == person2);
//
//    }
    }

    @Test
    @SuppressWarnings("resource")
    public void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        String[] beanNamesForType = context.getBeanNamesForType(MainConfig2.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }


    public void printBean(AnnotationConfigApplicationContext context) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test04() {
        printBean(context);
        Blue bean = context.getBean(Blue.class);
        System.out.println(bean);
    }

    @Test
    public void test05(){
        printBean(context);
        Object colorFactoryBean = context.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBean.getClass());
    }

}
