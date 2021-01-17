<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! int num=10; %>
<%
//main.jsp에사 사용한 request를 재 사용함
String mesg = (String)request.getAttribute("xxx"); //반드시 형 변환을 해줘야함
%>
<h1 style ="color:red;">
top.jsp
안녕하세요? mesg== <%= mesg %>
num == <%= num %>
</h1>