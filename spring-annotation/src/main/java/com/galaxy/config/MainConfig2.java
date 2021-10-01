package com.galaxy.config;

import com.galaxy.bean.ColorFactoryBean;
import com.galaxy.bean.Person;
import com.galaxy.bean.Teacher;
import com.galaxy.bean.User;
import com.galaxy.condition.LinuxCondition;
import com.galaxy.condition.MyImportBeanDefinitionRegistrar;
import com.galaxy.condition.MyImportSelector;
import com.galaxy.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/24 8:28
 */
@Configuration
@Import({User.class, Teacher.class, MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    /***
     * <p>TODO</p>
     *
     * @return {@link Person} TODO
     * @author Hance
     * @date 2021/9/24 8:32
     *  * @since 4.2
     *  * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     *  * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     *  * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     *  * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     */
    @Bean
//    @Scope("prototype")
    public Person person(){
        System.out.println("给容器添加person组件");
        return new Person("Andy",22);
    }

    @Bean("bill")
    @Conditional(WindowsCondition.class)
    public Person person01(){
        return new Person("bill",60);
    }

    @Bean("linus")
    @Conditional(LinuxCondition.class)
    public Person person02(){
        return new Person("linus",60);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
