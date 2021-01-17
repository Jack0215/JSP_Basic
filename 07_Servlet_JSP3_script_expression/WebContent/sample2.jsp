<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
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
List<String> list = 
Arrays.asList("홍길동","이순신","유관순");
for(String s: list){
   %>
   이름: <%= s %><br><!-- out.print와 비슷함 -->
<% } %>
 
</body>
</html>
