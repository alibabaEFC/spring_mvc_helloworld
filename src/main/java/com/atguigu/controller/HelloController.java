package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String portal(){

        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("master test");
        System.out.println("hot-fix test");
        return "successfull4";

    }



}
