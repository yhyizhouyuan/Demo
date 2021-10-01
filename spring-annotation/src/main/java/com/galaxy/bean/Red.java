package com.galaxy.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/25 8:48
 */
@Component
@Data
public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {
    private ApplicationContext context;

    @Override
    public void setBeanName(String name) {
        System.out.println("当前bean的名字：" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的IOC容器：" + applicationContext);
        this.context = applicationContext;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String resolveStringValue = resolver.resolveStringValue("你好${os.name}");
        System.out.println("解析的字符串：" + resolveStringValue);
    }
}
