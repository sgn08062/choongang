<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple JSP</title>
</head>
<body>
    <%--
        이 페이지에 진입하기 위한 경로 /chap03/simple.do 요청 경로 입니다.
        1. DispatcherSelrvelt에서 요청을 받아주는 else if 문을 추가
        2. HandlerController를 상속받는 SimpleController를 생성함
        3. SimpleController는 new Date() 오늘 날짜를 구해서 저장
        4. 이 페이지에서 출력
    --%>
    <h1>Simple JSP</h1>
    <p>오늘의 날짜는 <%=request.getAttribute("date")%></p>
</body>
</html>
