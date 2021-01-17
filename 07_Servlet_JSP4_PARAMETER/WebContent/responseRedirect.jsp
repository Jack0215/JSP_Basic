<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 응답 페이지에서 자료는 처리 못하고 화면만 보여지게 함 -->
redirect되어서 옴 <br> 
	<%
		request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("userid"); 
	String passwd = request.getParameter("passwd");
	String xxx= (String)request.getAttribute("xxx");
	%>
	redirect 사용자id: <%=userid%>	<br> 
	redirect 패스워드:	 <%=passwd%>	<br>
	redirect xxx : <%= xxx %>
	<br>
</body>
</html>