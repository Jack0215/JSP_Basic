<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	EmpService service = new EmpService();
List<EmpDTO> list = service.select();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>[이재윤]</h3>
	<hr width="270px" align="left">
	<table border="1">
		<tr>
			<td>사원번호</td>
			<td>사원이름</td>
			<td>월급</td>
			<td>입사일</td>
		</tr>
		<%
			for (EmpDTO dto : list) {
			int empno = dto.getEmpno();
			String ename = dto.getEname();
			int sal = dto.getSal();
			String hiredate = dto.getHiredate();
		%>
		<tr>
			<td><%=empno%></td>
			<td><%=ename%></td>
			<td><%=sal%></td>
			<td><%=hiredate%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>