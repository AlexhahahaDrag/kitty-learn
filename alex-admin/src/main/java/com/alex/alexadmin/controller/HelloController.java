package com.alex.alexadmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: hello controller test
 * @Author:     alex
 * @CreateDate: 2019/12/10 19:11
 * @Version:    1.0
 *
*/
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello Spring Boot!!";
    }
}
