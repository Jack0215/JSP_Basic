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
		String userid = (String) session.getAttribute("userid");
	String passwd = (String) session.getAttribute("passwd");
	if (userid != null) { //로그인 여부 판단
	%>
	<h1>회원정보</h1>
	회원아이디
	<%=userid%>
	회원비번
	<%=passwd%>
	<a href="LogoutServlet">로그아웃</a>
	<%
		} else {
	%>
	<h1>회원이 아닙니다.</h1>
	<a href="lofinForm">로그인화면으로이동</a>
	<%
		}
	%>
</body>
</html>