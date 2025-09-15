package com.example.jsp.chap01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //요청
        //System.out.println("서블릿 동작함");
        String uri = request.getRequestURI();
        System.out.println("요청주소:" + uri);
        String param = request.getParameter("age");
        System.out.println("요청파라미터:" + param);

        //응답
        response.setContentType("text/html;charset=UTF-8;");
        PrintWriter out = response.getWriter();
        out.println("<div style='color:red;'>");
        out.println("<h1>Hello World!</h1>");
        out.println("</div>");



    }

    
}


