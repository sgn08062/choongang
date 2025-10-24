package com.example.jsp.chap03;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface HandlerController {
    // 컨트롤러 구현체가 가져야할 공통 메서드를 선언
    String execute(HttpServletRequest request, HttpServletResponse response);
}
