<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello JSP</title>
</head>
<body>
    <%
        // JSP에서 사용하는 특별한 태그 scriptlet
        // 화면구성에 필요한 자바코드를 작성
        String message = "Hello from JSP Declaration!";
        int age = 20;
    %>
    
    <h1><%= message %></h1>

    <% if(age >= 20){ %>
        <p>성인입니다. 나이: <%= age %></p>
    <% } else { %>
        <p>미성년입니다. 나이: <%= age %></p>
    <% } %>


</body>
</html>
