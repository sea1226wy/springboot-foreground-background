package com.springboot.controller;

import com.springboot.domain.ServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther Seay
 * @date 2019/4/26 13:50
 */
@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {

    @Autowired
    private ServerSettings serverSettings;

    @GetMapping("hello")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("setting",serverSettings);
        return "fm/index";
    }
}