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
	request.getParameter("aa"); //form전송 데이터 파싱 관련 내장 객체
	request.setAttribute("ccc", "bbb"); //Request 객체에 데이터 set
	session.setAttribute("aaa", "bbb"); //HttpSession 내장객체에 데이터 set
	application.setAttribute("BBB", "CCC"); //ServletContext 내장객체
	out.print("홍길동");//out을 사용하여 바로 출력가능 
	config.getInitParameter("xxx");//ServletConfig 내장객체
	
%>
</body>
</html>