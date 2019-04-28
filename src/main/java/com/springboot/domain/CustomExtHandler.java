package com.springboot.domain;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @auther Seay
 * @date 2019/4/18 17:49
 */
@RestControllerAdvice
public class CustomExtHandler {
    //捕获全局异常，出来所有不可知的异常
    @ExceptionHandler(value = Exception.class)
    Object handleException(Exception e, HttpServletRequest request) {
        HashMap<String, Object> map = new HashMap<>();

        map.put("code", 100);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }

    /**
     * @Author: Seay
     * @Description:处理自定义异常
     * @Date: 2019/4/19 9:31
     */
    @ExceptionHandler(value = MyException.class)
    Object MyException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        modelAndView.addObject("msg",e.getMessage());
        return modelAndView;
    }
}