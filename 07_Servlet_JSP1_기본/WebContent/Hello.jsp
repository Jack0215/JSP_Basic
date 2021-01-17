<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Jsp 기본실습</h1>
Hello!! <br>

<% //서블릿의 doget(or doPost)함수
System.out.println("Console: Hello World "); //콘솔에 출력
out.print("브라우저 :안녕하세요"); //브라우저에 응답으로 출력(내장객체 out :출력 객체 변수)
	int age=20;//age 변수 선언, doget안에 쓴거와 같음
%> 	<!-- ↓ -->
	<%= age %> <!-- out.print(age)와 동일 -->
<br>
안녕
</body>
</html>