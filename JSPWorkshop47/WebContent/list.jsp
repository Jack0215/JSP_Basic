<%@page import="com.dto.PageDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원관리</title>
</head>
<body>
	<b>[ 사원 목록 ]</b>
	<hr></hr>
	<%
	PageDTO pDTO = (PageDTO) request.getAttribute("pDTO");
	List<EmpDTO> list = pDTO.getList();
	String order = (String)request.getAttribute("order");
	String searchName = (String)request.getAttribute("searchName");
	String searchValue = (String)request.getAttribute("searchValue");
	%>
	<table border="1">

		<!-- 검색기능 -->
		<tr>
			<td colspan="5">
				<form action="EmpListServlet">
					<select name="searchName">
						<option value="hiredate">입사일(년도만)</option>
						<option value="ename">이름</option>
					</select> <input type="text" name="searchValue"> <input
						type="submit" value="검색">
				</form>
			</td>
		</tr>
		<!-- 검색기능  -->
		<!-- 정렬기준 -->
		<tr>
			<th>정렬기준</th>
			<td colspan="4">
			  <form action="EmpOrderServlet">
			      월급 높은 순 : <input type="radio" name="order" value="desc"  <% if("desc".equals(order) || order == null){ %> checked="checked" <%} %> />
				 월급낮은 순 : <input type="radio" name="order" value="asc" <% if("asc".equals(order)){ %> checked="checked" <%} %>/>
				  <input type="submit" value="정렬">
               </form>
			</td>
		</tr>

		<!-- 정렬기준 -->
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>직업</th>
			<th>입사일</th>
			<th>월급</th>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
				EmpDTO dto = list.get(i);
				int empno = dto.getEmpno();
				String ename = dto.getEname();
				String job = dto.getJob();
				String hiredate = dto.getHiredate();
				int sal = dto.getSal();
		%>
		<tr>
			<td><a href="EmpRetrieveServlet?empno=<%=empno%>"><%=empno%></a></td>
			<td><%=ename%></td>
			<td><%=job%></td>
			<td><%=hiredate%></td>
			<td><%=sal%></td>
		</tr>
		<%
			} //end for
		%>
		<tr>
		 <td colspan="5"> 
		   <%
		        int curPage = pDTO.getCurPage();
		        int perPage = pDTO.getPerPage();
				int totalCount = pDTO.getTotalCount();
				int totalPage = totalCount/perPage;
				if(totalCount%perPage!=0) totalPage++;
		        for(int i=1; i<= totalPage; i++){
		          	if(i== curPage){
		          		out.print(i+"&nbsp;");
		          	}else{
		          		out.print("<a href='EmpListServlet?curPage="+i+"&searchName="+searchName+"&searchValue="+searchValue+"'>"+i+"</a>&nbsp;");
		          	}
		        }//end for  
		   %>
		
		  </td>
		</tr>
	</table>
	<a href="EmpWriteFormServlet">사원등록</a>
</body>
</html>