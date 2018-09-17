package com.kaka.springbootlearning.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller

//@RestController
public class HelloController {

    @RequestMapping({"/","/login.html"})
    public String index(){
        return "login";
    }
    @RequestMapping("/hello")
    @ResponseBody  //将数据直接写给浏览器（如果是对象转为json数据）
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object>map){
        map.put("hello", "你好");
        return "success";
    }
}
