package com.example.jsp.chap02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//TODO: /bye 요청을 처리하는 서블릿
@WebServlet("/bye")
public class ByeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //TODO: 서블릿 코드 작성

        //리다이렉트 vs forward
        String uri = request.getRequestURI();
        System.out.println("요청주소: " + uri);

//        필요한 자바 프로그램 코드 작성

        // 리바이렉트는 페이지를 강제로 이동 -> 적어준 경로로 응답을 보냄
        //response.sendRedirect("/chap02/bye.jsp"); // 절대경로, /로 전체경로를 지정하는 방식
        //response.sendRedirect("chap02/bye.jsp"); // 상대경로

        // 포워드
        // 1. 화면에 데이터를 담아서 보내주고 싶을 때 사용함
        // 2. 요청주소를 그대로 남겨둠 (새로고침할 때 요청주소로 실행시켜서 데이터를 가져가라고!)
        request.setAttribute("msg", "서블릿에서 보낸 데이터입니다"); // key-value: 화면에서는 키를 통해 받을 수 있다.
        request.getRequestDispatcher("chap02/bye.jsp").forward(request, response);
    }

}