<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% // <%는 JSP태그. doGET과 doPost 내부에 있다 라고 생각하면 됨. servlet의 doget 부분 코드 구현
   String mesg = (String)request.getAttribute("request"); //request객체 send
   String mesg2 = (String)session.getAttribute("session"); //session객체
   String mesg3 = (String)application.getAttribute("application"); //context객체
%>
request>>>><%=mesg %><br>  <!-- %= 이 표시는  out.print(mesg)와 같다 -->
session>>>><%=mesg2 %><br>
context(application)>>>><%=mesg3 %><br>
hello~~
</body>
</html>