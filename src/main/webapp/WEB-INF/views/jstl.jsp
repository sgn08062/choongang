<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>JSTL</title>
</head>
<body>

    <%--
        jsp에서 자바코드를 사용하려면 <% %>을 사용해야 되는데,
        너무 더러워지니까 자바의 제어문이나 값을 받아서
        사용할 수 있게 해주는 jstl 구문이 존재함

    <%
        String msg = (String)request.getAttribute("message");
    %>
    <h1><%= msg%></h1>

    ${message}<br>
    ${isMember}<br>
    ${list}<br>
<%
    Boolean isMember = (boolean) request.getAttribute("isMember");
%>
<% if(isMember){ %>
    회원만 가능한 컨텐츠 입니다.
<% } %>
 --%>
    <c:if test = "${isMember}">
        회원만 사용 가능한 컨텐츠 입니다.
    </c:if>

    <c:forEach var="a" items="${list}">
        <br>${a}
    </c:forEach>

    <c:forEach var="i" begin="1" end="10" step="1">
        <br>${i}
    </c:forEach>

    <h3>forEach문으로 구구반 2~9단 출력</h3>
    <c:forEach var="i" begin="2" end="9" step="1">
        <br>${i}단
        <c:forEach var="j" begin="1" end="9" step="1">
            <br>${i} x ${j} = ${i*j}
        </c:forEach>
    </c:forEach>
</body>
</html>


