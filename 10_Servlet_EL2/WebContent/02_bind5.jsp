<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.dto.Person" %>
<%@ page import ="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
/*List에서 person뽑아서 이름 출력*/
List<Person> xxx = (List<Person>)request.getAttribute("xxx"); 
 
 for(Person p : xxx){
 
%>

일반:<%=p.getUsername()%><br>
일반:<%=p.getAge()%><br> 
<%
 }
%>
EL:${xxx[0].username} ${xxx.[0].age}<br>
EL:${xxx[1].username} ${xxx.[1].age}<br>

</body>
</html>