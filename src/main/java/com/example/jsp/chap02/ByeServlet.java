package com.example.jsp.chap02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/bye")
public class ByeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // 요청 정보 출력
        String uri = request.getRequestURI();
        System.out.println("ByeServlet 요청주소: " + uri);
        
        // 리다이렉트 이동 - 주소가 바뀜
        //response.sendRedirect("/chap02/bye_ok.jsp");
        
        // 포워딩 - 주소 안바뀜
        // 포워딩은 화면에 데이터를 전달할 때 사용
        request.setAttribute("message", "서블릿에서 전달받은 메시지입니다!");
        request.getRequestDispatcher("/chap02/bye_ok.jsp").forward(request, response);
    }

}