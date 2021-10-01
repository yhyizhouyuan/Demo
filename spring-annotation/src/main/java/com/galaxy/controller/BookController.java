package com.galaxy.controller;

import com.galaxy.bean.User;
import com.galaxy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/23 23:27
 */
@Controller
public class BookController{

    @Autowired
    private BookService bookService;

    public User user(){
        return null;
    }
}
