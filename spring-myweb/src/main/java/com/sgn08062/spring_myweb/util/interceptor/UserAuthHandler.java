package com.sgn08062.spring_myweb.util.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// 인터셉터 클래스로 동작하려면 HandlerIntercepter를 상속받음
public class UserAuthHandler implements HandlerInterceptor {

    // 컨트롤러 요청 직전에 요청을 필터링
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("컨트롤러 이전에 동작");

        return true; // true 입력시 컨트롤러로 넘어감, false 입력시 컨트롤러 실행 x
    }

    // 컨트롤러 실행 이후에 요청을 필터링
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);

        System.out.println("컨트롤러 이후에 동작함");
    }
}
