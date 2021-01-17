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
String userid= (String)session.getAttribute("userid");
%>
<h1>로그인</h1>
안녕하세요. <%= userid %> <!--  아이디 띄워주고 -->
<a href ="LogininfoServlet">회원정보</a> <!-- 로그인인포서블릿으로이동 -->
</body>
</html>