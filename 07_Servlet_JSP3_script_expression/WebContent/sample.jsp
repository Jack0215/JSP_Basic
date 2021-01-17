<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%!//declaration tag : 멤버변수/멤버메소드 작성 시 사용
	int num = 10;

	public void a(int tt) {
		System.out.println("a:" + tt);
	}%>
<%
	//servlet의 doGet, doPost 안으로 적용됨
Date d;
ArrayList x;
a(10); //doGet함수 바깥에 있는 7번라인에 값을 넘겨주고 있음
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str = "홍길동"; //자바 주석
	System.out.println(str);
	%>
	<%=str%>
</body>
</html>