<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>jsp 페이지</title>
</head>
<body>
    jsp 태그 사용가능
    <%
        // 자바코드 사용 가능
        String name = "홍길동";
        int age = 20;
        if(name.equals("홍길동")){
            out.println("안녕하세요");
        }else{
            out.println("누구세요?");
        }
    %>


    <% if (age >= 20) { %>
        <h3>성인입니다!! <%=age%>세 입니다</h3>
    <% } else { %>
        <h3>미성년입니다</h3>
    <% } %>
</body>
</html>
