<!-- import -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.service.EmpService" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dto.EmpDTO"%>
<%
    EmpService service = new EmpService();
    ArrayList<EmpDTO> list = service.selectAllEmp();
//서비스를 통해 전체 emp리스트로 받아옴 
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
    <td>사원번호</td>
    <td>사원이름</td>
    <td>월급</td>
    <td>입사일</td>
    <td>부서번호</td>
  </tr>
  
 <%
 
  for(EmpDTO dto : list){  //for문시작
	  int empno = dto.getEmpno();
	  String ename = dto.getEname();
	  int sal = dto.getSal();
	  String hiredate = dto.getHiredate();
	  int deptno = dto.getDeptno();
 %> 
   <tr> <!-- 화면 출력 자성 -->
    <td><%= empno %></td>
    <td><%= ename %></td>
    <td><%= sal %></td>
    <td><%= hiredate %></td>
    <td><%= deptno %></td>
  </tr>
 
 <% } %>
<!--for문 종료 --> 
  
</table>
</body>
</html>