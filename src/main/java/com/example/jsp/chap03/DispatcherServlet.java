package com.example.jsp.chap03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//*.do 로 끝나는 모든 요청을 처리
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        //TODO: 서블릿 코드 작성
        //TODO: HandlerController로 결과를 반환 받아서 포워딩하는 역할
        // 1. 요청 url 분색
        String uri = request.getRequestURI(); // "/" 기준으로 분석해서 처리
        System.out.println("uri:"+uri);

        // 공통 부모
        HandlerController controller = null;
        if (uri.equals("/chap03/hello.do")) {
            // hello 클래스로 연결
            controller = new HelloController();
        } else if (uri.equals("/chap03/bye.do")) {
            // bye 클래스로 연결
            controller = new ByeController();
        } else if (uri.equals("/chap03/simple.do")){
            // simple 클래스로 연결
            controller  = new SimpleController();
        } else{
            // 에러에 관한 처리
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.println("<h3>잘못된 요청입니다.</h3>");
        }

        if(controller != null){
            // execute를 호출하고, 실행한 이후에 view에 대한 정보를 반환받음
            String viewPage = controller.execute(request, response);

            if(viewPage != null){
                // 포워드로 뷰페이지로 이동
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
