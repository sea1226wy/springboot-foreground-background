package com.springboot.controller;

import com.springboot.domain.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther Seay
 * @date 2019/4/28 10:39
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("info")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("setting",serverSettings);
        return "admin/info";
    }

}