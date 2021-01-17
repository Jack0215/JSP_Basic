<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //내장객체 request, session, application은 import와 new 없이 사용 가능함
out.print(request.getParameter("aa")+"<br>"); //form전송 데이터 파싱 관련 내장 객체\
out.print(session.getAttribute("aaa")+"<br>"); //HttpSession 내장객체에 데이터 set
out.print(application.getAttribute("BBB")+"<br>"); //ServletContext 내장객체
	out.print("홍길동<br>");//out을 사용하여 바로 출력가능 
	config.getInitParameter("xxx");//ServletConfig 내장객체
	
%>
</body>
</html>