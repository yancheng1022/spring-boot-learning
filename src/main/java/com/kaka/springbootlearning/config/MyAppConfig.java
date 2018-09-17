package com.kaka.springbootlearning.config;


import com.kaka.springbootlearning.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //指明当前类是一个配置类
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置类给容器中添加组件了...");
        return new HelloService();
    }
}
