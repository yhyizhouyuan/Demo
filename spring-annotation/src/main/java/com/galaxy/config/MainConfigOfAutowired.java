package com.galaxy.config;

import com.galaxy.bean.Car;
import com.galaxy.bean.Color;
import com.galaxy.dao.BookDao;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.awt.print.Book;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/24 17:05
 */
@Configuration
@ComponentScan({"com.galaxy.controller","com.galaxy.service","com.galaxy.dao","com.galaxy.bean"})
public class MainConfigOfAutowired {
    @Bean("bookDao2")
    //@Primary
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }

    @Bean
    public Color color(@Autowired Car car){
        Color color = new Color();
        color.setCar(car);
        return color;
    }

}
