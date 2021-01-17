<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//서비스 클래스통해 리스트 구해오기 
MyProductService service = new MyProductService();
List<MyProductDTO> list = service.select(); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>상풍아이디</td>
			<td>상품명</td>
			<td>가격</td>
			<td>갯수</td>
			<td>삭제</td>
		</tr>
		<!-- 리스트 출력 
	마지막 td에 삭제 버튼 달기
-->
	<%
	for(MyProductDTO dto: list){
	%>
	<tr>
	<td><%= dto.getProdId() %> </td>
	<td><%= dto.getProdName() %> </td>
	<td><%= dto.getPrice() %> </td>
	<td><%= dto.getQuantity() %> </td>			<!--prodId는 key값임-->
	<td><button onclick="location.href='delete.jsp?prodId=<%=dto.getProdId()%>'" >삭제</button></td>
	
	</tr>
	<%
	}
	%>
	
	</table>
</body>
</html>