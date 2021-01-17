
<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String prodId = request.getParameter("prodId");//id 값 파싱 
     MyProductService service = new MyProductService();
     int n = service.delete(prodId);//삭제 

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <!-- 삭제 후 삭제여부 출력 -->
<%
  String mesg = prodId + " 상품삭제 성공";
  if(n!=1){
	  mesg = prodId + " 상품삭제 실패";
  }
  out.print(mesg);	  
 %>
<!-- 하단 목록보기로 링크 -->
 <a href="listProduct.jsp">목록보기</a>
</body>
</html>