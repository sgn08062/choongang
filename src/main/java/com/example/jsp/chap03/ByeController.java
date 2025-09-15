package com.example.jsp.chap03;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Bye 요청을 처리하는 Controller 구현체
 */
public class ByeController implements HandlerController {
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("ByeController 실행됨");
        
        // 비즈니스 로직 처리
        String message = "ByeController에서 처리된 메시지입니다!";
        
        // request에 데이터 저장
        request.setAttribute("message", message);
        
        // 결과 페이지 경로 반환
        return "bye.jsp";
    }
}
