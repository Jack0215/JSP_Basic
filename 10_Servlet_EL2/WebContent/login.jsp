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
String userid = request.getParameter("userid");
String passwd = request.getParameter("passwd");

%>
userid:<%= userid %><br>
passwd:<%= passwd %><br>
EL:${param.userid}<br> <!-- parameter 값 파싱 시, 꺼내온 값을 화면에 출력할 때 사용 -->
EL:${param.passwd}<br>
</body>
</html>