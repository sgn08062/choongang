package com.example.jsp.chap01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// TODO: /hello 요청을 처리하는 서블릿
@WebServlet("/hello") // 브라우저에서 hello 요청을 받아서 get메서드로 연결함
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("hello 서블릿 실행됨");

        //요청
        System.out.println(request.getRequestURI());
        // 클라이언트에서 보낸 파라미터 값을 받을 수 있음
        String name = request.getParameter("name"); // 화면세어 보낸input태그의 name값이 들어감
        String id = request.getParameter("id");
        System.out.println("파라미터 값: " + name + ", id: " + id);
        System.out.println(request.getParameter("A"));
        System.out.println(request.getParameter("B"));
        System.out.println(request.getParameter("C"));



        // d응답
        // 응답에 대한 데이터 타입, 인코딩 형식을 작성함 content-type이라고 함
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<h3>서블릿에서 응답보낸 html입니다</h3>");
        out.println("<h3>문자열로 작성하기 힘들다!</h3>");

        //
    }
}


