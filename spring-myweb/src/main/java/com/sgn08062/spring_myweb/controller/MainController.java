package com.sgn08062.spring_myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    // 홈화면
    @GetMapping("/main")
    public String main(){
        return "main";
    }
}
