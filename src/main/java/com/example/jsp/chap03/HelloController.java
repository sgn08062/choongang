package com.example.jsp.chap03;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloController implements HandlerController {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        // request, response로 각 요청별로 처리를 하면 됨
        String age = request.getParameter("age");
        System.out.println("hello controller: "+ age);

        // 값을 화면으로 보내고 싶으면
        request.setAttribute("message", "hello controller에서 보낸 메시지");
        return "hello.jsp";
    }
}
