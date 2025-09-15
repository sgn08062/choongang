<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bye JSP</title>
</head>
<body>
    <h1>Bye JSP</h1>
    <p>메시지: <%= request.getAttribute("message") %></p>

</body>
</html>
