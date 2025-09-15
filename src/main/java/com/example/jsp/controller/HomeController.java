package com.example.jsp.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("message", "Hello, Spring MVC!");
        return "home"; // resolves to /WEB-INF/views/home.jsp
    }

    @GetMapping("/jstl")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        // c:if 에서 사용할 불리언 값
        request.setAttribute("isMember", true);

        // 전통 for문 비교용으로 길이 값도 제공
        request.setAttribute("itemsCount", 10);

        // c:forEach 에서 사용할 리스트
        List<String> items = Arrays.asList("alpha", "beta", "gamma");
        request.setAttribute("items", items);

        return "jstl"; // resolves to /WEB-INF/views/jstl.jsp
    }


}


