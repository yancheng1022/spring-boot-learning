package com.kaka.springbootlearning.controller;



import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody  //将数据直接写给浏览器（如果是对象转为json数据）
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
