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
		request.setCharacterEncoding("utf-8"); //post한글처리
	String userid = request.getParameter("userid"); //파싱
	String passwd = request.getParameter("passwd");
	request.setAttribute("xxx", "홍길동");
	%>
	login.jsp 사용자id:	<%=userid%>	<br> 
	login.jsp 패스워드:	<%=passwd%>
	<% RequestDispatcher dis = request.getRequestDispatcher("responseRedirect.jsp");
	dis.forward(request, response);
	//응답 페이지에서만 자료 처리하도록
	%>
	<%--<% response.sendRedirect("reponseRedirect.jsp"); %> --%>
	<br>
</body>
</html>