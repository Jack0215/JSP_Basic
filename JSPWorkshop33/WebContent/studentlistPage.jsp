<%@page import="com.dto.PageDTO"%>
<%@page import="com.dto.StudentDTO"%>
<%@page import="com.service.StudentService"%>
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
<%	String curPage = request.getParameter("curPage");
if(curPage == null) {
	curPage = "1";//최초 1로 설정 
}

StudentService service = new StudentService();
PageDTO pDTO = service.selectAllPageStudent(Integer.parseInt(curPage));//페이지 번호 전송
	
List<StudentDTO> list = pDTO.getList();
int perPage = pDTO.getPerPage();
int totalCount = pDTO.getTotalCount();
int totalPage = totalCount/perPage; // 전체 페이지 갯수 계산 
if(totalCount%perPage != 0) totalPage++;  //나머지 페이지 추가 
System.out.println("totalCount > " + totalCount);
System.out.println("totalPage > " + totalPage);//출력준비 끝
 %>

		<table border='1'>
		   <tr>
		   <td>학번</td>
		   <td>이름</td>
		  <td>주민번호</td>
		  <td>주소</td>
		  <td>입학년도</td>
		  <td>휴학여부</td>
		  </tr>
<%
for(StudentDTO dto:list){
String StuNo=dto.getStuNo();
String StuName=dto.getStuName();
String StuSsn=dto.getStuSsn();
String StuAddress=dto.getStuAddress();
String EntDate=dto.getEntDate();
char AbsYn=dto.getAbsYn();
%>			
		<tr>
		<td><%= StuNo %></td>
		<td><%= StuName %>"</td>
		<td><%= StuSsn %></td>
		<td><%= StuAddress %></td>
		<td><%= EntDate %></td>
		<td><%= AbsYn %></td>
		</tr>
<%		} %>
	
		 <tr><td colspan='6'>
<% 		
			String my="";
			for(int i=1; i<= totalPage; i++) {
			if(i==Integer.parseInt(curPage)) {//현재페이지와 i 일치할 경우 빨간색으로 표시 
				my += "<span style='color:red'>"+i+"</span>&nbsp;&nbsp;";
			}else {
				my += "<a href='StudentListServlet?curPage="+i+"'>"+i+"</a>&nbsp;&nbsp;";//요청페이지에 링크 걸고 페이지 번호 지정
			}
		}%>
		 <%= my %>
		 </td></tr>
		</table>
	
</body>
</html>