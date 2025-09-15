package com.example.jsp.chap03;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * HandlerController 인터페이스
 * 프론트 컨트롤러 패턴에서 각 요청을 처리하는 HandlerController 객체들의 공통 인터페이스
 */
public interface HandlerController {
    
    /**
     * 요청을 처리하고 결과 페이지 경로를 반환
     * 
     * @param request HttpServletRequest 객체
     * @param response HttpServletResponse 객체
     * @return 결과 페이지 경로 (JSP 파일명)
     */
    String execute(HttpServletRequest request, HttpServletResponse response);
}
