package com.example.basic.chap01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("hello world1 !!!");
        System.out.println("hello world2 !!!");
        return "hello";
    }
}