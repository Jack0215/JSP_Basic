<%@page import="java.util.Arrays"%>
<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



	<!--  //체크목록을 가져옴.
	 //가져온 목록을 list로 변환 
	 //service의 deleteAll 로 삭제  -->

<%
    String [] prodIds = request.getParameterValues("delCheck");//여러개의 value를 받음
    List<String> x = Arrays.asList(prodIds); 
    MyProductService service = new MyProductService();
     int n = service.deleteAll(x); 

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
//삭제 성공여부 출력
//목록보기 출력
</body>
</html>