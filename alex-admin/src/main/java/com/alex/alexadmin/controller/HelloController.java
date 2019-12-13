package com.alex.alexadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: hello controller test
 * @Author:     alex
 * @CreateDate: 2019/12/10 19:11
 * @Version:    1.0
 *
*/
@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
