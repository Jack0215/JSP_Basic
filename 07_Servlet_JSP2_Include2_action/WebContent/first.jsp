<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		//request.setAttribute("xxx", "홍길동");
%>
first.jsp<br>
아래화면은 top.jsp를 jsp:include 시킨 내용입니다.<br>
<jsp:include page="include/top.jsp"/> <!-- end tag주의 -->
<br>
다시 first.jsp내용입니다.
</body>
</html>