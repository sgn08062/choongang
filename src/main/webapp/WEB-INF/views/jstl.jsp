<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>JSTL Demo</title>
    <style>
        body { font-family: Arial, sans-serif; }
        ul { padding-left: 20px; }
    </style>
    
</head>
<body>
    <h1>JSTL Demo</h1>

    <h3>c:if</h3>
    <c:if test="${isMember}">
        <p>회원 전용 콘텐츠입니다.</p>
    </c:if>

    <h3>for 전통 방식</h3>
    <ul>
        <c:forEach var="i" begin="0" end="${itemsCount - 1}">
            <li>index = ${i}</li>
        </c:forEach>
    </ul>

    <h3>c:forEach</h3>
    <ul>
        <c:forEach var="it" items="${items}">
            <li>${it}</li>
            
        </c:forEach>
    </ul>

</body>
</html>