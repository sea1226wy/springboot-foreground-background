package com.springboot.controller;

import com.springboot.domain.MyException;
import com.springboot.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @auther Seay
 * @date 2019/4/8 15:53
 */
@RestController
public class SampleController {
    @RequestMapping("/")
    String Home(){
        return "Hello World";
    }

    @GetMapping("/testjson")
    public Object testjson(){
        int i= 1/0;
        return new User(111,"+","110",new Date());
    }
    /**
     * @Author: Seay
     * @Description : 模拟自定义异常
     * @Date: 2019/4/19 9:40
     */
    @RequestMapping("/api/v1/myext")
    public Object testException(){
        throw new MyException("500","my ext异常");
    }
}