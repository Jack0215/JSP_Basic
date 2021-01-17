<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>choose</h1>
	<c:choose>
		<c:when test="${xxx=='홍길동' }">
		</c:when>
		<c:when test="${xxx=='이순신' }">
		</c:when>
		<c:otherwise>
	유관순이다.
	</c:otherwise>
		<!-- else와 같음 -->
	</c:choose>

	<h1>if</h1>
	<c:if test="${xxx=='홍길동'}"> 
홍길동이다.
</c:if>
	<c:if test="${xxx!='홍길동'}"> 
홍길동이다.
</c:if>
</body>
</html>