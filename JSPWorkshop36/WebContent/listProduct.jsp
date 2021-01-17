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
	
	 
	function chk(n) { //전체선택 버튼의 동작 
		var lang = document.querySelectorAll(".delCheck");
		for (var i = 0; i < lang.length; i++) {
			lang[i].checked = n.checked;  //이벤트가 발생할 때마다 n.체크된걸 꺼내옴 n.checked를 true로 바꿔도 됨
		}
	}
	
	function deleteproduct (id){ //deleteproduct.jsp연결 해당 상품 하나만 삭제하도록
		location.href="deleteProduct.jsp?prodId="+id;
	}
	
	function delAll(){ //deleteAllproduct.jsp 연결모두 삭제
		document.querySelector("#delForm").action='deleteAllProduct.jsp';
		document.querySelector("#delForm").submit;
	}
</script>
</head>
<body>
	<form id="delForm">
		<table border="1">
			<tr>
				<!--chk함수 호출 전체 선택하도록 구현           체크받그사하하나마다 delCheckAll라고 이름을 줌, 체크했을 때 어떤게 삭제된건지 알아야함 , id를 알아야함 그래서 value에다가 상품의 아이디를 넣어줘야함  id=n이 됨-->
				<td><input type="checkbox" name ="delCheckAll" id="delCheckAll" onclick="chk(this)">전체선택</td>
				
				<td>상풍아이디</td>
				<td>상품명</td>
				<td>가격</td>
				<td>갯수</td>
				<td>삭제</td>
			</tr>

			<%
				for (MyProductDTO dto : list) {
		     %>
			<tr>
				<td><input type="checkbox" name="delCheck" class="delCheck"
					value="<%=dto.getProdId()%>"></td>
				<td><%=dto.getProdId()%></td>
				<td><%=dto.getProdName()%></td>
				<td><%=dto.getPrice()%></td>
				<td><%=dto.getQuantity()%></td>
				<!-- delprodcut()함수 호출 해당 상품만 삭제  -->
				<td><button onclick="deleteproduct(<%=dto.getProdId()%>)">삭제</button>
				</td>
			</tr>
			<%
				}
			%>
		</table>
		<!--delAll() -->
		<button id="deleteAllProduct" onclick="delAll()">선택된 항목 삭제
		
		</button>
	</form>

</body>
</html>