<%@page import="com.dto.EmpDTO"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 	데이터 가져오기 
if사용 회원 가입 성공실패 보이기 
1.데이터 파싱  -->
<%
	
request.setCharacterEncoding("UTF-8");
int empno = Integer.parseInt(request.getParameter("empno"));
String ename = request.getParameter("ename");
String job = request.getParameter("job");
int mgr = Integer.parseInt(request.getParameter("mgr"));
int sal = Integer.parseInt(request.getParameter("hiredate"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	/* 	//2. DTO 생성   */
	EmpDTO dto = new EmpDTO();
	dto.setEmpno(empno);
	dto.setEname(ename);
	dto.setJob(job);
	dto.setMgr(mgr);
	dto.setSal(sal);

	/* //3. 서비스 생성 */
	EmpService service = new EmpService();
	int n = service.memberAdd(dto);

	String mesg = "회원가입실패";

	if (n == 1) {
		mesg = "회원가입 성공";
	}
	%>



	<a href="??">목록보기</a>
</body>
</html>