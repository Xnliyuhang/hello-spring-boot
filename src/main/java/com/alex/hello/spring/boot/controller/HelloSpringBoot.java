package com.alex.hello.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hello-spring-boot
 * @description: TestController
 * @author: Alex
 * @create: 2020-01-14 09:21
 */
@RestController
public class HelloSpringBoot {

    @GetMapping(value = "/")
    public String helloSpringBoot(){
        return "Hellow Spring Boot";
    }
}
