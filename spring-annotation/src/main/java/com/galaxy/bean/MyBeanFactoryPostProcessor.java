package com.galaxy.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/26 11:00
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用MyBeanFactoryPostProcessor的postProcessBeanFactory方法");
        BeanDefinition bd = beanFactory.getBeanDefinition("myJavaBean");
        System.out.println("属性值："+bd.getPropertyValues().toString());
        MutablePropertyValues pv = bd.getPropertyValues();
        System.out.println(pv);
        if (pv.contains("remark")){
            pv.addPropertyValue("remark","在MyBeanFactoryPostProcessor把备注信息修改一下");
        }
        bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);
    }
}
