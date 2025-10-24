package com.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController{
    @RequestMapping("/")
    public String home(HttpServletRequest request, HttpServletResponse response){
        System.out.println("home 컨트롤러 실행됨");
        request.setAttribute("message", "홀리카우");
        return "home";
    }

    @RequestMapping("/jstl")
    public String jstl(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("message", "컨트롤러에서 보낸 jstl메세지");
        request.setAttribute("isMember", true);
        List<String> list = Arrays.asList("A", "B", "C");
        request.setAttribute("list", list);
        return "jstl";
    }
}
