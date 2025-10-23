<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>bye jsp</title>
</head>
<body>

    <%
        // setAttribute 저장한 값은 getAttribute로 얻음
        String str = request.getAttribute("msg").toString();
    %>
    <h3>bye 결과 페이지입니다.</h3>
    <%= str%>
</body>
</html>
