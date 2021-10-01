package com.galaxy;

import com.galaxy.bean.Boss;
import com.galaxy.bean.Car;
import com.galaxy.bean.Color;
import com.galaxy.bean.Red;
import com.galaxy.config.MainConfigOfAutowired;
import com.galaxy.config.MainConfigOfProfile;
import com.galaxy.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/23 23:28
 */
public class IOCTest_Profiles {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);


    public void printBean(AnnotationConfigApplicationContext context) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test04() {
        String[] beanNamesForType = context.getBeanNamesForType(Red.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }

    @Test
    public void test(){
       AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("test");
        annotationConfigApplicationContext.register(MainConfigOfProfile.class);
        //printBean(context);
        annotationConfigApplicationContext.refresh();

        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(DataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }


}
