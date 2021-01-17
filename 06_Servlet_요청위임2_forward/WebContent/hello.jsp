<!-- 주로 출력문 -->
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
   String mesg = (String)request.getAttribute("request"); 
   String mesg2 = (String)session.getAttribute("session"); 
   String mesg3 = (String)application.getAttribute("application"); 
%>
request>>>><%=mesg %><br>
session>>>><%=mesg2 %><br>
application>>>><%=mesg3 %><br>
hello~~
</body>
</html>