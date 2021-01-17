<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.dto.Person"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>forTokens</h1>
	<c:forTokens var="z" items="${yyy}" delims="/">
	${z}<br>
	</c:forTokens>

	<h1>forEach3:range</h1>
	<c:forEach var="x" begin="1" end="10" step="2">
	${x}:world<br>
	</c:forEach>
	
	<c:forEach var="x" begin="1" end="5">
	${x}:Hello<br>
	</c:forEach>
	
	<c:forEach var="x" begin="1" end="5">
	${x}:Hello<br>
	</c:forEach>
	
	<h1>forEach2:status</h1>
	<c:forEach var="person" items="${xxx}" varStatus="status">
	index:${status.index}<br>
	count:${status.count}<br>
	current:${status.current}<br>
	first:${status.first}<br>
	last:${status.last}<br>
	${person.username}
	${person.age}<br>
	</c:forEach>
	<!-- varStatus : 순회하는 정보를 갖고있다. -->
	<!-- first : 첫번째 방인지 물어보는 명령어 맞으면 true -->
	<!-- last : 마지막 방인지 물어보는 명령어 맞으면 true -->
	<h1>forEach</h1>
	<c:forEach var="person" items="${xxx}">
		<!-- xxx는 list를 가리키고 있음, 이를 하나씩 꺼내와서 var에 담아줌 -->
	${person.username}
	${person.age} <br>
	</c:forEach>
</body>
</html>