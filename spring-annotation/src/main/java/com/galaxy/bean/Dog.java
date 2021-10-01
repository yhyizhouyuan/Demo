package com.galaxy.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/24 15:08
 */
public class Dog implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    public Dog() {
        System.out.println("dog constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("dog...init");
    }

    @PreDestroy
    public void destory(){
        System.out.println("dog...destory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
