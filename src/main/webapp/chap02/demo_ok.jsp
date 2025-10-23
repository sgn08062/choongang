<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Start Template Demo</title>
</head>
<body>
<%--
    1. demo 요청을 받을 수 있는 서블릿을 생성
    2. demo.jsp에서는 form 태그로 인풋값 name 데이터를 넘기세요
    3. 서블릿에서는 name이라는 값을 받은 후에 name 이름 뒤에 "님 안녕하세요"를 붙인 데이터를 demo_ok.jsp 전달해서 출력
--%>
    <%
        String name = request.getAttribute("name").toString();
    %>
    <h3><%= name%>님 안녕하세요</h3>
</body>
</html>
