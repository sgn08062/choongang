package com.example.jsp.chap03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "*.do") // *.do 로 끝나는 모든 요청을 처리
public class DispatcherServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 요청 URI 추출
        String uri = request.getRequestURI();
        System.out.println("DispatcherServlet 요청 URI: " + uri);
        
        // URI 문자열로 equals 비교하여 HandlerController 실행
        HandlerController handlerController = null;

        if (uri.equals("/chap03/hello.do")) {
            handlerController = new HelloController();
            
        } else if (uri.equals("/chap03/bye.do")) {
            handlerController = new ByeController();
            
        } else {
            // 404 에러 처리
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.getWriter().println("<h1>404 - Page Not Found</h1>");
            return;
        }
        
        // HandlerController로 결과를 반환 받아서 포워딩하는 역할
        if (handlerController != null) {
            String viewPage = handlerController.execute(request, response);
            
            // 결과 페이지로 포워딩
            if (viewPage != null) {
                request.getRequestDispatcher(viewPage).forward(request, response);
            }
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
}
