package com.galaxy.bean;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/24 14:47
 */
@Component
@AllArgsConstructor
public class Cat implements InitializingBean, DisposableBean {
    private String name;
    @Override
    public void destroy() throws Exception {
        System.out.println("cat destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet");

    }

    public Cat() {
        System.out.println("cat constructor");
    }
}
