package com.galaxy;

import com.galaxy.bean.*;
import com.galaxy.config.MainConfig;
import com.galaxy.config.MainConfig2;
import com.galaxy.config.MainConfigOfAutowired;
import com.galaxy.dao.BookDao;
import com.galaxy.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/23 23:28
 */
public class IOCTest_Autowired {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);


    public void printBean(AnnotationConfigApplicationContext context) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test04() {
        BookService bean = context.getBean(BookService.class);
        System.out.println(bean);
//        BookDao bean1 = context.getBean(BookDao.class);
//        System.out.println(bean1);
//        BookDao bean1 = context.getBean(BookDao.class);
//        System.out.println(bean1);
    }

    @Test
    public void test06(){
        printBean(context);
        Boss boss = context.getBean(Boss.class);
        System.out.println(boss);
        Car car = context.getBean(Car.class);
        System.out.println(car);
    }

    @Test
    public void test07(){
        printBean(context);
        Color color = context.getBean(Color.class);
        System.out.println(color);
        Car car = context.getBean(Car.class);
        System.out.println(car);

        System.out.println(context);

        Red red = context.getBean(Red.class);
        ApplicationContext context = red.getContext();
        System.out.println(context);
    }


}
