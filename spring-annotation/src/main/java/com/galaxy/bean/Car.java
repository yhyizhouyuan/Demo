package com.galaxy.bean;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/24 12:23
 */
@Component
public class Car {
    public Car(){
        System.out.println("car constructor");
    }
    public void init(){
        System.out.println("init");
    }
    public void destory(){
        System.out.println("destory");
    }
}
