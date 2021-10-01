package com.galaxy;

import com.galaxy.bean.Cat;
import com.galaxy.bean.MyJavaBean;
import com.galaxy.bean.MyProcessor;
import com.galaxy.config.MainConfigOfProcessor;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/26 11:18
 */
public class IOCTest_Processor {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProcessor.class);
        MyJavaBean myJavaBean = applicationContext.getBean(MyJavaBean.class);
        System.out.println("======下面是输出结果");
        System.out.println("描述：" + myJavaBean.getDesc());
        System.out.println("备注：" + myJavaBean.getRemark());
        Cat bean = applicationContext.getBean(Cat.class);
        System.out.println(bean);

    }

    @Test
    public void testProcessor(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProcessor.class);
        MyProcessor bean = applicationContext.getBean(MyProcessor.class);
        ApplicationContext applicationContext1 = bean.getApplicationContext();
        System.out.println(applicationContext1);
        System.out.println(applicationContext);
    }
}
