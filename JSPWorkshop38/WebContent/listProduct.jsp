<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
     MyProductService service = new MyProductService();
     List<MyProductDTO> list = service.select();

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
//전체 총액 구현부분
window.onload=function(){
	totalSum();
}

function chk(n) {
	//전체선택구현
}
function delAll() {
	document.querySelector("#delForm").action='deleteAllProduct.jsp';
	document.querySelector("#delForm").submit;
}
function delProduct(n) {
	event.preventDefault();
	location.href="deleteProduct.jsp?prodId="+n;	
}
function update(n){
	//UPDATE 구현	
}

</script>
</head>
<body>
<form>

<table border="1">
  <tr>
    <td><input type="checkbox" name="delCheckAll" id="delCheckAll">전체선택</td>                                        
    <td>상풍아이디</td>
    <td>상품명</td>
    <td>가격</td>
    <td>갯수</td>
    <td>합계</td>
    <td>삭제</td>
    <td>수정</td>
  </tr>
  
 <%
   for(MyProductDTO dto: list){
 %> 
   <tr>
   <input type="hidden" name="price<%= dto.getProdId()%>" id="price<%= dto.getProdId()%>" value="<%= dto.getPrice()%>">
    <td><input type="checkbox" name="delCheck"  class="delCheck" value="<%= dto.getProdId()%>"></td>
    <td><%= dto.getProdId()%></td>
    <td><%= dto.getProdName()%></td>
    <td><%= dto.getPrice()%></td>
    <td><input type="text" name="quantity" value="<%= dto.getQuantity()%>" id="quantity<%= dto.getProdId()%>"></td>
<!-- 합계, 제품아이디를 유일하게 구별하고있음 -->    <td><span class="sum" id="sum<%= dto.getProdId()%>"><%= dto.getQuantity()*dto.getPrice()%></span></td>
    <td><button id="<%= dto.getProdId()%>" class="deleteProduct">삭제</button></td>
   <%--  <td><button data-id="<%= dto.getProdId()%>" class="updateProduct">수정</button></td> --%>
   <td><button onclick="update(<%=dto.getProdId()%> )">수정</button></td>
  </tr> 
 <%
   }
 %> 
</table>
<button id="deleteAllProduct">선택된 항목 삭제</button>
 총합:<span id="totalSum"></span>
 	
</form>
<script type="text/javascript">
function totalSum(){
	//CLASS SUM의 총액을 구함, TOTALSUM에 출력
	
}
</script>
</body>
</html>