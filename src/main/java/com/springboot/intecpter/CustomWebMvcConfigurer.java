package com.springboot.intecpter;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @auther Seay
 * @date 2019/4/25 17:31
 */
public class CustomWebMvcConfigurer implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*拦截的路径这里容易出错*/
        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/api2/*/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}